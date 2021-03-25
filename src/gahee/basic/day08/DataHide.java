package gahee.basic.day08;

import gahee.basic.day07.B; // 다른 패키지 클래스 사용 위해 선언(day07)

public class DataHide {
    public static void main(String[] args) {
        // 캡슐화 : Capsulation
        // 사용자가 굳이 알 필요없는 정보를 숨길 수 있는 기능
        // 최소한의 정보로 프로그램을 이해하고 사용할 수 있음
        
        // 접근지정자 AccessModifier
        // 클래스와 멤버변수, 메서드 선언시 정보은닉의 정도를 부여

        // 자바 접근지정자 4가지
        // public < protected < default < private (엄격)

        A one = new A();    // 동일 패키지 내 클래스(day08)
        System.out.println(one.c); // public 변수 c
        System.out.println(one.a); // default 변수 a
        // System.out.println(one.b); // private 변수 b -> 오류발생

        B two = new B();   // 다른 패키지 클래스(day07)
        //System.out.println(two.d);  // default 변수 d : 다른 패키지라 오류발생
        //System.out.println(two.e);  // private 변수 e : 오류발생
        System.out.println(two.f);  // public 변수 f
        
    } // main

} // class

class A{
    int a;          // default 접근지정
    private int b;  // private 접근지정 - class  A 에서만 사용가능
    public int c;   // public 접근지정 - 모든 곳에서 사용가능
}