package gahee.basic.day11;

import java.util.Scanner;

public class WrapperClass {
    public static void main(String[] args) {
        // wraper class
        // 기본자료형 변수를 참조자료형 변수로 변환하는 클래스
        // int -> Integer, double -> Double, char -> Character, boolean -> Boolean
        // 프로그램에 따라 기본 자료형의 데이터를 참조자료형으로 바뀌
        // 취급할 때가 있음
        // 메서드의 매개변수가 객체형을 요구하면 그에 따라 객체형을 사용해야 함

        int a = 123;
        Integer b = new Integer(a);
        // Boxing(박싱) : 기본자료형 변수를 참조자료형 변수로 변환
        System.out.println(a);
        System.out.println(b);
        // 박싱을 통해 클래스의 장점을 활용할 수 있는 변수로 변환함

        Scanner sc = new Scanner(System.in);
        //int number = sc.next();
        System.out.println("숫자를 하나 입력하세요");
        int number = Integer.parseInt(sc.next());
        // 문자 입력값을 정수로 변환함

        int c = b.intValue();
        // Unboxing(언박싱) : 참조자료형 변수를 기본자료형 변수로 변환
        // or

        Integer d = 456;  // new Integer 사용 안 함
        // 자동 박싱 적용
        int e = d ;        // intValue 사용 안 함
        // 자동 언박싱 적용

        // 10진수를 2진수로 변환하기
        // 4 => 100
        System.out.println( Integer.toBinaryString(4) );

        // 두 수를 비교해서 큰지, 작은지, 같은지 출력
        // compareTo(수1, 수2)
        // 결과값 : 1, 0, -1
        System.out.println( b.compareTo(d) );  // 작다 : -1

        System.out.println( Integer.compare(b, d) ); // 작다 : -1





    }
}
