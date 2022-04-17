package EmployeeInfo;


import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;


// while �� ���

class Employee implements Comparable<Employee>{ 	// ����� ������ ���� Ŭ���� 
	int empNo; 		// ��� ��ȣ
	String empName; 	// ��� �̸�
	String phone;		// ����ó
	int age;			// ����
	String dept;		// �μ�
	String compRank; 	// ����
	
	Employee (int empNo, String empName, String phone, int age, String dept, String compRank){   //��ü ������ �ʵ��� ���� �޾Ƽ� �ʵ忡 �ε� 
		this.empNo = empNo;
		this.empName = empName;
		this.phone = phone;
		this.age = age;
		this.dept = dept;
		this.compRank = compRank;
	}
	
	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public String getCompRank() {
		return compRank;
	}

	public void setCompRank(String compRank) {
		this.compRank = compRank;
	}
	@Override
		public boolean equals(Object obj) {
		if (obj instanceof Employee ) {
			if (this.empNo == (((Employee)obj).empNo )) {
				return true;
			}
			return false;
		}
		return false;
	}
	@Override
		public int hashCode() {
			return Objects.hash(empNo);
		}
	@Override
	public int compareTo(Employee o) {
		if (this.empNo < o.empNo)
			return -1;
		else if (this.empNo == o.empNo)
			return 0;
		else
			return 1;
	}
}

// TreeSet: �ߺ��� �����͸� ������ �� ���� Wreapper Ŭ������ ������ �Ǿ� �ִ�. equals(), hashCode()
	// ���ĵǾ ����
		// �Ϲݰ�ü�� set �ڷ����� �����Ҷ��� ��ü�� Ư���ʵ尡 �ߺ� ������� �ʵ��� equals(), hashCode() ������
	//Wrapper: �⺻�ڷ����� ��ü�� �⺻�ڷ������� ���� �޼ҵ尡 �߰�. (Boolean, Byte, Charactor, Integer, Double... )
		// Comparable compareTo() : ��� �ؼ� ����, ��ü ����, Comparator compare(): �������� ��밡���ϰ� ������ �Ǿ� �ִ�.


public class Employee_Info {
	
	 private static TreeSet<Employee> tSet = new TreeSet<Employee>(new Comparator<Employee>() {
			public int compare(Employee o1, Employee o2) {
				if(o1.getEmpNo() < o2.getEmpNo()) { 	// �������� ����ó��
					return -1;
				} else if(o1.getEmpNo() == o2.getEmpNo()) {
					return 0;
				} else {
					return 1;
				}
			};
		});

	

	private static Scanner sc = new Scanner(System.in);

	private static void nE() {
		//�ڵ� �ۼ� : 1. ���� ����.  ��ĳ�ʷ� 1.���¹�ȣ, 2. �̸�, 3. �ʱ����� �ݾ�
		//�迭 ��ü�� ����. 
		
		
		System.out.println("-------------------------------");
		System.out.println("------- 1. ������� �űԵ�� -------");
		System.out.println("-------------------------------");
		System.out.println("����� �Է� �ϼ��� >>> ");
		int empNo = sc.nextInt();
		System.out.println("�̸��� �Է� �ϼ��� >>> ");
		String empName = sc.next();
		System.out.println("����ó�� �Է� �ϼ��� >>> ");
		String phone = sc.next();
		System.out.println("���̸� �Է� �ϼ��� >>> ");
		int age = sc.nextInt();
		System.out.println("�μ��� �Է� �ϼ��� >>> ");
		String dept = sc.next();
		System.out.println("������ �Է� �ϼ��� >>> ");
		String compRank = sc.next();
		
		//�ش� ��� �迭���� ã�Ƽ� ã�� ��ü�� �޾ƿ´�. 
		Employee newEmployee = new Employee(empNo, empName, phone, age, dept, compRank);
		
		tSet.add(newEmployee);
		System.out.println(empName + "���� ������ ���������� �Է� �Ǿ����ϴ�.");
		
	}

