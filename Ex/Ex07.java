package Ex;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		/* ���� 7. ���� ������ 10�� �Է¹޾� �迭�� �����ϰ�, 
		 * �迭�� �ִ� ���� �߿��� 3�� ����� ����ϴ� ���α׷��� �ۼ��϶�.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� 10���� �Է��Ͻÿ� >> ");
		
		int[] array = new int[10];
		for (int i=0; i<array.length; i++) {
			array[i]= sc.nextInt();
		}
		
		System.out.print("3�� ����� ");
		for (int i=0; i<array.length; i++) {
			if(array[i] % 3 == 0) {
				System.out.print(array[i] + " ");
			}
		}
		sc.close();
	}
}
