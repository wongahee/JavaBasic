package gahee.basic.day04;
/*
 *  연습지
*/
import java.util.Scanner;

public class mo {
	public static void main(String []args) {
// for 문 구구단		
		for(int i = 1; i <= 9; i ++) {
			System.out.println(" 7 x " + i + " = " +(7 * i));
		}
		
		System.out.println("------------");

// while 문 구구단 +printf
		int i = 1;
		String fmt = " 7 x %d = %2d \n";
		while( i <= 9) {
		System.out.printf(fmt, i, (7 * i));
					++i;
		}
		System.out.println("------------");

// 구구단
		i = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력하세요");		
		int dan = sc.nextInt();
		
		fmt ="%d x %d = %2d \n";
		
		while(i <=9) {
		System.out.printf(fmt , dan, i, (dan*i));
						++ i;
		}
		
		
		
	}
}
