package ABC.A;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;



/*
	백화점의 고객 관리 프로그램. (상속과 다형성)
	
	고객 등급 : 1. 일반고객(silver) : 보너스포인트(1%적립). 할인률(없음),
			2. Gold 고객 : 보너스포인트 (2%적립), 할인률(5%)
			3. VIP 고객: 보너스포인트 (5%적립). 할인률(10%), 담당에이전트가 존재
 */

class Customer { 	// 일반 고객 (Silver)
	int customerID; 		// 고객 아이디
	String customerName; 	// 고객 이름
	String customerGrade = "Silver";  	// 고객 등급 ( "Silver", "Gold", "VIP" )
	double bonusPoint;		// 보너스 포인트 값: 
	double bonusRatio = 0.01; 		// 보너스 포인트 적립율 : Silver: 1%, gold: 2%, Vip: 5%
	
	Customer() {}
	
	Customer (int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
	}
	Customer (int customerID, String customerName, String customerGrade, double bonusPoint, double bonusRatio) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerGrade = customerGrade;
		this.bonusPoint = bonusPoint;
		this.bonusRatio = bonusRatio;
}
	// getter . setter 
	public int getcustomerID() {return customerID;}
	public void setcustomerID(int customerID) {customerID = customerID;}

	public String getCustomerName() {return customerName;}
	public void setCustomerName(String customerName) {this.customerName = customerName;}

	public String getCustomerGrade() {return customerGrade;}
	public void setCustomerGrade(String customerGrade) {this.customerGrade = customerGrade;}

	public double getBonusPoint() {return bonusPoint;}
	public void setBonusPoint(double bonusPoint) {this.bonusPoint = bonusPoint;}
	
	public double getBonusRatio() {return bonusRatio;}
	public void setBonusRatio(double bonusRatio) {this.bonusRatio = bonusRatio;}
	
	
	
	// 물품의 가격을 받아서 보너스 포인트를 적립하는 코드
	public double calcPrice(double price) { 			// 하위 클래스에서 오버라이딩해서 처리 >> 
		
		// 생성자에서 기본으로 2개의 필드의 값은 로드(customerGrade : Silver, bonusRatio : 1%)
		bonusPoint += price * bonusRatio; 	// 보너스 포인트
		return price; 	// 할인된 가격을 리턴 
	}
	@Override
		public String toString() {
			return "고객ID: " + customerID + " 고객이름 : " + customerName + " 고객등급 : " +  customerGrade +
					" 할인율 : " +  "0" +  " 보너스포인트비율 : "+ bonusRatio + " 에이전트ID : " + "VIP가 아닙니다." ; 
		}
	@Override
		public boolean equals(Object obj) {
			if (obj instanceof Customer) {
				if (this.customerID == ((Customer)obj).customerID)
					return true;
			}
			return false;
		}
	@Override
		public int hashCode() {
			return Objects.hash(customerID);
		}
}

	// 골드고객 클래스
class GoldCustomer extends Customer {
	String customerGrade = "Gold";
	double bonusRatio = 0.02; 
	double saleRatio = 0.05; 		// 물품 할인율:  생성자에서 기본으로 로드: 5%
	
	public GoldCustomer() {}
	
	GoldCustomer (int customerID, String customerName) {
			super.customerID = customerID;
			super.customerName = customerName;
	}
	
	GoldCustomer (int customerID, String customerName, String customerGrade, double bonusPoint, double bonusRatio
			, double saleRatio) {
		super.customerID = customerID;
		super.customerName = customerName;
		super.customerGrade = customerGrade;
		super.bonusPoint = bonusPoint;
		super.bonusRatio = bonusRatio;
		this.saleRatio = saleRatio;
	}
	