	private static void search() {
		System.out.println("-------------------------------");
		System.out.println("------- 2. ������� �˻� -------");
		System.out.println("-------------------------------");
		
		Iterator<Employee> iter = tSet.iterator();
			while (iter.hasNext()) {
				Employee employee = iter.next();
				if(employee != null) {
					System.out.print(employee.getEmpNo());  //��� 
					System.out.print("    ");
					System.out.print(employee.getEmpName());   //�̸�
					System.out.print("    ");
					System.out.print(employee.getPhone());  //����ó	
					System.out.print("    ");
					System.out.print(employee.getAge()); 	// ����
					System.out.print("    ");
					System.out.print(employee.getDept()); 	// �μ�
					System.out.print("    ");
					System.out.print(employee.getCompRank()); 	// ����
					System.out.println();
				}			
			}
	}
	private static void fix() {
		System.out.println("-------------------------------");
		System.out.println("------- 3. ������� ���� -------");
		System.out.println("-------------------------------");
		System.out.println("������ ��� : ");
		int empNo = sc.nextInt();
		System.out.println("������ �ʵ� ���� : [1. ����ó, 2. ����, 3. �μ�, 4. ����]");
		int no1 = sc.nextInt();
		Employee employee = findEmployee(empNo);
		if (no1 == 1 ) {
			System.out.println("������ ����ó�� �Է� �ϼ��� >>>");
			String phone =  sc.next();
			employee.setPhone(phone);
		} else if (no1 == 2) {
			System.out.println("������ ���̸� �Է� �ϼ��� >>>");
			int age =  sc.nextInt();
			employee.setAge(age);
		} else if (no1 == 3) {
			System.out.println("������ �μ��� �Է� �ϼ��� >>>");
			String dept = sc.next();
			employee.setDept(dept);
		} else if (no1 == 4) {
			System.out.println("������ ������ �Է� �ϼ��� >>>");
			String compRank = sc.next();
			employee.setCompRank(compRank);
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			sc.close();

		}
	}
	private static void del() {
		System.out.println("-------------------------------");
		System.out.println("------- 4. ������� ���� -------");
		System.out.println("-------------------------------");
		System.out.println("������ ��� : ");
		int empNo = sc.nextInt();
		
		Employee employee = findEmployee(empNo);
		tSet.remove(employee);
	}
	
	//�迭���� Employee ��ü ���� empNo[���]�� ������ ����� ã�Ƽ� ã�� ��ü�� �������� ������. 
	// �����ڵ� , ���� �޼ҵ忡�� �ߺ� ��� �ɶ� ������ �޼ҵ带 �����ؼ� �ߺ��ڵ带 �����ϰ� ����� �ش�. 
	private static Employee findEmployee(int empNo)	{
		Employee employee = null; 
		
		Iterator<Employee> iter = tSet.iterator();
		//�� ���� ��ü�� ��� ������ ���� 	// 0 ~ 99 ���� ��ü�� Employee ���� ������ ��´�.
		while (iter.hasNext()) {
			Employee a1 = iter.next();
			int dbempNo = a1.getEmpNo();		// �迭�� �� �濡 ����� ��ü�� ano�� dbAno ������ �Ҵ�.
			if(dbempNo == (empNo)) {
				employee = a1;
				return employee;
			}
		}
			
		return employee; 
	}
			

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
		
		boolean run = true; 
		while (run) {
		System.out.println("=======������� ���α׷�============");
		System.out.println("# 1. ������� �űԵ��");
		System.out.println("# 2. ������� �˻�");
		System.out.println("# 3. ������� ����");
		System.out.println("# 4. ������� ����");
		System.out.println("# 5. ���α׷� ����");
		System.out.println("===============================");
		System.out.println("��ȣ�� �Է��ϼ��� >>> ");
	
		int selectNO = sc.nextInt();
		
		if (selectNO == 1) {
			 nE();//�޼ҵ� ȣ�� , ��ü ���� ���� �޼ҵ������ ȣ��(static) , 
		}else if (selectNO == 2) {
			search(); 
		}else if (selectNO == 3) {
			fix(); 
		}else if (selectNO == 4) {
			del(); 
		}else if (selectNO == 5) {
			run = false; 
			//break;
			}
		}
		sc.close();
		System.out.println("���α׷� ����");

	}
}