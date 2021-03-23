package gahee.basic.day06;

import java.util.Arrays;

/*
 * 자바기초.docx
 * 54~56 문제 풀기
 */
public class EX03 {
    public static void main(String[] args) {
        // 배열 다루는 예제
        // 54. 다음 코드 실행 시 결과는?
        char [] letter;
        letter = new char[3];    // 문자 3개를 저장할 수 있는 배열 선언
        letter[0] ='a';
        letter[1] ='b';         // letter 배열의 각 위치에 a,b,c 문자를 저장
        letter[2] ='c';         // 위 5줄 char[] letter ={'a','b','c'}; 로 함축 가능

        for ( int i = 0; i < 3; i++) {
            System.out.print(letter[i] + ", ");
        } // 19 줄 빨간 원 break (우클릭 > 디버스, f7누르면 배열 순차보기)
        System.out.println();

        // 배열 다루는 예제 2
        double [] a = {1.1, 2.2, 3.3};
        System.out.println(a[0] + " " + a[1] + " " + a[2]);
        a[1] = a[2];         // 3번째 요소 값을 2번째 요소에 대입
        System.out.println(a[0] + " " + a[1] + " " + a[2]);
        System.out.println();

        // 배열 다루는 예제 3
        int [] sampleArray = new int [10];

        //for ( int idx = 1; idx <= sampleArray.length; ++idx)
        //    sampleArray[idx] = 3 * idx;

        // [][][][][] [][][][][]  => new int [10]
        // [][3][6][9][12] [15][18][21][24][27]
        // 배열의 인덱스 범위 : 0~9(10개)
        // 반복문 인덱스의 범위 : 1~10(10개)=> ArrayIndexOutOfBoundsException(배열인덱스경계초과)
        // 위 두줄 수정 ('=' 빼기)
        for( int idx = 1; idx < sampleArray.length; ++idx) //배열변수명.length : 배열의 크기
            sampleArray[idx] = 3 * idx;

       // for( int idx = 0; idx <= sampleArray.length; ++idx)
        //    System.out.println(sampleArray[idx] + ",");

        // 배열에 정의하고 값 저장하기 1
        // 1 2 3 4 5 6 7 8 9 10
        int[] num1 = new int[10];
//        num1[0] = 1;
//        num1[1] = 2;
//        num1[2] = 3;
//        num1[3] = 4;
//        num1[4] = 5;
//        num1[5] = 6;
//        num1[6] = 7;
//        num1[7] = 8;
//        num1[8] = 9;
//        num1[9] = 10;
//        System.out.print(num1 [0]);
//        System.out.print(num1 [1]);
//        System.out.print(num1 [2]);
//        System.out.print(num1 [3]);
//        System.out.print(num1 [4]);
//        System.out.print(num1 [5]);
//        System.out.print(num1 [6]);
//        System.out.print(num1 [7]);
//        System.out.print(num1 [8]);
//        System.out.println(num1 [9]);

        //for (int i = 1; i < num1.length; ++i){
        //    num1[i - 1] = i;
        //}
        //    [][1][][][] [][][][][]    boundary 오류 발생!!!

        // 수정된 코드
        for (int i = 0; i < num1.length; ++i) {
             num1[i] = i + 1;
         }
        //    [1][2][3][4][5] [][][][][]
        // or
        for (int i = 0; i < num1.length; ++i){
            System.out.print(num1[i] +", " );
        }
        System.out.println();

        // 배열에 정의하고 값 저장하기 2
        // 0 2 4 6 8 10 12 14 16 18 20
        int[] num2 = new int[11];

        for (int i = 0; i < num2.length; ++i) {
            num2[i] = i * 2;
            System.out.print(num2[i] + ", ");
        }
        System.out.println();

        // 배열에 정의하고 값 저장하기 3
        // 1 4 9 16 25 36 49 64 81 100
        int[] num3 = new int[11];
        for (int i = 1; i < num3.length; ++i){
            num3[i] = i * i;     //= (int)Math.pow((i+1), 2)  pow(밑수, 지수)
            System.out.print(num3[i] + ", ");
        }
        System.out.println();
        // or
        // int[] num3 = new int[10];
        // for (int i = 0; i < num3.length; ++i){
        //     num3[i] = (i+1) * (i+1);

        // 배열에 정의하고 값 저장하기 4
        // 0 0 0 0 0 0 0 0 0 0
        int[] num4 = new int[10];
        for(int i = 0; i < num4.length; ++i){
            System.out.print(num4[i] + ", ");
        }
        System.out.println();
        // 참고 : 참조 자료형 변수는 new 연산자로 객체 생성 시
        // 미리 변수에 기본값이 할당됨
        // 숫자형 : 0, 객체형 : null

        // 배열에 정의하고 값 저장하기 5
        // 1 4 9 16 9 7 4 9 11 => 규칙이 안보임
        int[] num5 = {1, 4, 9, 16, 9, 7, 4, 9, 11};
        for(int i = 0; i < num5.length; ++i){
            System.out.print(num5[i] + ", ");
        }
        System.out.println();

        // 56.
        // 입력 : 0 11 2 33 4 55 6 77 8 99
        // 출력 : 99 8 77 6 55 4 33 2 11 0

        // 인덱스를 증가시키며 배열을 역순출력 (++i)
        int [] num6 = {0, 11, 2, 33, 4, 55, 6, 77, 8, 99};

        for(int i = 0; i < num6.length; ++i){
            System.out.print(num6[num6.length - 1- i]+ ", ");
       }
       // or
       // 인덱스를 감소시키며 배열을 역순출력 (--i)
       // for(int i = (num6.length - 1); i  >= 0; --i){
       //     System.out.print(num6[i]+ ", ");
       // }
        System.out.println();
    }
}