	@Override
	public double calcPrice(double price) {
		bonusPoint += price * bonusRatio; 	// 보너스 포인트
		return price - (price * saleRatio); // 할인된 가격을 리턴 
	}
	// 생성자에서 기본으로 3개의 필드의 값은 로드(customerGrade : Gold, bonusRatio : 2%,  saleRatio :5%)
	// super 키로 값을 할당
	
	@Override
	public String toString() {
		return "고객ID: " + customerID + " 고객이름 : " + customerName + " 고객등급 : " +  customerGrade +
				" 할인율 : " +  saleRatio +  " 보너스포인트비율 : "+ bonusRatio + " 에이전트ID : " + "VIP가 아닙니다." ; 
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Customer) {
			if (this.customerID == ((Customer)obj).customerID)
				return true;
		}
		return false;
	}
@Override
	public int hashCode() {
		return Objects.hash(customerID);
	}
}

class VipCustomer extends Customer {
	String customerGrade = "Vip";
	double bonusRatio = 0.05;
	double saleRatio = 0.1;		// 물품 할인율 : 10%
	private int agentID; 	// 생성자, setter, (필드이름으로 접근불가능)
	
	VipCustomer() {}
	
	VipCustomer (int customerID, String customerName, int agentID) {
		super.customerID = customerID;
		super.customerName = customerName;
		this.agentID = agentID;
	}
	
	VipCustomer (int customerID, String customerName, String customerGrade, double bonusPoint, double bonusRatio,
				double saleRatio, int agentID) {
		super.customerID = customerID;
		super.customerName = customerName;
		super.customerGrade = customerGrade;
		super.bonusPoint = bonusPoint;
		super.bonusRatio = bonusRatio;
		this.agentID = agentID;
		this.saleRatio = saleRatio;
	}
	
	@Override 	// vip 고객 가격
	public double calcPrice(double price) {
		bonusPoint += price * bonusRatio; 	// 보너스 포인트
		return price - (price * saleRatio); // 할인된 가격을 리턴 
	}
	// 생성자에서 기본으로 3개의 필드의 값은 로드(customerGrade : VIP, bonusRatio : 5%,  saleRatio :10%)
	@Override
	public String toString() {
		return "고객ID: " + customerID + " 고객이름 : " + customerName + " 고객등급 : " +  customerGrade +
				" 할인율 : " +  saleRatio +  " 보너스포인트비율 : "+ bonusRatio + " 에이전트ID : " + agentID ; 
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Customer) {
			if (this.customerID == ((Customer)obj).customerID)
				return true;
		}
		return false;
	}
@Override
	public int hashCode() {
		return Objects.hash(customerID);
	}
}
public class Customer_Management {
	private static Set<Customer> customerListS = new HashSet<>();
	private static Set<VipCustomer> customerListV = new HashSet<>();
	private static Set<GoldCustomer> customerListG = new HashSet<>();
	
	private static Scanner sc = new Scanner(System.in);
	
	// Silver 고객 등록 메서드
	private static void Create_s () {
		System.out.println("== 1. 일반고객 등록 입니다. ==");
		System.out.print("- 고객 아이디: ");
		int customerID = sc.nextInt();
		System.out.print("- 고객 이름: ");
		String customerName = sc.next();
		//각 필드의 정보를 사용자로 부터 할당 받아서 객체를 생성후 객체에 필드의 값을 저장. 
		Customer newCustomer = new Customer(customerID, customerName); //생성자를 통해서 객체에 필드값적용후 객체 생성. 
		
		//배열 선언은 메소드 외부에서 선언. 전역변수 : 모든 메소드에서 사용가능 
		//객체를 배열에 저장(비어있는 방에 저장). for 문을 사용해서 null인 방을 찾아서 null경우 객체를 저장.  
		customerListS.add(newCustomer);
		System.out.println(" 일반고객 등록이 완료되었습니다. ");
	}
	
