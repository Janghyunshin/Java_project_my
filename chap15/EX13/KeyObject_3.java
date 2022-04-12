package chap15.EX13;


/*
	���� �����尡 ������ �ʵ忡 �����Ҷ� ���ü��� ������ �߻�.	====> ����ȭ�� ���ü� ������ �ذ�

	����ȭ : ���� �����尡 ������ �ʵ� �����Ҷ� �ϳ��� �����尡 �Ϸ�Ǹ� �ٸ� �����忡�� ������ ����
	�ϳ��� �����尡 ������� ��� Lock�� �ɰ� �۾��� �Ϸ�Ǹ� �ٸ� �����尡 ���� �����ϵ��� Lock�� ���� 

	- ��� ����ȭ�� �޼ҵ�� this(�ڽ��� ��ü) ��� Ű�� ������.
	- ���� �޼ҵ尡 ����ȭ�� �޼ҵ��� ��� : �ϳ��� �����常 ������ ���� 
	
	Ŭ���� ���ο� �������� ����ȭ �޼ҵ尡 ������ ��� : ��� �����尡 �����ϴ� Ű�� this
		�������� ����ȭ �޼ҵ� ������ ��Ƽ �����带 ����ϰ��� �� ��� : ����ȭ ����� ���� �� Ű�� �ٸ��� ����.
 
*/

class A{}
class B{}
class C{}

class MyData{	// ���� ��ü : ���� �����尡 ���� ��ü�� ����
// ����ȭ�� �޼ҵ�� key���� ��� this�� �ڵ����� ���, ������ �Ұ���.
 // ����ȭ �޼ҵ�� key ���� ���� �� ����.
 // �ϳ��� �����尡 �����Ҷ� key�� ������ ����ȭ�� �޼ҵ带 ���� �����ϴ�
 // key�� ��ü�� Ű�� ����� �� �ִ�.
// ����ȭ ���� key ���� ���Ƿ� �Ҵ� �����ϴ�.
	
synchronized void abc() {	// ���������尡 �����Ҷ� ���ü� ������ �����ϱ� ���ؼ� ����ȭ ó��
		
		
			for (int i=0 ; i<3 ; i++) {
				try {Thread.sleep(10);} catch (InterruptedException e) {}		// 0.01�� ������
				System.out.println(i+ "sec");
				try {Thread.sleep(1000);} catch (InterruptedException e) {}	// 1�� ������ 
			}
}

void bcd() {	// ���������尡 �����Ҷ� ���ü� ������ �����ϱ� ���ؼ� ����ȭ ó��
	synchronized (new A()) {	// �����尡 ������ ������ Ű�� ����.

	for (int i=0 ; i<3 ; i++) {
		try {Thread.sleep(20);} catch (InterruptedException e) {}		// 0.02�� ������
		System.out.println(i+ "��");
		try {Thread.sleep(1000);} catch (InterruptedException e) {}	// 1�� ������
	}
	}
}

void cde() {	// ���������尡 �����Ҷ� ���ü� ������ �����ϱ� ���ؼ� ����ȭ ó��
	
	synchronized (new Object()) {	// this Ű�� �ƴ�		// ������ Ű�� ���� : ������ Ű , �����尡 �����ϴ� Ű, ��ü ����
		try {Thread.sleep(30);} catch (InterruptedException e) {}	// 0.03�� ������
		for (int i=0 ; i<3 ; i++) {
			System.out.println(i+ "��°");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}	// 1�� ������
		}
	}
	}

}


public class KeyObject_3 {

	public static void main(String[] args) {
		
		//���� ��ü
		MyData myData = new MyData();
		
		// ������ �����尡 ������ �޼ҵ� ȣ��
		new Thread() {					//�͸� Ŭ����: ������ Ŭ������ �����ϴ� �ڽ� �͸� Ŭ����
			public void run() {
				myData.abc();			//ù ��° ������ abc() �޼ҵ� ȣ��
			};
		}.start();
		
		new Thread() {					//�͸� Ŭ����: ������ Ŭ������ �����ϴ� �ڽ� �͸� Ŭ����
			public void run() {
				myData.bcd();
			};
		}.start();
		
		new Thread() {					//�͸� Ŭ����: ������ Ŭ������ �����ϴ� �ڽ� �͸� Ŭ����
			public void run() {
				myData.cde();			//�� ��° ������ cde() �޼ҵ� ȣ��
			};
		}.start();
		

}

}