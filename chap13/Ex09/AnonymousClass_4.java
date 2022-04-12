package chap13.Ex09;

interface A {
	void abc();		//public abstract
}

class C {
	void cde(A a) {
		a.abc();
	}
}

public class AnonymousClass_4 {

	public static void main(String[] args) {
		C c  = new C();
		// 3. �������̽��� ������ Ŭ���� (x) + �������� ���� (0)
		A a  = new A() {	// �������̽� ������ �ڽ� �͸� ��ü���� �� Ÿ���� A�� ������ ���� ������ ����.
			@Override
			public void abc() {System.out.println("Ŭ����(x) + ��������(0)"); }
		};
		c.cde(a); 	// ���������� �Ű� ������ ���� 
		
		// 4. �������̽��� ������ Ŭ���� (x) + �������� ���� (x)	<<=== ���� ���� ��� (�ӽ÷� �ѹ��� ���)
				//�̺�Ʈ ó�� ���.
		
		c.cde(new A() {
			@Override
			public void abc() {System.out.println("Ŭ����(x) + ��������(x) "); }
		});
		
 	}

}
