package gahee.basic.day01;
/**
 * 
 * @author gahee
 * @category javabasic
 * @version 1.0
 * 자바프로그램 기초 - 성적처리프로그램
 * 입력 : 이름, 국,영,수
 * 처리 : 총점,평균,학점
 * 출력 : 이름 ,국,영,수, 총점,평균,학점
 * 단 학점은 A,B,C,D,F
 */
public class SungJukV1 {
	public static void main(String [] args) {
		
		//변수 선언
		String name;
		int kor;
		int eng;
		int math;
		int tot;  //총점
		double avg; //평균
		char grd; //학점   char 은 ''사용
 		
		//처리
		name = "홍길동";
		kor = 95;
		eng = 78;
		math = 84;	
		tot = kor + eng + math;
		avg = tot / 3;  //  또는  (kor + eng + math) / 3;
		grd = '가';
		
		//결과 출력
		System.out.print("이름 : ");  // 또는 System.out.print("이름 : "+name);
		System.out.println(name);
		System.out.print("국어 : ");  // 또는 System.out.print("국어 : "+kor);
		System.out.println(kor);
		System.out.print("영어 : ");  // 또는 System.out.print("영어 : "+eng);
		System.out.println(eng);
		System.out.print("수학 : ");  // 또는 System.out.print("수학 : "+math);
		System.out.println(math);
		System.out.print("총점 : ");  // 또는 System.out.print("총점 : "+tot);
		System.out.println(tot);
		System.out.print("평균 : ");  // 또는 System.out.print("평균 : "+avg);
		System.out.println(avg);
		System.out.print("학점 : ");  // 또는 System.out.print("학점 : "+grd);
		System.out.println(grd);
		
	/*	System.out.println("국어, 영어, 수학 : " +kor, eng, math);
		System.out.println("총점, 평균, 학점 : " +tot, avg, grd);
 	*/
		
	}

}
