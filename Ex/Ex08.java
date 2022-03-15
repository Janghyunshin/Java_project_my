package Ex;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		/* 문항 8 : 배열과 반복문을 이용하여 프로그램을 작성해보자.
		 * 키보드에서 정수로된 돈의 액수를 입력받아 오만 원권, 만 원권, 천 원권,
		 * 500 원짜리 동전, 100 원짜리 동전, 10 원짜리 동전, 1원짜리 동전이
		 * 각 몇개로 변환되는지 예시와 같이 출력하라. 이때 반드시 다음 배열을 
		 * 이용하고 반복문으로 작성하라.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하시오 >> ");
		
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		// 환산할 돈의 종류
		int a[] = new int[8];
		int b;
		b = sc.nextInt();
		
		for (int i=0; i<8; i++) {
			a[i] = b / unit[i];
			b= b % unit[i];
		}
		System.out.println("50000 원 짜리 : " + a[0] + " 개 " );
		System.out.println("10000 원 짜리 : " + a[1] + " 개 " );
		System.out.println("1000 원 짜리 : " + a[2] + " 개 " );
		System.out.println("500 원 짜리 : " + a[3] + " 개 " );
		System.out.println("100 원 짜리 : " + a[4] + " 개 " );
		System.out.println("50 원 짜리 : " + a[5] + " 개 " );
		System.out.println("10 원 짜리 : " + a[6] + " 개 " );
		System.out.println("1 원 짜리 : " + a[7] + " 개 " );
		
		sc.close();
	}
}
