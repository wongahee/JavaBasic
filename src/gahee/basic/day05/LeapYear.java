package gahee.basic.day05;

import java.util.Scanner;
/*
 * 자바기초.dox 27번 문제
 * 
 * 윤년 여부를 출력하는 프로그램
 * 지구의 공전주기(365.24일)와 자전주기(0.24일)의 불일치로 발생
 * 이 둘 간의 오차로 4년마다 하루를 추가하는 방법으로 오류 보정
 * < 4년마다 2월 29일생김 >
 * 
 * 입력받은 년도의 윤년 체크
 * 조건 
 * - 4로 나누어떨어지지만 100으로 나눠떨어지지 않음
 * - 단 400으로 나누어 떨어짐.
 * 1600(윤년), 2020(윤년), 1900(평년), 2021(?)
 */
public class LeapYear {

	public static void main(String[] args) {
			
		// 변수 선언
		int year;
		String result;
		
		Scanner sc = new Scanner(System.in); 
		System.out.print("년도를 입력하세요.");              // ln 제거
		year= sc.nextInt();
		
		if((year % 4 == 0 && year % 100 != 0)||(year % 400 == 0)) 
				result = year+"년은 윤년입니다.";
		else 
				result = year+"년은 평년입니다.";
		
		System.out.println(result);
	}
}