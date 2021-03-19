package gahee.basic.day01;

public class EX06 {
	public static void main(String[] args) {
		double x = 2.5;
		double y = 1.5;
		int m= 18;
		int n = 4;
		
		System.out.println( x + n * y - ( x + n ) * y);
		System.out.println( m / n + m % n);
		System.out.println( 5 * x - n / 5 );
		System.out.println( 1 - ( 1 - ( 1 - ( 1 - ( 1 - n )))));
		
		// 또는 한 줄을 두 줄로
		// result = x + n * y - ( x + n ) * y;
		// System.out.println(" x + n * y - ( x + n ) * y : " +result);
		
		

	}
}