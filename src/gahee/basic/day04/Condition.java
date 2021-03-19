package gahee.basic.day04;

import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		// 조건문
		// 일반적으로 프로그램의 실행순서는 순차적임 = sequence
		// 하지만, 특수한 상황에서는 선택적 코트 실행이 필요하다
		// 이때 , 조건문을 사용한다.
		// if, switch
		
		// if문
		// 조건식의 결과가 true와 false 일때, 각각 주어진 명령문을 실행함
		// if (조건식){
		//				// 조건이 참일 때 실행하는 코드
		//   }    else{
		//				// 조건이 거짓일 때 실행하는 코드
		// }
		
// ex) 1~100 사이 정수 중 짝수를 출력하세요.
// for 문 + if 문
		for(int i = 1; i <= 100; ++i) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
// ex) 1~100 사이 정수 중 짝수라면 "짝수입니다."를,
//	 		홀수면 "홀수입니다."라고 출력하세요.
		for(int i = 0; i <= 100; ++i) {
			if(i % 2 == 0) {
				System.out.print(i + "는 짝수입니다 ");
			}else {
				System.out.println(i + "는 홀수입니다");
			}
		}
		System.out.println();
// 26. 사용자가 연봉과 결혼 여부를 입력하면 다음의 세금율에 의해
// 납부해야 할 세금을 계산하는 프로그램을 작성하세요.
// 미혼인 경우 : 연봉 3000미만 - 10%, 연봉 3000이상 - 25%
// 결혼한 경우 : 연봉 6000미만 - 15%, 연봉 6000이상 - 35%
// 연봉(salary), 결혼 여부(IsMarried - 0(결혼x) or 1(결혼o))		
// 결혼 햇으면 돈
		int IsMarried, salary;
		double tax;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" 연봉 : ");
		salary = sc.nextInt();
		System.out.println("결혼 유무 : (0 : No, 1 : Yes)");
		IsMarried = sc.nextInt();
		
		if(IsMarried == 0)  								// 미혼
			if(salary < 3000) tax = salary * 0.1;
						 else tax = salary * 0.25;
		else                                            // 기혼
			if(salary < 6000) tax = salary * 0.15; 		
						 else tax = salary * 0.35;	
		
		String fmt = "연봉은 %d 이고, 결혼 여부는 %d일 때 \n" +
				 	 "세금은 %.1f 입니다.";
		System.out.printf(fmt, salary, IsMarried, tax);
		
	}//m

}//c
