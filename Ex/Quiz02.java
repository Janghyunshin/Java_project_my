package Ex;

import java.util.Scanner;

public class Quiz02 {

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
	
			if (nu == 1 ) {	// ���� for ���� ����ؼ� 19�� ���
				for (int a = 1;  a<= 19; a++) {
					for (int b = 1; b<= 19; b++) {
						System.out.println(a + " * " + b);		
					}
				}	
			
			} else if ( nu == 2 ) { // Ȧ���ܸ� ���
				for (int a = 1;  a<= 19; a++) {
					for (int b = 1; b<= 19; b++) {
						if ( a % 2 == 0) {
							continue;
						}
						System.out.println(a + " * " + b);		
					}
			}
			
			} else if ( nu == 3 ) { // 3�� ����ܸ� ���
				for (int a = 1;  a<= 19; a++) {
					for (int b = 1; b<= 19; b++) {
						if ( a % 3 != 0) {
							continue;
						}
						System.out.println(a + " * " + b);		
					}
			}
			
			} else if ( nu == 4 ) { //���α׷� ����
				break;
			}
			
		} while (run);
		
		// ��ĳ�� �޸𸮿��� ���� ��
		System.out.println("���α׷��� �����մϴ�. ");
		sc.close();
	}

}
