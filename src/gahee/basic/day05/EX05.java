package gahee.basic.day05;
/*
 * 자바기초.docx
 * 54~56 문제 풀기
 */
public class EX05 {

	public static void main(String[] args) {
		// 54. 다음 코드 실행 시 결과는? 
		char [] letter = {'a', 'b', 'c'};
		for ( int index = 0; index < letter.length; index++)
		  System.out.print(letter[index] + ", ");
		
		double [] a = {1.1, 2.2, 3.3};
		System.out.println(a[0] + " " + a[1] + " " + a[2]);
		a[1] = a[2];
		System.out.println(a[0] + " " + a[1] + " " + a[2]);
		
		int [] sampleArray = new int [10];
		for ( int index = 1; index <= sampleArray.length; index++)
		 sampleArray[index] = 3 * index;
		// 55.
		// 가.
		//int[] array = new int [10];
		//
		//for(int i = 1; i <= 10; ++i) {
		//	System.out.print(i+" ");
		//	}
		//System.out.println();

		/* 나.
		int[] array2 = new int [10];

		for(int i = 0; i < 21; i +=2) {
			System.out.print(i+" ");
			}
		System.out.println();
*/
		/*
		// 다.
		int[] array3 = new int [10];
		for(int i = 1; i < 101; i *=i) {
			System.out.print(i+" ");
			}

		System.out.println();

		// 라.
		int[] array4 = new int [10];

		for(int i = 0; i < 10; ++i) {
			System.out.print(array4[i]+" ");
			}
		System.out.println();

		// 마.
		int[] array5 = new int [10];
		for(int i = 1; i < 21; i +=2) {
			System.out.print(i+" ");
			}

		System.out.println();
		*/
		// 56.
		// 0 11 2 33 4 55 6 77 8 99
	}

}
