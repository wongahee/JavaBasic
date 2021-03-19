package gahee.basic.day01;

public class EX04 {

	public static void main(String[] args) {
		//4.
		//표현식 : expression
		//계산이나 처리를 위해 작성하는 식을 의미
		//수식에서 말하는 수식과 유사
		//중요한 특징 : 평가 evaluate
		//즉, 코드의 결과를 알아내는 과정을 의미
		
		int x, y, z, s0, v, t, g;
		int result;
		
		 x = 10;
		 y = 20;
		 z = 30;
		 s0 = 5;
		 v = 10;
		 t = 15;
		 g = 20;
		
    	result  = 3 * x;                         //또는 두줄을 한줄로 
    	System.out.println("3x = "+result);     //System.out.println("3x = "+ 3 * x);
    	 										//-------------------------------
    	                                        //밑줄 대체
    											//System.out.println("3x = ");
    	                                        // System.out.println(result);
    	result = 3 * x + y;
    	System.out.println("3 x + y =  "+result);

    	result = ( x + y ) / 7;
    	System.out.println("( x + y ) / 7 =  "+result);

    	result = (3 * x + y ) / ( z + 2 );
    	System.out.println("( 3 * x + y ) / ( z + 2 ) =  "+result);

    	result = s0 + v * t + g * (1/2) * t^2;		
    	System.out.println("s0 + v * t + g * (1/2) * t^2 =  "+result);

	}
}