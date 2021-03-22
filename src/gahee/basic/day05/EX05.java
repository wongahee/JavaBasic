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
		
	}

}
