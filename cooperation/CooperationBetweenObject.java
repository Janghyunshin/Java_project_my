package cooperation;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


// ��ü���� ����
/*				�л��� �뵷 100,0000
 		�л�		:			 ������ Ż�� (- 1000��) 	����ö�� Ż �� (- 1,500)
 		����		: 1,000��	�°��� ����, ��������
 		����ö	: 1,500��							�°��� ����, ��������
 */

class Student {
	String studentName; 	// �л���
	int money; 				// �л��� ������, �ʱⰪ : 100,000 
	
	
	// �ʵ� getter setter 
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
	
	public void takeBus (Bus bus) { 		// �л��� ������ ������? ������ ���� �����ؾ� �Ѵ�. 
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeOutBus (Bus bus) { 	// �������� ����.
		bus.takeOut();
	}
	
	public void takeSubway (Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	public void takeOutSubway (Subway subway) {
		subway.takeOut();
	}
	
	// 000 ���� �������� 000 �Դϴ�. 
	public void showInfo() {
		System.out.println(studentName + " ���� �������� " + money + " �� �Դϴ�.");
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
	int busName; 			// 100�� ����, 200�� ���� 		<== ��ǲ���� �޾Ƽ�, ������.
	int passengerCount; 	// �°���						
	int money;				// ������ ���� 
	
	// Bus �ʵ� getter . setter
	
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
	
	public void take(int money) { 	// Ż ��,  ������ ������ ó��, �°��� ó��
		this.money += money;
		passengerCount ++;
	}
	public void takeOut() {		//  ���� �� , �°����� ����
		passengerCount --;
	}
	public void showInfo () {  // ���� ����
		System.out.println("����" + busName + "���� �°��� " + passengerCount + "���̰� ������ " + money + " �� �Դϴ�.");
//		���� 000���� �°��� 000���̰� ������000 �Դϴ�. 
	}
	
}

class Subway {
	String lineNumber; 		// "1ȣ��", 2ȣ��, 3ȣ��
	int passengerCount; 	// �°���
	int money; 				// ����
	
	// subway �ʵ� getter. setter
	
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
	
	//�����ڸ� ���ؼ� ����ö ȣ���� ��ǲ �޾Ƽ� Ȱ��ȭ
	public void take(int money) { 		// (Ż ��) ������ ó���ϴ� �޼ҵ�, �°��� 
		this.money = money;
		passengerCount ++;
	}
	public void takeOut() {		// ���� ��, �°����� ����
		passengerCount --;
	}
	public void showInfo () {
		System.out.println("����ö " + lineNumber + " �� �°��� " + passengerCount + "���̰� ������ " + money + " �� �Դϴ�." );
//		����ö 00 ȣ���� �°��� 00���̰� ������  000 �Դϴ�. 
	}
}


public class CooperationBetweenObject {

	private static ArrayList<Student> aList = new ArrayList<Student>();
	private static ArrayList<Bus> bList = new ArrayList<Bus>();
	private static ArrayList<Subway> sList = new ArrayList<Subway>();
	
	private static Scanner sc = new Scanner(System.in); 
	
	// �л� ��ü ���� �޼���
	private static void createStudent() {
		System.out.println("------ 1. �л���ü ���� ------");
		System.out.print("- �л��̸� : ");
		String studentName = sc.next();
		System.out.print("- �� �Է� : ");
		int money = sc.nextInt(); 	// �л��� ���� ��, �ʱⰪ
		
		//�� �ʵ��� ������ ����ڷ� ���� �Ҵ� �޾Ƽ� ��ü�� ������ ��ü�� �ʵ��� ���� ����. 
		Student student = new Student (studentName, money); //�����ڸ� ���ؼ� ��ü�� �ʵ� �� ������ ��ü ����. 
		
		//�迭 ������ �޼ҵ� �ܺο��� ����. �������� : ��� �޼ҵ忡�� ��밡�� 
		aList.add(student);
		System.out.println("�л� ��ü�� ���������� �����Ǿ����ϴ�. ");
	}
	
	// �л����� ��� �� ���� : 	�л��̸�	������
	
	private static void studentInfo() {
		//�ڵ� �ۼ� :2. ���� ��� ��� :  �迭�� ����� ��ü�� �����ͼ� �л��̸�, �ݾ� �� ��� 
		//�迭�� �� ���� ��ȸ �ϸ鼭 null�� �ƴ� ��� �迭���� ��ü�� ������ �ʵ��� ������ ���. 
		System.out.println("------ 2. �л� ���� ��� ------");
		
		//�迭�� ������ null�ƴ� ��� , ��ü�� �ʵ��� ���� ���. 
		for ( int i = 0 ; i < aList.size(); i++) {
			//�� ���� ��ü�� ��� ������ ���� 
			Student student = aList.get(i);    // 0 ~ 99 ���� ��ü�� student ���� ������ ��´�. 
	
				System.out.print(student.getStudentName());  // �л� �̸� 
				System.out.print("    ");
				System.out.print(student.getMoney());   // �ݾ�
				System.out.print("����");
				System.out.println();   //���� ����. 
		}	
	}
	
	// ���� Ż ��
	private static void tBus() {
		System.out.println("-------  3. ������ Ž  -------");
		System.out.println("- �л��� �̸��� �Է��ϼ��� : ");
		String studentName = sc.next(); // �л� ����
		Student student = findStudent(studentName); //findStudent(�л���)
		System.out.println("- ������ ��ȣ�� �Է��ϼ��� : ");
		int busName = sc.nextInt();
		Bus bus = new Bus(busName);
		
		if (student == null) {
			System.out.println("��� : �ش� �л��� �������� �ʽ��ϴ�.  ");
			return;    // �޼ҵ带 ����. 
		}
		
		student.takeBus(bus);
		System.out.println(student.studentName + " �� " + bus.busName + " �� ������ �����ϴ�. ��ſ� �Ϸ�Ǽ���.");
		student.showInfo();
		bus.showInfo();
	// ���� ���� ��	
	}
		private static void tOutBus() {
			System.out.println("-------  4. ������ ����  -------");
			System.out.println("- ������ ��ȣ�� �Է��ϼ��� : ");
			int busName = sc.nextInt();
			Bus bus = findBus(busName);
			System.out.println("- �л��� �̸��� �Է��ϼ��� : ");
			String studentName = sc.next(); // �л� ����
			Student student = findStudent(studentName); //findStudent(�л���)

			
			if (student == null) {
				System.out.println("��� : �ش� �л��� �������� �ʽ��ϴ�.  ");
				return;    // �޼ҵ带 ����. 
			}
			
			
			student.takeOutBus(bus);
			System.out.println(student.studentName + " �� " + bus.busName + " ������ ���Ƚ��ϴ�. �¹���~~~. ");
			student.showInfo();
			bus.showInfo();
		}
	// ����ö Ż ��	
		private static void tSubway() {
			System.out.println("-------  5. ����ö�� Ž  -------");
			System.out.println("- �л��� �̸��� �Է��ϼ��� : ");
			String studentName = sc.next(); // �л� ����
			Student student = findStudent(studentName); //findStudent(�л���)
			System.out.println("- ����ö�� ȣ���� �Է��ϼ��� : ");
			String lineNumber = sc.next();
			Subway subway = new Subway(lineNumber);
			
			if (student == null) {
				System.out.println("��� : �ش� �л��� �������� �ʽ��ϴ�.  ");
				return;    // �޼ҵ带 ����. 
			}
			
			student.takeSubway(subway);
			System.out.println(student.studentName + " �� " + subway.lineNumber + " ����ö�� �����ϴ�. ��ſ� �Ϸ�Ǽ���.  ");
			student.showInfo();
			subway.showInfo();
		}
	// ����ö�� ���� ��
		private static void tOutSubway() {
			System.out.println("-------  6. ����ö�� ����  -------");
			System.out.println("- �л��� �̸��� �Է��ϼ��� : ");
			String studentName = sc.next(); // �л� ����
			Student student = findStudent(studentName); //findStudent(�л���)
			System.out.println("- ����ö�� ȣ���� �Է��ϼ��� : ");
			String lineNumber = sc.next();
			Subway subway = findSub(lineNumber);
			
			if (student == null) {
				System.out.println("��� : �ش� �л��� �������� �ʽ��ϴ�.  ");
				return;    // �޼ҵ带 ����. 
			}
			
			
			
			student.takeOutSubway(subway);
			System.out.println(student.studentName + " �� " + subway.lineNumber + " ����ö�� �����ϴ�. ��ſ� �Ϸ�Ǽ���.  ");
			student.showInfo();
			subway.showInfo();
		}
		
		
		
		
	// �л� ��ü ã�� 
	private static Student findStudent (String studentName) {
		Student student = null ; 
		//�ڵ� �ۼ� 
		for (int i = 0 ; i < aList.size() ; i++) {   
			if (aList.get(i) != null) {		//�迭���� ���� null�� �ƴ� ��쿡 ��ü�� studentName[�л���] 
				//�� ��ü�� ���� studentName �� ��� ���� ����. 
				String dbName = aList.get(i).getStudentName(); //�迭�� �� �濡 ����� ��ü�� studentName�� dbName ������ �Ҵ�. 
				if (dbName.equals(studentName)) {
					student = aList.get(i); // student ���������� ��ü�� �ּ������� ��´�.
					break;
				}
			}
		}
		return student; 
	}
	
	// ���� ��ü ã�� 
		private static Bus findBus (int busName) {
			Bus bus = null ; 
			//�ڵ� �ۼ� 
			for (int i = 0 ; i < bList.size() ; i++) {   
				if (bList.get(i) != null) {		//�迭���� ���� null�� �ƴ� ��쿡 ��ü�� busName[������ȣ] 
					//�� ��ü�� ���� busName �� ��� ���� ����. 
					int bName = bList.get(i).getBusName(); //�迭�� �� �濡 ����� ��ü�� studentName�� dbName ������ �Ҵ�. 
					if (bName == (busName)) {
						bus = bList.get(i); // bus ���������� ��ü�� �ּ������� ��´�.
						break;
					}
				}
			}
			return bus;
		}
		
	// ����ö ��ü ã�� 
	private static Subway findSub (String lineNumber) {
		Subway subway = null ; 
		//�ڵ� �ۼ� 
		for (int i = 0 ; i < sList.size() ; i++) {   
			if (sList.get(i) != null) {		//�迭���� ���� null�� �ƴ� ��쿡 ��ü�� LineNumber[����ö ȣ��] 
				//�� ��ü�� ���� lineNumber �� ��� ���� ����. 
				String sName = sList.get(i).getLineNumber(); //�迭�� �� �濡 ����� ��ü�� lineNumber�� sName ������ �Ҵ�. 
				if (sName == (lineNumber)) {
					subway = sList.get(i); // subway ���������� ��ü�� �ּ������� ��´�.
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
			System.out.println("1. �л���ü ����	| 2. �л����� ��� �� ����	| 3. ������ Ž ");
			System.out.println("4. ������ ����		| 5. ����ö�� Ž			| 6. ����ö�� ����	| 7 ���� ");
			System.out.println("==================================================================================");
			System.out.print("���� >> ");
			int No = sc.nextInt();
			// 1. �л���ü ����
			if (No == 1) {
				createStudent();
			// 2. �л����� ��� �� ����
			} else if (No == 2) {
				studentInfo();

			// 3. ������ Ž
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
		System.out.println("���α׷��� �����մϴ�.");
		/*
		�л� 5�� �Է� : �л��� 100,000���� �ʱⰪ �Ҵ�. 
		=============================================
		1. �л���ü ����  | 2. �л����� ��� �� ����  
		3. ������ Ž |  4.  ������ ���� 5. ����ö�� Ž , 6. ����ö�� ����.   7. ����  
		=============================================
		����>> 1
		�л��̸�  : 
		 �� �Է�   : 

		����>> 2 
		=====�л����� ���=====
		�л��̸�	������



		�л�����(�̸��Է�)>> 
		
		����>> 3
		000 �� 000 �� ������ �����ϴ�. ��ſ� �Ϸ�Ǽ���. 
		000 ���� �������� 000 �Դϴ�. 
		���� 000���� �°��� 000���̰� ������000 �Դϴ�. 

		����>> 4
		000 �� 000 �� ������ ���Ƚ��ϴ�. �¹���~~~. 
		000 ���� �������� 000 �Դϴ�. 
		���� 00���� �°��� 000���̰� ������ 000 �Դϴ�. 

		����>> 5
		000 �� 000 ȣ�� ����ö�� �����ϴ�. ��ſ� �Ϸ�Ǽ���. 
		000 ���� �������� 000 �Դϴ�. 
		����ö 00 ȣ���� �°��� 00���̰� ������  000 �Դϴ�. 

		����>> 6
		000 �� 000 ȣ�� ����ö�� ���Ƚ��ϴ�. �ȳ� ~~~
		000 ���� �������� 000 �Դϴ�. 
		����ö 00 ȣ���� �°��� 00���̰� ������  000 �Դϴ�. 
		*/ 

	}

}
