package gahee.basic.day05;

import java.util.Scanner;

/*
 *  성적처리 프로그램 v2b
 *  switch를 이용해서 성적 데이터 입력을 계속 수행함
 *  
 */
public class SungJukV2b {
		public static void main(String []args) {
			
			// 변수 선언
			String name;
			int kor, eng, mat;
			int tot;
			double avg;
			char grd;
			String fmt = "%s, %d, %d, %d \n"  // 이름, 국, 영, 수
						+"%d, %.1f, %c \n";   // 총계, 평균, 학점
			
			Scanner sc = new Scanner(System.in);
			
			// 성적 처리 - 3번 반복
			int i = 1;
			while(i <= 3) {  // while문의 조건식을 (true)로 작성하면 
							 // 무한 반복문
				System.out.print("이름을 입력하세요 : ");
				name = sc.next();
				System.out.print("국어는?");
				kor = sc.nextInt();
				System.out.print("영어는?");
				eng = sc.nextInt();
				System.out.print("수학은?");
				mat = sc.nextInt();
				
				tot = kor + eng + mat ;
				avg = (double)tot / 3;
				
				/* if -else 문으로 변경
				grd = '가';
				if(avg >= 90) grd = '수';
				else if  (avg >= 80) grd = '우';
				else if  (avg >= 70) grd = '미';
				else if  (avg >= 60) grd = '양';
			 	else  grd ='가';
				*/
				
				// 학점 계산 switch 문으로 작성
				// avg : 99.9 => (int)avg : 99
				switch((int)avg / 10) {              // /10의 조건을 붙여 나머지로 case 조건을 적어줌
						case 10 : case 9: grd = '수'; break;
						case 8: grd = '우'; break;
						case 7: grd = '미'; break;
						case 6: grd = '양'; break;	
						default : grd ='가';
				}
				
				// 결과 출력
				System.out.printf(fmt, name, kor, eng, mat,
								   tot, avg, grd);
				++ i; // 반복 증감식
				
			}//while	
	}//main
}//class