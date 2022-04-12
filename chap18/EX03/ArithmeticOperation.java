package chap18.EX03;

import java.util.Scanner;

// 1. ��ĳ�ʸ� ����ؼ� double�� �� ���� ��ǲ �޽��ϴ�.
// 2. ���1. ���ٽ��� ����ؼ� ��ǲ���� �ΰ��� +,-,*,/ , ��Ģ������ �����ؼ� ���
// 3. ���2. �������̽��� ������ �ڽ� ��ü�� ����ؼ� ��ǲ���� �ΰ��� +,-,*,/ , ��Ģ������ �����ؼ� ���
// 4. ���3. �͸��̳�Ŭ������ ����ؼ� ��ǲ���� �ΰ��� +,-,*,/ ��Ģ������ �����ؼ� ���.
// 5. ArithmeticException ó�� : 0 ���� ������ ���� �߻��� �ǹǷ� ���� ó�� , int(0), double <== �ش� ������ �ƴ� 

// �Ϸ�ð� : 13:10

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
		
		System.out.println("�� �Ǽ��� ������ �����ؼ� �Է��ϼ��� >> ");
		// ����� 
		/*
		Arithmetic a1 = (a, b) -> {System.out.println(a + b);};
		Arithmetic a2 = (a, b) -> {System.out.println(a - b);};
		Arithmetic a3 = (a, b) -> {System.out.println(a * b);};
		Arithmetic a4 = (a, b) -> {System.out.println(a / b);};
		
		System.out.println("a���� �Է��ϼ���");
		double a= sc.nextDouble();
		System.out.println("b���� �Է��ϼ���");
		double b= sc.nextDouble();
		System.out.print("+ ��: "); 
		a1.arithmetiOpr(a, b);
		System.out.print("- ��: ");
		a2.arithmetiOpr(a, b);
		System.out.print("* ��: "); 
		a3.arithmetiOpr(a, b);
		System.out.print("/ �� : ");
		a4.arithmetiOpr(a, b);
		*/
		
		// ������ ���
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		// 1. ���ٽ� : �������̽��� �߻�޼ҵ带 �͸�Ŭ������ ������ ���� ���ǥ���̴�.
		  
		Arithmetic a1 = (x,y) -> {System.out.println("a + b : " + (x+y) + " , " + "a - b" + (x-y) + " , " +
		"a * b : " + (x * y) + " , " + " a / b : " + (x / y) );};
		
		a1.arithmetiOpr(a,b);
		
		//2 
		Arithmetic a2 = new ArithmeticImpl();
		
		// 3. �͸� �̳� Ŭ����
		
		Arithmetic a3 = new Arithmetic() {
			@Override
			public void arithmetiOpr(double a, double b) {
				System.out.println("a + b : " + (a+b) + " , " + "a - b" + (a-b) + " , " +
						"a * b : " + (a * b) + " , " + " a / b : " + (a / b) );};
						
		};
		
	}
}
