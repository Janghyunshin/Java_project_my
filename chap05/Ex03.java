package chap05;
public class Ex03 {
	public static void main(String[] args) {
		
		int [][] arr1 = new int [][] {{1,2,3,4,5,6,7,8,9,10},{11,12,13,14,15,16,17,18,19,20}};
		
		System.out.println(" ============ ���� �������� ��� ============== ");
		
		for (int i=0 ; i< arr1.length ; i++) { // �ٱ��� for �� : ���� ���� ������. 
			for (int j=0 ; j< arr1[i].length ; j++)  { // ���� for �� : ���� ���� ������. array2[i]���� ���� length
					System.out.print(arr1[i][j] + " ");
			}
					System.out.println();
		}
				
		System.out.println("============ ���� ���� for �� ==============");
		
		for ( int [] array : arr1 ) {		// 2���� �迭�� ���� ���� 1���� �迭 ������ ��� (array)
			for ( int g: array) {			// �迭�� ���� ������ ��Ƽ� ���
				System.out.print(g + " ");
			}
			System.out.println();
		}	
		System.out.println("============================================");
		
		// �������� �迭
		int[][] arr2 = new int [][] {{1,2},{11,12,13},{21,22,23,24,25},{31,32}};
		System.out.println("=== ���� for ���� ����ؼ� ��� ==================");
		
		for (int a=0 ; a< arr2.length ; a++) { 
			for (int b=0 ; b< arr2[a].length ; b++)  { 
				System.out.print(arr2[a][b] + " ");
			}
				System.out.println();
		}
		
		System.out.println("====== ���� ���� for ���� ����ؼ� ���===========");
		for ( int [] ar : arr2 ) {
			for ( int t: ar) {			
				System.out.print(t + " ");
			}
			System.out.println();
		}	
		System.out.println("============================================");
		
		
		
		
		
		
		
		
		
	}
}
