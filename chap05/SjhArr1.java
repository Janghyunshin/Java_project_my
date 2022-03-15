package chap05;

import java.util.Arrays;

public class SjhArr1 {
	public static void main(String[] args) {
		/*
		 *  문제: 배열변수명 arr1 [100]
		 *  0 번방: 1
		 *  1 번방: 2
		 *  ~
		 *  99번방 : 100
		 *  for 문을 사용해서 저장
		 *  -출력 : for, 향상된 for, Arrays.toString()
		 */
		
		int[] arr1 = new int[100];
		
		for (int i= 0; i <arr1.length; i++) {
			arr1[i] = i + 1; 
		}	
		for ( int i = 0; i <arr1.length; i++) { // 1번
			System.out.println(i + " 번째방의 값 : " + arr1[i] );
		}
			System.out.println(" ====================");
		for (int g: arr1) {	// 2번
			System.out.print(g+ " ");
		}
		
			System.out.println();
			System.out.println("=====================");
			
			System.out.println(Arrays.toString(arr1)); //3번

	}
}
