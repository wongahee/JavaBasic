package gahee.basic.day09;

public class Interfaces {
    public static void main(String[] args) {
        // 인터페이스 Interface
        // 객체지향 프로그래밍 핵심은 추상화 (abstract)
        // 즉, 복잡한 자료, 모듈, 시스템으로부터
        // 핵심적인 개념 또는 기능을 간추리는 것을 의미
        // -> 이것을 이용해서 중복된 소스코드를 줄이고, 느슨한 결합도를 유지할 수 있음

        // 추상화라는 개념을 적절하고 효율적으로 사용할 수 있도록
        // 문법적으로 지원해주는 논리적 도구가 인터페이스이다.

        // 추상메서드와 상수만으로 구성된 클래스를 인터페이스라함.
        // 어떤 클래스를 만들때 추상메서드를 통해 기본이 되는 틀을 제공하여
        // 규칙에 맞게 코드를 짜도록 함
        // 클래스와는 달리 다중상속을 지원

        // 인터페이스 작성 시 interface 라는 예약어를 사용하고,
        // 인터페이스 구현 시 implements 라는 키워드를 사용한다.

        // 객체생성 & 출력
        Cat3 c = new Cat3();
        c.cry();

        Murloc m = new Murloc();
        m.cry();

        Dog3 d = new Dog3();
        d.cry();

    } //main

} //class

abstract class Animal3 {
    protected int height;
    protected int weight;

    // abstract public void cry();
    // -> 클래스의 기능에 해당하는 부분은 인터페이스를 통해 구현하도록 만든다.

}

interface Animal3Action{
    abstract public void cry();
}

// implements : 구현
class Cat3 extends Animal3 implements Animal3Action {

    @Override
    public void cry() {
        System.out.println("양옹 야옹~");
    }
}

class Dog3 extends Animal3 implements Animal3Action {

    @Override
    public void cry() {
        System.out.println("멍멍멍 ");
    }
}

class Murloc extends Animal3 implements Animal3Action {   // 게임캐릭터

    @Override
    public void cry() {
        System.out.println("아올옳옳옳올옳옳~" );
    }
}
