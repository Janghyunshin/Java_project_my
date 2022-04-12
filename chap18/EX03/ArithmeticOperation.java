package chap18.EX03;

import java.util.Scanner;

// 1. 스캐너를 사용해서 double의 두 수를 인풋 받습니다.
// 2. 방법1. 람다식을 사용해서 인풋받은 두값을 +,-,*,/ , 사칙연산을 구현해서 출력
// 3. 방법2. 인터페이스를 구현한 자식 객체를 사용해서 인풋받은 두값을 +,-,*,/ , 사칙연산을 구현해서 출력
// 4. 방법3. 익명이너클래스를 사용해서 인풋받은 두값을 +,-,*,/ 사칙연산을 구현해서 출력.
// 5. ArithmeticException 처리 : 0 으로 나누면 예외 발생이 되므로 예외 처리 , int(0), double <== 해당 사항이 아님 

// 완료시간 : 13:10

@FunctionalInterface
interface Arithmetic {
	void arithmetiOpr (double a, double b);
}

class ArithmeticImpl implements Arithmetic {
	@Override
	public void arithmetiOpr(double a, double b) {
		System.out.println("a + b : " + (a + b) + " , " + "a - b" + (a-b) + " , " +
				"a * b : " + (a * b) + " , " + " a / b : " + (a / b) );	
	};
}


public class ArithmeticOperation {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 실수를 공백을 구분해서 입력하세요 >> ");
		// 내답안 
		/*
		Arithmetic a1 = (a, b) -> {System.out.println(a + b);};
		Arithmetic a2 = (a, b) -> {System.out.println(a - b);};
		Arithmetic a3 = (a, b) -> {System.out.println(a * b);};
		Arithmetic a4 = (a, b) -> {System.out.println(a / b);};
		
		System.out.println("a값을 입력하세요");
		double a= sc.nextDouble();
		System.out.println("b값을 입력하세요");
		double b= sc.nextDouble();
		System.out.print("+ 값: "); 
		a1.arithmetiOpr(a, b);
		System.out.print("- 값: ");
		a2.arithmetiOpr(a, b);
		System.out.print("* 값: "); 
		a3.arithmetiOpr(a, b);
		System.out.print("/ 값 : ");
		a4.arithmetiOpr(a, b);
		*/
		
		// 선생님 답안
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		// 1. 람다식 : 인터페이스의 추상메소드를 익명클래스로 생성한 것의 약식표현이다.
		  
		Arithmetic a1 = (x,y) -> {System.out.println("a + b : " + (x+y) + " , " + "a - b" + (x-y) + " , " +
		"a * b : " + (x * y) + " , " + " a / b : " + (x / y) );};
		
		a1.arithmetiOpr(a,b);
		
		//2 
		Arithmetic a2 = new ArithmeticImpl();
		
		// 3. 익명 이너 클래스
		
		Arithmetic a3 = new Arithmetic() {
			@Override
			public void arithmetiOpr(double a, double b) {
				System.out.println("a + b : " + (a+b) + " , " + "a - b" + (a-b) + " , " +
						"a * b : " + (a * b) + " , " + " a / b : " + (a / b) );};
						
		};
		
	}
}
