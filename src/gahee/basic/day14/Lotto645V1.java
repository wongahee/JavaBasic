package gahee.basic.day14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lotto645V1 {
    public static void main(String[] args) {
        // 로또 645 프로그램 만들기
        // ArrayList를 이용해서 1 ~ 45사이 임의의 6개 숫자 생성
        // 중복은 허용x
        // Random - nextInt, remove
        // 비복원 추출 - 한번 뽑은 것을 다시 뽑을 수 없음

        // 뽑은 번호값을 저장할 동적배열
        List<Integer> lotto = new ArrayList<>();

        // 1 ~ 45 숫자를 동적배열 초기화 - 번호들을 list배열에 넣어줌
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <=45; ++i){      
            nums.add(i);
        }

        // 난수를 이용해서 총 6개의 숫자를 뽑음  
        for(int i = 0; i < 6; ++i){                 // 위치값 난수 생성 6번 반복
            Random rnd = new Random();
            int idx = rnd.nextInt(45 - i );
            // 1 ~ 45의 숫자가 들어있는 배열의 요소 위치값을 난수로 생성
            
            lotto.add(nums.get(idx)); // 위치값으로 숫자를 뽑아 lotto 동적배열에 저장

            nums.remove(idx);  // 뽑은 숫자는 배열에서 제거함
        }

        // 결과 출력
        for(Integer key : lotto){
            System.out.print(key + " ");
        }

    } //main
} //class
