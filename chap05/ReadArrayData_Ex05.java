package chap05;

import java.util.Arrays;

public class ReadArrayData_Ex05 {
	public static void main(String[] args) {
		int[] array = new int[] {3,4,5,6,7};
		
		// 1. �迭�� ��(index)�� ���� ���ϱ�
		System.out.println(array.length); // ���� ������ ��� : 5
		
		// 2. ��� �ϱ� 1 : ���ȣ�� ���� �� ��� - Ư�� �� ��ȣ�� ���� ���.
		System.out.print(array[0] + " ");
		System.out.print(array[1] + " ");
		System.out.print(array[2] + " ");
		System.out.print(array[3] + " ");
		System.out.print(array[4] + " ");
//		System.out.print(array[5])+ " ");	// ArrayIndexOutOfBoundException, ���ȣ�� �ʰ��� ��츦
											// ��� �� ����
		System.out.println();
		
		// 3. ����ϱ� 2 : for ���� ����ؼ� Ư�� ������ �����ؼ� ���
		for ( int i = 0 ; i < array.length; i++ ) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		 // for ���� ����ؼ� Ư�� ������ ��� �ϱ�
		for (int i = 1 ; i < 3 ; i++) {
			System.out.print(array[i]+ " ");
		}
		System.out.println();
		
		// 4. ����ϱ� 3 : ���� for, ó�� ����� ������ ����� ��ȯ �ϸ鼭 ���. ������ �����ؼ� ��� �Ұ�
				// ������ for ���� ���ؼ� ª��.
		
		for ( int k: array) {				// for (����� �ڷ��� ���� :�迭 ����) { ���๮, k }
			System.out.print(k + " ");
		}
			System.out.println();
		// 5. ����ϱ� 5 : Arrays.toString(�迭������) // �迭 ������ ��� ���� ���
			System.out.print(Arrays.toString(array));
			
		
	}
}