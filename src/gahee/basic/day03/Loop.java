package gahee.basic.day03;

public class Loop {
	public static void main(String [] args) {
		
		// 반복문(loop)
		// 프로그램 내에서 똑같은 명령을 지정한 횟수만큼 반복하여 수행하도록
		// 작성하는 명령문
		// 사용빈도가 높은 명령어 중 하나
		// for(횟수 지정 후 반복), while(특정 조건을 만족할 때까지 반복)
		
		// 인사말 출력 v1 - 1번만 출력
		System.out.println("Hello, World!!");

		// 인사말 출력 v2 - 3번만 출력
		System.out.println("Hello, World!!");
		System.out.println("Hello, World!!");
		System.out.println("Hello, World!!");

		// 인사말 출력 v2.5 - 5번만 출력
		System.out.println("Hello, World!!");
		System.out.println("Hello, World!!");
		System.out.println("Hello, World!!");
		System.out.println("Hello, World!!");
		System.out.println("Hello, World!!");
		
		// 인사말 출력 v3 - 대상 변경 후 5번 출력
		// World -> Java
		System.out.println("Hello, Java!!");
		System.out.println("Hello, Java!!");
		System.out.println("Hello, Java!!");
		System.out.println("Hello, Java!!");
		System.out.println("Hello, Java!!");
		
		// 반복 횟수에 따라 코드를 복붙하기 번거로움
		// 반복 내용이 바뀌면 코드를 수정하기 번거로움
		
		// for문
		// 초기식, 조건식, 증감식을 이용해서 특정 코드를
		// 지정한 횟수만큼 반복하도록 작성하는 명령문
		// for(초기식; 조건식; 증감식){
		//				반복할 코드}
		// ex ) 1 ~ 10까지 정수 출력 v1 - 반복문 사용 x
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");
		
		// ex ) 1 ~ 10까지 정수 출력 v2 - 반복문 사용 o
			for(int i = 1; i <= 10; i ++) { // 증감식 "i += 1" 도 가능
				System.out.println(i);
			}
			
		// ex ) 1 ~ 50까지 홀수 출력 - 반복문 사용 o		
			for(int i = 1; i <=50; i += 2) {
				System.out.print(i+" ");
			}
			System.out.println(" ");
			
		// ex ) 1 ~ 50까지 짝수 출력 - 반복문 사용 o
			for(int i = 2; i <= 50; i += 2) {
				System.out.print(i+" ");
			}
			System.out.println(" ");
			
		// ex ) 1 ~ 100까지 총합 구해서 출력 v1 - 반복문 사용 o
			int sum = 0;
			for(int i = 1; i <= 100; i ++) {
				sum += i;
			}
			System.out.println("1 ~ 100까지 총합 : "+sum);
			
		
		// ex ) 1 ~ 100까지 총합 구해서 출력 v2
		// 가우스 덧셈 공식 이용	
			int sum2 = 0;
			for(int i = 1; i <= 100; i ++) {
				sum2 =(i + 100) * (100 / 2);
			}
			System.out.println("1 ~ 100까지 총합 : "+sum2);
			
	}
}