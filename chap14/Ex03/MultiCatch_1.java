package chap14.Ex03;

public class MultiCatch_1 {

	public static void main(String[] args) {
		
		// 1. 단일 Exception 처리 try catch 처리
		// ArithmeticException
		try {
			System.out.println( 10/0 );
		} catch (ArithmeticException e ) {
			//catch 블락의 아무 내용이 없어도 예외처리
			System.out.println("정상출력 (ArithmeticException)");
		}
		
		// NumberFormatException
		try {
			int num = Integer.parseInt("10A");
		} catch (NumberFormatException e ) {
			System.out.println("정상 출력(NumberFormatException)");
		}
		 
		System.out.println("===========================");
		
		// 2. 다중 Exception 처리
		
		try {	// try 블락에서 여러 예외가 발생된 경우
			System.out.println(10/0);
			int num2 = Integer.parseInt("10A");
		} catch (ArithmeticException e) {
			System.out.println("0 ArithmeticException 출력");
		} catch (NumberFormatException e) {
			System.out.println("1 NumberFormatException 출력");
		}
		
		System.out.println("====================");
		// 3. 다중 Exception 처리 2 
		
		try {
		System.out.println( 10/0 );
		int num3 = Integer.parseInt("10A");
		} catch (ArithmeticException | NumberFormatException e) {
			System.out.println("다중 예외 처리 ");
		}
		
		System.out.println("프로그램 종료");
				
	}

}
