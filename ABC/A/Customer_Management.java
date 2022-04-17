package ABC.A;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;



/*
	��ȭ���� �� ���� ���α׷�. (��Ӱ� ������)
	
	�� ��� : 1. �Ϲݰ�(silver) : ���ʽ�����Ʈ(1%����). ���η�(����),
			2. Gold �� : ���ʽ�����Ʈ (2%����), ���η�(5%)
			3. VIP ��: ���ʽ�����Ʈ (5%����). ���η�(10%), ��翡����Ʈ�� ����
 */

class Customer { 	// �Ϲ� �� (Silver)
	int customerID; 		// �� ���̵�
	String customerName; 	// �� �̸�
	String customerGrade = "Silver";  	// �� ��� ( "Silver", "Gold", "VIP" )
	double bonusPoint;		// ���ʽ� ����Ʈ ��: 
	double bonusRatio = 0.01; 		// ���ʽ� ����Ʈ ������ : Silver: 1%, gold: 2%, Vip: 5%
	
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
	
	
	
	// ��ǰ�� ������ �޾Ƽ� ���ʽ� ����Ʈ�� �����ϴ� �ڵ�
	public double calcPrice(double price) { 			// ���� Ŭ�������� �������̵��ؼ� ó�� >> 
		
		// �����ڿ��� �⺻���� 2���� �ʵ��� ���� �ε�(customerGrade : Silver, bonusRatio : 1%)
		bonusPoint += price * bonusRatio; 	// ���ʽ� ����Ʈ
		return price; 	// ���ε� ������ ���� 
	}
	@Override
		public String toString() {
			return "��ID: " + customerID + " ���̸� : " + customerName + " ����� : " +  customerGrade +
					" ������ : " +  "0" +  " ���ʽ�����Ʈ���� : "+ bonusRatio + " ������ƮID : " + "VIP�� �ƴմϴ�." ; 
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

	// ���� Ŭ����
class GoldCustomer extends Customer {
	String customerGrade = "Gold";
	double bonusRatio = 0.02; 
	double saleRatio = 0.05; 		// ��ǰ ������:  �����ڿ��� �⺻���� �ε�: 5%
	
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
		bonusPoint += price * bonusRatio; 	// ���ʽ� ����Ʈ
		return price - (price * saleRatio); // ���ε� ������ ���� 
	}
	// �����ڿ��� �⺻���� 3���� �ʵ��� ���� �ε�(customerGrade : Gold, bonusRatio : 2%,  saleRatio :5%)
	// super Ű�� ���� �Ҵ�
	
	@Override
	public String toString() {
		return "��ID: " + customerID + " ���̸� : " + customerName + " ����� : " +  customerGrade +
				" ������ : " +  saleRatio +  " ���ʽ�����Ʈ���� : "+ bonusRatio + " ������ƮID : " + "VIP�� �ƴմϴ�." ; 
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
	double saleRatio = 0.1;		// ��ǰ ������ : 10%
	private int agentID; 	// ������, setter, (�ʵ��̸����� ���ٺҰ���)
	
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
	
	@Override 	// vip �� ����
	public double calcPrice(double price) {
		bonusPoint += price * bonusRatio; 	// ���ʽ� ����Ʈ
		return price - (price * saleRatio); // ���ε� ������ ���� 
	}
	// �����ڿ��� �⺻���� 3���� �ʵ��� ���� �ε�(customerGrade : VIP, bonusRatio : 5%,  saleRatio :10%)
	@Override
	public String toString() {
		return "��ID: " + customerID + " ���̸� : " + customerName + " ����� : " +  customerGrade +
				" ������ : " +  saleRatio +  " ���ʽ�����Ʈ���� : "+ bonusRatio + " ������ƮID : " + agentID ; 
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
	
	// Silver �� ��� �޼���
	private static void Create_s () {
		System.out.println("== 1. �Ϲݰ� ��� �Դϴ�. ==");
		System.out.print("- �� ���̵�: ");
		int customerID = sc.nextInt();
		System.out.print("- �� �̸�: ");
		String customerName = sc.next();
		//�� �ʵ��� ������ ����ڷ� ���� �Ҵ� �޾Ƽ� ��ü�� ������ ��ü�� �ʵ��� ���� ����. 
		Customer newCustomer = new Customer(customerID, customerName); //�����ڸ� ���ؼ� ��ü�� �ʵ尪������ ��ü ����. 
		
		//�迭 ������ �޼ҵ� �ܺο��� ����. �������� : ��� �޼ҵ忡�� ��밡�� 
		//��ü�� �迭�� ����(����ִ� �濡 ����). for ���� ����ؼ� null�� ���� ã�Ƽ� null��� ��ü�� ����.  
		customerListS.add(newCustomer);
		System.out.println(" �Ϲݰ� ����� �Ϸ�Ǿ����ϴ�. ");
	}
	
	// Vip �� ��� �޼���
	private static void Create_v() {
		System.out.println("==  2. VIP �� ��� �Դϴ�. ==");
		System.out.print("- �� ���̵�: ");
		int customerID = sc.nextInt();
		System.out.print("- �� �̸�: ");
		String customerName = sc.next();
		System.out.print("- ��翡����Ʈ(ID) ��� : ");
		int agentID = sc.nextInt();
		
		VipCustomer newVcustomer = new VipCustomer(customerID, customerName, agentID); //�����ڸ� ���ؼ� ��ü�� �ʵ尪������ ��ü ����. 
		
		//�迭 ������ �޼ҵ� �ܺο��� ����. �������� : ��� �޼ҵ忡�� ��밡�� 
		//��ü�� �迭�� ����(����ִ� �濡 ����). for ���� ����ؼ� null�� ���� ã�Ƽ� null��� ��ü�� ����.  
		customerListV.add(newVcustomer);
		System.out.println(" VIP �� ����� �Ϸ�Ǿ����ϴ�. ");
	}
		
	
	//  Gold �� ��� �޼���
	private static void Create_g() {
		System.out.println("== 3. Gold �� ��� �Դϴ�. ==");
		System.out.print("- �� ���̵�: ");
		int customerID = sc.nextInt();
		System.out.print("- �� �̸�: ");
		String customerName = sc.next();
		//�� �ʵ��� ������ ����ڷ� ���� �Ҵ� �޾Ƽ� ��ü�� ������ ��ü�� �ʵ��� ���� ����. 
		GoldCustomer newGcustomer = new GoldCustomer(customerID, customerName); //�����ڸ� ���ؼ� ��ü�� �ʵ尪������ ��ü ����. 
		
		//�迭 ������ �޼ҵ� �ܺο��� ����. �������� : ��� �޼ҵ忡�� ��밡�� 
		//��ü�� �迭�� ����(����ִ� �濡 ����). for ���� ����ؼ� null�� ���� ã�Ƽ� null��� ��ü�� ����.  
		customerListG.add(newGcustomer);
		System.out.println(" Gold �� ����� �Ϸ�Ǿ����ϴ�. ");
	}
	
	private static void CustomerInfo() {
		//�ڵ� �ۼ� :2. ���� ��� ��� :  �迭�� ����� ��ü�� �����ͼ� ���¹�ȣ, �̸�, �ݾ� �� ��� 
		//�迭�� �� ���� ��ȸ �ϸ鼭 null�� �ƴ� ��� �迭���� ��ü�� ������ �ʵ��� ������ ���. 
		System.out.println("== 4. ���� ��� �Դϴ�. ==");
		
		//�迭�� ������ null�ƴ� ��� , ��ü�� �ʵ��� ���� ���. 
		Iterator<Customer> iter1 = customerListS.iterator();
		Iterator<VipCustomer> iter2 = customerListV.iterator();
		Iterator<GoldCustomer> iter3 = customerListG.iterator();
		System.out.println("==��ǰ������ ������ �ּ��� ==");
		System.out.print("- ���� ��ǰ ���� : ");
		int price1 = sc.nextInt();

		while (iter1.hasNext()) {
			Customer c1 = iter1.next();
			if(c1 != null) {
				System.out.println(c1.customerID + " ���� " + c1.calcPrice(price1) + "�� �����ϼ̽��ϴ�.");
				System.out.println(c1.getCustomerGrade() + " ������ ����� " + c1.getCustomerGrade() + " �̰� ���� ����Ʈ�� " + c1.getBonusPoint() + " �̰� ������ "
					+ c1.calcPrice(price1) + " �� �Ǿ����ϴ�.");
			}
			break;
		}
		while (iter2.hasNext()) {
			VipCustomer c2 = iter2.next();
			if(c2 != null) {
				System.out.println(c2.customerID + " ���� " + c2.calcPrice(price1) + "�� �����ϼ̽��ϴ�.");
				System.out.println(c2.getCustomerGrade() + " ������ ����� " + c2.getCustomerGrade() + " �̰� ���� ����Ʈ�� " + c2.getBonusPoint() + " �̰� ������ "
					+ c2.calcPrice(price1) + " �� �Ǿ����ϴ�.");
			}
			break;
		}
		while (iter3.hasNext()) {
			GoldCustomer c3 = iter3.next();
			if(c3 != null) {
				System.out.println(c3.customerID + " ���� " + c3.calcPrice(price1) + "�� �����ϼ̽��ϴ�.");
				System.out.println(c3.getCustomerGrade() + " ������ ����� " + c3.getCustomerGrade() + " �̰� ���� ����Ʈ�� " + c3.getBonusPoint() + " �̰� ������ "
					+ c3.calcPrice(price1) + " �� �Ǿ����ϴ�.");
			}
			break;
		}
		
		
	}
	
//	private static Customer findCustomer(String ano) {
//		Customer customer = null ;
//		
//		Iterator<Account> iter = aSet.iterator();
//		//�� ���� ��ü�� ��� ������ ���� 	// 0 ~ 99 ���� ��ü�� account ���� ������ ��´�.
//
//		//�ڵ� �ۼ� 
//		while (iter.hasNext()) {
//			Account a1 = iter.next();
//			String dbAno = a1.getAno();		// �迭�� �� �濡 ����� ��ü�� ano�� dbAno ������ �Ҵ�.
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
			System.out.println("1. �Ϲݰ� ���  | 2. VIP �����  | 3. Gold �����  | 4. ���� ���  | 5. ��ǰ����  | 6. ����");
			System.out.println("==================================================================================");
			System.out.print("���� >> ");
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
//					System.out.print("- �� ���̵�: ");
//					k.setcustomerID(sc.nextInt());
//					System.out.println("-- ��ǰ������ ������ �ּ��� ==");
//					System.out.print("-- ���� ��ǰ ���� : " );
//					double price1 = sc.nextDouble();
//					System.out.print("-- ���ε� ����: ");
//					System.out.println(k.calcPrice(price1));
//					System.out.println(k.customerID + " ���� " + k.calcPrice(price1) + "�� �����ϼ̽��ϴ�.");
//					System.out.println(k.getCustomerGrade() + " ������ ����� " + k.getCustomerGrade() + " �̰� ���� ����Ʈ�� " + k.getBonusPoint() + " �̰� ������ "
//						+ k.calcPrice(price1) + " �� �Ǿ����ϴ�.");
//				} 
				
			}	else if (No == 6) {
				break;
			}	else {
				System.out.println(" 1~6������ ���ڸ� �Է����ּ���");
			}
		}
		System.out.println("���α׷��� �����մϴ�.");
		
		/*
		
		======================================================================
		1. �Ϲݰ� ���	|   2. VIP �����      |  3. Gold �� ���   4. ���� ���    5. ��ǰ����  5. ���� 
		======================================================================
		���� >> 1
		==�Ϲݰ� ��� �Դϴ�. ==
		�� ���̵� : 
		���̸� : 

		���� >>2
		==VIP �� ��� �Դϴ�. ==
		�� ���̵� : 
		���̸� : 
		��翡����Ʈ(ID) ��� : 

		���� >>3
		==Gold �� ��� �Դϴ�. ==
		�� ���̵� : 
		���̸� : 

		���� >>4
		==�� ���� ���  �Դϴ�. ==
		��ID	���̸�	�����	���η�	���ʽ�����Ʈ����	������ƮID<VIP��>



		���� >>5
		==��ǰ������ ������ �ּ��� ==
		���� ��ǰ ���� :  

		000 ���� 000 �� ���� �ϼ̽��ϴ�. 
		000 ������ ����� 000 �̰� ���� ����Ʈ�� 000 �̰� ������ 000�� �Ǿ����ϴ�. 

		*/
		
		
	}
}
