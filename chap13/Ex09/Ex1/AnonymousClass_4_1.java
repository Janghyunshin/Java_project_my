package chap13.Ex09.Ex1;

interface A {
	void cry();
	void fly();
}

class C {
	void abc(A a) {
		a.cry();
		a.fly();
	}
}


public class AnonymousClass_4_1 {

	public static void main(String[] args) {
		//1. 클래스는 존재 (x) + 참조 변수 (0)
			C c = new C();
			A a = new A() {			// 참조 변수 a 생성
				@Override
				public void cry() {
					System.out.println("멍멍");
				}
				@Override
				public void fly() {
					System.out.println("날지 못합니다.");
				}
			};
			c.abc(a);
			System.out.println("========================");
			
		//2. 클래스는 존재 (x) + 참조 변수 (x)
			c.abc(new A() {
				public void cry() {
					System.out.println("멍멍");
					}
				public void fly() {
					System.out.println("날지 못합니다.");
					}
			});
			
	}

}
