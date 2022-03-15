package chap06_07.Ex01;

class AA {
	String name;	// 필드(멤버) : 인스턴스화 시켜야 사용이 가능 (Heap 공간에 값이 저장)
	int age;
	String email;
	
	AA() {	} // 기본 생성자, 생략이 가능, 다른 생성자가 존재할 경우, 기본 생성자는 생략하면 오류.
	
	public String getName() {	// 메소드 (멤버) : 인스턴스화 시켜야 사용가능
		return name;			// Heap 공간에 주소만 저장, 클래스 영역 내의 메소드영역에 저장.
								// return : 메소드를 호출하는 곳으로 변수의 값을 던져준다.
	}
	public void setName(String name) {		//void : 리턴값이 없다를 알려주는 식별자
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {	//this : 3개의 값이 같을때
		this.email = email;
	}
	
	
	
}

public class CreateObject {

	public static void main(String[] args) {

		AA aa = new AA();	//AA클래스(설계도)를 가지고 aa(객체)를 생성
							// 같은 패키지 내부에 있어서 import가 필요없음
		// AA: 클래스 이름, aa : 객체명 (인스턴스명), new : Heap 영역에 필드와 메소드
		// AA() : 생성자 : 객체의 필드값을 초기화, 생성자도 하나의 메소드,
					// 1. 생성자 이름이 클래스의 이름과 동일 메소드.
					// 2. 리턴타입이 없다.
					// 3. 생성자중 매개변수가 없는 생성자를 기본 생성자라고 함.
					// 4. 기본 생성자는 생략이 가능하다.
					// 5. 객체를 생성 할때 반드시 생성자를 호출 , 
		
		
		// 객체의 메소드 호출
		System.out.println(aa.getName());
		System.out.println(aa.getAge());
		System.out.println(aa.getEmail());
		System.out.println("===========");
		// 객체의 필드 호출
		System.out.println(aa.name);
		System.out.println(aa.age);
		System.out.println(aa.email);
		
		// ==================================
		
		System.out.println("===========");
		
		//setters : 객체의 메모리에 값을 할당 할때
		aa.setName("홍길동");			//객체의 변수에 값을 할당
		aa.setAge(29);
		aa.setEmail("aaa@aaa.com");
		
		//getters : 객체의 메모리의 값을 가지고 올때
		System.out.println(aa.getName());
		System.out.println(aa.getAge());
		System.out.println(aa.getEmail());
		System.out.println("===========");
		
		AA bb = new AA();
		bb.setName("김유신");
		bb.setAge(50);
		bb.setEmail("bbb@bbb.com");
		
		System.out.println(bb.getName());
		System.out.println(bb.getAge());
		System.out.println(bb.getEmail());
		System.out.println("===========");

		AA cc = new AA();
		cc.setName("신사임당");
		cc.setAge(40);
		cc.setEmail("ccc@ccc.com");
		
		System.out.println(cc.getName());
		System.out.println(cc.getAge());
		System.out.println(cc.getEmail());
		
		
		
		
		
	}

}
