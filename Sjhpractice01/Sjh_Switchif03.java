package Sjhpractice01;

import java.util.Scanner;

public class Sjh_Switchif03 {

	public static void main(String[] args) {
		System.out.println("문자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		char operator = sc.next().charAt(0);
		int num1 = 10;
		int num2 = 2;
		
		switch (operator)  {
		case '+': 
			System.out.println(num1 + num2);
			break;
		case '-': 
			System.out.println(num1 - num2);
			break;
		case '*':
			System.out.println(num1 * num2);
			break;
		case '/':
			System.out.println(num1 / num2);
			break;
		default: 
			System.out.println("연산자 오류 입니다.");
		}
		sc.close();
		
	}

}
