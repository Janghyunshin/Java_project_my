package chap04;
public class Sjh_continue02 {
	public static void main(String[] args) {
		/*
		 * ����2: 3�� ����ܸ� ���
		 */
		
POS1:	for (int a = 1;  a<= 19; a++) {
			for (int b = 1; b<= 19; b++) {
				if (a % 3 != 0) {
					continue POS1;
				}	
				System.out.println(a + " * " + b);
			}
			System.out.println("================");
		}


		
		
	}

}
