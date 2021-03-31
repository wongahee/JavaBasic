package gahee.basic.day11;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class JavaCalendar {
    public static void main(String[] args) {
        // *자바에서 시간, 날짜 다루기*
        // JDK 1에서 제공하는 Date 클래스를 이용해서 날짜, 시간 처리 가능
        // but, JDK 1.1에 나온 Calendar 클래스를 이용한 날짜, 시간 처리를 수행을 권장
        // 하지만, JDK 1.1 사용 시 날짜 처리 시 윤년을 고려하지 않거나,
        // 월을 표시할때 1부터 표시하지 않고 0부터 표시하는 등의 문제 존재
        // 따라서, 더 나은 성능의 Joda-Time이라는 라이브러리가 JDK 8에 추가됨

        // Date 클래스
        Date d = new Date();
        System.out.println( d.toString() );

        String fmt = "%d년 %d월 %d일 %d시 %d분 %d초\n";;
        System.out.printf(fmt, d.getYear()+1900, d.getMonth()+1, d.getDate(),
                            d.getHours(), d.getMonth(), d.getSeconds());  // 지수선: 지원하지 x

        // Calendar 클래스
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());

        System.out.printf(fmt, c.get(Calendar.YEAR), c.get(Calendar.MONTH)+1, c.get(Calendar.DAY_OF_MONTH),
                          c.get(Calendar.HOUR_OF_DAY), c.get(Calendar.MINUTE), c.get(Calendar.SECOND));

        System.out.println("오늘은 " + c.get(Calendar.DAY_OF_WEEK)+"요일입니다.");
        // 일요일 :1, 월 :2, ... , 토 :7

        System.out.println("오늘은 2021년 중 " +c.get(Calendar.DAY_OF_YEAR)+ "일째날입니다.");

        // 오늘 기준 5일 후 날짜는? (add 메서드 이용)
        c.add(Calendar.DATE,5);
        System.out.println( c.getTime() );

        // 오늘 기준 100일 후 날짜는?
        c = Calendar.getInstance();
        c.add(Calendar.DATE, 100);
        System.out.println( c.getTime() );

        // 오늘 기준 11일 전 날짜는?
        c = Calendar.getInstance();
        c.add(Calendar.DATE, -11 - 4); // 11일째 출석날 -학원시작 3/15 (주말 4일 더빼기)
        System.out.println( c.getTime() );

        // 오늘 아내가 아이를 가졌어요, 10개월 후는 언제?
        c = Calendar.getInstance();
        c.add(Calendar.MONTH, 10);
        System.out.println( c.getTime() );

        // SimpleDataFormat
        // 날짜, 시간 출력을 원하는 형태대로 다양하게 출력
        fmt = "yyyy-MM-dd HH:m:s";
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        System.out.println( sdf.format(d) );

        c = Calendar.getInstance();
        System.out.println( sdf.format( c.getTime() ) );

        // JDK 8에 추가된 jodatime 사용하기
        // java.time 패키지
        // 날짜를 표현할 때는 LocalDate
        // 시간을 표현할 때는 LocalTime
        // 둘 다 표현할 때는 LocalDateTime
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        System.out.println(time);
        System.out.println(date);





    }
}
