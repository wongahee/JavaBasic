package gahee.basic.day11;

import java.util.Date;
import java.util.Locale;

public class JavaString {
    public static void main(String[] args) {
        // String 클래스
        // java.lang 패키지에 포함된 클래스
        // 문자열을 나타내기 위해 c언어에서 char 배열로 표현하지만,
        // 자바에서는 String 이라는 클래스를 사용함
        // String 객체는 한번 생성되면 그 값을 읽기만 가능하고, 수정은 불가하다
        // => 불변 객체 (immutable object)
        // String 객체 값 비교 시 equals 메서드 사용
        // chatAt, concat, indexOf, trim, length, toLowerCase&toUpperCase, split, substring


        // 자바에서 String 객체는 메모리 재활용(interning)을 함.
        // 즉, 생성된 String 객체 값을 String Pool에 저장하는데,
        // 그 다음에 생성한 String 객체값이 이전과 유사한 경우
        // String Pool에 이미 만들어둔 객체를 재활용함
        String str1 = "Hello, World!!" ;                        // 힙 영역 내 상수 풀에 생성
        String str2 = new String("Hello, World!!") ;    // 힙 영역에 생성
        String str3 = "Hello, World!!" ;                        // 힙 영역 내 상수 풀에 생성

        // 문자열 비교 시 == 연산자는
        // 값의 동등을 비교하는 것이 아니라
        // 값의 위치를 비교함 (참조값 비교)
        if ( str1 == str2 )
            System.out.println("str1과 str2의 저장 위치가 같음");
        if ( str1 == str3 )
            System.out.println("str1과 str3의 저장 위치가 같음");
        
        // 문자열 비교 시 equals 메서드를 사용하면
        // 변수에 저장된 값을 비교함
        if ( str1.equals(str2) )
            System.out.println("str1과 str2는 값이 같음");
        if ( str1.equals(str3))
            System.out.println("str1과 str3은 값이 같음");
// ----------------------------------------------------------------------

        // charAt : 문자열의 특정 위치에 있는 index에 있는 문자를 반환
        String jumin = "123456-1234567";
        if( jumin.charAt(7) == '1' )  // 8번째 글자가 1이라면 index : 0부터 시작
            System.out.println("남자입니다.");

// ----------------------------------------------------------------------

        // concat : 두 문자열을 하나로 이어 묶음
        // 문자열의 + 연산자를 사용하면 StringBuilder로 변환한 후 
        // Append로 문자열을 더하고 toString으로 문자열을 변환
        // 따라서, 2개의 문자열을 합칠 때는 concat으로, 3개 이상은 +로 합치는 것이 적합
        String a = "Hello ";
        String b = "World!!";
        System.out.println( a.concat(b) );

// ----------------------------------------------------------------------

        // indexOf : 특정 문자열이 처음 등장하는 위치를 알아냄
        //           문자열이 존재하지 않을 경우 -1 반환
        //           보통 문자열 내에 특정 문자가 포함되어 있는지 알아낼 때 사용
        String c = "Hello, World!!";        // 띄어쓰기 포함해서 7번째
        System.out.println( c.indexOf("World") );

        String d = "abc123.jpg";
        System.out.println( d.indexOf('.') ); // 0부터 시작하므로 6번째

        String e = "123412341234";
        System.out.println( e.indexOf("12") );

        // fromIndex : 시작위치 재조정 매개변수 => -2번째(3)부터 12
        System.out.println( e.indexOf("12", 2) );
        
        // lastIndexOf : 오른쪽부터(<-) 특정 문자열의 index(위치) 찾기
        System.out.println( e.lastIndexOf("12") );

// ----------------------------------------------------------------------

        // trim : 문자열 입력 시 쓸데없는 공백을 제거 시 사용
        String f = " abc123 ";
        String g = " 987 xyz ";
        System.out.println("[" + f + "]/" + "[" + f.trim() + "]");
        System.out.println("[" + g.trim() + "]");
        // 단, 문자열 가운데 공백은 제거되지 않음
        // -> replace 메서드를 이용해 제거 가능

// ----------------------------------------------------------------------

        // length : 문자열의 길이(개수)를 반환하는 메소드
        System.out.println( a.length() );
        System.out.println( c.length() );
        System.out.println( e.length() );

        String h = "안녕하세요, 자바!!";
        System.out.println( h.length() );

        // getByte : 문자열의 실제 바이트 수를 반환하는 메소드
        System.out.println( h.getBytes().length );
        // UTF-8 에서는 한글은 3byte 로 인식
        System.out.println( e.getBytes().length );  //12

// ----------------------------------------------------------------------

        // toLowerCase, toUpperCase : 대소문자 변환에 사용
        //   대->소       소->대
        String i = "abcdef";
        String j = "ABCDEF";
        System.out.println( i.toUpperCase(Locale.ROOT) );
        System.out.println( j.toLowerCase(Locale.ROOT) );

        // split : 특정 문자를 기준으로 문자열을 잘라 배열에 넣는 메서드
        String k = "혜교 78 56 12";
        String [] datas = k.split(" " );
        for ( int z = 0 ; z < datas.length ; ++z)
        System.out.println( datas[z] );
        System.out.println("");

        // ex ) "hello, java!!"라는 문자열에서 각 단어의 첫글자를 대문자로 변환하는
        // 코드 작성 (Capitalization) 결과 : H \n J
        String l = "hello, java!!" ;
        String [] words = l.split(" " );    // 띄어쓰기 기준 문자열 자르기
        System.out.println( (words[0].charAt(0) + "").toUpperCase() );
        // words 배열 위치 0인문자를 대문자로
        System.out.println( (words[1].charAt(0) + "").toUpperCase() );

// ----------------------------------------------------------------------        
        // replace : 특정 문자열을 다른 문자열로 바꾸는 메서드
        // replace(기존 문자, 바꿀 문자)
        System.out.println( h.replace( "자바", "파이썬") );
        
        // String e = "123412341234"; 12를 98로 변경
        System.out.println( e.replace("12","98") );

        String m = "1234-4567-9812";
        System.out.println( m.replace( "-", ":") );

        // ex) "hello, java!!" 라는 문자열에서 각 단어의 첫글자를 대문자로 변환하는
        // 코드 작성 (Capitalization) 결과 : Hello, Java!!
        String word1 =  (words[0].charAt(0) + "").toUpperCase();
        String word2 =  (words[1].charAt(0) + "").toUpperCase();
        l = l.replace("h", word1 );
        l = l.replace("j", word2 );
        System.out.println(l);

        // suvstring : 문자열의 시작 위치부터 끝위치 -1까지의 문자열을 추출하는 메서드
        // substring(시작)   
        //      or
        // substring(시작, 끝-1)

        // ex ) 주민번호 코드에서 생년월일을 추출
        // 123456-1234567 (13자리) 0 ~ 14
        System.out.println( jumin.substring(0, 6) ); // 0 ~ 5까지

        // ex ) 주민번호 코드에서 생년월일을 제외한 나머지 추출
        System.out.println( jumin.substring(7) );
        System.out.println( jumin.substring(7, 14) );

        // valueOf : 숫자를 문자로 변환 시 사용하는 메서드
        int height = 123;
        System.out.println( height + ""); //or
        System.out.println( String.valueOf(height) ); //or
        System.out.println( Integer.toString(height) );
        
        // format : c언어의 printf처럼 서식 문자열을 이용해서
        //          변수와 문자열을 조합해서 문자열을 생성하는 메서드
        // System.out.printf 메서드는 생성된 문자열을 화면에 출력하는데만 사용
        Date today = new Date();

        // %tY : year, %tm : month, %td: day, %tH: hour, %tm: minute, %ts : second t=time
        String fmt = "%tY년 %<tm월 %<td일 %<tH시 %<tM분 %<tS초 \n"; // 소/대문자도 차이있음
        String result = String.format(fmt, today);
        System.out.println(result);

        // StringBuilder, StringBuffer
        // String 객체는 불변 객체이므로 새로운 문자열이 추가되면 기존 공간 대신
        // 새 공간을 생성한 후 추가 -> 메모리 낭비 심함
        // StringBuilder나 StringBuffer를 이용하면 기존 공간에 바로 문자열을 추가해
        // 메모리를 절약할 수 있다.
        // 따라서, +를 이용한 문자열 결합보다는 StringBuilder를 이용하는 것이 나음.
        StringBuilder sb = new StringBuilder();

        sb.append("Hello, ").append("World").append("!!");
        System.out.println( sb.toString() );  // 문자열 형태로 바꿔야함







    }

}
