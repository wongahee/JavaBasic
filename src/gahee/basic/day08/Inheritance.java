package gahee.basic.day08;

public class Inheritance {

    public static void main(String[] args) {
      // 상속 : Extends, Inheritance
      // 객체지향 3대 개념 중 하나
      // 기존 클래스에 기능을 추가하거나 재정의해서 새로운 클래스 생성
        
      // 상속을 이용하면 기존에 만들어둔 클래스의 모든 필드와 메서드를 이용해서
      // 새로운 클래스를 편리하게 만들 수 있음
      // 기존 클래스를 부모/상위/슈퍼 클래스라 하고,
      // 새롭게 작성된 클래스를 자식/하위/서브 클래스라 한다.

      // 상속의 장점
      // 기존에 작성된 클래스를 재활용 가능하다.
      // 클래스의 계층구조 파악에 용이하다.
      // 소프트웨어 생산성이 향상된다.

      // 형식
      // class 클래스명 extends 부모클래스명 { }

        Tiger2 t = new Tiger2();
        System.out.println(t.eye);
        System.out.println(t.leg);

    } //main

} //class

// 상속 사용 x
class Eagle{
     String eye;
     String mouth;
     String wing;

    public void eat( ){ };
    public void sleep( ) { };
    public void fly( ){ };
}

class Tiger {
    String eye;
    String mouth;
    String leg;

    public void eat( ){ };
    public void sleep( ){ };
    public void run( ){ };
    }

class Goldfish {
    String eye;
    String mouth;
    String fin;   // 지느러미

    public void eat( ){ };
    public void sleep( ){ };
    public void swim( ){ };

}

// 상속 사용 o - animal에 공통 매개변수, 메소드 넣기
class Animal {
    String eye;
    String mouth;

    public void  eat( ){ };
    public void sleep( ){ };
}

class Eagle2 extends Animal {
    String  wing;

    public void fly() {}
}

class Tiger2 extends Animal {
    String leg;

    public void run() {}
}

class Goldfish2 extends Animal {
    String fin;

    public void swim( ){ };
}

