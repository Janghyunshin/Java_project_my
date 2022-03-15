package chap06_07.Ex05;

public class Ex_C {

	public static void main(String[] args) {
		
		C c = new C();	// 같은 패키지에 존재하는 클래스
		// c.company = "삼성자동차"; //private : 외부 클래스에서 접근 불가
		c.model = "그랜져";	// default
		c.color = "검정";		// protected
		c.maxSpeed = 250; 	// public
		
		c.print();	// public
		
	}

}
