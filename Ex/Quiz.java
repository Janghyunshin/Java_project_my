package Ex;

import java.util.Scanner;

public class Quiz {

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
		
		Scanner sc = new Scanner (System.in);
		System.out.println("� �̸��� ������ ���� ������ �̿��ؼ� �Է� �ϼ���. ");
		System.out.println("��) �Է� >>> Ź�� 2 �߱� 9 �౸ 11 �� 6 ���� 2");
		
		String str; 	// ��ü String ���� ��ǲ �޴� ����
		String[] array ; 	// ������ �������� �߶� �迭�� �����ϴ� ����
		int sum ;	// ��� �������� ����� ���� �����ϴ� ����
		int memberCount = 0;
		double avg;	// ����� ���ϴ� ���� : (double) ��ü �������� �� / ������ �� 
		int b;		// �� ������ �������� ��� ����
		
		do {
			sum = 0;
			avg = 0;
			b = 0;
			str = sc.nextLine();	// sc.next() : ��������� String
									// sc.nextLine():
			if (str.equals("�׸�")) {break;}	// str�� ���� �ڷ����̹Ƿ� str.equals()
			
			array = str.split(" ");	// str�� ������ �������� �߶� arr �迭�� ����
			
			for ( int i = 0;  i<array.length ; i++) { // arr.length : �迭�� index 0 ~ ������ �����
				if (i%2 !=0 ) {		// i : ���� ��ȣ�̰� ���ڸ� ������ �´�.
					b = Integer.parseInt(array[i]);		// �� ���� String Ÿ���� ������ ��ȯ
					sum += b;		// sum = sum + b	// sum : ��ü �������� ��  
					memberCount ++;	// avg = sum / memberCount 
				}
			}
			avg = (double) sum / memberCount;	// ���
			
			System.out.println(str);
			System.out.println("�������� ���� : " + sum);
			System.out.println("�������� ��� : " + avg);
			
		} while (true);
		
		
		
		
		
		
	}

}
