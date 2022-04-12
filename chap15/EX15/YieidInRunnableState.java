package chap15.EX15;

//Thread Yield() : �������� �������  (RUNNABLE) �� �ִ� Ư�� �����忡�� �ڽ��� ������� �Ͻ� �纸
	// ������� ���ο��� �ٸ� �����带 ���� ���� �ϵ��� �纸.
	// ����ȭ���� key�� ���� �����ϴ� ������ �߻��Ǵµ�.... Ű�� �纸�ؼ� �յ��ϰ� ó���ϵ��� �Ҷ� ���

class MyThread extends Thread {
	boolean yieldFlag;
	@Override
	public void run() {
		while (true) {		// ���� ���� 
			if (yieldFlag) {		// yieldFlag�� True �϶� �����带 �纸 ����
				Thread.yield(); 		// �����带 �纸 ����.
			} else {	// yield Flag�� False �ϋ� ������ ������ ��� ����
				System.out.println(getName() + "����");
				for (long i = 0; i<100000000L ; i++ ) {} // 0.5�� �ð� ����
			}	
			
		}
		
		
	}
}

public class YieidInRunnableState {

	public static void main(String[] args) {
		
		MyThread thread1 = new MyThread();
		thread1.setName("thread1");
		thread1.yieldFlag = false;		// false
		thread1.setDaemon(true); 		// ������ �����尡 ����ɶ� ����		// while ���� ������ ���� ���������� ����
		thread1.start();
		
		MyThread thread2 = new MyThread();
		thread2.setName("thread2");
		thread2.yieldFlag = true;		// false
		thread2.setDaemon(true); 		// ������ �����尡 ����ɶ� ����		
		thread2.start();
		
		// ������ 6�� ���� ( 1�ʸ��� �ѹ��� �纸)
		for (int i = 0 ; i < 6 ; i++) {
			try {Thread.sleep(50);} catch (InterruptedException e) {} // 0.05�� ������
			thread1.yieldFlag =! thread1.yieldFlag;		// ���϶� ������ �����ϰ� �����϶� ���� ����
			thread2.yieldFlag =! thread2.yieldFlag;		//
		}
		
	}

}