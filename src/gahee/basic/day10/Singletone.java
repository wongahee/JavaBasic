package gahee.basic.day10;
// 싱글톤 클래스
// 어떤 클래스가 최초 한번만 메모리에 생성되고
// 객체로 만들어 사용하는 디자인 패턴
// 생성자의 호출이 반복적으로 이루어져도 최초 생성된 객체만을 반환
// 하나의 객체를 재사용하므로 메모리 낭비를 방지
// private 생성자, static 변수 사용, 객체에 대한 getter 정의

public class Singletone {
    public static void main(String[] args) {

     ServiceOne so1 = new ServiceOne();
     so1.name = "첫번째";
     ServiceOne so2 = new ServiceOne();
     so2.name = "두번째";

     System.out.println(so1.name + " " + so2.name);
     // so1과 so2.의 name 변수값은 서로 다름 - 인스턴스 변수
     // ServiceTwo sw1 = new ServiceTwo();
     // private 생성자이므로 new 키워드로 객체 생성은 불가능

    ServiceTwo sw1 = ServiceTwo.getInstance();
    sw1.name = "첫번째";
    System.out.println(sw1.name);

    ServiceTwo sw2 = ServiceTwo.getInstance();
    System.out.println(sw2.name);
    // singleton -> 하나의 객체만 만듬 sw1 = sw2
    }
}

class ServiceOne {
    String name;
    public ServiceOne() { }  // 생성자 - public
}

class ServiceTwo {
    private static ServiceTwo stwo;  // static 단 하나
    String name;

    private ServiceTwo() { } // 생성자 - private

    public static ServiceTwo getInstance() {
        if (stwo == null) stwo = new ServiceTwo();
        // stwo 객체가 한번도 생성되지 않았으면 객체 생성
        return stwo;
    }
}
