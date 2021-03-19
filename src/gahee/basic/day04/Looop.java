package gahee.basic.day04;

public class Looop {
	public static void main(String []args){
		
		// while
		// 특정 조건을 만족할 때까지 주어진 명령 반복
		// 초기식
		// while( 조건식 ) {
		//              반복 코드
		//              증감식
		//   				 }
		// 조건식이 처음부터 false면 while은 코드를 반복 실행하지 x
		// 반면 , do-while문은 일단 코드를 먼저 실행 후 
		// 조건을 검사하기 때문에 조건식이 false라도 do 실행문은 작동
		// 최소 한번 정도는 코드를 실행할 수 있음
		
		// ex ) 1 ~ 10까지 정수 출력
		int i = 1 ;
		while(i <= 10) {        // 조건이 참이면 반복 실행
			System.out.print(i + " ");
	   		   i +=1 ;          // 증감식         
		}
			System.out.println();
			
		// ex ) 1 ~ 50까지 홀수 출력
		int j = 1;
		while(j <=50) {                         // while(i<=50 && i % 2 != 0) (!=) = (! =)
			System.out.print(j + " "); 			// 사용할 수는 있지만 불편한 코드
			  j +=2;
		}
			System.out.println();
		
		// ex ) 1 ~ 50까지 짝수 출력
		int k = 2 ;
		while(k <= 50) {         // 조건이 참이면 반복 실행
			System.out.print(k + " ");
			    k += 2 ;          // 증감식         
			}
			System.out.println();
				
		// ex ) 1 ~ 100까지 총합 구해서 출력
		int sum = 0;
		int l = 1 ;
		while(l <= 100) {        // 조건이 참이면 반복 실행
				sum += l++ ;           // 증감식         
		}	
			System.out.print(sum + " ");
			System.out.println();
		
		// 가우스 덧셈 공식을 이용하면
		// 특정 범위 내 모든 수의 합을 편리하게 구할 수 있음
		// sum = (j + 1) * (j / 2)
		//
		
		// ex ) 1 ~ 100까지 총합 구해서 출력
		   // 총합 : sum, 범위 : i ~ j	
			i = 1;
			j = 100;
			int sum2 = (i + j) * j / 2;
			System.out.println("1 ~ 100 까지 총합 : "+sum2);	
			
		// ex ) 1 ~ 99 까지 총합 구해서 출력
			i = 1;
			j = 99;
			int sum3 = (i + j) * j / 2;
			System.out.println("1 ~ 99 까지 총합 : "+sum3);	
	
	}
}
