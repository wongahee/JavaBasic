package gahee.basic.day12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) throws IOException { // 예외 떠넘기기 -118줄
        // 예외(Exception)와 오류(Error)
        // 자바 프로그램 작성 시 문법에 맞지 않게 코드를 작성하면 컴파일 오류가 발생.
        // 또한, 코드가 제대로 작성되었다 해도 실행 중 예상치 못한 상황으로 오류 발생가능.

        // 이처럼 프로그램 실행 중에 예상치 못한 상황으로 프로그램의 실행에 영향을 주는 것을
        // 예외와 오류로 구분할 수 있음

        // 오류는 시스템 단계에서 심각한 문제를 야기해서 실행중인 프로그램을 강제로 종료시킴
        // 예 ) 네트워크 서버 중단, 메모리/자원 고갈
        // 이러한 오류는 개발자가 코드로 처리할 수 없음
        
        // 예외는 오류와 마찬가지로 실행 중인 프로그램을 강제 종료시키지만,
        // 발생할 수 있는 상황을 미리 예측해서 코드로 예방할 수 있다.
        // 예 ) 파일 경로를 잘못 작성, 데이터 값 잘못 입력

        // 개발자는 예외처리를 통해 예외상황을 처리할 수 있도록
        // 예외처리 코드를 작성할 수 있어야함.

        // 예외처리 전 (1)
        System.out.println("프로그램 시작1");
        System.out.println("프로그램 끝1");

        // 예외처리 전 (2)
        System.out.println("프로그램 시작2");
        int a = 20, b = 25;
        int c = a + b;
        System.out.println(c);
        System.out.println("프로그램 끝2");

        // 예외처리 전 (3)
/*      System.out.println("프로그램 시작3");
        int d = 10, e = 0;
        int f = d / e;                       // 오류 발생 -- 이 이후 문장은 실행되지 x
        System.out.println(f);
        System.out.println("프로그램 끝3");
*/
        // 예외처리 구문
        // 자바에서는 예외처리를 하기위해 try - catch - finally 구문을 사용함
        //-------------------------------------------------
        // try { 
        //      예외가 발생할 코드
        // } catch (예측한 예외상황1){
        //      예외 발생 시 실행할 코드
        // } catch (예측한 예외상황2){
        //      예외 발생 시 실행할 코드
        // }
        //-------------------------------------------------

        // 예외처리 1
        System.out.println("프로그램 시작4");
//        try {
//            int g = 10, i = 0;
//            int j = g / i ;         // 오류 발생
//            System.out.println(j);  // 실행 안됨
//        } catch (Exception ex) {
                // 예외상황을 명확하게 지정하지 않음
//            ex.printStackTrace();       // 오류사항 보기
//        }
        System.out.println("프로그램 끝4");

        // ex) 1 ~ 9 사이 정수만 입력받아 출력하는 프로그램
        //     정수가 아닌 다른 문자 입력 시 "잘못 입력하셨습니다." 출력
        //     + 예외처리 이용
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("1부터 9사이 정수를 입력하세요.");
            int num = sc.nextInt();
            System.out.println("입력한 정수 : " + num);
        } catch (Exception ex) {
            System.out.println("잘못 입력하셨습니다.");
            ex.printStackTrace();
        }

        // 예외의 종류
        // checked exception(검사형 예외), unchecked exception(비검사형 예외, 실행 예외)

        // 실행 예외(unchecked exception)
        // 명시적인 예외 처리를 강제하지 않음. => 코딩 구조를 강제로
        // 예외발생 시점 : 실행할 때(runtime) 임.
        // ArithmeticException, ArrayIndexOutOfBoundsException, InputMismatchException

        // 일반 예외(checked exception)
        // 명시적인 예외 처리를 강제함.
        // 예외 발생 시점 : 컴파일할 때
        // IOException, ClassNotFoundException

        // 임의의 성적 데이터를 c:/java/sungjuk.txt 에 저장하는 프로그램 작성
        String sjdata = "혜교 98 45 23";
        String fpath = "c:/Java/sungjuk.txt";

        try {
            FileWriter fw = new FileWriter(fpath);
            BufferedWriter bw = new BufferedWriter(fw); // 입출력 속도 빠르도록
            bw.write(sjdata);
            bw.close();
            fw.close();
        } catch (IOException e){
            e.printStackTrace();
        }

        // 예외처리 회피/양도/떠넘기기
        // 메서드 선언부에 throws를 사용해서
        // 해당 메서드에서 발생한 예외를 미리 명시하고
        // 메서드를 호출한 상위 메서드에서 이것을 처리할 수 있도록 함
        // 이를 통해서 각 하위 메서드들에서 발생하는 예외들을 한 곳에서 모아 처리할 수 있음
        // 또한, 메서드에 try-catch 문을 사용하지 않아도 된다는 장점이 있음
        fpath = "c:/abc123/Java/sungjuk.txt";
        FileWriter fw = new FileWriter(fpath);   // '예외를 메서드 시그니처에 추가' 누르기
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(sjdata);
        bw.close();
        fw.close();


   }

}
