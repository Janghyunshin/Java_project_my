package chap06_07.Ex02;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		//[����]: ��ĳ�ʷ� ������ �������� �޾Ƽ� �հ�, ���....>>
		Scanner sc = new Scanner (System.in);
		
		int array[] = new int[10];
		int sum = 0;
		double avg = 0;
		System.out.println("������ ���� ��: ");
		
		for (int i=0; i<100; i++) {
			array[i] = (int)(Math.random()*10+1);
			System.out.print(array[i] + " ");
		}
		for (int i=0; i<100; i++) {
			sum += array[i];
			avg = sum / 10;
		}
		System.out.print("���� : " + sum);
		System.out.print("����� : " + avg);
		
		
	}

}
