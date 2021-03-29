package gahee.basic.day10;

// 다국어로 인사하는 프로그램 작성
// 한글, 영어, 일본어

public class SayHello {
    public static void main(String[] args) {
        // 개별 작성
        SayHelloKor say1 = new SayHelloKor();
        say1.sayHello();

        SayHelloEng say2 = new SayHelloEng();
        say2.sayHello();

        SayHelloJpn say3 = new SayHelloJpn();
        say3.sayHello();

        // 다형성 이용해서 작성 - 한번만 객체를 생성해서 사용
        SayHelloService say = new SayHelloKor();
        say.sayHello();
        
        say = new SayHelloEng();
        say.sayHello();
        
        say = new SayHelloJpn();
        say.sayHello();

    }
}

interface SayHelloService {
     void sayHello();
}

class SayHelloKor implements SayHelloService {
    @Override
    public void sayHello( ) {
        System.out.println("안녕하세요, 자바8!");
    }
}

class SayHelloEng implements SayHelloService {
    @Override
    public void sayHello( ) {
        System.out.println("Hello, Java8!!");
    }
}

class SayHelloJpn implements SayHelloService {
    @Override
    public void sayHello( ) {
        System.out.println("こんにちは、ジャワ8!!");
    }
}