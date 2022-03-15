package chap05;
public class Ex03 {
	public static void main(String[] args) {
		
		int [][] arr1 = new int [][] {{1,2,3,4,5,6,7,8,9,10},{11,12,13,14,15,16,17,18,19,20}};
		
		System.out.println(" ============ 이중 포문으로 출력 ============== ");
		
		for (int i=0 ; i< arr1.length ; i++) { // 바깥쪽 for 문 : 행을 루프 돌린다. 
			for (int j=0 ; j< arr1[i].length ; j++)  { // 안쪽 for 문 : 열을 루프 돌린다. array2[i]번의 행의 length
					System.out.print(arr1[i][j] + " ");
			}
					System.out.println();
		}
				
		System.out.println("============ 이중 향상된 for 문 ==============");
		
		for ( int [] array : arr1 ) {		// 2차원 배열의 행의 값을 1차원 배열 변수에 담고 (array)
			for ( int g: array) {			// 배열의 값을 변수에 담아서 출력
				System.out.print(g + " ");
			}
			System.out.println();
		}	
		System.out.println("============================================");
		
		// 비정방형 배열
		int[][] arr2 = new int [][] {{1,2},{11,12,13},{21,22,23,24,25},{31,32}};
		System.out.println("=== 이중 for 문을 사용해서 출력 ==================");
		
		for (int a=0 ; a< arr2.length ; a++) { 
			for (int b=0 ; b< arr2[a].length ; b++)  { 
				System.out.print(arr2[a][b] + " ");
			}
				System.out.println();
		}
		
		System.out.println("====== 이중 향상된 for 문을 사용해서 출력===========");
		for ( int [] ar : arr2 ) {
			for ( int t: ar) {			
				System.out.print(t + " ");
			}
			System.out.println();
		}	
		System.out.println("============================================");
		
		
		
		
		
		
		
		
		
	}
}
