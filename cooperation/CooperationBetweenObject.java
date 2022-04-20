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
	
	public Student(String studentName, int money) {
		this.studentName = studentName; 	// �л���
		this.money = money; 				// �л��� ������, �ʱⰪ : 100,000 
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
	@Override
	public String toString() {
		return studentName + " ���� �������� " + money + " �� �Դϴ�.";
	}
	
}

class Bus {
	int busName; 			// 100�� ����, 200�� ���� 		<== ��ǲ���� �޾Ƽ�, ������.
	int passengerCount; 	// �°���						
	int money;				// ������ ���� 
	

	public Bus(int busName) {
		this.busName= busName;
	}
	
	public void take(int money) { 	// Ż ��,  ������ ������ ó��, �°��� ó��
		this.money += money;
		passengerCount += 1;
	}
	public void takeOut() {		//  ���� �� , �°����� ����
		passengerCount -= 1;
	}
	@Override
	public String toString() {
		return "����" + busName + "���� �°��� " + passengerCount + "���̰� ������ " + money + " �� �Դϴ�.";
	}
	
}

class Subway {
	String lineNumber; 		// "1ȣ��", 2ȣ��, 3ȣ��
	int passengerCount; 	// �°���
	int money; 				// ����

	public Subway (String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	//�����ڸ� ���ؼ� ����ö ȣ���� ��ǲ �޾Ƽ� Ȱ��ȭ
	public void take(int money) { 		// (Ż ��) ������ ó���ϴ� �޼ҵ�, �°��� 
		this.money = money;
		passengerCount += 1;
	}
	public void takeOut() {		// ���� ��, �°����� ����
		passengerCount -= 1;
	}
	@Override
	public String toString() {
		return "����ö " + lineNumber + " �� �°��� " + passengerCount + "���̰� ������ " + money + " �� �Դϴ�.";
	}
}


public class CooperationBetweenObject {
	public static void main(String[] args) {
		
		ArrayList<Student> studentList = new ArrayList<>();
		Scanner sc = new Scanner(System.in); 
		String pickStudent = null;
		Bus bus = new Bus(100);
		Subway subway = new Subway("1ȣ��");	
		
		while(true) {
			System.out.println("==================================================================================");
			System.out.println("1. �л���ü ����	| 2. �л����� ��� �� ����	| 3. ������ Ž ");
			System.out.println("4. ������ ����		| 5. ����ö�� Ž			| 6. ����ö�� ����	| 7 ���� ");
			System.out.println("==================================================================================");
			System.out.print("���� >> ");
			
			int No = sc.nextInt();
			// 1. �л���ü ����
			if (No == 1) {
				System.out.println("--  1. �л� ��� �Դϴ�.  --");
				System.out.print("-- ù ��° �л��� �̸��� �Է��ϼ��� : ");
				String studentName1 = sc.next();
				System.out.print("-- ù ��° �л��� ���� �Է��ϼ��� : ");
				int money1 = sc.nextInt();
				Student student1 = new Student(studentName1, money1);
				studentList.add(student1);
				System.out.println("-- ù ��° �л��� ��ϵǾ����ϴ�. --");
				
				System.out.print("-- �� ��° �л��� �̸��� �Է��ϼ��� : ");
				String studentName2 = sc.next();
				System.out.print("-- �� ��° �л��� ���� �Է��ϼ��� : ");
				int money2 = sc.nextInt();
				Student student2 = new Student(studentName2, money2);
				studentList.add(student2);
				System.out.println("-- �� ��° �л��� ��ϵǾ����ϴ�. --");
				
				System.out.print("-- �� ��° �л��� �̸��� �Է��ϼ��� : ");
				String studentName3 = sc.next();
				System.out.print("-- �� ��° �л��� ���� �Է��ϼ��� : ");
				int money3 = sc.nextInt();
				Student student3 = new Student(studentName3, money3);
				studentList.add(student3);
				System.out.println("-- �� ��° �л��� ��ϵǾ����ϴ�. --");
				
				System.out.print("-- �� ��° �л��� �̸��� �Է��ϼ��� : ");
				String studentName4 = sc.next();
				System.out.print("-- �� ��° �л��� ���� �Է��ϼ��� : ");
				int money4 = sc.nextInt();
				Student student4 = new Student(studentName4, money4);
				studentList.add(student4);
				System.out.println("-- �� ��° �л��� ��ϵǾ����ϴ�. --");
				
				System.out.print("-- �ټ� ��° �л��� �̸��� �Է��ϼ��� : ");
				String studentName5 = sc.next();
				System.out.print("-- �ټ� ��° �л��� ���� �Է��ϼ��� : ");
				int money5 = sc.nextInt();
				Student student5 = new Student(studentName5, money5);
				studentList.add(student5);
				System.out.println("-- �ټ� ��° �л��� ��ϵǾ����ϴ�. --");
				
			// 2. �л����� ��� �� ���� : 		�л��̸�	������
			} else if (No == 2) {
				System.out.println("--  2. �л� ���� ����Դϴ�.  --");
				System.out.println("�л��̸�" +"\t" + "������");
				for (Student k : studentList) {
					System.out.println(k);
				}
				
				System.out.println();
				System.out.print(" �л�����(�̸��Է�) >>> ");
				pickStudent = sc.next();
				System.out.println(pickStudent + " �л��� ���� �Ǿ����ϴ�.");
				
				
			// 3. ������ Ž
			} else if (No == 3) {
				for (Student k : studentList) {
					if (pickStudent.equals(k.studentName)) {
						k.takeBus(bus);
						System.out.println(k.studentName + " ���� " + bus.busName + " �� ������ �����ϴ�. ��ſ� �Ϸ�Ǽ���. ");
						System.out.println(k.studentName + " ���� ���� ���� " + k.money + "�� �Դϴ�.");
						System.out.println("���� " + bus.busName + " ���� �°��� " + bus.passengerCount + " �� �̰�, ������ "
						+ bus.money + " �� �Դϴ�.");
					}
				}
				
			} else if (No == 4) {
				for (Student k : studentList) {
					if (pickStudent.equals(k.studentName)) {
						k.takeOutBus(bus);
						System.out.println(k.studentName + " ���� " + bus.busName + " �� ������ ���Ƚ��ϴ�. �¹���~~~. ");
						System.out.println(k.studentName + " ���� ���� ���� " + k.money + "�� �Դϴ�.");
						System.out.println("���� " + bus.busName + " ���� �°��� " + bus.passengerCount + " �� �̰�, ������ "
						+ bus.money + " �� �Դϴ�.");
					}
				}
				
			} else if (No == 5) {
				for (Student k : studentList) {
					if (pickStudent.equals(k.studentName)) {
						k.takeSubway(subway);
						System.out.println(k.studentName + " ���� " + subway.lineNumber + " ����ö�� �����ϴ�. ��ſ� �Ϸ�Ǽ���. ");
						System.out.println(k.studentName + " ���� ���� ���� " + k.money + "�� �Դϴ�.");
						System.out.println("����ö " + subway.lineNumber + " �� �°��� " + subway.passengerCount + " �� �̰�, ������ "
						+ subway.money + " �� �Դϴ�.");
					}
				}
			} else if (No == 6) {
				for (Student k : studentList) {
					if (pickStudent.equals(k.studentName)) {
						k.takeOutSubway(subway);
						System.out.println(k.studentName + " ���� " + subway.lineNumber + " ����ö�� ���Ƚ��ϴ�. �ȳ� ~~~ ");
						System.out.println(k.studentName + " ���� ���� ���� " + k.money + "�� �Դϴ�.");
						System.out.println("����ö " + subway.lineNumber + " �� �°��� " + subway.passengerCount + " �� �̰�, ������ "
						+ subway.money + " �� �Դϴ�.");
					}
				}
			} else if (No == 7) {
				break;
			}
			
		}
		System.out.println("���α׷��� �����մϴ�.");
		sc.close();
		
		
		/*
		!! ���� !!
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
