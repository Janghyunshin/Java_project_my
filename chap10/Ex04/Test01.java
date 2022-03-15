package chap10.Ex04;

class Human {		// 부모 클래스
	String name;	// 인스턴스 필드 : 객체화 시켜야 사용, Heap
	int age;
	
	void eat() {	// 인스턴스 메소드 : 객체화 시켜야 사용, Heap (pointer), 클래스영역내의 인스턴스 메소드영역에
						// 실제 메소드의 코드가 저장 
		System.out.println("사람이 먹습니다.");
	}
	void sleep() {
		System.out.println("사람이 잠을 잡니다.");
	}
}

class Student extends Human {
	int studentID;
	void goToSchool () {
		System.out.println("학생은 학교에 갑니다.");
	}
}

class Worker extends Human {
	int workerID;
	void goToCompany () {
		System.out.println("회사원은 직장에 갑니다.");
	}
}

public class Test01 {

	public static void main(String[] args) {

			Human h = new Human(); 
			
			h.name = "홍길동";
			h.age = 30;
			h.eat();
			h.sleep();
			
			Student s = new Student();	//자식 클래스: 자식 클래스는 부모클래스의 필드와 메소드를 상속
			s.name = "신사임당";	// 부모클래스의 필드
			s.eat(); 			// 부모클래스의 메소드
			s.studentID = 1111;	// 자식클래스의 필드
			s.goToSchool(); 	// 자식클래스의 메소드

			Worker w = new Worker();	//자식클래스
			w.name = "BTS"; 			//부모클래스 필드
			w.eat(); 					//부모클래스 메소드
			w.workerID = 2222; 			//자식클래스 필드
			w.goToCompany(); 			//자식클래스 메소드 
			
			Human h1 = new Student (); 		// 업캐스팅 자식 => 부모 타입으로 형변환 
								// h1  : Human, Student 타입이 모두 저장, Human만 접근 가능 
			h.name = "이순신";
			h.eat();
			
			System.out.println("==============================");
			
			//다운 캐스팅 : 부모 ==> 자식 으로 타입 변환		, if 조건을 사용해서 instanceof 를 사용해서 처리 
				// 런타임 오류 
			
			System.out.println(h1 instanceof Student ); 	// true
			System.out.println(h1 instanceof Human ); 	 	// true 
			
			if ( h1 instanceof Student) { 	// 다운 캐스팅 할때 런타임 오류를 방지하기 위해 객체의
				Student s2 = (Student) h1;		// 다운 캐스팅할 데이터 타입이 존재할때
				s2.studentID = 3333;
				s2.goToSchool();
			}
			
			if ( h1 instanceof Worker) {
				Worker w4 = (Worker) h1; 	
			}
			// 오류가 발생 하지 않는다 . (컴파일 오류는 발생되지 않는다)
										// 실행시 오류 발생, 런타임 오류 
			System.out.println(h1 instanceof Worker); 		// false
			
			
			
			
			
	}

}
