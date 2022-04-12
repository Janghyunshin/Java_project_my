package chap17.EX13;

// �Ϸ� �ð� : ���� ��ħ 9�� 30�б��� 
import java.util.Scanner;

class Account {		// ���� ������ �����ϴ� ��ü. �߿��� �ʵ�, private(ĸ��ȭ), 		
					// DTO, VO <-- �� �������� �ʵ��� ���� �����ϰ� ���� 
					// ��ü�� �ʵ�����(x), ������(0), getter(0), setter(0)
	
	private String ano;		// ���� ��ȣ
	private String owner;	// ���� ��, �̸� 
	private int balance;	// ���� �ݾ�,
	
	public Account (String ano, String owner, int balance) {	//��ü ������ �ʵ��� ���� �޾Ƽ� �ʵ忡 �ε�
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	//getter, setter 
	

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return ano + " " + owner + " " + balance;
	}
}

public class BankAccountUsingArray {
	// �迭�� ����ؼ� Account ��ü ��� 
	private static Account[] accountArray = new Account[100];	// �迭�� ��ü ����.
		// Account[] : �迭 Ÿ��.����Ÿ��, �迭�� ���濡 ���� �������� ���� ��� �⺻������ NULL
		// �迭 ���� �� ��(Index) �� ũ�⸦ ����, index = 0, length() <== �迭 ���� ���� 
	
	private static Scanner scanner = new Scanner(System.in);
	
	private static void createAccount() {
		// �ڵ� �ۼ� : 1. ���� ����.  ��ĳ�ʷ�  1.���¹�ȣ , 2. �̸� , 3. �ʱ����� �ݾ�
		// �迭 ��ü�� ���� 
		
		System.out.println("----------");
		System.out.println("1. ���� ����");
		System.out.println("----------");
		
		System.out.println("1. ���� ��ȣ�� �Է��ϼ��� >>");
		String aNum = scanner.next();	// ���� ��ȣ�� ��ǲ �޾Ƽ� aNum ������ �Ҵ� < �޼ҵ� �������� ����ϴ� �������� >
		System.out.println("2. �̸��� �Է��ϼ��� >>");
		String aOwner = scanner.next();
		System.out.println("3. �ʱ����� �ݾ��� �Է� �ϼ��� >>");
		int aBal = scanner.nextInt();
		
		// �� �ʵ��� ������ ����ڷκ��� �Ҵ� �޾Ƽ� ��ü�� ���� �� ��ü�� �ʵ��� ���� ����.
		Account newAccount = new Account(aNum, aOwner, aBal); 	// �����ڸ� ���ؼ� ��ü�� �ʵ� �� ���� �� ��ü ����.
		
		// �迭 ������ �޼ҵ� �ܺο��� ����. �������� : ��� �޼ҵ忡�� ��� ���� 
		// ��ü�� �迭�� ����. (����ִ� ��(Null)�� ����). for ���� ����ؼ� null�� ���� ã�Ƽ� null�� ��� ��ü�� ����.
		for (int i = 0; i<accountArray.length; i++ ) {	// accountArray �迭 ���� 0 ~ 99 ����� ��ȸ
			if(accountArray[i] == null) { 	// 0���� ���� null�� ���� ã�Ƽ� null�� ��� ��ü�� �迭�� ���� 
				accountArray[i] = newAccount;	// null�� �濡 ��ü�� ����.
				System.out.println("���°� ���������� �����Ǿ����ϴ�. ");
				break;	// ���¸� �����ϰ� for���� �������´�.
			}
		}
		
	}
	
	private static void accountList() {
		// �ڵ� �ۼ� : 2. ���� ��� ��� : �迭�� ����� ��ü�� �����ͼ� ���¹�ȣ �̸�, �ݾ��� ���
		// �迭�� �� ���� ��ȸ �ϸ鼭 null�� �ƴ� ��� �迭���� ��ü�� ������ �ʵ��� ������ ���.
		
		System.out.println("-------------");
		System.out.println("2. ���� ��� ���");
		System.out.println("-------------");
		
		// �迭�� ������ null�� �ƴ� ���, ��ü�� �ʵ��� ���� ���.��
		for (int i=0; i<accountArray.length; i++) {
			// �� ���� ��ü�� ��� ������ ����
			Account account = accountArray[i]; 		// 0 ~ 99 ���� ��ü�� account ���� ������ ��´�.
			if (accountArray[i] != null) {		// �� ���� ���� Null�� �ƴ� ��� ��ü ������ �����ͼ� ���
				//System.out.print(account.toString());
				System.out.print(account.getAno());		// ���� ����.
				System.out.print("    ");
				System.out.print(account.getOwner());	// �̸�
				System.out.print("    ");
				System.out.print(account.getBalance());	// �ݾ�
				System.out.println(); 	// ���� ���� 
			}
		}
	}
	
