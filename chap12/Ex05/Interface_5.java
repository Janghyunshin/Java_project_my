package chap12.Ex05;

//1. ���1 : ��ü�� ������ ����
//2. �͸� Ŭ������ �̿��ϴ� ���

// �������̽� ���� : ����� �ְ� ������ (PM)
interface A {
	double PI = 3.14;	// public static final
	void run() ;			// public abstract
}

class B implements A {

	@Override
	public void run() {		// public ����
		System.out.println("�޸��ϴ�");
	}
	
}

public class Interface_5 {

	public static void main(String[] args) {
		// 1. ��ü ������ ���
		A a1 = new B();
		a1.run();
		
		// 2. �͸� ��ü�� ���
		A a2 = new A() {
			public void run() {
				System.out.println("���� ���ϴ�.");
			}
		};
	}

}