package Ex;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		/* ���� 8 : �迭�� �ݺ����� �̿��Ͽ� ���α׷��� �ۼ��غ���.
		 * Ű���忡�� �����ε� ���� �׼��� �Է¹޾� ���� ����, �� ����, õ ����,
		 * 500 ��¥�� ����, 100 ��¥�� ����, 10 ��¥�� ����, 1��¥�� ������
		 * �� ��� ��ȯ�Ǵ��� ���ÿ� ���� ����϶�. �̶� �ݵ�� ���� �迭�� 
		 * �̿��ϰ� �ݺ������� �ۼ��϶�.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��Ͻÿ� >> ");
		
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		// ȯ���� ���� ����
		int a[] = new int[8];
		int b;
		b = sc.nextInt();
		
		for (int i=0; i<8; i++) {
			a[i] = b / unit[i];
			b= b % unit[i];
		}
		System.out.println("50000 �� ¥�� : " + a[0] + " �� " );
		System.out.println("10000 �� ¥�� : " + a[1] + " �� " );
		System.out.println("1000 �� ¥�� : " + a[2] + " �� " );
		System.out.println("500 �� ¥�� : " + a[3] + " �� " );
		System.out.println("100 �� ¥�� : " + a[4] + " �� " );
		System.out.println("50 �� ¥�� : " + a[5] + " �� " );
		System.out.println("10 �� ¥�� : " + a[6] + " �� " );
		System.out.println("1 �� ¥�� : " + a[7] + " �� " );
		
		sc.close();
	}
}
