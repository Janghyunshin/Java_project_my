package chap03;

import java.util.Scanner;

public class SjhScanner {
	private static Scanner scanner;

	public static void main(String[] args) {
		System.out.println("�������� �Է��ϼ���?");
		scanner = new Scanner(System.in); 
		
		int value1 = scanner.nextInt();
		

		 /* ���� ������
		  *  System.out.println();(value1 % 3 == 0) ? "3�� ����Դϴ�." : "3�� ����� �ƴմϴ�.";
		  */
		 
		if  (value1 % 3 == 0) {
			System.out.println("3�� ����Դϴ�.");
		} else {
			System.out.println("3�� ����� �ƴմϴ�.");
		}
		
		System.out.println();
		scanner.close();
		

	}

}
