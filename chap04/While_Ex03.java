package chap04;
public class While_Ex03 {
	public static void main(String[] args) {

		// 1. while의 기본 문법
		int a = 0;  // 초기값
		
		while ( a < 10 ) { // 조건
			System.out.print( a + " ");
			a++;// 증감식
		}
			//0 , 1, 2, 3, 4, .... 9 : 10번 출력
		System.out.println();
		
		// For 문으로 변환
		for ( int i = 0 ; i < 10 ; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		// while 문의 10부터 시작해서 1씩 감소
		int b = 10 ; 
		while ( b > 0 ) {
			System.out.print(b + " ");
			b--;
		}
		
		System.out.println();
		
		for (int i = 10; i > 0 ; i--) {
			System.out.print(i+ " ");
		}
		
		// while문의 무한 루프
		
		/*while (true) {
			System.out.println("While의 무한 루프 발생");
		}
		*/
		
		
		// while의 무한 루프 중지
		
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
