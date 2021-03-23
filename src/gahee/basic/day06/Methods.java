package gahee.basic.day06;

public class Methods {
    public static void main(String[] args) {
        // 메서드
        // 어떤 특정 작업을 수행하기 위한 코드들의 집합
        // C 언어의 함수와 유사
        // 유사한 코드들의 반복적인 사용을 피할 수 있음
        // 모듈화로 프로그램의 이해도를 높일 수 있음
        // 코드 문제 발생, 기능 변경시 쉽게 유지보수할 수 있음

        // 형식
        // 접근지정자 반환타입 메서드이름(매개변수목록){     => public static void main()
        //          메서드 몸체
        //          return 변수(반환타입)
        //      }
        
        // 접근지정자 : 메서드 접근허용 범위 지정 (public , private - 지정한 것만 사용o, ,)
        // 반환타입 : 메서드 실행 후 반환하는 자료의 타입
        //   -> 없는 경우 void 로 정의 void(= 공허, 무)
        // 매개변수목록 : 메서드 호출 시 전달하는 변수 지정

        // 메서도 호출
        // 메서드명();
        // 메서드명(매개변수 값);

        // ex) 1 ~ 10 사이 난수 10개 생성 v1
       /*
        for(int i =1; i <= 10; ++i) {
             int magic = (int) (Math.random() * 10) + 1;     // 난수 생성
            System.out.print(magic + " ");
        }
        System.out.println();

        // ex) 1 ~ 10 사이 난수 10개 생성 v2
        for(int i =1; i <= 10; ++i) {
                make_magic();
        }
        */
        // 인사말 출력 v1
        System.out.println("Hello, World!!");

        // 인사말 출력 v2
        sayHello();

        // 인사말 출력 v2b - "Hello, Java" 메세지 출력
        sayHello2();

        // 인사말 출력 v3 - 인사말 대상을 변수화
        sayHello3("World");    // Hello, World
        sayHello3("Java");     // Hello, Java

        // 인사말 출력 v4 - 반환 타입이 있는 메서드
        String say = sayHello4("Python");
        System.out.println(say);

    } //main

        // 1 ~ 10 사이 임의의 난수를 출력하는 메서드
        public  static void make_magic() {
            int magic = (int) (Math.random() * 10) + 1;     // 난수 생성
            System.out.print(magic + " ");
        }
        // 간단한 인사말을 출력하는 메서드 1
        public static void sayHello() {
            System.out.println("Hello, World!!");
        }

        // 간단한 인사말을 출력하는 메서드 2
        public static void sayHello2() {
            System.out.println("Hello, Java");
        }

        // 간단한 인사말을 출력하는 메서드 3
        // 인사말을 구성한 후, 콘솔에 출력
        public static void sayHello3(String msg) {
            System.out.println("Hello, "+ msg + "!!");
        }

        public static String sayHello4(String msg){       // (void -> string)
            String say = "Hello, " + msg + "!!";          // msg의 타입형과 동일하게 변경
            return say;
        }
} //c