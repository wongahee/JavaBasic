package gahee.basic.day05;
/*
 * 간단한 로그인 프로그램
 * > 중첩 if문 
 */
import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		
		// 키보드로 아이디, 비밀번호를 입력하여
		// 로그인 성공 여부를 출력하는 프로그램
		
		// setting ---------------------------
		// id : abc123
		// pw : 987xyz
		// 1. 아이디x, 비밀번호x - 로그인 실패!
		// 2. 아이디o, 비밀번호x - 비밀번호를 확인하세요.
		// 3. 아이디x, 비밀번호o - 아이디를 확인하세요.
		// 4. 아이디o, 비밀번호o - 로그인 성공!
		//  => 입력값에 따른 결과 처리가 복잡하므로 단순화시킴
		// 입력처리가 복잡해지면 코드도 복잡하게 짤수밖에 없음
		// 즉 1,2,3 => 로그인 실패, 4 => 로그인 성공
		
		// 변수선언
		String userid;
		String password;
		Scanner sc = new Scanner(System.in);
		String result;
		
		// 처리 - id,pw 입력받아 비교
	
		System.out.print(" 아이디를 입력하세요.");
		userid = sc.next();
		System.out.print(" 비밀번호를 입력하세요.");
		password = sc.next();
	
		/*// 중첩 if - 출력 결과 4가지 경우
		// 문자열 비교시 == 아닌 equals 메서드 사용
		if(userid.equals("abc123")) {     // id o
			 if (password.equals("987xyz"))
				 result = " 로그인 성공! ";
			 else
				 result = " 비밀번호를 확인하세요. ";
		}
		else {                      // id x
			if(password.equals("987xyz"))
				 result = " 아이디를 확인하세요. ";
			else 
				 result = " 로그인 실패 ";
		}
		
		
		// 위 코드 단순화 - 출력 경우 2가지
		// 위 코드처럼 4가지 경우로 작성하는 것은 코드 복잡
		if(userid.equals("abc123")) {
			if(password.equals("987xyz"))
				 result = " 로그인 성공! ";
			else
				 result = " 로그인 실패 ";
		}else
				 result = " 로그인 실패 ";
		*/
		
		// 출력 경우 3가지
		if(userid.equals("abc123") && password.equals("987xyz"))
			result  = " 로그인 성공! ";
		else
			 result = " 로그인 실패 ";
		// -> 조건식들을 논리식으로 재작성 - 코드 단순화
		
		// 결과 출력
		System.out.println(result);
		
	}//m
}//c