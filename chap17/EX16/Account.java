package chap17.EX16;

import java.util.Objects;

public class Account {
	    //���� ������ �����ϴ� ��ü. �߿��� �ʵ�, private (ĸ��ȭ),   
		//DTO, VO <== ���������� �ʵ��� ���� �����ϰ� ����  
		// ��ü�� �ʵ�����(x), ������(0), getter(0), setter(0)
		String ano ; 	//���� ��ȣ
		String owner;   //���� �� , �̸�
		int balance; 	// ���� �ݾ�, 
		
		Account(String ano, String owner, int balance){   //��ü ������ �ʵ��� ���� �޾Ƽ� �ʵ忡 �ε� 
		this.ano = ano ; 
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
		public boolean equals(Object obj) {
		if (obj instanceof Account) {
			if (this.ano.equals(((Account)obj).ano )) {
				return true;
			}
		} 
		return false;
		}
		@Override
		public int hashCode() {
		return Objects.hash(ano);
		}
}

