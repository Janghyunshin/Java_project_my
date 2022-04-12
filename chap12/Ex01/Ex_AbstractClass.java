package chap12.Ex01;

abstract class Abc {
	abstract void cry();	// 
	abstract void fly();
}


class Cat extends Abc {
	@Override
	void cry() {
		System.out.println("�߿�");
	}

	@Override
	void fly() {
		System.out.println("����̴� ���� �����ϴ�.");
	}
}

class Eagle extends Abc{
	@Override
	void cry() {
		System.out.println("����");
	}
	@Override
	void fly() {
		System.out.println("�������� ���� �ֽ��ϴ�.");
	}
}

public class Ex_AbstractClass {

	public static void main(String[] args) {
			// 1. �ڽ� Ŭ���� Cat, Eagle Ŭ������ ������ ���
			Abc ac = new Cat();		// �ڽ� Ŭ���� ����, �θ� Ÿ�� 
			Abc ae = new Eagle();	// �ڽ� Ŭ���� ����, �θ� Ÿ�� 
		
			ac.cry();	// �޼ҵ� ȣ��
			ac.fly();
			
			ae.cry();	// �޼ҵ� ȣ��
			ae.fly();
		
			System.out.println("=====================");
			
			// 2. �͸� Ŭ���� ������ ���,
			// �͸� ��ü ����
			Abc abc = new Abc() { 	
				void cry() {
					System.out.println("�͸� Ŭ������ cry �޼ҵ�");
				}
				void fly() {
					System.out.println("�͸� Ŭ������ fly �޼ҵ�");
				}
			};
			
			// �޼ҵ� ȣ��
			abc.cry();
			abc.fly();
			
		
	}

}