	// Vip 고객 등록 메서드
	private static void Create_v() {
		System.out.println("==  2. VIP 고객 등록 입니다. ==");
		System.out.print("- 고객 아이디: ");
		int customerID = sc.nextInt();
		System.out.print("- 고객 이름: ");
		String customerName = sc.next();
		System.out.print("- 담당에이젼트(ID) 등록 : ");
		int agentID = sc.nextInt();
		
		VipCustomer newVcustomer = new VipCustomer(customerID, customerName, agentID); //생성자를 통해서 객체에 필드값적용후 객체 생성. 
		
		//배열 선언은 메소드 외부에서 선언. 전역변수 : 모든 메소드에서 사용가능 
		//객체를 배열에 저장(비어있는 방에 저장). for 문을 사용해서 null인 방을 찾아서 null경우 객체를 저장.  
		customerListV.add(newVcustomer);
		System.out.println(" VIP 고객 등록이 완료되었습니다. ");
	}
		
	
	//  Gold 고객 등록 메서드
	private static void Create_g() {
		System.out.println("== 3. Gold 고객 등록 입니다. ==");
		System.out.print("- 고객 아이디: ");
		int customerID = sc.nextInt();
		System.out.print("- 고객 이름: ");
		String customerName = sc.next();
		//각 필드의 정보를 사용자로 부터 할당 받아서 객체를 생성후 객체에 필드의 값을 저장. 
		GoldCustomer newGcustomer = new GoldCustomer(customerID, customerName); //생성자를 통해서 객체에 필드값적용후 객체 생성. 
		
		//배열 선언은 메소드 외부에서 선언. 전역변수 : 모든 메소드에서 사용가능 
		//객체를 배열에 저장(비어있는 방에 저장). for 문을 사용해서 null인 방을 찾아서 null경우 객체를 저장.  
		customerListG.add(newGcustomer);
		System.out.println(" Gold 고객 등록이 완료되었습니다. ");
	}
	
