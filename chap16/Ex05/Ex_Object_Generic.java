package chap16.Ex05;

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

class Something<T> {	// ObJect 를 사용해서 모든 상품을 저장할 수 있다.
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}


public class Ex_Object_Generic {
	public static void main(String[] args) {
		
		Something<Student> some1 = new Something<Student>();
		some1.setT(new Student("홍길동", "HONG", 100));
		System.out.println(some1.getT());
		
		Something<Professor> some2 = new Something<Professor>();
		some2.setT(new Professor("교수", 3, "aaa@aaa.aaa"));
		System.out.println(some2.getT());
		
		Something<Tiger> some3 = new Something<Tiger>();
		some3.setT(new Tiger ("호랑이", "빠르게 뜁니다."));
		System.out.println(some3.getT());
		
		Something<Banana> some4 = new Something<Banana>();
		some4.setT(new Banana ("바나나", "노랑", 3000));
		System.out.println(some4.getT());
		
	}
}
