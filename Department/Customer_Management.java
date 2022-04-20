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
	String customerGrade; 	// 고객 등급 ( "Silver", "Gold", "VIP" )
	double bonusPoint;		// 보너스 포인트 값: 
	double bonusRatio; 		// 보너스 포인트 적립율 : Silver: 1%, gold: 2%, Vip: 5%

	// 물품의 가격을 받아서 보너스 포인트를 적립하는 코드
	public double calcPrice(double price) { 			// 하위 클래스에서 오버라이딩해서 처리 >> 
		bonusRatio = 0.01; 
		
		// 생성자에서 기본으로 2개의 필드의 값은 로드(customerGrade : Silver, bonusRatio : 1%)
		bonusPoint = bonusPoint +  (price * bonusRatio); 	// 보너스 포인트  bonusPoint += (price * bonusRatio)
		return price; 	// 할인된 가격을 리턴 
	}
	@Override
		public String toString() {
		customerGrade = "Silver";
		bonusRatio = 0.01; 
			return "고객ID: " + customerID + " 고객이름 : " + customerName + " 고객등급 : " +  customerGrade +
					" 할인율 : " +  "0" +  " 보너스포인트비율 : "+ bonusRatio + " 에이전트ID : " + "VIP가 아닙니다." ; 
		}
}
	// 골드고객 클래스
class GoldCustomer extends Customer {
	double saleRatio; 		// 물품 할인율:  생성자에서 기본으로 로드: 5%
	
	
	
	@Override
	public double calcPrice(double price) {
		this.saleRatio = 0.05;
		super.bonusRatio = 0.02;
		super.bonusPoint = super.bonusPoint +  (price * super.bonusRatio); 	// 보너스 포인트
		return price - (price * this.saleRatio); // 할인된 가격을 리턴 
	}
	// 생성자에서 기본으로 3개의 필드의 값은 로드(customerGrade : Gold, bonusRatio : 2%,  saleRatio :5%)
	// super 키로 값을 할당
	
	@Override
	public String toString() {
		this.saleRatio = 0.05;
		super.bonusRatio = 0.02;
		super.customerGrade = "Gold";
		return "고객ID: " + customerID + " 고객이름 : " + customerName + " 고객등급 : " +  customerGrade +
				" 할인율 : " +  this.saleRatio +  " 보너스포인트비율 : "+ bonusRatio + " 에이전트ID : " + "VIP가 아닙니다." ; 
	}
}

class VipCustomer extends Customer {
	double saleRatio;
	private int agentID; 	// 생성자, setter, (필드이름으로 접근불가능)
	
	
	public int getAgentID() {
		return agentID;
	}
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	
	@Override 	// vip 고객 가격
	public double calcPrice(double price) {
		saleRatio = 0.1;
		bonusRatio = 0.05;
		super.bonusPoint = super.bonusPoint +  (price * super.bonusRatio); 	// 보너스 포인트
		return price - (price * saleRatio); // 할인된 가격을 리턴 
	}
	// 생성자에서 기본으로 3개의 필드의 값은 로드(customerGrade : VIP, bonusRatio : 5%,  saleRatio :10%)
	@Override
	public String toString() {
		customerGrade = "Vip";
		bonusRatio = 0.05;
		saleRatio = 0.1; 	// 물품 할인율 : 10%
		return "고객ID: " + customerID + " 고객이름 : " + customerName + " 고객등급 : " +  customerGrade +
				" 할인율 : " + this.saleRatio +  " 보너스포인트비율 : "+ bonusRatio + " 에이전트ID : " + agentID ; 
	}
}

public class Customer_Management {
	public static void main(String[] args) {
		
		Set<Customer> customerSet = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		
		Customer customer = new Customer();
		GoldCustomer goldCustomer = new GoldCustomer();
		VipCustomer vipCustomer = new VipCustomer();
		
		while(true) {
			System.out.println("==================================================================================");
			System.out.println("1. 일반고객 등록  | 2. VIP 고객등록  | 3. Gold 고객등록  | 4. 정보 출력  | 5. 물품구매  | 6. 종료");
			System.out.println("==================================================================================");
			System.out.print("선택 >> ");
			int No = sc.nextInt();
			if (No == 1) {
				System.out.println("== 일반고객 등록 입니다. ==");
				System.out.print("- 고객 아이디: ");
				customer.customerID = sc.nextInt();
				System.out.print("- 고객 이름: ");
				customer.customerName = sc.next();
				customerSet.add(customer);
				System.out.println("등록이 완료되었습니다.");
				
			} else if (No == 2) {
				System.out.println("== VIP고객 등록 입니다. ==");
				System.out.print("- 고객 아이디: ");
				vipCustomer.customerID = sc.nextInt();
				System.out.print("- 고객 이름: ");
				vipCustomer.customerName = sc.next();
				System.out.print("- 담당에이전트(ID) 등록: ");
				vipCustomer.setAgentID(sc.nextInt());
				customerSet.add(vipCustomer);
				System.out.println("등록이 완료되었습니다.");
				
			} 	else if (No == 3) {
				System.out.println("== Gold 등록 입니다. ==");
				System.out.print("- 고객 아이디: ");
				goldCustomer.customerID = sc.nextInt();
				System.out.print("- 고객 이름: ");
				goldCustomer.customerName = sc.next();
				customerSet.add(goldCustomer);
				System.out.println("등록이 완료되었습니다.");
				
			}	else if (No == 4) {
				System.out.println("== 고객 정보 출력입니다. ==");
				for (Customer k : customerSet) {
					System.out.println(k);
				}
			}	else if (No == 5) {
				System.out.print("- 고객 아이디를 입력하세요: ");
				int searchID = sc.nextInt();
				for (Customer k : customerSet) {
					
					if (k.customerID == searchID) {
					System.out.println("-- 물품가격을 지불해 주세요 --");
					System.out.print("-- 구매 물품 가격 : " );
					int price1 = sc.nextInt();
					System.out.print("-- 할인된 가격: ");
					System.out.println(k.customerID + " 고객님 " + k.calcPrice(price1) + "원 지불하셨습니다.");
					System.out.println(k.customerName + " 고객님의 등급은 " + k.customerGrade + " 이고, 현재 포인트는 " 
							+ k.bonusPoint + " 이고, 할인은 " + k.calcPrice(price1) + " 원 되었습니다.");		
					}
				}
			}	else if (No == 6) {
					break;
			}	else {
					System.out.println(" 1~6까지의 숫자를 입력해주세요");
			}
		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}
}
