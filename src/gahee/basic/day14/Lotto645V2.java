package gahee.basic.day14;

import java.util.*;

public class Lotto645V2 {
    public static void main(String[] args) {
        // 로또 645 프로그램 만들기
        // ArrayList를 이용해서 1 ~ 45사이 임의의 6개 숫자 생성
        // 중복은 허용x
        // Random - nextInt, while

        // 중복 발생
//        for (int i = 1; i <= 6; ++i) {
//            int key = rnd.nextInt(45) + 1;
//            System.out.print(key + " ");
//        }

//      // HashSet으로 다시 작성
//        Set<Integer> lotto = new HashSet<>();
//
//        for (int i = 1; i <= 6; ++i) {
//            int key = rnd.nextInt(45) + 1;
//            lotto.add(key);
//        }
//
//       // 출력
        // 오류 발생 - 중복이 발생하면 1개만 출력되어 6개 숫자 발생이 x
//        for (Integer k : lotto){
//            System.out.print(k + " "); // 오류발생!
//        }
//        System.out.println("");

        Set<Integer> lotto = new HashSet<>();

        while (lotto.size() < 6){
            Random rnd = new Random();
            
            int key = rnd.nextInt(45 ) + 1;  // 45범위내에 난수 6번 반복
            lotto.add(key);
        } // 중복값이 나오지 않을때까지 뽑기를 계속 무한 반복 
          // 복원 추출 : 한번 뽑은 것을 다시 뽑을 수 있음

        for (Integer k : lotto){
            System.out.print(k + " ");
        }
            System.out.println("");

    } //main
} //class
