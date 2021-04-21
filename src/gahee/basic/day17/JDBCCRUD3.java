package gahee.basic.day17;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class JDBCCRUD3 {
    public static void main(String[] args) {
        // ex) playground 데이터베이스의 books 테이블에 저장된 데이터들 중
        //     출판사가 oracle인 도서의 제목을 python으로 변경하세요.
        String sql = " update books set bookname = 'python' where publisher = 'oracle' ";

        MariaJDBC jdbc = new MariaJDBC();
        try ( Connection conn = jdbc.openConn();
              PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {
            int cnt = pstmt.executeUpdate();    // count 약자
            if (cnt > 0) System.out.println("데이터 수정완료!");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // ex) playground 데이터베이스의 books 테이블에 저장된 데이터들 중
        //     이름이 python인 도서를 삭제하세요.
        sql = " delete from books where bookname = 'python' ";

        try ( Connection conn = jdbc.openConn();
              PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {
            int cnt = pstmt.executeUpdate();    // count 약자
            if (cnt > 0) System.out.println("데이터 삭제완료!");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
