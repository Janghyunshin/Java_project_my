package chap05;

import java.util.Arrays;

public class SjhArr1 {
	public static void main(String[] args) {
		/*
		 *  ����: �迭������ arr1 [100]
		 *  0 ����: 1
		 *  1 ����: 2
		 *  ~
		 *  99���� : 100
		 *  for ���� ����ؼ� ����
		 *  -��� : for, ���� for, Arrays.toString()
		 */
		
		int[] arr1 = new int[100];
		
		for (int i= 0; i <arr1.length; i++) {
			arr1[i] = i + 1; 
		}	
		for ( int i = 0; i <arr1.length; i++) { // 1��
			System.out.println(i + " ��°���� �� : " + arr1[i] );
		}
			System.out.println(" ====================");
		for (int g: arr1) {	// 2��
			System.out.print(g+ " ");
		}
		
			System.out.println();
			System.out.println("=====================");
			
			System.out.println(Arrays.toString(arr1)); //3��

	}
}
