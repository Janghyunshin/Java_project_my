package Sjhpractice01;
public class Sjh_SwitchIf {
	public static void main(String[] args) {

		/*
		 * 1. switch 문으로 바꾸기 
		 * 2. if 문에서 Scanner를 장착해서 인풋 받아서 사용
		 * 3. switch 문에서 Scanner를 장착해서 인풋 받아서 사용
		 * 
		 * num 1
		 * num 2 
		 * operator
		 * 
		 * Scanner sc = new Scanner(system.in);
		 * char operator = sc.next().charAt(0);
		 */
		
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
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
		
		
	}

}
