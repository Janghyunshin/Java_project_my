package chap03;

import java.util.Scanner;

public class SjhScanner {
	private static Scanner scanner;

	public static void main(String[] args) {
		System.out.println("정수값을 입력하세요?");
		scanner = new Scanner(System.in); 
		
		int value1 = scanner.nextInt();
		

		 /* 삼항 연산자
		  *  System.out.println();(value1 % 3 == 0) ? "3의 배수입니다." : "3의 배수가 아닙니다.";
		  */
		 
		if  (value1 % 3 == 0) {
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println("3의 배수가 아닙니다.");
		}
		
		System.out.println();
		scanner.close();
		

	}

}
