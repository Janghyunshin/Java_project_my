package chap18.EX05;

// 2. �޼ҵ� ���� ( ���� �޼ҵ� ǥ��)
	// �޼ҵ� ���� : ���� �������� �ʰ� �����Ǿ� �ִ� �޼ҵ带 �����ؼ� ���.
	// ���� �޼ҵ� ���� 

interface A {
	void abc();
}

class B {
	static void bcd() {		// �����޼ҵ�		// <<== static : Ŭ�����̸����� ȣ���� ������.
		System.out.println("�޼���");
	}
}

public class RefOfInstanceMethod_Type_2 {

	public static void main(String[] args) {
		
		// 1. ���� �޼ҵ� ����: �̳� Ŭ������ ó��
		A a1 = new A () {
			@Override
			public void abc() {
				B.bcd(); 		//static �� ����� ���� �޼ҵ� ȣ��. ��ü �������� Ŭ���������� ȣ��
			}
		};
		
		// 2. ���ٽ� ǥ��
		A a2 = () -> {B.bcd();};		// ���ٽ� ǥ��
		
		// 3. ���� �޼ҵ� ����
		A a3 = B :: bcd;
		
		a1.abc();
		a2.abc();
		a3.abc();
		
	}

}