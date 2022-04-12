package chap16.Ex02;
// Object를 사용해서 4개의 객체를 저장하고 출력해보기

class Student {
	String name;
	String id;
	int pass;
	
	Student (String name, String id, int pass) {
		this.name = name;
		this.id = id;
		this.pass = pass;
	}
	
	@Override
	public String toString() {
		return "이름 : "  + name + " , 아이디 : " + id + " , 패스 : " + pass ;
	}	
}

class Professor { 
	String name;
	int year;
	String email;
	
	Professor (String name, int year, String email) {
		this.name = name;
		this.year = year;
		this.email = email;
	}
	@Override
	public String toString() {
		return "이름 : "  + name + " , 학년 : " + year + " , 이메일 : " + email ;
	}
}

class Tiger {
	String name;
	String run;
	
	Tiger (String name, String run) {
		this.name = name;
		this.run = run;
	}
	@Override
	public String toString() {
		return "이름 : "  + name + " , 걸음 : " + run ;
	}
}

class Banana {
	String name;
	String color;
	int price;
	
	Banana (String name, String color, int price)  {
		this.name = name;
		this.color = color;
		this.price = price;
	} 
	@Override
	public String toString() {
		return "이름 : "  + name + " , 색깔 : " + color + " , 가격 : " + price ;
	}
}

class Something {	// ObJect 를 사용해서 모든 상품을 저장할 수 있다.
	private Object object = new Object();	// Object : 모든 클래스는 Object 타입으로 변환

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
}


public class Ex_UsingObject {

	public static void main(String[] args) {
		// 1. Student를 저장 후 출력 . Object
		Something some1 = new Something();
		some1.setObject(new Student("학생", "Hong", 60));
		System.out.println((Student) some1.getObject());
		// 2. Professor를 저장 후 출력 . Object
		Something some2 = new Something();
		some2.setObject(new Professor("교수", 3, "aaa@aaa.aaa"));
		System.out.println((Professor) some2.getObject());
		// 3. Tiger를 저장 후 출력
		Something some3 = new Something();
		some3.setObject(new Tiger("호랑이", "빠르게 뜁니다."));
		System.out.println((Tiger) some3.getObject());
		// 4. Banana를 저장 후 출력
		Something some4 = new Something();
		some4.setObject(new Banana("바나나", "노랑", 3000));
		System.out.println((Banana) some4.getObject());
		
		
		
	}

}
