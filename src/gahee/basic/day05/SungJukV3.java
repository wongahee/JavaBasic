package gahee.basic.day05;

import java.util.Scanner;

public class SungJukV3 {

	public static void main(String[] args) {
		
		// 성적처리프로그램을 체계적으로 만들기
		// 객체지향 기법을 토대로 CRUD 기능을 제공하도록 작성
		// 즉, 성적데이터에 입력/조회/수정/삭제 메뉴를 제공해서
		// 프로그램의 사용성을 높임
		
		String menu ="";
		Scanner sc = new Scanner(System.in);
		
		// 입력 값과 보기의 종류를 알 수 없음
		//System.out.println("작업을 선택하세요 : ");
		//System.out.println("작업을 선택하세요 : (1,2,3,4,5,0)");
		while(true) {                             //또는 for(;;)
		String displaymenu = 
				"=======================\n"+
				"   성적 프로그램 V3\n"+
				"=======================\n"+
				"1) 성적데이터 입력\n"+
				"2) 성적데이터 조회\n"+
				"3) 성적데이터 상세조회\n"+
				"4) 성적데이터 수정\n"+
				"5) 성적데이터 삭제\n"+
				"0) 프로그램 종료\n"+
				"=======================\n"+
				" 작업을 선택하세요 : ";
		
		System.out.print(displaymenu);
		menu = sc.next();
	
		switch(menu){            //JDK 7 부터는 switch문에 문자형 사용가능
			case "1" : System.out.println("성적데이터 입력"); break;
			case "2" : System.out.println("성적데이터 조회"); break;
			case "3" : System.out.println("성적데이터 상세조회"); break;
			case "4" : System.out.println("성적데이터 수정"); break;
			case "5" : System.out.println("성적데이터 삭제"); break;
			case "0" : System.exit(0); break;
			default : System.out.println("잘못 입력하셨습니다!");
		 			}//switch
				}// while
		}//m
} //c