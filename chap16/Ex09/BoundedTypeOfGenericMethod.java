package chap16.Ex09;

// ���ʸ� �޼ҵ��� ���� ���� : 

class A {	// �Ϲ� Ŭ�������� ���ʸ� �޼ҵ� 
	
	
	//Number : Boolean, Character�� ������ 6���� Ÿ�� (Byte, Short, Integer, Long, Float, Double)
	public <T extends Number> void method1 (T t) {
		System.out.println(t.intValue());	//Number Ÿ���� �޼ҵ� . t.intValue() , ������ ���
	}	
}

interface MyInterface {
	void print();	// public abstract �� ������
}

class C implements MyInterface {	//�������̽��� ������ Ŭ���� 
	@Override
	public void print() {
		System.out.println("�������̽��� ������ Ŭ����  - ���");
	}
}

class B { 	// ���ʸ� Ÿ�� ���ο��� �������̽��� ���� �Ҷ��� extends Ű�� ����Ѵ�.
	public <T extends MyInterface> void method2 (T t) {		// T�� Ÿ�Կ� �� �� �ִ� ���� MyInterface�� ������
															 // Ŭ������ �� �� �ִ�.
		t.print();
	}
}

class D { 
	public <T extends String> void abc(T t) {
		System.out.println(t);  			// String�� toString �޼ҵ尡 ������
		System.out.println(t.toString());
	}
}

public class BoundedTypeOfGenericMethod {
	public static void main(String[] args) {
		A a = new A();	// �Ϲ� Ŭ���� ��ü ������ ���ʸ� �޼ҵ� ȣ��
		a.<Double>method1(5.8);
		a.method1(22.5);			// �Ű������� ������ ���� Ÿ���� �ĺ��� �� �ִ� ��� ���� ����
		a.<Long>method1(100L);		// Long
		a.<Float>method1(100.5555F); 	// Float
		// a.<Boolean>method1(true);	// Character, Boolean �� ���� �߻�
		
		B b = new B();	// �Ϲ� Ŭ����
		
		// Method2�� �Ű������� �� �� �ִ� ���� �������̽� Ÿ��, // �������̽��� ������ �ڽ� Ŭ����
		// �������̽��� ������ ���� �͸� Ŭ���� 
		b.<MyInterface> method2(new MyInterface() {	 
			@Override
			public void print() {				
				System.out.println("print() �͸� Ŭ������ ��� ");
			};
		}
				);  
		
		b.<MyInterface> method2(new C());	//�Ű������� �������̽��� ������ �ڽ� ��ü
			
		// �͸� Ŭ������ ���ʸ� �޼ҵ� ȣ�� �� �Ű������� �����ֱ� 
		
		b.method2(new MyInterface() {
			@Override
			public void print() {
				System.out.println("�͸����� ó���� Ŭ���� ���");
			}
		});
		
		D d = new D();
		d.<String> abc("�ȳ�");
		d.abc("�ϼ���");
	}	

}