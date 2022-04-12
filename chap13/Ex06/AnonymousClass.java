package chap13.Ex06;

class A {
	C c = new B();	// C 타입, 인스턴스 변수 c
	void abc() {
		c.bcd();
	}

	class B implements C {	// 인터페이스 C의 추상메소드 구현 B 클래스
	@Override
		public void bcd() {
			System.out.println("인스턴스 이너클래스");
		}
	}
}

interface C {			// 인터페이스, 추상메소드 정의 : void bcd()
	public abstract void bcd();
}

public class AnonymousClass {

	public static void main(String[] args) {
		// 1. 객체 생성 및 메소드 호출
		A a = new A();
		a.abc(); 		//인스턴스 이너 클래스
	}

}
