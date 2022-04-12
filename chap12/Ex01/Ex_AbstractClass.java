package chap12.Ex01;

abstract class Abc {
	abstract void cry();	// 
	abstract void fly();
}


class Cat extends Abc {
	@Override
	void cry() {
		System.out.println("야옹");
	}

	@Override
	void fly() {
		System.out.println("고양이는 날수 없습니다.");
	}
}

class Eagle extends Abc{
	@Override
	void cry() {
		System.out.println("끼오");
	}
	@Override
	void fly() {
		System.out.println("독수리는 날수 있습니다.");
	}
}

public class Ex_AbstractClass {

	public static void main(String[] args) {
			// 1. 자식 클래스 Cat, Eagle 클래스를 생성후 출력
			Abc ac = new Cat();		// 자식 클래스 생성, 부모 타입 
			Abc ae = new Eagle();	// 자식 클래스 생성, 부모 타입 
		
			ac.cry();	// 메소드 호출
			ac.fly();
			
			ae.cry();	// 메소드 호출
			ae.fly();
		
			System.out.println("=====================");
			
			// 2. 익명 클래스 생성후 출력,
			// 익명 객체 생성
			Abc abc = new Abc() { 	
				void cry() {
					System.out.println("익명 클래스의 cry 메소드");
				}
				void fly() {
					System.out.println("익명 클래스의 fly 메소드");
				}
			};
			
			// 메소드 호출
			abc.cry();
			abc.fly();
			
		
	}

}
