package Ex;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
			
		/* ������ ��� �̸��� �ְ� �ش� ����� ������(���)�� �־ ����ϴ� ���α׷��� �ۼ� �� , 
		 ��ü �� �� ����� ���ϴ� ���α׷��� �ۼ��ϼ���.
		 ��)
		 �Է� >>
		 Ź�� 2 �߱� 9 �౸ 11 �� 6 ���� 2    <== nextline() Ȱ�� 
		 
		 ��� >> 
		 Ź��: 2, �߱�: 9, �౸: 11, ��: 6, ����: 2 
		 ������� ������ �� �հ�:
		 ������� ��� ������ �� 
		 
		 "�׸�" �̶�� �Է��ϸ� ���α׷� ����
		 */
		Scanner sc = new Scanner(System.in);
		
		String[] sports = {"�౸", "��", "�߱�", "Ź��", "����"}; 
		int[] num = {11,6,9,2,2};
		
		String name = null; // ��ĳ�ʷ� ������ ���ڿ��� �޴� ����
		
		int i = 0;			// ���ȣ�� ��� ����
		int sum = 0;
		double avg = 0;
		
		int name2 = 0;
		
		System.out.print("�Է� >> ");
		 while (true) {		// Ư�� ������ ���� �Ҷ� ���� ��� ���� ���ư�.
			 
			 name = sc.next();	//��ĳ�ʷ� ���� �̸��� �޾Ƽ� ���� name�� �Ҵ�. 
			 name2 = sc.nextInt();
			 
			 if (name.equals("�׸�")) {	//����: name�� �������� �̹Ƿ� ==�� ������� �ʰ� equals
				 System.out.println("���α׷��� �����մϴ�.");
				 break;
			 }
			 for (i=0; i<sports.length; i++) {
				 if (sports[i].equals(name)) {
					 System.out.println(sports[i] + ": " + num[i]);
					 break;
				 }		 
			 }
			 for (i=0; i<num.length; i++) {
				 if (num[i] == (name2)) {
				 sum += num[i];
				 avg = (double) sum / num.length;
				 break;
				 }
				
			 }
			 System.out.println("������� ������ �� �հ� : " + sum);
			 System.out.println("������� ��� ������ �� : " + avg);
		 }
		
		 sc.close();
	}
}