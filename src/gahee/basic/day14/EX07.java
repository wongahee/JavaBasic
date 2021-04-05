package gahee.basic.day14;

// 문제 정답풀이

import java.util.Scanner;

public class EX07 {
    public static void main(String[] args) {
        // 추가문제) 두 수를 입력받아 두 사이의 모든 값의
        //           총합을 구하는 코드를 작성하세요.
        // ex) 10 3 => 3 ~ 10까지의 총합 
        //     3 10 => 위와 동일

        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력하세요.");
        int num1 = sc.nextInt();
        System.out.print("두번째 숫자를 입력하세요.");
        int num2 = sc.nextInt();

        // num1 < num2 인 경우
//        int sum = 0;
//        for (int i = num1; i <= num2; ++i){
//            sum += i;
//        }
//
//        String fmt = " %d 와 %d 사이의 합은 %d";;
//        System.out.printf(fmt, num1, num2, sum);

//----------------------------------------------------------------------------------------

        // num1 > num2 인 경우
//        int sum = 0;
//        for(int i = num2; i <= num1; ++i){    // 이 부분만 num1과 num2의 자리를 바꿔줌
//            sum += i;
//        }
//
//        String fmt = " %d 와 %d 사이의 합은 %d";;
//        System.out.printf(fmt, num1, num2, sum);

//----------------------------------------------------------------------------------------

        int begin = num1;
        int end = num2;
        int sum = 0;

        if (num1 > num2) {               // num1, num2에 같은수를 넣어도 더해지지않음
            begin = num2; end = num1;
        }

        for(int i = begin; i <= end; ++i){
            sum += i;
        }

        String fmt = " %d 와 %d 사이의 합은 %d";
        System.out.printf(fmt, begin, end, sum);
        System.out.println(" ");

//----------------------------------------------------------------------------------------

        // 가우스 덧셈을 이용하면 간단히 계산 가능
        // (i + j) * (j - i + 1) / 2  (단, i < j일때)
        sum = (num1 + num2) * (Math.abs(num2 - num1) + 1) / 2;  // 절대값 지정해주기 Math.abs
        System.out.println(sum);

    } //main
} //class
