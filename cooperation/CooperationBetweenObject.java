package cooperation;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


// 객체간의 협업
/*				학생의 용돈 100,0000
 		학생		:			 버스를 탈때 (- 1000원) 	지하철을 탈 때 (- 1,500)
 		버스		: 1,000원	승객수 증가, 수입증가
 		지하철	: 1,500원							승객수 증가, 수입증가
 */

class Student {
	String studentName; 	// 학생명
	int money; 				// 학생이 가진돈, 초기값 : 100,000 
	
	
	// 필드 getter setter 
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	// 
	Student (String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus (Bus bus) { 		// 학생이 버스를 탔을때? 버스에 돈을 지불해야 한다. 
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeOutBus (Bus bus) { 	// 버스에서 내림.
		bus.takeOut();
	}
	
	public void takeSubway (Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	public void takeOutSubway (Subway subway) {
		subway.takeOut();
	}
	
	// 000 님의 남은돈은 000 입니다. 
	public void showInfo() {
		System.out.println(studentName + " 님의 남은돈은 " + money + " 원 입니다.");
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			if ( studentName == ((Student)obj).studentName ) {
				return true;
			}
		}
		return false;
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(studentName);
	}
	
}

class Bus {
	int busName; 			// 100번 버스, 200번 버스 		<== 인풋값을 받아서, 생성자.
	int passengerCount; 	// 승객수						
	int money;				// 버스의 수입 
	
	// Bus 필드 getter . setter
	
	public int getBusName() {
		return busName;
	}

	public void setBusName(int busName) {
		this.busName = busName;
	}

	public int getPassengerCount() {
		return passengerCount;
	}

	public void setPassengerCount(int passengerCount) {
		this.passengerCount = passengerCount;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public Bus(int busName) {
		this.busName= busName;
	}
	
	public void take(int money) { 	// 탈 때,  버스의 수입을 처리, 승객수 처리
		this.money += money;
		passengerCount ++;
	}
	public void takeOut() {		//  내릴 떄 , 승객수만 감소
		passengerCount --;
	}
	public void showInfo () {  // 버스 정보
		System.out.println("버스" + busName + "번의 승객은 " + passengerCount + "명이고 수입은 " + money + " 원 입니다.");
//		버스 000번의 승객은 000명이고 수입은000 입니다. 
	}
	
}

class Subway {
	String lineNumber; 		// "1호선", 2호선, 3호선
	int passengerCount; 	// 승객수
	int money; 				// 수입
	
	// subway 필드 getter. setter
	
	public String getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(String lineNumber) {
		this.lineNumber = lineNumber;
	}

	public int getPassengerCount() {
		return passengerCount;
	}

	public void setPassengerCount(int passengerCount) {
		this.passengerCount = passengerCount;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public Subway (String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	//생성자를 통해서 지하철 호선을 인풋 받아서 활성화
	public void take(int money) { 		// (탈 때) 수입을 처리하는 메소드, 승객수 
		this.money = money;
		passengerCount ++;
	}
	public void takeOut() {		// 내릴 때, 승객수만 감소
		passengerCount --;
	}
	public void showInfo () {
		System.out.println("지하철 " + lineNumber + " 의 승객은 " + passengerCount + "명이고 수입은 " + money + " 원 입니다." );
//		지하철 00 호선의 승객은 00명이고 수입은  000 입니다. 
	}
}


public class CooperationBetweenObject {

	private static ArrayList<Student> aList = new ArrayList<Student>();
	private static ArrayList<Bus> bList = new ArrayList<Bus>();
	private static ArrayList<Subway> sList = new ArrayList<Subway>();
	
	private static Scanner sc = new Scanner(System.in); 
	
	// 학생 객체 생성 메서드
	private static void createStudent() {
		System.out.println("------ 1. 학생객체 생성 ------");
		System.out.print("- 학생이름 : ");
		String studentName = sc.next();
		System.out.print("- 돈 입력 : ");
		int money = sc.nextInt(); 	// 학생이 가진 돈, 초기값
		
		//각 필드의 정보를 사용자로 부터 할당 받아서 객체를 생성후 객체에 필드의 값을 저장. 
		Student student = new Student (studentName, money); //생성자를 통해서 객체에 필드 값 적용후 객체 생성. 
		
		//배열 선은은 메소드 외부에서 선언. 전역변수 : 모든 메소드에서 사용가능 
		aList.add(student);
		System.out.println("학생 객체가 성공적으로 생성되었습니다. ");
	}
	
	// 학생정보 출력 및 선택 : 	학생이름	가진돈
	
	private static void studentInfo() {
		//코드 작성 :2. 계좌 목록 출력 :  배열에 저장된 객체를 가져와서 학생이름, 금액 을 출력 
		//배열의 각 방을 순회 하면서 null이 아닌 경우 배열에서 객체를 꺼내서 필드의 정보를 출력. 
		System.out.println("------ 2. 학생 정보 출력 ------");
		
		//배열의 각방의 null아닌 경우 , 객체의 필드의 값을 출력. 
		for ( int i = 0 ; i < aList.size(); i++) {
			//각 방의 객체를 담는 변수를 선언 
			Student student = aList.get(i);    // 0 ~ 99 방의 객체를 student 참조 변수에 담는다. 
	
				System.out.print(student.getStudentName());  // 학생 이름 
				System.out.print("    ");
				System.out.print(student.getMoney());   // 금액
				System.out.print("만원");
				System.out.println();   //라인 개행. 
		}	
	}
	
	// 버스 탈 때
	private static void tBus() {
		System.out.println("-------  3. 버스를 탐  -------");
		System.out.println("- 학생의 이름을 입력하세요 : ");
		String studentName = sc.next(); // 학생 선택
		Student student = findStudent(studentName); //findStudent(학생명)
		System.out.println("- 버스의 번호를 입력하세요 : ");
		int busName = sc.nextInt();
		Bus bus = new Bus(busName);
		
		if (student == null) {
			System.out.println("결과 : 해당 학생이 존재하지 않습니다.  ");
			return;    // 메소드를 종료. 
		}
		
		student.takeBus(bus);
		System.out.println(student.studentName + " 님 " + bus.busName + " 번 버스를 탔습니다. 즐거운 하루되세요.");
		student.showInfo();
		bus.showInfo();
	// 버스 내릴 때	
	}
		private static void tOutBus() {
			System.out.println("-------  4. 버스를 내림  -------");
			System.out.println("- 버스의 번호를 입력하세요 : ");
			int busName = sc.nextInt();
			Bus bus = findBus(busName);
			System.out.println("- 학생의 이름을 입력하세요 : ");
			String studentName = sc.next(); // 학생 선택
			Student student = findStudent(studentName); //findStudent(학생명)

			
			if (student == null) {
				System.out.println("결과 : 해당 학생이 존재하지 않습니다.  ");
				return;    // 메소드를 종료. 
			}
			
			
			student.takeOutBus(bus);
			System.out.println(student.studentName + " 님 " + bus.busName + " 버스를 내렸습니다. 굿바이~~~. ");
			student.showInfo();
			bus.showInfo();
		}
	// 지하철 탈 때	
		private static void tSubway() {
			System.out.println("-------  5. 지하철을 탐  -------");
			System.out.println("- 학생의 이름을 입력하세요 : ");
			String studentName = sc.next(); // 학생 선택
			Student student = findStudent(studentName); //findStudent(학생명)
			System.out.println("- 지하철의 호선을 입력하세요 : ");
			String lineNumber = sc.next();
			Subway subway = new Subway(lineNumber);
			
			if (student == null) {
				System.out.println("결과 : 해당 학생이 존재하지 않습니다.  ");
				return;    // 메소드를 종료. 
			}
			
			student.takeSubway(subway);
			System.out.println(student.studentName + " 님 " + subway.lineNumber + " 지하철를 탔습니다. 즐거운 하루되세요.  ");
			student.showInfo();
			subway.showInfo();
		}
	// 지하철을 내릴 때
		private static void tOutSubway() {
			System.out.println("-------  6. 지하철을 내림  -------");
			System.out.println("- 학생의 이름을 입력하세요 : ");
			String studentName = sc.next(); // 학생 선택
			Student student = findStudent(studentName); //findStudent(학생명)
			System.out.println("- 지하철의 호선을 입력하세요 : ");
			String lineNumber = sc.next();
			Subway subway = findSub(lineNumber);
			
			if (student == null) {
				System.out.println("결과 : 해당 학생이 존재하지 않습니다.  ");
				return;    // 메소드를 종료. 
			}
			
			
			
			student.takeOutSubway(subway);
			System.out.println(student.studentName + " 님 " + subway.lineNumber + " 지하철를 탔습니다. 즐거운 하루되세요.  ");
			student.showInfo();
			subway.showInfo();
		}
		
		
		
		
	// 학생 객체 찾기 
	private static Student findStudent (String studentName) {
		Student student = null ; 
		//코드 작성 
		for (int i = 0 ; i < aList.size() ; i++) {   
			if (aList.get(i) != null) {		//배열방의 값이 null이 아닐 경우에 객체의 studentName[학생명] 
				//각 객체의 방의 studentName 을 담는 변수 선언. 
				String dbName = aList.get(i).getStudentName(); //배열의 각 방에 저장된 객체의 studentName를 dbName 변수에 할당. 
				if (dbName.equals(studentName)) {
					student = aList.get(i); // student 참조변수는 객체의 주소정보를 담는다.
					break;
				}
			}
		}
		return student; 
	}
	
	// 버스 객체 찾기 
		private static Bus findBus (int busName) {
			Bus bus = null ; 
			//코드 작성 
			for (int i = 0 ; i < bList.size() ; i++) {   
				if (bList.get(i) != null) {		//배열방의 값이 null이 아닐 경우에 객체의 busName[버스번호] 
					//각 객체의 방의 busName 을 담는 변수 선언. 
					int bName = bList.get(i).getBusName(); //배열의 각 방에 저장된 객체의 studentName를 dbName 변수에 할당. 
					if (bName == (busName)) {
						bus = bList.get(i); // bus 참조변수는 객체의 주소정보를 담는다.
						break;
					}
				}
			}
			return bus;
		}
		
	// 지하철 객체 찾기 
	private static Subway findSub (String lineNumber) {
		Subway subway = null ; 
		//코드 작성 
		for (int i = 0 ; i < sList.size() ; i++) {   
			if (sList.get(i) != null) {		//배열방의 값이 null이 아닐 경우에 객체의 LineNumber[지하철 호선] 
				//각 객체의 방의 lineNumber 을 담는 변수 선언. 
				String sName = sList.get(i).getLineNumber(); //배열의 각 방에 저장된 객체의 lineNumber를 sName 변수에 할당. 
				if (sName == (lineNumber)) {
					subway = sList.get(i); // subway 참조변수는 객체의 주소정보를 담는다.
					break;
				}
			}
		}
		return subway;
	}
	
	
	
	public static void main(String[] args) {
		
		ArrayList<Student> studentList = new ArrayList<>();
		Scanner sc = new Scanner(System.in); 
		

		
		
		while(true) {
			System.out.println("==================================================================================");
			System.out.println("1. 학생객체 생성	| 2. 학생정보 출력 및 선택	| 3. 버스를 탐 ");
			System.out.println("4. 버스를 내림		| 5. 지하철을 탐			| 6. 지하철을 내림	| 7 종료 ");
			System.out.println("==================================================================================");
			System.out.print("선택 >> ");
			int No = sc.nextInt();
			// 1. 학생객체 생성
			if (No == 1) {
				createStudent();
			// 2. 학생정보 출력 및 선택
			} else if (No == 2) {
				studentInfo();

			// 3. 버스를 탐
			} else if (No == 3) {
				tBus();
				
			} else if (No == 4) {
				tOutBus();
				
			} else if (No == 5) {
				tSubway();
				
			} else if (No == 6) {
				tOutSubway();
				
			} else if (No == 7) {
				break;
			}
			
		}
		System.out.println("프로그램을 종료합니다.");
		/*
		학생 5명 입력 : 학생당 100,000만원 초기값 할당. 
		=============================================
		1. 학생객체 생성  | 2. 학생정보 출력 및 선택  
		3. 버스를 탐 |  4.  버스를 내림 5. 지하철을 탐 , 6. 지하철을 내림.   7. 종료  
		=============================================
		선택>> 1
		학생이름  : 
		 돈 입력   : 

		선택>> 2 
		=====학생정보 출력=====
		학생이름	가진돈



		학생선택(이름입력)>> 
		
		선택>> 3
		000 님 000 번 버스를 탔습니다. 즐거운 하루되세요. 
		000 님의 남은돈은 000 입니다. 
		버스 000번의 승객은 000명이고 수입은000 입니다. 

		선택>> 4
		000 님 000 번 버스를 내렸습니다. 굿바이~~~. 
		000 님의 남은돈은 000 입니다. 
		버스 00번의 승객은 000명이고 수입은 000 입니다. 

		선택>> 5
		000 님 000 호선 지하철를 탔습니다. 즐거운 하루되세요. 
		000 님의 남은돈은 000 입니다. 
		지하철 00 호선의 승객은 00명이고 수입은  000 입니다. 

		선택>> 6
		000 님 000 호선 지하철를 내렸습니다. 안녕 ~~~
		000 님의 남은돈은 000 입니다. 
		지하철 00 호선의 승객은 00명이고 수입은  000 입니다. 
		*/ 

	}

}
