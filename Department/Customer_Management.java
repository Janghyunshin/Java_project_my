package Department;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

import chap17.EX16.Account;

/*
	백화점의 고객 관리 프로그램. (상속과 다형성)
	
	고객 등급 : 1. 일반고객(silver) : 보너스포인트(1%적립). 할인률(없음),
			2. Gold 고객 : 보너스포인트 (2%적립), 할인률(5%)
			3. VIP 고객: 보너스포인트 (5%적립). 할인률(10%), 담당에이전트가 존재
 */

class Customer { 	// 일반 고객 (Silver)
	int customerID; 		// 고객 아이디
	String customerName; 	// 고객 이름
	String customerGrade = "Silver"; 	// 고객 등급 ( "Silver", "Gold", "VIP" )
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
	public static void main(String[] args) {
		
		Set<Customer> customerList = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("==================================================================================");
			System.out.println("1. 일반고객 등록  | 2. VIP 고객등록  | 3. Gold 고객등록  | 4. 정보 출력  | 5. 물품구매  | 6. 종료");
			System.out.println("==================================================================================");
			System.out.print("선택 >> ");
			int No = sc.nextInt();
			if (No == 1) {
				System.out.println("== 일반고객 등록 입니다. ==");
				System.out.print("- 고객 아이디: ");
				int customerID = sc.nextInt();
				System.out.print("- 고객 이름: ");
				String customerName = sc.next();
				
				customerList.add(new Customer (customerID, customerName) );
				
			} else if (No == 2) {
				System.out.println("== VIP고객 등록 입니다. ==");
				System.out.print("- 고객 아이디: ");
				int customerID = sc.nextInt();
				System.out.print("- 고객 이름: ");
				String customerName = sc.next();
				System.out.print("- 담당에이전트(ID) 등록: ");
				int agentID = sc.nextInt();
				
				customerList.add(new VipCustomer (customerID, customerName, agentID) );
				
			} 	else if (No == 3) {
				System.out.println("== Gold 등록 입니다. ==");
				System.out.print("- 고객 아이디: ");
				int customerID = sc.nextInt();
				System.out.print("- 고객 이름: ");
				String customerName = sc.next();
				
				customerList.add(new GoldCustomer (customerID, customerName) );
			}	else if (No == 4) {
				System.out.println("== 고객 정보 출력입니다. ==");
				for (Customer k : customerList) {
					System.out.println(k);
				}
			}	else if (No == 5) 
				for (Customer k : customerList) {
					System.out.print("- 고객 아이디: ");
					k.setcustomerID(sc.nextInt());
					System.out.println("-- 물품가격을 지불해 주세요 ==");
					System.out.print("-- 구매 물품 가격 : " );
					double price1 = sc.nextDouble();
					System.out.print("-- 할인된 가격: ");
					System.out.println(k.calcPrice(price1));
					System.out.println(k.customerID + " 고객님 " + k.calcPrice(price1) + "원 지불하셨습니다.");
					System.out.println(k.getCustomerGrade() + " 고객님의 등급은 " + k.getCustomerGrade() + " 이고 현재 포인트는 " + k.getBonusPoint() + " 이고 할인은 "
						+ k.calcPrice(price1) + " 원 되었습니다.");				
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