	private static void CustomerInfo() {
		//코드 작성 :2. 계좌 목록 출력 :  배열에 저장된 객체를 가져와서 계좌번호, 이름, 금액 을 출력 
		//배열의 각 방을 순회 하면서 null이 아닌 경우 배열에서 객체를 꺼내서 필드의 정보를 출력. 
		System.out.println("== 4. 정보 출력 입니다. ==");
		
		//배열의 각방의 null아닌 경우 , 객체의 필드의 값을 출력. 
		Iterator<Customer> iter1 = customerListS.iterator();
		Iterator<VipCustomer> iter2 = customerListV.iterator();
		Iterator<GoldCustomer> iter3 = customerListG.iterator();
		System.out.println("==물품가격을 지불해 주세요 ==");
		System.out.print("- 구매 물품 가격 : ");
		int price1 = sc.nextInt();

		while (iter1.hasNext()) {
			Customer c1 = iter1.next();
			if(c1 != null) {
				System.out.println(c1.customerID + " 고객님 " + c1.calcPrice(price1) + "원 지불하셨습니다.");
				System.out.println(c1.getCustomerGrade() + " 고객님의 등급은 " + c1.getCustomerGrade() + " 이고 현재 포인트는 " + c1.getBonusPoint() + " 이고 할인은 "
					+ c1.calcPrice(price1) + " 원 되었습니다.");
			}
			break;
		}
		while (iter2.hasNext()) {
			VipCustomer c2 = iter2.next();
			if(c2 != null) {
				System.out.println(c2.customerID + " 고객님 " + c2.calcPrice(price1) + "원 지불하셨습니다.");
				System.out.println(c2.getCustomerGrade() + " 고객님의 등급은 " + c2.getCustomerGrade() + " 이고 현재 포인트는 " + c2.getBonusPoint() + " 이고 할인은 "
					+ c2.calcPrice(price1) + " 원 되었습니다.");
			}
			break;
		}
		while (iter3.hasNext()) {
			GoldCustomer c3 = iter3.next();
			if(c3 != null) {
				System.out.println(c3.customerID + " 고객님 " + c3.calcPrice(price1) + "원 지불하셨습니다.");
				System.out.println(c3.getCustomerGrade() + " 고객님의 등급은 " + c3.getCustomerGrade() + " 이고 현재 포인트는 " + c3.getBonusPoint() + " 이고 할인은 "
					+ c3.calcPrice(price1) + " 원 되었습니다.");
			}
			break;
		}
		
		
	}
	
//	private static Customer findCustomer(String ano) {
//		Customer customer = null ;
//		
//		Iterator<Account> iter = aSet.iterator();
//		//각 방의 객체를 담는 변수를 선언 	// 0 ~ 99 방의 객체를 account 참조 변수에 담는다.
//
//		//코드 작성 
//		while (iter.hasNext()) {
//			Account a1 = iter.next();
//			String dbAno = a1.getAno();		// 배열의 각 방에 저장된 객체의 ano를 dbAno 변수에 할당.
//			if(dbAno.equals(ano)) {
//				account = a1;
//				return account;
//			}
//		}
//			
//		return account; 
//	}
	
	
	public static void main(String[] args) {

		while(true) {
			System.out.println("==================================================================================");
			System.out.println("1. 일반고객 등록  | 2. VIP 고객등록  | 3. Gold 고객등록  | 4. 정보 출력  | 5. 물품구매  | 6. 종료");
			System.out.println("==================================================================================");
			System.out.print("선택 >> ");
			int No = sc.nextInt();
			if (No == 1) {
				Create_s();
				
			} else if (No == 2) {
				Create_v();
				
			} 	else if (No == 3) {
				Create_g();
				
			}	else if (No == 4) {
				CustomerInfo();
				
//			}	else if (No == 5) 
//				for (int i = 0; i <customerList.size(); i++  ) {
//					if(customerList != null) {
//						
//					
//					
//					System.out.print("- 고객 아이디: ");
//					k.setcustomerID(sc.nextInt());
//					System.out.println("-- 물품가격을 지불해 주세요 ==");
//					System.out.print("-- 구매 물품 가격 : " );
//					double price1 = sc.nextDouble();
//					System.out.print("-- 할인된 가격: ");
//					System.out.println(k.calcPrice(price1));
//					System.out.println(k.customerID + " 고객님 " + k.calcPrice(price1) + "원 지불하셨습니다.");
//					System.out.println(k.getCustomerGrade() + " 고객님의 등급은 " + k.getCustomerGrade() + " 이고 현재 포인트는 " + k.getBonusPoint() + " 이고 할인은 "
//						+ k.calcPrice(price1) + " 원 되었습니다.");
//				} 
				
			}	else if (No == 6) {
				break;
			}	else {
				System.out.println(" 1~6까지의 숫자를 입력해주세요");
			}
		}
		System.out.println("프로그램을 종료합니다.");
		
		/*
		
		======================================================================
		1. 일반고객 등록	|   2. VIP 고객등록      |  3. Gold 고객 등록   4. 정보 출력    5. 물품구매  5. 종료 
		======================================================================
		선택 >> 1
		==일반고객 등록 입니다. ==
		고객 아이디 : 
		고객이름 : 

		선택 >>2
		==VIP 고객 등록 입니다. ==
		고객 아이디 : 
		고객이름 : 
		담당에이젼트(ID) 등록 : 

		선택 >>3
		==Gold 고객 등록 입니다. ==
		고객 아이디 : 
		고객이름 : 

		선택 >>4
		==고객 정보 출력  입니다. ==
		고객ID	고객이름	고객등급	할인률	보너스포인트비율	에이젼트ID<VIP고객>



		선택 >>5
		==물품가격을 지불해 주세요 ==
		구매 물품 가격 :  

		000 고객님 000 원 지불 하셨습니다. 
		000 고객님의 등급은 000 이고 현재 포인트는 000 이고 할인은 000원 되었습니다. 

		*/
		
		
	}
}
