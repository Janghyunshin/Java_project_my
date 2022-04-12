package chap15.EX08;

// ����ȭ (Synchronized) : ���� �����尡 �ϳ��� ������ �ʵ带 ������ ���
	//	�� �۾��� ������ �Ϸ� �� ���� �۾��� ó���ϵ��� ����.
	// ���� �۾��Ҷ� lock�� �ɰ� �۾��� ��ġ�� lock�� ���� �Ѵ�.

// 1. ����ȭ�� ó�� ���� �ʾ��� �� ����

class MyData{ 	// �����尡 �����ϴ� ��ü �ʵ�
	int data = 3;
	public void plusData () {
		int myData = data;
		try {Thread.sleep(2000);} catch (InterruptedException e) {}
		data = myData + 1;
		
	}
}

class PlusThread extends Thread {	// 1�� �����ϸ鼭 �ΰ��� ������ ����
	MyData myData;
	public PlusThread(MyData myData) {
		this.myData = myData;
	}
	@Override
	public void run() {
		myData.plusData();
		System.out.println(getName() + " ���� ��� : " + myData.data);
	}
}

public class TheNeedForSynchronized {

	public static void main(String[] args) {

		// ���� ��ü ����
		MyData myData = new MyData();
		
		// 1. Plusthread 1 
		Thread plusThread1 = new PlusThread(myData);
		plusThread1.setName("plusThread1");
		plusThread1.start();
		
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		
		// 1. Plusthread 2 
		Thread plusThread2 = new PlusThread(myData);
		plusThread2.setName("plusThread2");
		plusThread2.start();
			
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		
	}

}
