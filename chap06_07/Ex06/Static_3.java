package chap06_07.Ex06;

// ���� �ʱ�ȭ ���� : �����ڿ� ���� static �ʵ��� ���� ȣ�� �� �ʱ�ȭ �ϴ� ���� 

// �����ڿ� static ����
	// ������ : �ν��Ͻ� �ʵ带 �ʱ�ȭ, ���� �ʵ��� ���� �ʱ�ȭ ���� 
	// static ����: static �ʵ��� ���� �ʱ�ȭ, �ν��Ͻ� �ʵ��� ���� �ʱ�ȭ �Ҽ� ����. 

class E	{
	
	int a; 
	static int b; // ��ü ���� ���̵� ȣ��,
	
	static { 	// ����(static) �ʱ�ȭ ���� : ��ü ���� ���̵� Ŭ���� ������ ȣ���Ҷ� �ʱ�ȭ 
	//	a = 3;	// ������ �߻�, �ν��Ͻ� �ʵ�� �ʱ�ȭ �� �� ����.
		b = 5;	
		System.out.println("Ŭ���� E�� �ε� �Ǿ����ϴ�. ���� b : " + b);
	}
	
	E () {		// ������ : ��üȭ�� �� �� �ʵ��� ���� �ʱ�ȭ
		a = 3;	// �ν��Ͻ� �ʵ� �ʱ�ȭ
		b = 10;	// static �ʵ� �ʱ�ȭ
	}
	
}

public class Static_3 {

	public static void main(String[] args) {

		System.out.println(E.b); 		// ��ü ���� ���� E.b ȣ�� �ɶ� Static ������ �۵��� : Static�� ���� �ʱ�ȭ ��.
		
	
	}

}