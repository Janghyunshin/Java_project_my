package Sjhpractice01;
public class Sjh_SwitchIf {
	public static void main(String[] args) {

		/*
		 * 1. switch ������ �ٲٱ� 
		 * 2. if ������ Scanner�� �����ؼ� ��ǲ �޾Ƽ� ���
		 * 3. switch ������ Scanner�� �����ؼ� ��ǲ �޾Ƽ� ���
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
			System.out.println("������ ���� �Դϴ�.");
		}
		
		
	}

}
