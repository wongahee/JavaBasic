package gahee.basic.day19;

public class BoardMain {
    public static void main(String[] args) {
        // 간단한 웹사이트 프로그램
        // 테이블명 : board
        // 구성 도메인 : 글번호 제목 작성자 작성일 조회수 추천수 본문
        // 컬럼명 : bdno, title, userid, regdate, views, thumbup, contents
        // 입력, 조회, 상세조회, 수정, 삭제

        // 추천 시 y일 때, 추천수 조회수 +1
        //         n일 때, 조회수 +1

        // BoardService 객체부터 생성
        BoardService bsrv = BoardServiceImpl.getInstance();
        // alt + enter : 클래스 가져오기

        // 데이터 입력
        bsrv.newBoard();

        // 데이터 조회
        bsrv.readBoard();

        // 데이터 상세조회
        bsrv.readOneBoard();;

        // 데이터 수정
        bsrv.modifyBoard();

        // 데이터 삭제
        bsrv.removeBoard();

    }
}
