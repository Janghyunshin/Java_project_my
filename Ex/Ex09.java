package Ex;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		/* ���� 9.
		 * ������ 10�� �����ϴ� �迭�� ����� 1���� 10���� ������ ������
		 * �����ϰ� �����Ͽ� �迭�� �����϶�. �׸��� �迭�� �� ���ڵ�� ����� ���
		 * [Hint]: 1���� 10���� ������ ������ �����ϰ� ������ ���� ���� �ڵ带 �̿��϶�
		 * int i = (int)(Math.random()*10+1);
		 */
		Scanner sc = new Scanner(System.in);
		
		int array[] = new int[10];
		int sum = 0;
		double ave = 0;
		System.out.print("������ ������ : ");
		
		for (int i=0; i<10; i++) {
			array[i] = (int)(Math.random()*10+1);
			System.out.print(array[i] + " ");
		}
		
		for (int i=0; i<10; i++) {
			sum += array[i];
			ave = sum / 10;
		}
			System.out.println();
			System.out.println("���� " + sum);
			System.out.println("����� " + ave);
		sc.close();
	}
}
