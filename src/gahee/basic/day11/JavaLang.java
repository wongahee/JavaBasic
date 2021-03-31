package gahee.basic.day11;

import gahee.basic.SungJuk.SungJukVO;

public class JavaLang {
    public static void main(String[] args) {
        // java.lang  패키지
        // 자바 프로그램에서 가장 기본이 되는 클래스와 인터페이스를 보관
        // import 문 없이 사용가능
        // Math, String, StringBuilder

        // Object 클래스
        // 모든 클래스의 조상
        // toString, equals, hashCode 외 6개의 메서드가 추가 정의되어 있음
        // 대다수 클래스는 Object 클래스가 제공하는 toString과 equals 메서드를
        // 오버라이딩해서 사용

        Member m = new Member();
        m.userid = "abc123";
        m.passwd = "987xyz";

        String fmt = "아이디 : %s, 비밀번호 : %s \n";
        System.out.printf(fmt, m.userid, m.passwd);
        // 출력할 변수가 많아지면 코드도 복잡해짐
        // 또한, 출력 횟수가 여러 번이면 코드를 중복 작성
        // => 클래스의 멤버 변수를 출력할 때는 toString 메서드 사용

         System.out.println( m.toString() );
         // toString 메서드를 이용해서 출력함
        
        // Class 클래스
        // 실행 중인 자바 프로그램 내부에 포함된 클래스와 인터페이스 정보를 제공
        // 또한, 동적으로 객체를 생성할 수도 있음

        // Math 클래스
        // 다양한 수학적 연산을 위한 메서드 제공
        // 모든 메서드가 static이기 때문에 객체 생성없이 바로 메서드 호출 가능
        // max, min, random, ceil(올림), floor(내림), round(반올림)
        System.out.println("원주율 : " + Math.PI);
        System.out.println("반올림 수 : " + Math.round(10.0) + " / " +
                                         Math.round(10.4) + " / " +
                                         Math.round(10.7));
        System.out.println("올림 수 : " + Math.ceil(10.0) + " / " +
                                         Math.ceil(10.4) + " / " +
                                         Math.ceil(10.7));
        System.out.println("내림 수 : " + Math.floor(10.0) + " / " +
                                         Math.floor(10.4) + " / " +
                                         Math.floor(10.7));

        // ex ) 전체 게시물 수 : 125
        //      페이지당 게시물 수 : 10
        //      총 페이지 수는?  125 / 10 = 12...5  => 13개
        System.out.println("총 페이지 수는? " + Math.ceil( (double)125/10 ));

        // ex ) 3.1415926에서 round 메서드를 이요해서 소수점 2째자리까지 구하려면?
        System.out.println( Math.round ( Math.PI * 100 ) / 100.0 );

        // max, min : 최대값, 최소값
        System.out.println(Math.max(10, 11));
        System.out.println(Math.max(-10, -11));
    }
}

class Member {
    String userid;
    String passwd;

    @Override // ctrl + space -> toString
    public String toString() {
        String fmt = "{ userid : '%s', passwd : '%s' } \n";
        String result = String.format(fmt, userid, passwd);

        return result;
    }
}
