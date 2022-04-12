package chap15.EX05;

/*    완료시간 : 13:20분까지 , p.jangwoo@gmail.com
 * 
 쓰레드 4개 생성 :  1, Thread를 상속, 2, Runnable 구현 , 3.4. 익명 내부클래스를 생성해서 구현 
각 값을 String 배열에 저장후 아래와 같이 출력 하세요. 
 
 1		2		3		4
 이름 	홍길동	이순신	신사임당
 나이 	40		50		60
 국어		100		90		80
 영어    70		60		100
 수학		50		70		80
 
 
 */

//ppt 20 ~ 30 page 
//dothome, GitHub, GitHub page

class F_Thread extends Thread{
	@Override
	public void run() {
		//0.01초 지연 , 제일 먼저 출력
		try {Thread.sleep(0);} catch (InterruptedException e) {}
		String[] strArr = {"T_1", "이름", "나이", "국어", "영어", "수학"};
		for (int i = 0 ; i < strArr.length; i++) {
			System.out.print(strArr[i] + "\t");
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}	
	}
}

class S_Thread implements Runnable{
	@Override
	public void run() {
		//0.01초 지연 , 두번째 출력
		try {Thread.sleep(10);} catch (InterruptedException e) {}
		String[] strArr = {"T_2", "홍길동", "40", "100", "70", "50"};
		for (int i = 0 ; i < strArr.length; i++) {
			System.out.print(strArr[i] + "\t");
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}	
	}
}

public class EX_CreateAndStartThread00 {
	public static void main(String[] args) {
		//1. 첫번째 쓰레드 객체 생성
		Thread thread1 = new F_Thread(); 
		
		//2. 두번째 쓰레드 객체 생성
		Runnable r1 = new S_Thread();
		Thread thread2 = new  Thread(r1);
		

		
		//3. 세번째 쓰레드 - 익명내부 객체 이용
		Thread thread3 = new Thread(new Runnable() {
			public void run() {
				//0.02초 지연 , 세번째 출력
				try {Thread.sleep(20);} catch (InterruptedException e) {}
				String[] strArr = {"T_3", "이순신", "50", "90", "60", "70"};
				for (int i = 0 ; i < strArr.length; i++) {
					System.out.print(strArr[i] + "\t");
					try {Thread.sleep(200);} catch (InterruptedException e) {}
				}
			};
		});
		
		
		//4. 네번째 쓰레드 - 익명내부 객체 이용
		Thread thread4 = new Thread(new Runnable() {
			public void run() {
				//0.03초 지연 , 두번째 출력
				try {Thread.sleep(30);} catch (InterruptedException e) {}
				String[] strArr = {"T_4", "신사임당", "60", "80", "100", "80"};
				for (int i = 0 ; i < strArr.length; i++) {
					System.out.println(strArr[i] + "\t");
					try {Thread.sleep(200);} catch (InterruptedException e) {}
				}
			};
		});
		
		//3. 쓰레드 시작 
			thread1.start();
			thread2.start();
			thread3.start();
			thread4.start();
	}
}
