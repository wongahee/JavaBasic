package gahee.basic.day05;

import java.util.Random;

public class Arrays {

	public static void main(String[] args) {
		// 배열
		// 같은 종류의 여러 개의 데이터를 저장하는 자료형 
		// 배열을 구성하는 각 값 : 요소
		// 해당 요소의 위치 : index라는 숫자 값
		// 배열 생성 시 몇개의 요소를 저장할 것인지 미리 지정해야 함
		// 배열 index는 0부터 시작
		// 1차원 ,2,3차원 배열까지 지원
		
		// 회원정보를 저장하는 배열 생성
		// userid , pwd, age
		
		// 선언 방법
		// 자료형[] 배열 변수명;  (v)추천
		// 자료형 배열 변수명[];
		
		// 초기화
		// 배열 변수 = new 자료형[개수];
		String[] uid;
		String[] pwd;
		int[] age;
		
		// new : 참조형 객체를 생성하라는 의미의 연산자
		// 기본 자료형 객체는 변수에 실제 값을 저장한다.
		// 참조 자료형 객체는 변수에 그 값의 위치 값을 저장한다.
		// 따라서, 실제 값을 알아내려면 위치값 + 변위를 적용해야함
		uid = new String[3];    // 3명분의 id를 저장할 수 있는 배열변수 선언
		pwd = new String[3];  
		age = new int[3];  
		
		System.out.println(uid);
		System.out.println(pwd);
		System.out.println(age);
		
		// 참조형 변수를 출력하면 
		// 그 변수값이 저장된 곳의 시작번지가 출력됨
		
		// * JVM의 메모리 구조
		// 스택 : 일반적인 변수가 선언될 때 사용하는 공간
		// 	      기본/참조 자료형 변수들이 주로 사용
		
		// 힙 : 객체형 자료(인스턴스instance)가 저장되는 공간
		//		즉, 프로그램에서 new 연산자를 사용하여
		//		객체가 만들어지면 해당 객체의 정보를 이곳에 저장
		//		저장된 객체의 위치값은 스택에 생성된 변수에 저장
		
		// 배열 요수 다루기
		// 배열명 [index] = 값;        => 배열의 특정요소에 값 저장
		uid[0] ="abc123";
		uid[1] ="abc987";
		uid[2] ="abc456";
		
		// 배열의 요소 출력 => '배열명[index];'
		// 배열의 요소를 다룰때는 반복문 사용할 것!
		//System.out.println(uid[0]);
		//System.out.println(uid[1]);
		//System.out.println(uid[2]);
		
		for(int i = 0; i < 3; ++i) {
			System.out.println(uid[i]);
		}
		
		// 1~45사이 임의의 숫자 6개를 출력하는 프로그램 v1
		// 난수(random value) : 임의의 숫자
		// Random class를 이용하면 원하는 형태의 난수 생성 가능
		int[] lotto =new int [6];
		
		// 난수표를 이용해서 난수 생성
		Random rnd = new Random();
		
		lotto[0] = rnd.nextInt(45) + 1 ;       //nextInt(boundary) 경계 : 0~44
		lotto[1] = rnd.nextInt(45) + 1 ;       // 0 ~ (경계-1) 범위의 난수 생성
		lotto[2] = rnd.nextInt(45) + 1 ;
		lotto[3] = rnd.nextInt(45) + 1 ;
		lotto[4] = rnd.nextInt(45) + 1 ;
		lotto[5] = rnd.nextInt(45) + 1 ;
		
		for(int i = 0; i < 6; ++i) {
		System.out.println(lotto[i]);
		}
		
		
		
		
		
		
	} //m
} //c