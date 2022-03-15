package chap06_07.Ex02;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		//[문제]: 스캐너로 임의의 정수값을 받아서 합계, 평균....>>
		Scanner sc = new Scanner (System.in);
		
		int array[] = new int[10];
		int sum = 0;
		double avg = 0;
		System.out.println("임의의 정수 값: ");
		
		for (int i=0; i<100; i++) {
			array[i] = (int)(Math.random()*10+1);
			System.out.print(array[i] + " ");
		}
		for (int i=0; i<100; i++) {
			sum += array[i];
			avg = sum / 10;
		}
		System.out.print("합은 : " + sum);
		System.out.print("평균은 : " + avg);
		
		
	}

}
