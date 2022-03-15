package Ex;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		boolean run = true;
		int nu = 0 ;		// 스캐너로 번호를 인풋 받는 변수
		
		System.out.println("=======================================================");
		System.out.println(" 1. 19단 출력 | 2. 홀수단만 출력 | 3. 3의 배수단만 출력 | 4. 종료 ");
		System.out.println("=======================================================");
		
		System.out.println("번호를 입력해주세요 >>> ");
		do {
			nu = sc.nextInt();
	
			if (nu == 1 ) {	// 이중 for 문을 사용해서 19단 출력
				for (int a = 1;  a<= 19; a++) {
					for (int b = 1; b<= 19; b++) {
						System.out.println(a + " * " + b);		
					}
				}	
			
			} else if ( nu == 2 ) { // 홀수단만 출력
				for (int a = 1;  a<= 19; a++) {
					for (int b = 1; b<= 19; b++) {
						if ( a % 2 == 0) {
							continue;
						}
						System.out.println(a + " * " + b);		
					}
			}
			
			} else if ( nu == 3 ) { // 3의 배수단만 출력
				for (int a = 1;  a<= 19; a++) {
					for (int b = 1; b<= 19; b++) {
						if ( a % 3 != 0) {
							continue;
						}
						System.out.println(a + " * " + b);		
					}
			}
			
			} else if ( nu == 4 ) { //프로그램 종료
				break;
			}
			
		} while (run);
		
		// 스캐너 메모리에서 삭제 후
		System.out.println("프로그램을 종료합니다. ");
		sc.close();
	}

}
