package EmployeeInfo;


import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;


// while 문 사용

class Employee implements Comparable<Employee>{ 	// 사원의 정보를 담은 클래스 
	int empNo; 		// 사원 번호
	String empName; 	// 사원 이름
	String phone;		// 연락처
	int age;			// 나이
	String dept;		// 부서
	String compRank; 	// 직급
	
	Employee (int empNo, String empName, String phone, int age, String dept, String compRank){   //객체 생성시 필드의 값을 받아서 필드에 로드 
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

// TreeSet: 중복된 데이터를 저장할 수 없다 Wreapper 클래스는 재정의 되어 있다. equals(), hashCode()
	// 정렬되어서 저장
		// 일반객체를 set 자료형에 저장할때는 객체의 특정필드가 중복 저장되지 않도록 equals(), hashCode() 재정의
	//Wrapper: 기본자료형을 객체와 기본자료형에는 없는 메소드가 추가. (Boolean, Byte, Charactor, Integer, Double... )
		// Comparable compareTo() : 상속 해서 구현, 객체 수정, Comparator compare(): 수정없이 사용가능하게 재정의 되어 있다.


public class Employee_Info {
	
	 private static TreeSet<Employee> tSet = new TreeSet<Employee>(new Comparator<Employee>() {
			public int compare(Employee o1, Employee o2) {
				if(o1.getEmpNo() < o2.getEmpNo()) { 	// 오름차순 정렬처리
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
		//코드 작성 : 1. 계좌 생성.  스캐너로 1.계좌번호, 2. 이름, 3. 초기통장 금액
		//배열 객체에 저장. 
		
		
		System.out.println("-------------------------------");
		System.out.println("------- 1. 사원정보 신규등록 -------");
		System.out.println("-------------------------------");
		System.out.println("사번을 입력 하세요 >>> ");
		int empNo = sc.nextInt();
		System.out.println("이름을 입력 하세요 >>> ");
		String empName = sc.next();
		System.out.println("연락처를 입력 하세요 >>> ");
		String phone = sc.next();
		System.out.println("나이를 입력 하세요 >>> ");
		int age = sc.nextInt();
		System.out.println("부서를 입력 하세요 >>> ");
		String dept = sc.next();
		System.out.println("직급을 입력 하세요 >>> ");
		String compRank = sc.next();
		
		//해당 사원 배열에서 찾아서 찾은 객체를 받아온다. 
		Employee newEmployee = new Employee(empNo, empName, phone, age, dept, compRank);
		
		tSet.add(newEmployee);
		System.out.println(empName + "님의 정보가 정상적으로 입력 되었습니다.");
		
	}

	private static void search() {
		System.out.println("-------------------------------");
		System.out.println("------- 2. 사원정보 검색 -------");
		System.out.println("-------------------------------");
		
		Iterator<Employee> iter = tSet.iterator();
			while (iter.hasNext()) {
				Employee employee = iter.next();
				if(employee != null) {
					System.out.print(employee.getEmpNo());  //사번 
					System.out.print("    ");
					System.out.print(employee.getEmpName());   //이름
					System.out.print("    ");
					System.out.print(employee.getPhone());  //연락처	
					System.out.print("    ");
					System.out.print(employee.getAge()); 	// 나이
					System.out.print("    ");
					System.out.print(employee.getDept()); 	// 부서
					System.out.print("    ");
					System.out.print(employee.getCompRank()); 	// 직급
					System.out.println();
				}			
			}
	}
	private static void fix() {
		System.out.println("-------------------------------");
		System.out.println("------- 3. 사원정보 수정 -------");
		System.out.println("-------------------------------");
		System.out.println("수정할 사번 : ");
		int empNo = sc.nextInt();
		System.out.println("수정할 필드 선택 : [1. 연락처, 2. 나이, 3. 부서, 4. 직급]");
		int no1 = sc.nextInt();
		Employee employee = findEmployee(empNo);
		if (no1 == 1 ) {
			System.out.println("수정할 연락처를 입력 하세요 >>>");
			String phone =  sc.next();
			employee.setPhone(phone);
		} else if (no1 == 2) {
			System.out.println("수정할 나이를 입력 하세요 >>>");
			int age =  sc.nextInt();
			employee.setAge(age);
		} else if (no1 == 3) {
			System.out.println("수정할 부서를 입력 하세요 >>>");
			String dept = sc.next();
			employee.setDept(dept);
		} else if (no1 == 4) {
			System.out.println("수정할 직급을 입력 하세요 >>>");
			String compRank = sc.next();
			employee.setCompRank(compRank);
		} else {
			System.out.println("잘못 입력하셨습니다.");
			sc.close();

		}
	}
	private static void del() {
		System.out.println("-------------------------------");
		System.out.println("------- 4. 사원정보 삭제 -------");
		System.out.println("-------------------------------");
		System.out.println("삭제할 사번 : ");
		int empNo = sc.nextInt();
		
		Employee employee = findEmployee(empNo);
		tSet.remove(employee);
	}
	
	//배열에서 Employee 객체 내의 empNo[사번]과 동일한 사번을 찾아서 찾은 객체를 리턴으로 돌려줌. 
	// 공통코드 , 여러 메소드에서 중복 사용 될때 별도의 메소드를 생성해서 중복코드를 간단하게 만들어 준다. 
	private static Employee findEmployee(int empNo)	{
		Employee employee = null; 
		
		Iterator<Employee> iter = tSet.iterator();
		//각 방의 객체를 담는 변수를 선언 	// 0 ~ 99 방의 객체를 Employee 참조 변수에 담는다.
		while (iter.hasNext()) {
			Employee a1 = iter.next();
			int dbempNo = a1.getEmpNo();		// 배열의 각 방에 저장된 객체의 ano를 dbAno 변수에 할당.
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
		System.out.println("=======사원관리 프로그램============");
		System.out.println("# 1. 사원정보 신규등록");
		System.out.println("# 2. 사원정보 검색");
		System.out.println("# 3. 사원정보 수정");
		System.out.println("# 4. 사원정보 삭제");
		System.out.println("# 5. 프로그램 종료");
		System.out.println("===============================");
		System.out.println("번호를 입력하세요 >>> ");
	
		int selectNO = sc.nextInt();
		
		if (selectNO == 1) {
			 nE();//메소드 호출 , 객체 생성 없이 메소드명으로 호출(static) , 
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
		System.out.println("프로그램 종료");

	}
}