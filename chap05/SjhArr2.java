package chap05;

import java.util.Arrays;

public class SjhArr2 {
	public static void main(String[] args) {
		/* 
		 * 배열변수 명 : arr2[300]
		 * 0 번째방: 3
		 * 1 번째방: 6
		 * 2 번째방: 9
		 * for 문을 사용해서 3의 배수만 저장
		 * 
		 * 출력은: for, 향상된 for, Arrays.toString
		 */
	
		int[] arr2 = new int[300];
		
		for ( int i = 0; i < arr2.length; i++) {
			arr2[i] = (i+1) * 3;
		}
		for ( int i = 0; i< arr2.length; i++) {
			System.out.println(i + " 번째방 : " + arr2[i] );
		}		
		System.out.println(" ============================ ");
		
		for( int g : arr2) {
			System.out.print(g+ " ");
		}
		System.out.println();
		System.out.println(" ===========================  ");
		System.out.println(Arrays.toString(arr2));
		
		System.out.println(" ================ 홀수 번의 방만 출력=============");
		
		for ( int i = 100; i < arr2.length; i++) {
			if(i%2 ==1)
				System.out.println(i + " 번째방 " + arr2[i]);
		}
			
	}
}
