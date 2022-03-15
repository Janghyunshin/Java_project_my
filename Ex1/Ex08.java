package Ex1;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		/* [문항 8] 배열과 반복문을 이용하여 프로그램을 작성해보자. 키보드에서 정수로
		된 돈의 액수를 입력받아 오만 원권, 만 원권, 천 원권, 500원짜리 동전, 100원
		짜리 동전, 50원짜리 동전, 10원짜리 동전, 1원짜리 동전이 각 몇 개로 변환되
		는지 예시와 같이 출력하라. 이때 반드시 다음 배열을 이용하고 반복문으로 작성
		하라.
		예시)
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; 
		// 환산할 돈의 종류 : 자판기
		금액을 입력하시오 >> 65123
		50000 원 짜리 : 1개
		10000 원 짜리 : 1개
		1000 원 짜리 : 5개
		500 원 짜리 : 0개
		100 원 짜리 : 1개
		50 원 짜리 : 0개
		10 원 짜리 : 2개
		1 원 짜리 : 3개
		*/
		Scanner sc = new Scanner(System.in);
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; //환살할 돈의 종류를 배열에 저장
		int money;			// 스캐너로 인풋 받을 돈을 저장하는 변수
		
		System.out.print("환산할 돈의 금액을 입력 하세요. >>> ");
		money = sc.nextInt();
				
		for ( int i=0; i<unit.length; i++) {
			System.out.printf(" %d 원 짜리 : %d 개 \n" , unit[i], money/unit[i]);
			// System.out.println(unit[i] + " 원 짜리 : " + money / unit[i] +" 개");
			money = money - (money/unit[i]) * unit[i];
			               // 환산한 돈의 갯수  * 50000
		}
		sc.close();
	}

}
