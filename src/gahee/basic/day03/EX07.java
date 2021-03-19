package gahee.basic.day03;
/*
 * 연습문제 07, 08 번
 */
public class EX07 {
	public static void main(String [] args) {
		
		// 7.
		System.out.println(3 + 4.5 * 2 + 27/8);
		
		// 연산 우선순위 : & - | - && - ||
		System.out.println(true || false && 3 < 4 ||!(5 == 7));
		System.out.println(true || (3 < 5 && 6 >= 2));
        
		//잘못된 비교 대상으로 오류	    
		//System.out.println(!true > 'A');
		
		// 단일 문자를 수식에 사용하면 자동으로 숫자형으로 바뀜
		// 숫자형으로 변환시 아스키 코드(ASCII) 값을 참조함
		// 0 : 48, A : 65, a : 97
		System.out.println(7 % 4 + 3- 2 / 6 * 'Z'); // 아스키코드(Z=90)
		System.out.println('D'+ 1 +'M'% 2 / 3); // 아스키코드(D=68, M=77)
		System.out.println(5.0 / 3 + 3 / 3);
		System.out.println(53 % 21 < 45 / 18);
		System.out.println((4 < 6) || true && false ||false && (2 > 3));
		System.out.println(7 - (3 + 8 * 6 + 3) - (2 + 5 * 2));
		System.out.println();
		
		// 8.
		System.out.print("May 13, 2021 fell on day number ");
		
		// (0000-1)년의 마지막 날 요일 출력
		// 0: 일요일, 1 : 월요일....., 6: 토요일
		System.out.println(((13 + (13 * 3 - 1) / 5 + 2021 % 100 + 2021 % 100 / 4 + 2021 / 400 - 2 * (2021 / 100)) % 7 + 7) % 7);
		
		System.out.print("Check out this line");
		System.out.println(" //hello there " + '9' + 7 ); // 문자, 숫자 "",'' 둘다 가능
		
		System.out.print('H' + 'I' + " is " + 1 + " more example "); //아스키코드 (H=72,I=73)
		System.out.print('H' + 6.5 + 'I' + " is " + 1 + " more example ");
	    
		System.out.print("Print both of us"+ "Me too");
		System.out.print(" Reverse " + 'I' + 'T' ); // ASCII CODE (I=73, T=84)
		System.out.print(" No! Here is " + 1 + " more example ");
		
		// 가로 개수 맞지 않고, 세미콜론 빠짐
		//System.out.print("Here is " + 10 * 10))  // that's 100;
		
		System.out.print(" Not x is " + true);    // that's true
	    
		// 출력할 대상이 지정되지 않아 오류 발생
		//System.out.print();
		// 괄호가 필요함
		//System.out.println;
		// 문자열에는 증감 연산자를 사용할 수 없다
		//System.out.print("How about this one" ++'?'+'Huh?');
			
	}
}