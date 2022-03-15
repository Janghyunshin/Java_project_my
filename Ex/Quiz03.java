package Ex;
				// 자바는 다중 상속이 불가 ,
class Student { // 부모 클래스 , 모든 클래스는 Object 클래스를 상속 합니다.
				//
	String name;			// 학생이름
	int studentID;			// 학번
	int kor;				// 국어점수
	int eng;				// 영어점수
	int math;				// 수학점수
	
	int sum;				// 점수 합
	double avg;				// 점수 평균
	
	void hobby () {
		System.out.println("각 학생의 취미는 입니다.");
	}

	@Override
	public String toString() {		// Object 클래스의 메소드, 객체 자체를 출력할 때  , [패키지명.클래스명@해쉬코드 
		return "이름 : " + name + " , 학번 : " + studentID + " , 국어: " + kor + " , 영어: " +eng +
				" , 수학: " + math + " , 합계 : " + sum + " , 평균: " + avg + " 입니다.";
	}
	
	
}

class S_철수 extends Student {
	
	S_철수 () {} // 생성자: 1. 클래스명과 동일, 2. 리턴타입이 없어야 한다.
	
	S_철수 (String a, int b, int c, int d, int e) {	// 생성자 : 객체를 생성할때 메모리의 초기값을 할당 할때 사용.
		super.name = a;				// super : 부모(super) 클래스,  this: 자기자신의 객체
		super.studentID = b;
		super.kor = c;
		super.eng = d;
		super.math = e;
		
		super.sum = c + d + e;
		super.avg = (double) sum / 3; 	// 평균을 계산 할때는 (double)로 캐스팅
	}
	
	@Override
	void hobby() {
		System.out.println("철수의 취미는 낚시 입니다.");
	}
}

class S_영희 extends Student {
	
	S_영희 () {}
	
	S_영희 (String a, int b, int c, int d, int e) {
		super.name = a;
		super.studentID = b;
		super.kor = c;
		super.eng = d;
		super.math = e;
		super.sum = c + d + e;
		super.avg = (double) (c + d + e) / 3;
	}

	@Override
	void hobby() {
		System.out.println("영희의 취미는 골프 입니다.");
	}
}

class S_영식 extends Student {
	
	S_영식 () {}
	
	S_영식 (String a, int b, int c, int d, int e) {	//생성자
		super.name = a;
		super.studentID = b;
		super.kor = c;
		super.eng = d;
		super.math = e;
		super.sum = c + d + e;
		super.avg = (double) (c + d + e) / 3;
	}

	@Override
	void hobby() {
		System.out.println("영식의 취미는 축구 입니다.");	
	}
}

public class Quiz03 {

	public static void main(String[] args) {

		Student cs2 = new S_철수("철수", 01, 55, 70, 85);
		Student yh2 = new S_영희("영희", 02, 75, 80, 85);
		Student ys2 = new S_영식("영식", 03, 100, 90, 80);
		
		Student[]arr2 = {cs2,yh2,ys2}; // 배열화 
		
		//for문
		for (int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
			arr2[i].hobby();
		}
		
		System.out.println("============================");
		
		for (Student g : arr2) {
			System.out.println(g);
			g.hobby();
		}
		
	}

}
