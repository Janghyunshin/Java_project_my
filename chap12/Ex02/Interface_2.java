package chap12.Ex02;

// interface ������ Ŭ���� , 
	// Overriding : ������ �޼ҵ带 �ڽ� Ŭ�������� ���Ӱ� �������ϴ� ��
	// Implements : �̿ϼ� �޼ҵ带 �ϼ���Ű�� �� 
	// extends	  : �θ� Ŭ������ ����� ��ӹ޾Ƽ� �ڽ��� ����� �߰��ؼ� Ȯ�� 
interface AA {
	void cry();		// �߻� �޼ҵ�, public abstract ������
	void run(); 	// �߻� �޼ҵ�, public abstract 
}

class BB implements AA {	// BBŬ������ AA�������̽��� �̿ϼ��� �޼ҵ带 ���� �Ѵ�.
	@Override
	public void cry() {
		System.out.println("�߿�");
	}

	@Override
	public void run() {
		System.out.println("��½");
		
	}	
	
}

public class Interface_2 {

	public static void main(String[] args) {
		//
		AA aa = new BB();	//BB : �������̽��� �̿ϼ� �޼ҵ带 ������ Ŭ����
		aa.cry();
		aa.run();
	}

}