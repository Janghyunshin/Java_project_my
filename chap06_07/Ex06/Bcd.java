package chap06_07.Ex06;

import chap06_07.Ex05.External_Abc;

public class Bcd {				// 부모 클래스
	public int a = 10;
	protected int b = 20;		// 자식 클래스에서 접근이 가능 (다른 패키지에서)
	int c = 30;
	private int d = 40;
	
	// Bcd() {}		<== 기본 생성자 : 필드의 초기값을 부여해서 객체를 생성 ,
	
	public void print1() {
		System.out.println("다른 패키지에서 접근 가능 : public");
	}
	protected void print2() {
		System.out.println("다른 패키지에서 접근 가능(상속관계가 구성될때 : protected");
	}
	void print3() {
		System.out.println("같은 패키지에서 접근 가능 : default");
	}
	private void print4() {
		System.out.println("같은 클래스에서 접근 가능 : private");
	}


	

}
