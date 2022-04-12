package chap16.Ex07;


// 제너릭 메소드 내부에서 사용 가능한 메소드 : Object 클래스의 메소드만 사용 가능 하다.

class A {
	public <T> void method(T t) {
		// System.out.println(t.length()); 		// t. length() : String 클래스에서 글자수를 리턴 해줌 	// 사용불가
		System.out.println(t.equals("안녕"));		// t. equals는 Object 클래스의 메소드는 사용 가능
	}
	
	public <T extends Object> void method2 (T t) {		// <T [extends Object]>
		
		System.out.println(t.equals("반갑습니다."));		// Object 클래스의 메소드만 사용 가능하다.	
	}
	
	public <T extends String> void method3 (T t) {		//
		System.out.println(t.length());
		// System.out.println(t.);
	}
	
}

public class AvailableMethodInGenericMethod {
	public static void main(String[] args) {
		A a = new A();
		a.<String>method("안녕");
		
	}
}
