package gahee.basic.day06;
/*
 *자바기초.docx 12, 16번
*/
import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {
        // 12. 생년월일을 이용해서 나이를 계산하는 프로그램을 작성하여라.
        // computeBirth
        computeBirth();

        // 16.고객에게 돌려줘야 하는 잔돈을 화폐단위로 계산하는 프로그램을 작성하시오.
        // 즉, 잔돈을 돌려주기 위해 10원, 50원, 100원, 500원, 1000원, 5000원, 10000원, 50000원 등이
        // 몇 개 필요한지 계산하는 것이다.
        // computeChange
        computeCharge();

    } //m

    public static void computeBirth(){
        int year;
        int birth;
        int nai = 0;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("출생년도를 입력하세요 ");
        year = sc.nextInt();
        System.out.print("출생일을 입력하세요 ");
        birth = sc.nextInt();

        nai = 2021 - year + 1;

        String fmt = "올해 나이는 %d세입니다.";
        System.out.printf(fmt, nai);
        String fmt2 = "올해 만나이는 %d세입니다.";
        System.out.printf(fmt, nai);
        System.out.println();
    }

    public static void computeCharge() {
        int price, money, charge;
        int ohMan, man, ohCheon, cheon, ohBaek, Baek, ohSip, sip;

        Scanner sc = new Scanner(System.in);

        System.out.println("상품 금액을 입력하세요.");
        price = sc.nextInt();
        System.out.println("지불할 금액을 입력하세요.");
        money = sc.nextInt();

        charge = price - money;

        ohMan = charge / 50000;
        man = (charge % 50000)/10000;
        ohCheon = charge / 5000;
        cheon = (charge % 5000)/1000;
        ohBaek = (charge % 1000)/500;
        Baek = (charge % 500)/100;
        ohSip = (charge % 100)/50;
        sip = (charge % 50)/10;

        System.out.println("거스름돈은 " +charge+ "원입니다.");
        System.out.print("50000원권 : " + ohMan + "장, ");
        System.out.print("10000원권 : " + man + "장, ");
        System.out.print("5000원권 : " + ohCheon + "장, ");
        System.out.println("1000원권 : " + cheon + "장");
        System.out.print("500원권 : " + ohBaek + "장, ");
        System.out.print("100원권 : " + Baek + "장, ");
        System.out.print("50원권 : " + ohSip + "장, ");
        System.out.println("10원권 : " + sip + "장 필요!!");
    }

} //c