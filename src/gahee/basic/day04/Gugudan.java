package gahee.basic.day04;

import java.util.Scanner;                           // Scanner

public class Gugudan {
		public static void main(String []args) {
// 구구단 출력하기
// ex ) 7단 출력 - v1
			System.out.println(" 7 x 1 = 7");
			System.out.println(" 7 x 2 = 14");
			System.out.println(" 7 x 3 = 21");
			System.out.println(" 7 x 4 = 28");
			System.out.println(" 7 x 5 = 35");
			System.out.println(" 7 x 6 = 42");
			System.out.println(" 7 x 7 = 49");
			System.out.println(" 7 x 8 = 56");
			System.out.println(" 7 x 9 = 63");
			
			System.out.println("------------");
			
//  ex ) 7단 출력 v2 - for
			for(int i = 1; i <= 9; ++i) {
			System.out.println(" 7 x "+i+ " = " + (7 * i));

			}
			
			System.out.println("------------");
			
//  ex ) 7단 출력 v3 - while, printf
			String fmt = " 7 x %d = %d \n";
			int i = 1 ;
			while(i <= 9) {        // 조건이 참이면 반복 실행
			System.out.printf(fmt, i , 7 * i);  
						++i ;     // 증감식  
			}	
			
			System.out.println("------------");
			
			
//ex ) 3단 출력  - while, printf
			fmt = " 3 x %d = %2d \n";  // 2 = 자리수 조절
			i = 1 ;
			while(i <= 9) {        // 조건이 참이면 반복 실행
			System.out.printf(fmt, i , 3 * i);  
						++i ;     // 증감식  
			}	
			
			System.out.println("------------");

			
//ex ) 구구단 프로그램 v1
// 사용자로부터 숫자(1~9)를 입력받아 구구단을 출력하는 프로그램 작성
// Scanner, while, printf
			i = 1 ;
			
			Scanner scan = new Scanner(System.in);      // Scanner
			System.out.print(" 숫자를 입력하면 구구단을 출력합니다 : ");
			int dan = scan.nextInt();                    // Scanner
			
			fmt = " %d  x %d = %2d \n";
			
			while(i<=9) {        // 조건이 참이면 반복 실행
			System.out.printf(fmt, dan, i, (dan *i));
						++i;
			}
			
			System.out.println("------------");
			
// ex ) 구구단 프로그램 v2
// 사용자로부터 숫자(1~9)를 입력받아 구구단을 출력하는 프로그램 작성
// 입력받는 타입을 문자열로 입력받을 때 (입력받은 글자의 차례수 지정)
			System.out.print(" 숫자를 입력하면 구구단을 출력합니다 : ");
			
			// 입력받은 문자열 중 첫번째 글자(0)만 char형 변수에 대입
			char dan2 = scan.next().charAt(0); 
			
			// 입력받은 문자의 아스키 코드값이 49~57인지 검사(1~9)
			String result =
					(dan2 >= 49 && dan2 <= 57) ?
							"구구단 출력": "잘못 입력하셨습니다!!";
			System.out.println(result);
			//System.out.println(number2 + " " + (int)number2); 
			//()부분 아스키코드값으로 출력됨
			System.out.println("------------");
			
// ex) 구구단 프로그램 v3
// 사용자로부터 숫자(1~9)를 입력받아 구구단을 출력하는 프로그램 작성
// 잘못 입력하셨습니다!!" 라는 메세지를 출력하도록 합니다.
// catch -try 사용			
			System.out.print(" 숫자를 입력하면 구구단을 출력합니다 : ");
			String dan3 = scan.next();          //string 사용시
			
			i = 1;
			try {											//
			while (i <= 9) {
				System.out.printf(fmt, dan3, i,
						(Integer.parseInt(dan3) * 1));  //string 사용시 문자->숫자로 변환
							++i;
			}
			} catch (Exception ex) {                       //
				System.out.println("잘못 입력하셨습니다!!");
			}
			// 예외처리 코드(try-catch)를 이용해서 프로그램 실행 중 오류발생 시
			// 제어를 catch 코드 쪽으로 넘김
			System.out.println("------------");
//  ex) 주민번호로 성별을 출력하는 코드 
// 형식 : 123456-1234567 (두번째 1자리)
// 1 : 1999년 이전 출생 남자			
// 2 : 1999년 이전 출생 여자			
// 3 : 2000년 이후 출생 남자			
// 4 : 2000년 이후 출생 여자			
// charAt			
			String jumin = "123456-1234567";
			
			char genter = jumin.charAt(7);          //8번째 =>7
			result = (genter == '1') ? "1999년 이전 출생 남자" :   //''써줘야 아스키코드값으로 비교되지 x
					 (genter == '2') ? "1999년 이전 출생 여자" :
					 (genter == '3') ? "2000년 이후 출생 남자" :"2000년 이후 출생 여자";
					
			System.out.println(result);
				
				
						
				
		}
}