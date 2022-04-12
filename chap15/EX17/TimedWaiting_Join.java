package chap15.EX17;

// a.join(1000) : a 객체에게 CPU를 할당하고 자신은 TimedWaiting 상태로 대기

class MyThread1 extends Thread {
	@Override
	public void run() {
		for (long i=0; i<1000000000L; i++) {} 	// 시간 지연 0.5ch
		for (long i=0; i<1000000000L; i++) {} 	// 시간 지연 0.5ch
		for (long i=0; i<1000000000L; i++) {} 	// 시간 지연 0.5ch
		};
}

class MyThread2 extends Thread {
	MyThread1 myThread1;	// 클래스타입 참조변수;
	public MyThread2 (MyThread1 myThread1) {	// 생성자를 통해서 참조변수의 값 할당.
		this.myThread1 = myThread1;
	}
	
	@Override
	public void run() {
		try {
			myThread1.join(3000);	// MyThread2는 3초대기하고 myThread1에게 CPU 할당.
		} catch (InterruptedException e) {
			System.out.println("---join(...) 진행중 interrupt 발생 ");
			for (long i = 0 ; i < 100000000L; i++) {} 	// 시간지연 0.5초 100억 
		}
	}
}

public class TimedWaiting_Join {

	public static void main(String[] args) {
		// 1. 객체생성
		MyThread1 myThread1 = new MyThread1();
		MyThread2 myThread2 = new MyThread2(myThread1);
		myThread1.start();
		myThread2.start();
		
		try {Thread.sleep(1);} catch (InterruptedException e) {} // 쓰레드 시작 준비 시간 0.1 
		System.out.println("MyThread1 State : " + myThread1.getState());	// Runnable
		System.out.println("MyThread2 State : " + myThread2.getState());	// Timed_Waiting
		
		myThread2.interrupt();	// 3초 대기중 전에 인터럽트가 발생되면 
		try {Thread.sleep(1);} catch (InterruptedException e) {} // 쓰레드 시작 준비 시간 0.1 
		System.out.println("MyThread1 State : " + myThread1.getState());	// Runnable
		System.out.println("MyThread2 State : " + myThread2.getState());	// Runnable
	}

}
