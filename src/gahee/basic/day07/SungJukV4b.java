package gahee.basic.day07;

public class SungJukV4b {
    // 클래스의 종류
    // VO/DTO (Value Object,  Data Transfer Object) :
    // 값만 저장하기 위해 사용하는 클래스. 주로 데이터베이스 테이블의 각 열과 연계해서 작성함

    // Service :
    // 비지니스 로직을 구성하는 클래스. 데이터 영속화 전에 처리하는 코드들로 구성

    // DAO (Data Access Object) :
    // 데이터 영속화와 관련된 코드들로 구성된 클래스.
    // 주로 데이터베이스를 사용해서 데이터를 추가/조회/수정/삭제 기능을 작성함

    public static void main(String[] args) {
            // 성적데이터 생성 - tot, avg, grd 를 구하기 위해
            SungJuk sj = new SungJuk("전지현", 87,98,53);

            // 성적 처리를 위해 service 객체 생성
            SungJukService sjsrv = new SungJukService();

            // 성적 처리
            sjsrv.computeSungJuk(sj);

            // 결과 출력
           sjsrv.printSungJuk(sj);

    } // main

    // 값 클래스
    static class SungJuk {
        // 멤버변수
        private String name;
        private int kor;
        private int eng;
        private int mat;
        private int tot;
        private double avg;
        private char grd;

        // 생성자 ( alt + insert or 우클릭+생성 )
        public SungJuk() { }      // 생성자 2개 -> 서로 다른 생성자로 인식됨 두개다 사용 ㅇ

        public SungJuk(String name, int kor, int eng, int mat) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.mat = mat;
        }
    }

    // 기능 클래스
    static class SungJukService {
        // 성적처리 (기능)
        public SungJuk readSungJuk(){
            return null;
        }

        public void computeSungJuk(SungJuk sj) {
            sj.tot = sj.kor + sj.eng + sj. mat;
            sj.avg = (double)  sj.tot / 3;
            switch ((int) sj.avg / 10) {
                case 10 : case 9 :  sj.grd = '수'; break;
                case 8 :  sj.grd = '우'; break;
                case 7 :  sj.grd = '미'; break;
                case 6 :  sj.grd = '양'; break;
                default:  sj.grd = '가'; break;
            }
        }

        // 성적처리 결과출력
        public void printSungJuk(SungJuk sj) {
            String fmt = "%s %d %d %d \n%d %.1f %c \n";
            System.out.printf(fmt, sj.name, sj.kor, sj.eng, sj.mat, sj.tot, sj.avg, sj.grd );
        }
}



} // class
