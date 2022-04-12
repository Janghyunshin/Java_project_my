package chap14.Ex09;

class MyAllException extends Exception {		// �Ϲ� ���� (checked Exception) - ���� ����(����ó��)
	public MyAllException () {
		super();	// �θ��� ������ ȣ��
	}
	public MyAllException (String message) {	// ���� �޼��� ���, e.getMessage();
		super(message);
	}
}



class A {
	// private : ĸ��ȭ, ��ü���� �� �ٷ� ���� ���� ���ϵ��� ����
		// ������, setter <== ���� �� �ʵ��� ���� �Ҵ� 
	private String season ;	// ��, ����, ����, �ܿ� (���ܹ߻� : ��,����,����,�ܿ︸ �Է��ϼ���)
	private String week ;	// ��, ȭ, ��, ��, �� ,��, �� (���� �߻� : ��,ȭ,��,��,��,��,�� �� �Է��ϼ���)
	private int scoreKor;	// 0 ~ 100 ���� �Է�( ���� �߻� : 0 ~ 100���� ������ �Է��ϼ���)
	private int scoreEng; 	// 0 ~ 100 ���� �Է�( ���� �߻� : 0 ~ 100���� ������ �Է��ϼ���)
	private String userID;	// 12���̻� 20�� ������ ���� ( ���� �߻�: 12���̻� 20�� ������ ���ڸ� ��������)
	
	void studentInfo (String season, String week, int scoreKor, int scoreEng, String userID) throws MyAllException{
		if ( season != "��" && season != "����" && season != "����" && season != "�ܿ�") {
			throw new MyAllException ("���ܹ߻� : ��,����,����,�ܿ︸ �Է��ϼ���");
			
	}   else if ( week != "��" && week != "ȭ" && week != "��" && week != "��" && week != "��" &&
			week != "��" && week != "��") {
			throw new MyAllException ("���� �߻� : ��,ȭ,��,��,��,��,�� �� �Է��ϼ���");
			
	}   else if ( scoreKor < 0  || scoreKor > 100 ) {
			throw new MyAllException ("���� �߻� : 0 ~ 100���� ������ �Է��ϼ���");
			
	}	else if ( scoreEng < 0  || scoreEng > 100) {
			throw new MyAllException ("���� �߻� : 0 ~ 100���� ������ �Է��ϼ���");
			
	}	else if (userID.length() < 12 || userID.length() > 20) {
			throw new MyAllException	("���� �߻�: 12���̻� 20�� ������ ���ڸ� ��������"); 
			
	} 	else {
			System.out.println("���������� �� �Է� �Ǿ����ϴ�.");
			this.season = season;
			this.week  = week ;
			this.scoreKor = scoreKor;
			this.scoreEng = scoreEng;
			this.userID = userID;
	}
		System.out.printf(season + "," + week + "," + scoreKor + "," + scoreEng + "," + userID);
	}
}

public class UserException_EX {

	public static void main(String[] args) {
		
	
		A a1 = new A();
		// ��� �ʵ��� ���� ����
		try{
			a1.studentInfo("��", "��", 80, 90, "aaaaaaaaaabbb");
		}catch (MyAllException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());	// Return String
		}
	
		System.out.println();
		System.out.println("======================");
		
		try{
			a1.studentInfo("��", "��", 80, 90, "aaaaaaaaaabbb");
		}catch (MyAllException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println();
		System.out.println("======================");
		
		try{
			a1.studentInfo("����", "��", 110, 90, "aaaaaaaaaabbb");
		}catch (MyAllException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println();
		System.out.println("======================");
		
		try{
			a1.studentInfo("�ܿ�", "��", 80, 111, "aaaaaaaaaabbb");
		}catch (MyAllException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println();
		System.out.println("======================");
		
		try{
			a1.studentInfo("����", "��", 80, 90, "aaaa");
		}catch (MyAllException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}	
		
		


