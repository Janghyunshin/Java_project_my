package chap05;

import java.util.Arrays;

public class SjhArr2 {
	public static void main(String[] args) {
		/* 
		 * �迭���� �� : arr2[300]
		 * 0 ��°��: 3
		 * 1 ��°��: 6
		 * 2 ��°��: 9
		 * for ���� ����ؼ� 3�� ����� ����
		 * 
		 * �����: for, ���� for, Arrays.toString
		 */
	
		int[] arr2 = new int[300];
		
		for ( int i = 0; i < arr2.length; i++) {
			arr2[i] = (i+1) * 3;
		}
		for ( int i = 0; i< arr2.length; i++) {
			System.out.println(i + " ��°�� : " + arr2[i] );
		}		
		System.out.println(" ============================ ");
		
		for( int g : arr2) {
			System.out.print(g+ " ");
		}
		System.out.println();
		System.out.println(" ===========================  ");
		System.out.println(Arrays.toString(arr2));
		
		System.out.println(" ================ Ȧ�� ���� �游 ���=============");
		
		for ( int i = 100; i < arr2.length; i++) {
			if(i%2 ==1)
				System.out.println(i + " ��°�� " + arr2[i]);
		}
			
	}
}
