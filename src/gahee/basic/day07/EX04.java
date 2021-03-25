package gahee.basic.day07;
/*
 *자바기초.docx 12, 16번 풀이
 */
import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {
        computeAge();
        computeChange();
/*
        // 12. 생년월일을 이용해서 나이를 계산하는 프로그램
        // 현재연도 - 출생년도
        // 만나이 : 생일이 지났으면 동일, 지나지않았으면 -1살
        int byear, bmonth, bday;    // 생년 월 일
        int cyear, cmonth, cday;    // 현재 년 월 일(current)

        Scanner sc = new Scanner(System.in);
        String fmt = "현재 : %d년 %d월 %d윌 \n " +
                     "생일 : %d년 %d월 %d윌 \n " +
                     "나이 : %d세";

        // 현재 날짜 설정
        cyear = 2021;
        cmonth = 3;
        cday = 24;

        // 생년월일 입력받음
        System.out.print("생년을 입력하세요 : ");
        byear = sc.nextInt();
        System.out.print("생월을 입력하세요 : ");
        bmonth = sc.nextInt();
        System.out.print("생일을 입력하세요 : ");
        bday = sc.nextInt();

        // 나이 계산
       int age = cyear - byear;
        if( bmonth < cmonth)
            age = age;
        else if(cmonth== bmonth && bday <= cday )
            age = age ;
        else
            age = age - 1;

        // 결과출력
        // ex ) 1985.2.25 => 2021.3.24 기준 36세 (생일 지남)
        // ex ) 1985.4.25 => 2021.3.24 기준 35세 (생일 안지남)
        System.out.printf(fmt, cyear, cmonth, cday, byear, bmonth, bday, age);

        // 16. 잔돈 계산하는 프로그램
        // 가격 : 54,320원, 지불액 : 10만원  => 잔돈 : 45,680원
        int price ,pay, change;
        int w50000, w10000, w5000, w1000, w500, w100, w50, w10;
        String fmt = "사용요금은 %d, 지불액은 %d 일때\n" +
                     "잔돈은 %d입니다. \n" +
                     "5만원권은 %d개, 1만원권은 %d개, \n" +
                     "5천원권은 %d개, 1천원권은 %d개, \n" +
                     "500원권은 %d개, 100원권은 %d개, \n" +
                     "50원권은 %d개, 10원권은 %d개 \n";

        Scanner sc = new Scanner(System.in);

        System.out.print("사용요금은? ");
        price = sc.nextInt();
        System.out.print("지불액은? ");
        pay = sc.nextInt();

        change = pay - price;              //ex ) change = 67890

        w50000 = change / 50000;           // 5만 1장
        change = change % 50000;        //change = change - (50000 * w50000);

        w10000 = change / 10000;
        change = change % 10000;       //change = change - (10000 * w10000);

        w5000 = change / 5000;
        change = change % 5000;       // change = change - (5000 * w5000);

        w1000 = change / 1000;
        change = change % 1000;       //change = change - (1000 * w1000);

        w500 = change / 500;
        change = change % 500;        //change = change - (500 * w500);

        w100 = change / 100;
        change = change % 100;        //change = change - (100 * w100);

        w50 = change / 50;
        change = change % 50;       //change = change - (50 * w50);

        w10 = change / 10;

        System.out.printf(fmt, price, pay, (pay - price), w50000, w10000, w5000, w1000, w500, w100, w50, w10);
*/
    }

    public static void computeAge() {
        int byear, bmonth, bday;    // 생년 월 일
        int cyear, cmonth, cday;    // 현재 년 월 일(current)

        Scanner sc = new Scanner(System.in);
        String fmt = "현재 : %d년 %d월 %d윌 \n " +
                     "생일 : %d년 %d월 %d윌 \n " +
                     "나이 : %d세";

        // 현재 날짜 설정
        cyear = 2021;
        cmonth = 3;
        cday = 24;

        // 생년월일 입력받음
        System.out.print("생년을 입력하세요 : ");
        byear = sc.nextInt();
        System.out.print("생월을 입력하세요 : ");
        bmonth = sc.nextInt();
        System.out.print("생일을 입력하세요 : ");
        bday = sc.nextInt();

        // 나이 계산
        int age = cyear - byear;
        if( bmonth < cmonth)
            age = age;
        else if(cmonth== bmonth && bday <= cday )
            age = age ;
        else
            age = age - 1;
        // 결과출력
        // ex ) 1985.2.25 => 2021.3.24 기준 36세 (생일 지남) 24세
        // ex ) 1985.4.25 => 2021.3.24 기준 35세 (생일 안지남) 23세
        System.out.printf(fmt, cyear, cmonth, cday, byear, bmonth, bday, age);
        System.out.println();
    }
    public static void computeChange(){
        int price ,pay, change;
        int[] wons = {0, 0, 0, 0, 0, 0, 0, 0};      //or new int[8]; 배열로 지폐종류 선언
        int[] notes = {50000, 10000, 5000, 1000, 500, 100, 50, 10}; // 나누는 값

        String fmt = "사용요금은 %d, 지불액은 %d 일때\n" +
                     "잔돈은 %d원입니다. \n" +
                     "5만원권은 %d개, 1만원권은 %d개, \n" +
                     "5천원권은 %d개, 1천원권은 %d개, \n" +
                     "500원권은 %d개, 100원권은 %d개, \n" +
                     "50원권은 %d개, 10원권은 %d개 \n";

        Scanner sc = new Scanner(System.in);

        System.out.print("사용요금은? ");
        price = sc.nextInt();
        System.out.print("지불액은? ");
        pay = sc.nextInt();

        change = pay - price;

        for(int i = 0; i < wons.length; ++i) {
            wons[i] = change / notes[i];
            change = change % notes[i];
        }

        System.out.printf(fmt, price, pay, (pay - price),
                          wons[0],  wons[1],  wons[2],  wons[3],
                          wons[4],  wons[5], wons[6], wons[7]);

    }

} //c