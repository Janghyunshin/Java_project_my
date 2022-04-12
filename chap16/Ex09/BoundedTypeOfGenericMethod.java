package chap16.Ex09;

// 제너릭 메소드의 범위 지정 : 

class A {	// 일반 클래스내의 제너릭 메소드 
	
	
	//Number : Boolean, Character를 제외한 6개의 타입 (Byte, Short, Integer, Long, Float, Double)
	public <T extends Number> void method1 (T t) {
		System.out.println(t.intValue());	//Number 타입의 메소드 . t.intValue() , 정수만 출력
	}	
}

interface MyInterface {
	void print();	// public abstract 가 생략됨
}

class C implements MyInterface {	//인터페이스를 구현한 클래스 
	@Override
	public void print() {
		System.out.println("인터페이스를 구현한 클래스  - 출력");
	}
}

class B { 	// 제너릭 타입 내부에서 인터페이스를 적용 할때는 extends 키를 사용한다.
	public <T extends MyInterface> void method2 (T t) {		// T의 타입에 올 수 있는 것은 MyInterface를 구현한
															 // 클래스만 올 수 있다.
		t.print();
	}
}

class D { 
	public <T extends String> void abc(T t) {
		System.out.println(t);  			// String은 toString 메소드가 재정의
		System.out.println(t.toString());
	}
}

public class BoundedTypeOfGenericMethod {
	public static void main(String[] args) {
		A a = new A();	// 일반 클래스 객체 생성후 제너릭 메소드 호출
		a.<Double>method1(5.8);
		a.method1(22.5);			// 매개변수로 던지는 값이 타입을 식별할 수 있는 경우 생략 가능
		a.<Long>method1(100L);		// Long
		a.<Float>method1(100.5555F); 	// Float
		// a.<Boolean>method1(true);	// Character, Boolean 은 오류 발생
		
		B b = new B();	// 일반 클래스
		
		// Method2에 매개변수로 올 수 있는 것은 인터페이스 타입, // 인터페이스를 구현한 자식 클래스
		// 인터페이스를 구현한 내부 익명 클래스 
		b.<MyInterface> method2(new MyInterface() {	 
			@Override
			public void print() {				
				System.out.println("print() 익명 클래스로 출력 ");
			};
		}
				);  
		
		b.<MyInterface> method2(new C());	//매개변수로 인터페이스를 구현한 자식 객체
			
		// 익명 클래스로 제너릭 메소드 호출 후 매개변수로 던져주기 
		
		b.method2(new MyInterface() {
			@Override
			public void print() {
				System.out.println("익명으로 처리된 클래스 출력");
			}
		});
		
		D d = new D();
		d.<String> abc("안녕");
		d.abc("하세요");
	}	

}
