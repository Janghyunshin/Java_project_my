package chap14.Ex09;

class MyAllException extends Exception {		// 일반 예외 (checked Exception) - 구문 오류(예외처리)
	public MyAllException () {
		super();	// 부모의 생성자 호출
	}
	public MyAllException (String message) {	// 예외 메세지 출력, e.getMessage();
		super(message);
	}
}



class A {
	// private : 캡슐화, 객체생성 후 바로 접근 하지 못하도록 설정
		// 생성자, setter <== 제어 후 필드의 값을 할당 
	private String season ;	// 봄, 여름, 가을, 겨울 (예외발생 : 봄,여름,가을,겨울만 입력하세요)
	private String week ;	// 월, 화, 수, 목, 금 ,토, 일 (예외 발생 : 월,화,수,목,금,토,일 만 입력하세요)
	private int scoreKor;	// 0 ~ 100 값만 입력( 예외 발생 : 0 ~ 100까지 정수만 입력하세요)
	private int scoreEng; 	// 0 ~ 100 값만 입력( 예외 발생 : 0 ~ 100까지 정수만 입력하세요)
	private String userID;	// 12자이상 20자 사이의 문자 ( 예외 발생: 12자이상 20자 사이의 문자만 넣으세요)
	
	void studentInfo (String season, String week, int scoreKor, int scoreEng, String userID) throws MyAllException{
		if ( season != "봄" && season != "여름" && season != "가을" && season != "겨울") {
			throw new MyAllException ("예외발생 : 봄,여름,가을,겨울만 입력하세요");
			
	}   else if ( week != "월" && week != "화" && week != "수" && week != "목" && week != "금" &&
			week != "토" && week != "일") {
			throw new MyAllException ("예외 발생 : 월,화,수,목,금,토,일 만 입력하세요");
			
	}   else if ( scoreKor < 0  || scoreKor > 100 ) {
			throw new MyAllException ("예외 발생 : 0 ~ 100까지 정수만 입력하세요");
			
	}	else if ( scoreEng < 0  || scoreEng > 100) {
			throw new MyAllException ("예외 발생 : 0 ~ 100까지 정수만 입력하세요");
			
	}	else if (userID.length() < 12 || userID.length() > 20) {
			throw new MyAllException	("예외 발생: 12자이상 20자 사이의 문자만 넣으세요"); 
			
	} 	else {
			System.out.println("정상적으로 잘 입력 되었습니다.");
			this.season = season;
			this.week  = week ;
			this.scoreKor = scoreKor;
			this.scoreEng = scoreEng;
			this.userID = userID;
	}
		System.out.printf(season + "," + week + "," + scoreKor + "," + scoreEng + "," + userID);
	}
}

public class UserException_EX {

	public static void main(String[] args) {
		
	
		A a1 = new A();
		// 모든 필드의 값을 정상
		try{
			a1.studentInfo("봄", "월", 80, 90, "aaaaaaaaaabbb");
		}catch (MyAllException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());	// Return String
		}
	
		System.out.println();
		System.out.println("======================");
		
		try{
			a1.studentInfo("꿈", "월", 80, 90, "aaaaaaaaaabbb");
		}catch (MyAllException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println();
		System.out.println("======================");
		
		try{
			a1.studentInfo("여름", "목", 110, 90, "aaaaaaaaaabbb");
		}catch (MyAllException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println();
		System.out.println("======================");
		
		try{
			a1.studentInfo("겨울", "금", 80, 111, "aaaaaaaaaabbb");
		}catch (MyAllException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println();
		System.out.println("======================");
		
		try{
			a1.studentInfo("가을", "토", 80, 90, "aaaa");
		}catch (MyAllException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}	
		
		


