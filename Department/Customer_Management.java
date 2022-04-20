package Department;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

import chap17.EX16.Account;

/*
	��ȭ���� �� ���� ���α׷�. (��Ӱ� ������)
	
	�� ��� : 1. �Ϲݰ�(silver) : ���ʽ�����Ʈ(1%����). ���η�(����),
			2. Gold �� : ���ʽ�����Ʈ (2%����), ���η�(5%)
			3. VIP ��: ���ʽ�����Ʈ (5%����). ���η�(10%), ��翡����Ʈ�� ����
 */

class Customer { 	// �Ϲ� �� (Silver)
	int customerID; 		// �� ���̵�
	String customerName; 	// �� �̸�
	String customerGrade; 	// �� ��� ( "Silver", "Gold", "VIP" )
	double bonusPoint;		// ���ʽ� ����Ʈ ��: 
	double bonusRatio; 		// ���ʽ� ����Ʈ ������ : Silver: 1%, gold: 2%, Vip: 5%

	// ��ǰ�� ������ �޾Ƽ� ���ʽ� ����Ʈ�� �����ϴ� �ڵ�
	public double calcPrice(double price) { 			// ���� Ŭ�������� �������̵��ؼ� ó�� >> 
		bonusRatio = 0.01; 
		
		// �����ڿ��� �⺻���� 2���� �ʵ��� ���� �ε�(customerGrade : Silver, bonusRatio : 1%)
		bonusPoint = bonusPoint +  (price * bonusRatio); 	// ���ʽ� ����Ʈ  bonusPoint += (price * bonusRatio)
		return price; 	// ���ε� ������ ���� 
	}
	@Override
		public String toString() {
		customerGrade = "Silver";
		bonusRatio = 0.01; 
			return "��ID: " + customerID + " ���̸� : " + customerName + " ����� : " +  customerGrade +
					" ������ : " +  "0" +  " ���ʽ�����Ʈ���� : "+ bonusRatio + " ������ƮID : " + "VIP�� �ƴմϴ�." ; 
		}
}
	// ���� Ŭ����
class GoldCustomer extends Customer {
	double saleRatio; 		// ��ǰ ������:  �����ڿ��� �⺻���� �ε�: 5%
	
	
	
	@Override
	public double calcPrice(double price) {
		this.saleRatio = 0.05;
		super.bonusRatio = 0.02;
		super.bonusPoint = super.bonusPoint +  (price * super.bonusRatio); 	// ���ʽ� ����Ʈ
		return price - (price * this.saleRatio); // ���ε� ������ ���� 
	}
	// �����ڿ��� �⺻���� 3���� �ʵ��� ���� �ε�(customerGrade : Gold, bonusRatio : 2%,  saleRatio :5%)
	// super Ű�� ���� �Ҵ�
	
	@Override
	public String toString() {
		this.saleRatio = 0.05;
		super.bonusRatio = 0.02;
		super.customerGrade = "Gold";
		return "��ID: " + customerID + " ���̸� : " + customerName + " ����� : " +  customerGrade +
				" ������ : " +  this.saleRatio +  " ���ʽ�����Ʈ���� : "+ bonusRatio + " ������ƮID : " + "VIP�� �ƴմϴ�." ; 
	}
}

class VipCustomer extends Customer {
	double saleRatio;
	private int agentID; 	// ������, setter, (�ʵ��̸����� ���ٺҰ���)
	
	
	public int getAgentID() {
		return agentID;
	}
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	
	@Override 	// vip �� ����
	public double calcPrice(double price) {
		saleRatio = 0.1;
		bonusRatio = 0.05;
		super.bonusPoint = super.bonusPoint +  (price * super.bonusRatio); 	// ���ʽ� ����Ʈ
		return price - (price * saleRatio); // ���ε� ������ ���� 
	}
	// �����ڿ��� �⺻���� 3���� �ʵ��� ���� �ε�(customerGrade : VIP, bonusRatio : 5%,  saleRatio :10%)
	@Override
	public String toString() {
		customerGrade = "Vip";
		bonusRatio = 0.05;
		saleRatio = 0.1; 	// ��ǰ ������ : 10%
		return "��ID: " + customerID + " ���̸� : " + customerName + " ����� : " +  customerGrade +
				" ������ : " + this.saleRatio +  " ���ʽ�����Ʈ���� : "+ bonusRatio + " ������ƮID : " + agentID ; 
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
			System.out.println("1. �Ϲݰ� ���  | 2. VIP �����  | 3. Gold �����  | 4. ���� ���  | 5. ��ǰ����  | 6. ����");
			System.out.println("==================================================================================");
			System.out.print("���� >> ");
			int No = sc.nextInt();
			if (No == 1) {
				System.out.println("== �Ϲݰ� ��� �Դϴ�. ==");
				System.out.print("- �� ���̵�: ");
				customer.customerID = sc.nextInt();
				System.out.print("- �� �̸�: ");
				customer.customerName = sc.next();
				customerSet.add(customer);
				System.out.println("����� �Ϸ�Ǿ����ϴ�.");
				
			} else if (No == 2) {
				System.out.println("== VIP�� ��� �Դϴ�. ==");
				System.out.print("- �� ���̵�: ");
				vipCustomer.customerID = sc.nextInt();
				System.out.print("- �� �̸�: ");
				vipCustomer.customerName = sc.next();
				System.out.print("- ��翡����Ʈ(ID) ���: ");
				vipCustomer.setAgentID(sc.nextInt());
				customerSet.add(vipCustomer);
				System.out.println("����� �Ϸ�Ǿ����ϴ�.");
				
			} 	else if (No == 3) {
				System.out.println("== Gold ��� �Դϴ�. ==");
				System.out.print("- �� ���̵�: ");
				goldCustomer.customerID = sc.nextInt();
				System.out.print("- �� �̸�: ");
				goldCustomer.customerName = sc.next();
				customerSet.add(goldCustomer);
				System.out.println("����� �Ϸ�Ǿ����ϴ�.");
				
			}	else if (No == 4) {
				System.out.println("== �� ���� ����Դϴ�. ==");
				for (Customer k : customerSet) {
					System.out.println(k);
				}
			}	else if (No == 5) {
				System.out.print("- �� ���̵� �Է��ϼ���: ");
				int searchID = sc.nextInt();
				for (Customer k : customerSet) {
					
					if (k.customerID == searchID) {
					System.out.println("-- ��ǰ������ ������ �ּ��� --");
					System.out.print("-- ���� ��ǰ ���� : " );
					int price1 = sc.nextInt();
					System.out.print("-- ���ε� ����: ");
					System.out.println(k.customerID + " ���� " + k.calcPrice(price1) + "�� �����ϼ̽��ϴ�.");
					System.out.println(k.customerName + " ������ ����� " + k.customerGrade + " �̰�, ���� ����Ʈ�� " 
							+ k.bonusPoint + " �̰�, ������ " + k.calcPrice(price1) + " �� �Ǿ����ϴ�.");		
					}
				}
			}	else if (No == 6) {
					break;
			}	else {
					System.out.println(" 1~6������ ���ڸ� �Է����ּ���");
			}
		}
		System.out.println("���α׷��� �����մϴ�.");
		sc.close();
	}
}
