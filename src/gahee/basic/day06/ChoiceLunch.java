package gahee.basic.day06;

import java.util.Random;

public class ChoiceLunch {
    public static void main(String[] args) {
        // 배열을 이용한 점심메뉴 고르기 프로그램
        // 메뉴 7개 -> idx 변수의 범위는 0~6
        String[] menu = {"김밥", "라면", "돈까스", "우동", "짜장면", "햄버거", "짬뽕"};
        // 난수생성 1
        //Random rnd = new Random();
        //int idx = rnd.nextInt(7);   // 난수 생성  7만 작성하면 됨

        // Math.random() 을 이용해서 실제 난수가 만들어지는 원리를 알아봄
        double magic = Math.random();
        
        System.out.println(magic * 10);  // 0~9 사이 임의의 난수 생성
        System.out.println((int)(magic * 10));  // 정수로 만들기
        System.out.println(magic * 100);  // 0~99 사이 임의의 난수 생성

        // 0~ (b-1) 범위 난수 : random * b
        System.out.println(magic * 100);   // 0~ 99

        // a ~ b 범위 난수 : random % (최대값 - 최소값) + 최소값
        // 1 ~ 45 미만 범위 난수(1~44)
        System.out.println((int)(magic % (45 - 1 )) + 1);

        // 메뉴 출력을 위한 난수 생성 표현식
        int idx = (int)(Math.random() * 7);
        // 생성된 난수로 메뉴 랜덤 출력
        System.out.println(menu[idx]);


    } // m

}// c
