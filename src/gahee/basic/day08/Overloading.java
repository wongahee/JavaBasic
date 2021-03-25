package gahee.basic.day08;

public class Overloading {
    public static void main(String[] args) {
        // 오버로딩 Overloading - 메서드 다중 정의
        // 객체지향 3대 개념 중 '다형성'에 해당
        // 같은 이름의 메서드를 중복해서 정의하는 것을 의미
        // 메서드의 서명을 다르게 해서 한 클래스에서 같은 이름의 메서드를 2개이상 선언하는 것

        // 간단한 덧셈 수행 프로그램
        // 정수/실수 매개변수를 2개 또는 3개 이용 
        NonOver no = new NonOver();
        System.out.println(no.add_int( 10, 10 ));
        System.out.println(no.add_int3( 10, 10, 10 ));
        System.out.println(no.add_doube( 10, 10 ));

        Over ov = new Over();
        System.out.println(ov.add( 10, 10 ));
        System.out.println(ov.add( 10, 10, 10 ));
        System.out.println(ov.add( 10.0, 10.0) );   // 정수로 쓰게되면 정수로 출력됨
        System.out.println("");   // 문자열 매개변수
        System.out.println(' ');   //

    } // main

} //class

class NonOver{

    // 1. 정수 2개를 이용한 덧셈 메서드
    public int add_int(int a, int b) {
        return a + b;
    }
    // 2. 정수 3개를 이용한 덧셈 메서드
    public int add_int3(int a, int b ,int c){
        return a + b + c ;
    }
    // 3. 실수 2개를 이용한 덧셈 메서드
    public double add_doube(double a, double b){
        return a + b;
    }
}
    // nonover -> 다형성이 적용되지 않으면 생성한 메서드마다 이름을 제각각 정해야하므로
    // 개발자가 일일히 기억해서 사용해야하는 번거로움 초래

class Over {

    // 1. 정수 2개를 이용한 덧셈 메서드
    public int add(int a, int b) {
        return a + b;
    }

    // 2. 정수 3개를 이용한 덧셈 메서드
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // 3. 실수 2개를 이용한 덧셈 메서드
    public double add(double a, double b) {
        return a + b;
    }
    // over -> 다형성이 적용하면 기능은 달라도 메서드 이름을 통일해서 사용가능
    // 개발자가 메서드를 일일히 외우지 않아도 됨
    // 단, 메서드를 어떻게 호출할 것인지 알고있어야함.
    
}

