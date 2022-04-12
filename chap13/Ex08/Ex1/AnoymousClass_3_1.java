package chap13.Ex08.Ex1;

// 3. �޼ҵ��� �Ű������� �����ϴ� ���:
//	3-1 : ��ü ������ �Ű� ������ ���� ( Ŭ������ 0, + �������� 0 )
//	3-2 : ��ü ������ �Ű� ������ ���� ( Ŭ������ 0, + �������� x )

interface A { 	// �������̽�, �߻�޼ҵ带 ����
	public abstract void cry();		// �߻�޼ҵ�, public abstract
	void fly();
}

class B implements A {		// B�� A�������̽��� ������ Ŭ����
	@Override
	public void cry() {
		System.out.println("�۸� : �Ű� ���� ���� �� ���");
		}
	@Override
	public void fly() {
		System.out.println("���� ���մϴ� : �Ű� ���� ����");
		}	
}

class C {	// C ��ü�� abc �޼ҵ� ȣ��� AŸ���� �Ű������� �޴´�. 
	void abc(A a) {		// ���� �ڽ� Ŭ������ �Ű������� ���� ��� A Ÿ������ �ڵ����� ��ĳ������ �ȴ�.
		a.cry();
		a.fly();
	}
}

public class AnoymousClass_3_1 {

	public static void main(String[] args) {
		
		// 1. Ŭ������ ���� 0 + �������� : 0 
		C c = new C();
		A a = new B(); 		// B �� ��üȭ �ؼ� AŸ������ ����, a: ���� ����
		
		c.abc(a);
		System.out.println("====================");
		
		
		// 2. Ŭ������ ���� 0 + �������� : x 
		
		c.abc(new B());
		
	}

}
