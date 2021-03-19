package gahee.basic.day03;

public class TestCast {
	public static void main(String []args) {
		
		// 자바의 JVM은 기본적으로 32bit 단위로 계산
		byte x = 127;       // byte는 1byte 크기의 자료형
		byte y = 127;
        byte z = (byte)(x + y);  // x + y로 작성 시 오류 발생  
		// byte형 변수 연산 시 자동으로 int자료형으로 변환
		// 따라서, 결과를 byte로 저장할 시 
		// int->byte로 변환하는 과정이 필요
		
		// 성적 처리 시 적절한 평균 계산하기
		int kor = 87;
		int eng = 78;
		int math = 64;
		
		//double avg = ( kor + eng + math ) / 3.0;  -> 숫자를 실수로
		//double avg = ( kor + eng + math ) / (double)3;  -> 숫자에 자료형을 기재
		double avg = (double)( kor + eng + math ) / 3;   // 변수를 실수로
		
		//System.out.println("평균은 " + avg + " 점 입니다.");
		String fmt = "평균은 %.1f 입니다.";
		System.out.printf(fmt, avg);
		
	}
}