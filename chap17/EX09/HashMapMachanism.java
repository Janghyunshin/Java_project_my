package chap17.EX09;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

// Map : Key는 중복되지 않아야 됨. equals(), hashCode() 재정의 시켜야 한다.
	// Value는 중복되어도 됨 .

// equals(), hashCode()를 재정의 하지 않는 클래스
class A {
	int data;
	public A(int data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return data + " ";
	}
}

// equals()만 재정의하는 클래스
class B {
	int data;
	public B(int data) {
		this.data = data;
	}
	
	@Override 		// 객체의 필드의 값을 비교해서 같으면 같은 값이다.
	public boolean equals(Object obj) { 	// obj는 Object 타입으로 업캐스팅
		if (obj instanceof B) {				// obj가 B타입을 내포할때 (true)
			if( this.data == ((B) obj).data) {
				return true;
			}
		}
		return false;
	}
	@Override
	public String toString() {
		return data + " ";
	}
}

class C {	// equals(), hashCode()를 재정의 하는 클래스 ; Map의 key로 사용할 수 있다.
	int data;
	public C(int data) {
		this.data = data;
	}
	
	@Override 		// 객체의 필드의 값을 비교해서 같으면 같은 값이다.
	public boolean equals(Object obj) { 	// obj는 Object 타입으로 업캐스팅
		if (obj instanceof C) {				// obj가 B타입을 내포할때 (true)
			if( this.data == ((C) obj).data) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(data); 		// 권장 방법
		// return data;
	}
	
	@Override
	public String toString() {
		return data + " ";
	}
}

public class HashMapMachanism {
	public static void main(String[] args) {

		//1 . 두 메소드 모두 오버라이딩 하지 않는 경우, 두 객체 모두 Map의 Key로 등록된다.
		Map<A, String> hashMap1 = new HashMap();
		
		A a1 = new A(3);
		A a2 = new A(3);
		
		System.out.println(a1 == a2); 		// Stack 주소를 비교 , false
		System.out.println(a1.equals(a2)); 	// == , false
		
		hashMap1.put(a1, "첫번째");
		hashMap1.put(a2, "두번째");
		
		System.out.println(hashMap1.size());
		System.out.println(hashMap1);
		System.out.println();
		
		//2. equals() 만 오버라이딩된 경우
		Map<B, String> HashMap2 = new HashMap();
		B b1 = new B(3);
		B b2 = new B(3);
		
		System.out.println(b1 == b2);		//false
		System.out.println(b1.equals(b2));	//true
		
		HashMap2.put(b1, "첫번째");
		HashMap2.put(b2, "두번쨰");

		System.out.println(HashMap2.size()); 	//2
		System.out.println(HashMap2);
		System.out.println();
		
		//3. equals(), hashCode() 모두 오버라이딩 된 경우
		Map <C, String> hashMap3 = new HashMap();
		C c1 = new C (3);
		C c2 = new C (3);
		
		System.out.println(c1 == c2); 	//false
		System.out.println(c1.equals(c2)); //true
		
		System.out.println(c1.hashCode() + " , " +c2.hashCode()); 	// 34 : 10진법으로 출력 
		
		hashMap3.put(c1, "첫번째");
		hashMap3.put(c2, "두번째");
		System.out.println(hashMap3); 		// 22 - 16진수로 표현 
		System.out.println(hashMap3.size());
	}
}
