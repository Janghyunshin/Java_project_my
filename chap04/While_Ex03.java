package chap04;
public class While_Ex03 {
	public static void main(String[] args) {

		// 1. while�� �⺻ ����
		int a = 0;  // �ʱⰪ
		
		while ( a < 10 ) { // ����
			System.out.print( a + " ");
			a++;// ������
		}
			//0 , 1, 2, 3, 4, .... 9 : 10�� ���
		System.out.println();
		
		// For ������ ��ȯ
		for ( int i = 0 ; i < 10 ; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		// while ���� 10���� �����ؼ� 1�� ����
		int b = 10 ; 
		while ( b > 0 ) {
			System.out.print(b + " ");
			b--;
		}
		
		System.out.println();
		
		for (int i = 10; i > 0 ; i--) {
			System.out.print(i+ " ");
		}
		
		// while���� ���� ����
		
		/*while (true) {
			System.out.println("While�� ���� ���� �߻�");
		}
		*/
		
		
		// while�� ���� ���� ����
		
		System.out.println();
		
		int c1 = 0;
		while (true) {
			if (c1 > 100) {
				break;
			}
			System.out.print( c1 + " ");
			
			c1++;
		}
		
	}

}
