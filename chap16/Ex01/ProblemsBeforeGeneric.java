package chap16.Ex01;

// Generic ��� �� ������
// ��ü�� ���� Ŭ������ ���� ���, �Ź� ��ü�� �����Ҷ� ���� �� ��ü�� ���� Ŭ������ ����� ��� �Ѵ�.
// ��ü�� ������ Ŭ������ �����ؼ� ��ü ������ ���� �� �ִ�.	<== ���ο� ��ǰ�� �߰� �ɶ� ���� �� ��ǰ�� ���� Ŭ������ ������ ��� �Ѵ�.
// �ڵ尡 ������ ������ ����. 

class Apple { 		// ��� Ŭ����
	String name;
	int price;
	
	Apple (String name, int price) {	// ������
		this.name = name;
		this.price = price;
	}
	
	@Override
		public String toString() {		// ��ü ��ü�� ��½� ��ü�� �ּҰ� �ƴ϶� �ʵ��� ������ ���
			return "�̸� : "  + name + " , ���� : " + price ;
		}
	
}

class Pancil { 	// ���� Ŭ����
	String name; 
	int price;
	
	Pancil (String name, int price) {	// �����ڸ� ���ؼ� �ʵ��� �� �Ҵ�
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "�̸� : "  + name + " , ���� : " + price ;
	}
}

// 1. Apple�� ���� �� �ִ� Ŭ���� ����.
class Goods1 {	// ��ǰ�� ����� ���� Ŭ����
	private Apple apple = new Apple("���", 1000);

	public Apple getApple() {	// getter : ��ü �ʵ��� ������ ��� �ϴ� �� 
		return apple;
	}

	public void setApple(Apple apple) {	// setter
		this.apple = apple;
	}
}

class Goods2 {	// ��ǰ2 : ���� ��ǰ�� ���� Ŭ����
	private Pancil pancil = new Pancil ("����", 2000);

	public Pancil getPancil() {	
		return pancil;
	}

	public void setPancil(Pancil pancil) {
		this.pancil = pancil;
	}	
}

public class ProblemsBeforeGeneric {

	public static void main(String[] args) {

		// 1. Goods1 ��ǰ�� ����Ǿ� �ִ�. Apple ��ü �߰� �� ��������
		Goods1 goods1 = new Goods1 ();	// �⺻ ������ ȣ��
		goods1.setApple(new Apple("��� 2", 2000)); 	// setter�� ���� �Ҵ�
		System.out.println(goods1.getApple()); 		// �ʵ��� ������ ��� 
		
		// 2. Goods2 ��ǰ�� ���� . Pancil ��ü�� ����,
		Goods2 goods2 = new Goods2();
		goods2.setPancil(new Pancil("���� 2", 3000));
		System.out.println(goods2.getPancil());
		
		
	}
}
