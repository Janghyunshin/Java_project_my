package chap04;
public class Sjh_continue01 {
	public static void main(String[] args) {

		/* 
		 * 문제1: continue 를 사용해서 
		 * 1단 ~ 19단까지 출력 하는데 홀수단만 출력
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

