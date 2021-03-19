package gahee.basic.day03;

import java.util.Scanner;
/**
 * @author gahee
 * @category javabasic
 * @version 1.1
 * 자바프로그램 기초 - 성적처리프로그램
 * 
 * 이름과 성적 데이터를 키보드로 직접 입력받아
 * 총점, 평균, 학점 처리하고 결과 출력
 * 
 */
public class SungJukV1c {
	public static void main(String []args) {
		//변수선언
		String name;
		int kor;
		int eng;
		int math;
		int tot;    //총점
		double avg; //평균
		char grd;   //학점
		
		//처리
		//키보드를 이용해서 성정데이터 입력받기위해 Scanner 클래스 초기화
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름은? ");
		
		name = sc.next();//키보드로 문자데이터를 입력받아 name 변수에 대입
		
		System.out.println("국어는? ");
		kor = sc.nextInt();
		
		System.out.println("수학은? ");
		eng = sc.nextInt();
		
		System.out.println("영어는? ");
		math = sc.nextInt();
		
		//총점, 평균, 학점 처리
		tot = kor + eng + math;
		avg = (double) tot / 3;
		grd = (avg >= 90) ? '수' :
			  (avg >= 80) ? '우' :
			  (avg >= 70) ? '미' :
			  (avg >= 60) ? '양' : '가'; // 조건식? ( T ) :( F )
										 // 조건식이 맞으면 T출력, 틀리면 F 출력
				
		//출력
		String fmt = "이름 : %s , 국어 : %d, 영어 : %d, 수학 : %d \n";
		System.out.printf(fmt, name, kor, eng, math);
		fmt = "총점 : %d , 평균 : %.1f, 학점 : %c";
		System.out.printf(fmt, tot, avg, grd);
	}
}