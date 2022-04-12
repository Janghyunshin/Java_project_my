package chap17.EX16;

import java.util.Objects;

public class Account {
	    //계좌 정보를 저장하는 객체. 중요한 필드, private (캡슐화),   
		//DTO, VO <== 각계층으로 필드의 값을 저장하고 전달  
		// 객체명 필드접근(x), 생성자(0), getter(0), setter(0)
		String ano ; 	//계좌 번호
		String owner;   //계좌 주 , 이름
		int balance; 	// 통장 금액, 
		
		Account(String ano, String owner, int balance){   //객체 생성시 필드의 값을 받아서 필드에 로드 
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

