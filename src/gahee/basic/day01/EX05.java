package gahee.basic.day01;

public class EX05 {
	public static void main(String[] args) {
		
		// 예상값 : 1, 실제값 : 0.0
		// 정수 나누기 정수의 결과값은 정수이기 때문
		// 1 / 3 = 0(소숫점 생략)
		double number = ( 1 / 3 ) * 3;
		System.out.println("( 1 / 3 ) * 3 = " + number);
		
		// 예상값 : 2.3333, 실제값 : 2
		int quotient = 7 / 3 ;
		System.out.println(7 / 3);
		
		// 나눈 값의 나머지 값 출력
		int remainder = 7 % 3 ;
		System.out.println(7 % 3);
		
		// 	복합대입연산자
		// 산술 연산자와 대입연산자를 합쳐놓은 연산자
		// ex ) a = a + 1 => a += 1
		int result=11;
		System.out.println( result /= 2 );
	}
}