package gahee.basic.day07;

import java.util.Scanner;

public class SungJukV3b {

	public static void main(String[] args) {
		
		// 성적처리프로그램을 체계적으로 만들기
		// 배열과 메서드로 효율적이게 코드를 재작성
		
		String menu ="";
		Scanner sc = new Scanner(System.in);

		while(true) {                             //또는 for(;;)
		displayMenu();			// 프로그램 메뉴 표시
		menu = sc.next();
	
		switch(menu){            //JDK 7 부터는 switch문에 문자형 사용가능
			case "1" : addSungJuk(); break;
			case "2" : System.out.println("성적데이터 조회"); break;
			case "3" : System.out.println("성적데이터 상세조회"); break;
			case "4" : System.out.println("성적데이터 수정"); break;
			case "5" : System.out.println("성적데이터 삭제"); break;
			case "0" : System.exit(0); break;
			default : System.out.println("잘못 입력하셨습니다!");
		 			}//switch
		}// while
}//m

	

	// 메뉴를 출력하는 메서드 - displayMenu
	public static void displayMenu() {
		String displayMenu =
					"======================= \n"+
					"   성적 프로그램 V3 \n"+
					"======================= \n"+
					"1) 성적데이터 입력 \n"+
					"2) 성적데이터 조회 \n"+
					"3) 성적데이터 상세조회 \n"+
					"4) 성적데이터 수정 \n"+
					"5) 성적데이터 삭제 \n"+
					"0) 프로그램 종료 \n"+
					"======================= \n"+
					" 작업을 선택하세요 : ";

		System.out.print(displayMenu);
	}
	
	// 성적 입력 및 처리 결과 출력
	public static void addSungJuk() {
		String name;
		int kor, eng, mat, tot;
		double avg;
		char grd;
		Scanner sc = new Scanner(System.in);

		System.out.print("이름은? ");
		name = sc.next();
		System.out.print("국어는? ");
		kor = sc.nextInt();
		System.out.print("영어는? ");
		eng = sc.nextInt();
		System.out.print("수학은? ");
		mat = sc.nextInt();

		tot = kor + eng + mat;
		avg = (double) tot / 3;

		switch ((int) avg / 10){
			case 10 : case 9 : grd = '수'; break;
					  case 8 : grd = '우'; break;
					  case 7 : grd = '미'; break;
					  case 6 : grd = '양'; break;
					  default: grd = '가'; break;
		}
		String  fmt = " %s %d %d %d \n " +
					  " %d %.1f %c \n";
		System.out.printf(fmt, name, kor, eng, mat, tot, avg, grd);
	}
	
} //c