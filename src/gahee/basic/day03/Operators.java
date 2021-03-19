package gahee.basic.day03;

public class Operators {
	public static void main(String[] args) {
		// 개발자용 폰트
		// 개발자의 취향에 따라 합자(ligature)를 지원하는 폰트 사용여부 결정
		// 합자 : =< 쓸시 ≤로 합쳐서 표현됨
		// 합자 퐅트 사용 시, 수학기호를 따로 표시하거나 붙여 표현하는 것 결정 가능
		// 글꼴 : d2coding, cascadia (@붙은 글꼴 사용x)
		
		// 연산자(Operator)
		// 여러 종류의 연산을 수행하기 위한 기호
		
		// 산술연산, 비교연산, 논리연산, 삼항연산(조건연산)
		// 산술연산 : 사칙연산을 다루는 연산 ( +, -, *, /, %)
		int x = 30, y = 15;   // 변수 선언과 초기화를 동시에 수행
		System.out.println("두 수 30, 15의 연산");
		System.out.println(" + 연산 : " + (x + y));
		System.out.println(" - 연산 : " + (x - y));
		System.out.println(" * 연산 : " + (x * y));
		System.out.println(" ÷ 연산 : " + (x / y));  // ÷ 기호 (ㄷ+한자)
		System.out.println(" % 연산 : " + (x % y));  // mod 연산(나머지)
		System.out.println("");
		
		// 비교 연산 : 값의 상대적인 크기를 핀딘하는 연산
		// 왼쪽 피연산자를 기준으로 오른쪽 피연산자를 비교
		// 비교 연산의 결과는 논리값(참, 거짓)으로 반환
		System.out.println(" > 연산 : " + (x > y));
		System.out.println(" < 연산 : " + (x < y));
		System.out.println(" ≤ 연산 : " + (x <= y));
		System.out.println(" ≥ 연산 : " + (x >= y));
		System.out.println(" ≠ 연산 : " + (x != y));
		System.out.println(" = 연산 : " + (x == y));
		System.out.println("");
		
		// 논리 연산 : 주어진 논리식을 판단
		// 논리 연산의 결과는 논리값(참, 거짓)으로 반환
		// 보통 2개 이상의 비교 연산식으로 구성됨
		// 논리곱 연산(and) : &, &&(short-circuit 지원)
		// 논리합 연산(or) : |, || 
		// 논리 부정연산(not) : !
		
		// 단축식 평가(short-circuit)
		// 여러 개의 논리식 중에 어떤 식에 의해 참 거짓이 판명되면
		// 나머지 논리식을 평가하지 않음
		boolean result = (x > y) & (x!= y);  
		System.out.println("(x > y) and (x!= y) : " +result);
	
		// 조건 연산 (삼항연산자)
		// 3개의 피연산자를 이용해서 조건에 따라
		// 특정 피연산자를 취하도록 사용하는 특수한 연산자
		// 형식 : 조건식 ? 참일때 값 : 거짓일때 값
		String result2 = 
				(x > y) ? "x가 큽니다." : "y가 큽니다."; // () 꼭 없어도 됨
		System.out.println(result2);
		
		// 증감 연산자
		// 피연산자의 값을 하나 증가,감소 시킴
		// 피연산자의 어느 쪽에 위치하는지에 따라 연산의 순서가 달라짐
		// i = 1 => i = i + 1 => i += 1 => i++
		//       => i = i + 3 => i += 3 
		int a = 7, b = 7;
		int result3 = ++a + 10;  // a값 먼저 증가시킨 후 연산참여(전치) 7+1+10
		int result4 = b++ + 10; // 연산참여 후 a값 증가시킴(후치) 7+10+1
		System.out.println("++a + 10 = " +result3);
		System.out.println("b++ + 10 = " +result4);

		//50p 6번
		double a1 = 3.141562;
		int  b1 = (int)a1;
		System.out.println(b1);
	}
}