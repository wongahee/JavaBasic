package gahee.basic.day11;

import java.util.StringTokenizer;

public class StringToken {
    public static void main(String[] args) {
        // StringTokenizer 클래스
        // 문자열을 지정한 문자로 분리하는데 사용
        // 이렇게 쪼개진 각 문자들을 token 이라 부름
        // StringTokenizer 와 split 비교
        // 단순한 문자열을 나눌 때 -> StringTokenizer
        // 복잡한 문자열을 정규식을 이용해 나눌 때 -> split
        String str = "this string include default delims";

        String words1[] = str.split(" "); // regular express
        for(int i = 0; i < words1.length; ++i)
            System.out.print( words1[i] + " ");
            System.out.println("");

        //StringTokenizer st = new StringTokenizer(str);
        // 기본 구분자에 의해 문자열을 적절히 쪼갬
        StringTokenizer st = new StringTokenizer(str, " ");
        // 지정 구분자로 문자열을 쪼갬. 둘 다 가능
        
       System.out.println( st.countTokens() );
        while( st.hasMoreTokens() ) {
            System.out.println( st.nextToken() + " ");
        }
        // StringTokenizer는 iterable 자료구조임
        // 즉, 배열의 세련된 객체형식이라 보면됨 (Collection, 컬랙션)
        // 따라서, 분리된 토큰들은 차례대로 하나씩 순회하면서 처리할 수 있음
        System.out.println("");






    }
}
