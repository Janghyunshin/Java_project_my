package Ex1;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		/* [���� 9] ������ 10�� �����ϴ� �迭�� ����� 1���� 10���� ������ ������ �����ϰ�
		�����Ͽ� �迭�� �����϶�. �׸��� �迭�� �� ���ڵ�� ����� ����϶�.
		������ ������ : 3 6 3 6 1 3 8 9 6 9 
		����� 5.4
		[Hint] 1���� 10���� ������ ������ �����ϰ� ������ ���� ���� �ڵ带 �̿��϶�.
		int i = (int)(Math.random()*10+1); */
		
		Scanner sc = new Scanner(System.in);
		
		double c = (double) Math.random(); 		// ���� �߻��� (������ ���� �ڵ����� �߻���Ŵ)
			// 0.000000xxx ~ 0.999999xxx <== ������ ������ ���� �߻���Ŵ
		System.out.println(c);
		
		int d = (int) (Math.random() * 10 ); // 0 ~ 9������ ������ ���� ����
		int e = (int) (Math.random() * 10 + 1); // 1 ~ 10������ ���� ���� 
		
		System.out.println("0���� 9 ������ ������ �� : " + d);
		System.out.println("1���� 10 ������ ������ �� : " + e);
		
		// 1���� 100 ������ ������ �߻���Ŵ
		int f = (int) (Math.random() * 100 + 1);
		System.out.println("1���� 100 ������ ������ �� : " + f);
	}

}