package chap06_07.Ex05;

public class Ex_C {

	public static void main(String[] args) {
		
		C c = new C();	// ���� ��Ű���� �����ϴ� Ŭ����
		// c.company = "�Ｚ�ڵ���"; //private : �ܺ� Ŭ�������� ���� �Ұ�
		c.model = "�׷���";	// default
		c.color = "����";		// protected
		c.maxSpeed = 250; 	// public
		
		c.print();	// public
		
	}

}
