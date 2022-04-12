package chap16.Ex02;
// Object�� ����ؼ� 4���� ��ü�� �����ϰ� ����غ���

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
		return "�̸� : "  + name + " , ���̵� : " + id + " , �н� : " + pass ;
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
		return "�̸� : "  + name + " , �г� : " + year + " , �̸��� : " + email ;
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
		return "�̸� : "  + name + " , ���� : " + run ;
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
		return "�̸� : "  + name + " , ���� : " + color + " , ���� : " + price ;
	}
}

class Something {	// ObJect �� ����ؼ� ��� ��ǰ�� ������ �� �ִ�.
	private Object object = new Object();	// Object : ��� Ŭ������ Object Ÿ������ ��ȯ

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
}


public class Ex_UsingObject {

	public static void main(String[] args) {
		// 1. Student�� ���� �� ��� . Object
		Something some1 = new Something();
		some1.setObject(new Student("�л�", "Hong", 60));
		System.out.println((Student) some1.getObject());
		// 2. Professor�� ���� �� ��� . Object
		Something some2 = new Something();
		some2.setObject(new Professor("����", 3, "aaa@aaa.aaa"));
		System.out.println((Professor) some2.getObject());
		// 3. Tiger�� ���� �� ���
		Something some3 = new Something();
		some3.setObject(new Tiger("ȣ����", "������ �ݴϴ�."));
		System.out.println((Tiger) some3.getObject());
		// 4. Banana�� ���� �� ���
		Something some4 = new Something();
		some4.setObject(new Banana("�ٳ���", "���", 3000));
		System.out.println((Banana) some4.getObject());
		
		
		
	}

}
