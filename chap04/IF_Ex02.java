package chap04;
public class IF_Ex02 {
	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 2;
		char operator = '+' ;
		
		int result = 0;
		
		if (operator == '+' ) {
			result = num1 + num2;
		}
		else if (operator == '-' ) {
			result = num1 - num2;
		}else if (operator == '*' ) {
			result = num1 * num2;
		}else if (operator == '/' ) {
			result = num1 / num2;
		}else {
			System.out.println("연산자 오류 입니다.");
			return;
		}
		System.out.println( "결과 값은 : " +result + " 입니다.");
	
	}

}
