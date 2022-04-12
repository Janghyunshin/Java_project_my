package chap18.EX06;

// 람다식의 활용.
	// 1. 익명이너클래스를 활용하는 방법
	// 2. 메서드 참조 (1. 인스턴스메소드 참조, 2. 정적 메소드 참조)
		// 메서드 참조 : 구현되어 있는 메서드를 참조
			// 메서드 참조를 위해서는 리턴타입과 매개변수가 동일해야한다.


interface A {
	void abc (B b, int k);
}

class B {
	void bcd (int k) {				// 인스턴스 메소드 : 
		System.out.println(k);
	}
}


public class RefOfInstanceMethod_Type_2_1 {
	public static void main(String[] args) {

		// 인스턴스 메소드 참조 Type 2
		// 익명 이너클래스
		
		A a1 = new A() {
			public void abc(B b, int k) {
				b.bcd(k);
			}
		};
		
		// 람다식 표현
		A a2 = (B b, int k) -> { b.bcd(k); };
		
		// 인스턴스 메소드 참조
		A a3 = B::bcd; 			// <== 인스턴스 메소드나 B 객체를 인풋 받아서 bcd 메소드 호출
			// 1. 객체명 :: 메소드명
			// B - 정정메소드 호출일때, 인스턴스메소드 호출이지만 매개변수로 객체가 인풋 값으로 들어갈때
		
		B b = new B();
		
		a1.abc(b, 7);
		a2.abc(b, 8);
		a2.abc(b, 9);
		
	}
}