	private static void deposit() {
		// �ڵ� �ۼ� : 3. ���� <== ���¹�ȣ�� �޾Ƽ� ��ü���� �ش� ���¸� ã�Ƽ�, �Աݱݾ�: �ش� ���¿� ����.
		// 1. ����ڷκ��� �Ա��� ���¸� �޾ƾ� �Ѵ�.
		// 2. ����ڷκ��� ���� ���� ��ȣ�� �迭�� ����� ��ü���� ���¹�ȣ�� Ȯ�� �� �ش� ���¿� �Ա�.
		
		System.out.println("-------------");
		System.out.println("3. �����ϱ� ");
		System.out.println("-------------");
		
		System.out.println("������ ���� ��ȣ�� �Է��ϼ��� >> ");
		String aNum = scanner.next();
		
		System.out.println("������ �ݾ��� �Է� �ϼ��� >> ");
		int aBal = scanner.nextInt();
		
		// �ش� ���¸� �迭���� ã�Ƽ� ã�� ��ü�� �޾ƿ´�. 
		Account account = findAccount(aNum);	// findAccount(���¹�ȣ) 
		
		if(account == null) {
			System.out.println("��� : �ش� ���°� �������� �ʽ��ϴ�. ");
			return;		// �޼ҵ� ����.
		}
		account.setBalance(account.getBalance() + aBal); 	//setter�� ����ؼ� ������ �ݾ� + �߰� �Ա� 
		System.out.println("��� : ������ ���������� �Ա� �Ǿ����ϴ�. ");
	}
	private static void withdraw() {
		// �ڵ� �ۼ� : 4. ��� <== ���� ��ȣ�� ��ǲ �޾Ƽ� �ش� ���¸� ��ü���� ã�Ƽ� ���
		System.out.println("-------------");
		System.out.println("4. ����ϱ� ");
		System.out.println("-------------");
		
		System.out.println("����� ���¹�ȣ�� �Է��ϼ��� >> ");
		String aNum = scanner.next();
		
		System.out.println("����� �ݾ��� �Է��ϼ��� >> ");
		int aBal = scanner.nextInt();
		
		Account account = findAccount(aNum); 
		
		if(account == null) {
			System.out.println("��� : �ش� ���°� �������� �ʽ��ϴ�. ");
			return;		// �޼ҵ� ����.
		}
		
		account.setBalance(account.getBalance() - aBal);	//setter�� ����ؼ� ������ �ݾ� - ��� �ݾ� 
		System.out.println("��� : ������ ���������� ��� �Ǿ����ϴ�. ");
		System.out.println("���� �ݾ� : " + account.getBalance());
	}
	
	// �迭���� Account ��ü ���� ano[���¹�ȣ] �� ������ ���¸� ã�Ƽ� ã�� ��ü�� �������� ������.
	// ����, ����Ҷ� �����ڵ�, ���� �޼ҵ忡�� �ߺ� ���� �� ������ �޼ҵ带 �����ؼ� �ߺ��ڵ带 �����ϰ� ����� �ش�.
	private static Account findAccount(String ano) {
		Account account = null;
		
		for (int i=0 ; i<accountArray.length; i++) {
			if (accountArray[i] != null) {		// �迭���� ���� null�� �ƴ� ��쿡 ��ü�� ano[���¹�ȣ]
				// �� ��ü�� ���� ano �� ��� ���� ����.
				
				String aNum = accountArray[i].getAno(); 	// �迭�� �� �濡 ����� ��ü�� ano�� aNum ������ �Ҵ�.
				
				if(aNum.equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}
		
	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.���»��� | 2. ���¸�� | 3. ���� | 4. ��� | 5. ����");
			System.out.println("-----------------------------------------------");
			System.out.println("����>>");
			int selectNO = scanner.nextInt();
			
			if(selectNO == 1) {
				createAccount() ; //�޼ҵ� ȣ��, 	��ü ���� ���� �޼ҵ������ ȣ�� (Static)
			} else if(selectNO == 2) {
				accountList() ; 
			} else if (selectNO == 3) {
				deposit();
			} else if (selectNO == 4) {
				withdraw();
			} else if (selectNO == 5) {
				run = false;
				//break;
			}
			
		}
		scanner.close();
		System.out.println("���α׷� ����");
	}

}
