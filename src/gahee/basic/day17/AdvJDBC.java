package gahee.basic.day17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import java.util.Scanner;

public class AdvJDBC {
    public static void main(String[] args) {
        // 효율적으로 JDBC 프로그램 작성하기
        // 데이터베이스 연결정보를 소스내에 작성하는 것은
        // 보안상으로 좋지 않고, 유지보수 측면에서도 추천하지 않음
        // 따라서, 독립적은 외부파일에 작성해서 사용하도록 코드를 짜는 것이 효율적임
        // => properties 파일 사용
        // 생성위치 : src/jdbc 패키지 아래

        // jdbc.properties 파일 경로 지정
        String pkpath = "gahee.basic.jdbc.jdbc";     // 패키지명.파일명
        ResourceBundle rb = ResourceBundle.getBundle(pkpath);

//        System.out.println(rb.getString("mdrv"));
//        System.out.println(rb.getString("murl"));
//        System.out.println(rb.getString("musr"));
//        System.out.println(rb.getString("mpwd"));

        // JDBC 프로그램에서 공통적으로 작성하는 코드들 중 하나는
        // 디비 접속부분과 해제부분임
        // 이것을 클래스로 만들어 따로 관리하면 유지보수에 많은 장점을 가져다줌

        // ex) playground 데이터베이스의 books 테이블에
        //     새로운 도서정보를 입력하는 프로그램을 작성
        //     입력방법은 Scanner 클래스 이용

        String sql = " insert into books " +
                     " values ( ?, ?, ?, ?)";
        // ? : parameter placeholder
        // 동적 SQL문을 사용해서 실제 입력값은
        // 매개변수를 통해 완전한 SQL문으로 구성하는 방식을 추천
        // XSS 해킹을 방지하는데에도 도움이됨

        // parameter placeholder 사용하기 전 자주 사용된 방식 
        // -> 해킹위험이 존재!
        // sql = " insert into books " +
        //       " values ("+ bkid +", '"+ name +"', '"+ publish + "', " + price+ ")"

        Scanner sc = new Scanner(System.in);
        System.out.println("도서번호, 도서명, 출판사, 가격 순으로 입력하시오.");
        int bookid = Integer.parseInt(sc.next());
        String bookname = sc.next();
        String publisher = sc.next();
        int price = Integer.parseInt(sc.next());

        MariaJDBC jdbc = new MariaJDBC();

        try ( Connection conn = jdbc.openConn();
              PreparedStatement pstmt = conn.prepareStatement(sql);
              // Statement vs PreparedStatement
              // JDBC를 이용해서 SQL이 실행되는 순서
              // => Statement : SQL 분석 -> 컴파일 -> 실행
              // => PreparedStatement : (SQL 분석 -> 컴파일) -> 실행

              // Statement 객체로 sql 실행 시 위 3가지 과정을 매번 거쳐야함
              // 반면, PreparedStatement 객체는 
              // 처음 sql 실행 시 3가지 과정을 거친 후 실행한 sql을 캐시에 저장해둠. 
              // 그 후 다음 실행 시 캐시를 재활용해서 실행하기 때문에 성능이 좋아짐

              // 반복 실행 해야할 sql : PreparedStatement (DML)
              // 반복 실행 필요없는 sql : Statement (DDL)

        ) {
            pstmt.setInt(1, bookid);
            pstmt.setString(2, bookname);
            pstmt.setString(3, publisher);
            pstmt.setInt(4, price);

            int cnt = pstmt.executeUpdate();
            if (cnt > 0) System.out.println("도서 추가 완료!!");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // ex) playground 데이터베이스의 books 테이블에 저장된 데이터들을
        //     조회하는 프로그램을 작성
        sql = "select * from books";
        try ( Connection conn = jdbc.openConn();
              PreparedStatement pstmt = conn.prepareStatement(sql);
              ResultSet rs = pstmt.executeQuery();
        ) {
            String fmt = "%s %s %s %s \n";
            StringBuffer sb = new StringBuffer();
            while(rs.next()) {
                String result = String.format(fmt, rs.getString(1),
                                                   rs.getString(2),
                                                   rs.getString(3),
                                                   rs.getString(4));
                    sb.append(result);
            }
            System.out.println(sb.toString());
        } catch (Exception ex){
            ex.printStackTrace();
        }

    }
}

class MariaJDBC {
    private ResourceBundle rb = null;
    private String DRV;
    private String URL;
    private String USR;
    private String PWD;

    public MariaJDBC() {
        String pkpath = "gahee.basic.jdbc.jdbc"; // 패키지경로.properties파일명
        rb = ResourceBundle.getBundle(pkpath);
        DRV = rb.getString("mdrv");
        URL = rb.getString("murl");
        USR = rb.getString("musr");
        PWD = rb.getString("mpwd");
    }

    public Connection openConn() {
        Connection conn =  null;
        try {
            Class.forName(DRV);
            conn = DriverManager.getConnection(URL, USR, PWD);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return conn;
    }

}