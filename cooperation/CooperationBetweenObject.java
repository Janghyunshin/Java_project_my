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
	
	public Student(String studentName, int money) {
		this.studentName = studentName; 	// 학생명
		this.money = money; 				// 학생이 가진돈, 초기값 : 100,000 
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
	@Override
	public String toString() {
		return studentName + " 님의 남은돈은 " + money + " 원 입니다.";
	}
	
}

class Bus {
	int busName; 			// 100번 버스, 200번 버스 		<== 인풋값을 받아서, 생성자.
	int passengerCount; 	// 승객수						
	int money;				// 버스의 수입 
	

	public Bus(int busName) {
		this.busName= busName;
	}
	
	public void take(int money) { 	// 탈 때,  버스의 수입을 처리, 승객수 처리
		this.money += money;
		passengerCount += 1;
	}
	public void takeOut() {		//  내릴 떄 , 승객수만 감소
		passengerCount -= 1;
	}
	@Override
	public String toString() {
		return "버스" + busName + "번의 승객은 " + passengerCount + "명이고 수입은 " + money + " 원 입니다.";
	}
	
}

class Subway {
	String lineNumber; 		// "1호선", 2호선, 3호선
	int passengerCount; 	// 승객수
	int money; 				// 수입

	public Subway (String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	//생성자를 통해서 지하철 호선을 인풋 받아서 활성화
	public void take(int money) { 		// (탈 때) 수입을 처리하는 메소드, 승객수 
		this.money = money;
		passengerCount += 1;
	}
	public void takeOut() {		// 내릴 때, 승객수만 감소
		passengerCount -= 1;
	}
	@Override
	public String toString() {
		return "지하철 " + lineNumber + " 의 승객은 " + passengerCount + "명이고 수입은 " + money + " 원 입니다.";
	}
}


public class CooperationBetweenObject {
	public static void main(String[] args) {
		
		ArrayList<Student> studentList = new ArrayList<>();
		Scanner sc = new Scanner(System.in); 
		String pickStudent = null;
		Bus bus = new Bus(100);
		Subway subway = new Subway("1호선");	
		
		while(true) {
			System.out.println("==================================================================================");
			System.out.println("1. 학생객체 생성	| 2. 학생정보 출력 및 선택	| 3. 버스를 탐 ");
			System.out.println("4. 버스를 내림		| 5. 지하철을 탐			| 6. 지하철을 내림	| 7 종료 ");
			System.out.println("==================================================================================");
			System.out.print("선택 >> ");
			
			int No = sc.nextInt();
			// 1. 학생객체 생성
			if (No == 1) {
				System.out.println("--  1. 학생 등록 입니다.  --");
				System.out.print("-- 첫 번째 학생의 이름을 입력하세요 : ");
				String studentName1 = sc.next();
				System.out.print("-- 첫 번째 학생의 돈을 입력하세요 : ");
				int money1 = sc.nextInt();
				Student student1 = new Student(studentName1, money1);
				studentList.add(student1);
				System.out.println("-- 첫 번째 학생이 등록되었습니다. --");
				
				System.out.print("-- 두 번째 학생의 이름을 입력하세요 : ");
				String studentName2 = sc.next();
				System.out.print("-- 두 번째 학생의 돈을 입력하세요 : ");
				int money2 = sc.nextInt();
				Student student2 = new Student(studentName2, money2);
				studentList.add(student2);
				System.out.println("-- 두 번째 학생이 등록되었습니다. --");
				
				System.out.print("-- 세 번째 학생의 이름을 입력하세요 : ");
				String studentName3 = sc.next();
				System.out.print("-- 세 번째 학생의 돈을 입력하세요 : ");
				int money3 = sc.nextInt();
				Student student3 = new Student(studentName3, money3);
				studentList.add(student3);
				System.out.println("-- 세 번째 학생이 등록되었습니다. --");
				
				System.out.print("-- 네 번째 학생의 이름을 입력하세요 : ");
				String studentName4 = sc.next();
				System.out.print("-- 네 번째 학생의 돈을 입력하세요 : ");
				int money4 = sc.nextInt();
				Student student4 = new Student(studentName4, money4);
				studentList.add(student4);
				System.out.println("-- 네 번째 학생이 등록되었습니다. --");
				
				System.out.print("-- 다섯 번째 학생의 이름을 입력하세요 : ");
				String studentName5 = sc.next();
				System.out.print("-- 다섯 번째 학생의 돈을 입력하세요 : ");
				int money5 = sc.nextInt();
				Student student5 = new Student(studentName5, money5);
				studentList.add(student5);
				System.out.println("-- 다섯 번째 학생이 등록되었습니다. --");
				
			// 2. 학생정보 출력 및 선택 : 		학생이름	가진돈
			} else if (No == 2) {
				System.out.println("--  2. 학생 정보 출력입니다.  --");
				System.out.println("학생이름" +"\t" + "가진돈");
				for (Student k : studentList) {
					System.out.println(k);
				}
				
				System.out.println();
				System.out.print(" 학생선택(이름입력) >>> ");
				pickStudent = sc.next();
				System.out.println(pickStudent + " 학생이 선택 되었습니다.");
				
				
			// 3. 버스를 탐
			} else if (No == 3) {
				for (Student k : studentList) {
					if (pickStudent.equals(k.studentName)) {
						k.takeBus(bus);
						System.out.println(k.studentName + " 님이 " + bus.busName + " 번 버스를 탔습니다. 즐거운 하루되세요. ");
						System.out.println(k.studentName + " 님의 남은 돈은 " + k.money + "원 입니다.");
						System.out.println("버스 " + bus.busName + " 번의 승객은 " + bus.passengerCount + " 명 이고, 수입은 "
						+ bus.money + " 원 입니다.");
					}
				}
				
			} else if (No == 4) {
				for (Student k : studentList) {
					if (pickStudent.equals(k.studentName)) {
						k.takeOutBus(bus);
						System.out.println(k.studentName + " 님이 " + bus.busName + " 번 버스를 내렸습니다. 굿바이~~~. ");
						System.out.println(k.studentName + " 님의 남은 돈은 " + k.money + "원 입니다.");
						System.out.println("버스 " + bus.busName + " 번의 승객은 " + bus.passengerCount + " 명 이고, 수입은 "
						+ bus.money + " 원 입니다.");
					}
				}
				
			} else if (No == 5) {
				for (Student k : studentList) {
					if (pickStudent.equals(k.studentName)) {
						k.takeSubway(subway);
						System.out.println(k.studentName + " 님이 " + subway.lineNumber + " 지하철을 탔습니다. 즐거운 하루되세요. ");
						System.out.println(k.studentName + " 님의 남은 돈은 " + k.money + "원 입니다.");
						System.out.println("지하철 " + subway.lineNumber + " 의 승객은 " + subway.passengerCount + " 명 이고, 수입은 "
						+ subway.money + " 원 입니다.");
					}
				}
			} else if (No == 6) {
				for (Student k : studentList) {
					if (pickStudent.equals(k.studentName)) {
						k.takeOutSubway(subway);
						System.out.println(k.studentName + " 님이 " + subway.lineNumber + " 지하철을 내렸습니다. 안녕 ~~~ ");
						System.out.println(k.studentName + " 님의 남은 돈은 " + k.money + "원 입니다.");
						System.out.println("지하철 " + subway.lineNumber + " 의 승객은 " + subway.passengerCount + " 명 이고, 수입은 "
						+ subway.money + " 원 입니다.");
					}
				}
			} else if (No == 7) {
				break;
			}
			
		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
		
		
		/*
		!! 문제 !!
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
