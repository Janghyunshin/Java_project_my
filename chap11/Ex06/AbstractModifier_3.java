package chap11.Ex06;

abstract class Animal {		// �߻� Ŭ���� : �߻� �޼ҵ尡 �ϳ��̻� ���� �Ǿ� �ִ� ���
							// �߻� Ŭ������ ��ü ���� �Ұ�, Ÿ���� ��밡��
								// �ڽ� Ŭ������ �θ� Ŭ������ �޼ҵ带 ������ ������ ����
							// �߻� Ŭ������ �߻� Ŭ���� ���� �߻�޼ҵ带 �ڽ� Ŭ�������� �ݵ�� �����ϵ���
							// ���� �޴´�.
	String name;
	int age;
	
	abstract void cry();	// �߻� �޼ҵ� : �����ΰ� ���� �޼ҵ�
		// void cry() {}	<== �Ϲ� �޼ҵ� : ���� Ÿ�� �޼ҵ��̸� (�Է¸Ű�����) {�����ڵ�}
	abstract void run();		
	
	@Override
		public String toString() {
			return "�̸� : " + name + " , " + " ���� : "+ age;
		}
}

class Cat extends Animal  {			// 	Cat�� Animal ��� �Ϻθ� ����� ��� �߻� Ŭ����
									// ��� �߻� �޼ҵ带 ������ ���� ��ũ��Ʈ Ŭ����(������ ������ Ŭ����)
	Cat (String name, int age ) {
		super.name = name;
		super.age = age;
	}
	
	@Override
		public String toString() {	// ��ü ��ü�� ��½� �޸��� ������ ���
			return "�̸� : " + name + " , " + " ���� : "+ age;
}
	
	@Override
	void cry() {	//�߻� �޼ҵ带 ������ �޼ҵ�
		System.out.println("�߿�");
	}

	@Override
	void run() {
		System.out.println("����̴� ���� �ݴϴ�.");
	}
}

class Tiger extends Animal {
	Tiger (String name, int age ) {
		super.name = name;
		super.age = age;
	}
	
	@Override
	public String toString() {
		return "�̸� : " + name + " , " + " ���� : "+ age;
	}

	@Override
	void cry() {
		System.out.println("����");
	}

	@Override
	void run() {
		System.out.println("ȣ���̴� ������ �޸��ϴ�.");
	}
	
}

class Eagle extends Animal {
	Eagle (String name, int age ) {
		super.name = name;
		super.age = age;
	}
	
	@Override
	public String toString() {
		return "�̸� : " + name + " , " + " ���� : "+ age;
	}

	@Override
	void cry() {
		System.out.println("±±");
	}

	@Override
	void run() {
		System.out.println("�������� �ϴ��� ���ƴٴմϴ�.");
	}
}

public class AbstractModifier_3 {

	public static void main(String[] args) {
		Animal a1 = new Cat("�����", 10);
		Animal a2 = new Tiger("ȣ����", 5);
		Animal a3 = new Eagle("������",15);
		
		// 1. Animal �迭 ��ü�� ���� ��
		Animal[] arr1 = {a1, a2, a3}; 
		System.out.println("=====================");
		
		// 2. For ���� ����ؼ� ��ü�� ��½� �̸��� ���� ���, .cry(), run()
		for (int i = 0; i<arr1.length; i++) {
			System.out.println(arr1[i]);	// ��ü ��� , Animal�� toString()
			arr1[i].cry();		// ��ü�� �������̵��� �޼ҵ� ���
			arr1[i].run();		// Animal�� cry(), run()	=====> �������̵� (�ڽ��� cry(), run())
		}
		System.out.println("=====================");
		// 3. Enhanced for ���� ����ؼ� �̸��� ���� ���, .cry(), run()
		for (Animal k : arr1) {
			System.out.println(k);
			k.cry();
			k.run();
		}
	}

}
