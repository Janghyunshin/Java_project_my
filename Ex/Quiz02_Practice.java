package Ex;

import java.util.Scanner;

public class Quiz02_Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		boolean run = true;
		int nu = 0 ;		// ��ĳ�ʷ� ��ȣ�� ��ǲ �޴� ����
		
		
		System.out.println("=======================================================");
		System.out.println(" 1. 19�� ��� | 2. Ȧ���ܸ� ��� | 3. 3�� ����ܸ� ��� | 4. ���� ");
		System.out.println("=======================================================");
		System.out.println("��ȣ�� �Է����ּ��� >>> ");
		
		
		do {
			nu = sc.nextInt();
			
			if (nu == 1) { // 1. ���� for ���� ����ؼ� 19�� ���
				for ( int i = 1; i<= 19; i++ ) {
					for ( int j = 1; j<= 19; j++) {
						System.out.println( i + " * " + j);
					}
				}
					
			} else if ( nu == 2)	{ // 2. Ȧ���ܸ� ���
				for ( int i = 1; i<= 19; i++ ) {
					for ( int j = 1; j<= 19; j++) {
						if ( i % 2 == 0) {
							continue;
						}
						System.out.println( i + " * " + j);
					}
				}
				
			} else if ( nu == 3)	{ // 3. 3�� ����ܸ� ���
				for ( int i = 1; i<= 19; i++ ) {
					for ( int j = 1; j<= 19; j++) {
						if ( i % 3 != 0) {
							continue;
						}
						System.out.println( i + " * " + j);
					}
				}
			} else if ( nu == 4)	{ // 4. ���α׷� ����
				break;
			}
			
		} while (run);
		// ��ĳ�ʸ� �޸𸮿��� ������
		System.out.println(" ���α׷��� �����մϴ�. ");
		sc.close();
	}

}
