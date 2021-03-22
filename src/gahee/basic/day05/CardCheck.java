package gahee.basic.day05;

import java.util.Scanner;

/*
 * 
 * 자바기초 dox 33번 문제
 * 카드 체크문제
 * 신용카드 번호 첫글자로 어떤 종류의 은행인지 출력하는 프로그램
 * 
 * setting
 * 첫글자 -> 3 : JCB, 4 : VISA, 5: MASTER
 * 문자열.charat(자릿수) : 지정한 자릿수의 문자 하나 추출 v
 * 문자열.substring(시작, 끝) : 지정한 시작 ~ (끝-1) 위치 문자들 추출
 */
public class CardCheck {

	public static void main(String[] args) {

		String number;
		String cardtype = "";
		String cardbank = "";
		String fmt = "카드 종류는 %s이고, %s 입니다.";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("카드번호 6자리를 입력하세요.");
		number= sc.next();
		
		// 1) 카드종류 - if 중첩문
		 if(number.charAt(0) == '3') 
			 	cardtype = "JCB 카드";
		 else if(number.charAt(0) == '4') 
			 	cardtype = "VISA 카드";
		 else if(number.charAt(0) == '5') 
			 	cardtype = "MASTER 카드";
		
		 // 2) 카드종류 - switch 문
		 /*
		 switch(number.charAt(0)) {
				case '3' : cardtype = "JCB 카드"; break; 
				case '4' : cardtype = "VISA 카드"; break; 
				case '5' : cardtype = "MASTER 카드"; break;
		
		 System.out.println(cardtype);
		 */
		 
		// 카드사 이름 
		switch(number) {
		case "356317" : cardbank = "NH농협카드"; break;
		case "356901" : cardbank = "신한카드"; break;
		case "356912" : cardbank = "KB국민카드"; break;
		case "404825" : cardbank = "비씨카드"; break;
		case "438676" : cardbank = "신한카드"; break;
		case "457973" : cardbank = "KB국민카드"; break;
		case "515594" : cardbank = "신한카드"; break;
		case "524353" : cardbank = "외환카드"; break;
		case "540926" : cardbank = "KB국민카드"; break;
		}
		System.out.printf(fmt, cardtype, cardbank);		
	}//m
}//c