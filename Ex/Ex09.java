package Ex;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		/* 문항 9.
		 * 정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를
		 * 랜덤하게 생성하여 배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력
		 * [Hint]: 1에서 10까지 범위의 정수를 랜덤하게 생성할 때는 다음 코드를 이용하라
		 * int i = (int)(Math.random()*10+1);
		 */
		Scanner sc = new Scanner(System.in);
		
		int array[] = new int[10];
		int sum = 0;
		double ave = 0;
		System.out.print("랜덤한 정수들 : ");
		
		for (int i=0; i<10; i++) {
			array[i] = (int)(Math.random()*10+1);
			System.out.print(array[i] + " ");
		}
		
		for (int i=0; i<10; i++) {
			sum += array[i];
			ave = sum / 10;
		}
			System.out.println();
			System.out.println("합은 " + sum);
			System.out.println("평균은 " + ave);
		sc.close();
	}
}
