package chap04;
public class Sjh_continue01 {
	public static void main(String[] args) {

		/* 
		 * ����1: continue �� ����ؼ� 
		 * 1�� ~ 19�ܱ��� ��� �ϴµ� Ȧ���ܸ� ���
		 */
		
		for (int a = 1;  a <= 19; a++) {
			for (int b = 1; b<= 19; b++) {
				if (a%2 == 0) {
					continue;
				}
				System.out.println(a + " * " + b);
					
			}
			System.out.println("================");
			
			
			
		}
	}
		
		
}

