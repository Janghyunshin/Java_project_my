package chap18.EX06;

// ���ٽ��� Ȱ��.
	// 1. �͸��̳�Ŭ������ Ȱ���ϴ� ���
	// 2. �޼��� ���� (1. �ν��Ͻ��޼ҵ� ����, 2. ���� �޼ҵ� ����)
		// �޼��� ���� : �����Ǿ� �ִ� �޼��带 ����
			// �޼��� ������ ���ؼ��� ����Ÿ�԰� �Ű������� �����ؾ��Ѵ�.


interface A {
	void abc (B b, int k);
}

class B {
	void bcd (int k) {				// �ν��Ͻ� �޼ҵ� : 
		System.out.println(k);
	}
}


public class RefOfInstanceMethod_Type_2_1 {
	public static void main(String[] args) {

		// �ν��Ͻ� �޼ҵ� ���� Type 2
		// �͸� �̳�Ŭ����
		
		A a1 = new A() {
			public void abc(B b, int k) {
				b.bcd(k);
			}
		};
		
		// ���ٽ� ǥ��
		A a2 = (B b, int k) -> { b.bcd(k); };
		
		// �ν��Ͻ� �޼ҵ� ����
		A a3 = B::bcd; 			// <== �ν��Ͻ� �޼ҵ峪 B ��ü�� ��ǲ �޾Ƽ� bcd �޼ҵ� ȣ��
			// 1. ��ü�� :: �޼ҵ��
			// B - �����޼ҵ� ȣ���϶�, �ν��Ͻ��޼ҵ� ȣ�������� �Ű������� ��ü�� ��ǲ ������ ����
		
		B b = new B();
		
		a1.abc(b, 7);
		a2.abc(b, 8);
		a2.abc(b, 9);
		
	}
}
