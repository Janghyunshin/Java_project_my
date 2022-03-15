package chap04;
public class Continue_Ex05 {
	public static void main(String[] args) {

		// 1. 단일 루프에서 continue
		
		for ( int i = 0 ; i < 10 ; i++) {
			continue;
			//System.out.println("출력 구문 오류");
		}
		
		for (int i=0; i<10; i++) {
			System.out.print( i + " "); 
			continue;				// continue는 조건 없이 하위에 실행문을 사용하면 오류
			// System.out.println();
		}
		System.out.println();
		System.out.println("========= continue ===========");
		
		// 2. 조건을 사용해서 continue 처리
		
		for (int i=0; i<10; i++) {
			if ( i == 5) {
				continue;
			}
			System.out.print( i + " ");		
		}
		
		System.out.println();
		System.out.println("========== break =============");
		
		// 2. 조건을 사용해서 break 처리
		
		for (int i=0; i<10; i++) {
			if ( i == 5) {
				break;
			}
			System.out.print( i + " ");	
			
		System.out.println();
		System.out.println("=============<다중 루프문의 continue>===============");
		
		// 3. 다중 루프문에서 continue 사용
		
		for ( int a =0; a<5 ; a++) {
			for (int j=0; j<5; j++) {
				if ( j == 3 ) {
					continue ; 
				}
				
				System.out.println (a + " , " + j);
			}
		}
		
		System.out.println();
		System.out.println("=============<다중 루프문의 break>===============");
		
		// 3. 다중 루프문에서 break 사용
		for ( int a =0; a<5 ; a++) {
			for (int j=0; j<5; j++) {
				if ( j == 3 ) {
					break ; 
				}
				
				System.out.println (a + " , " + j);
			}
		}
		
		System.out.println();
		System.out.println("=============<Continue에서 라벨 사용>===============");
		
		// 4. Continue에서 라벨 사용
		
POS2:	for ( int a = 0 ; a < 5 ; a++) {
			for (int b =0 ; b<5 ; b++ ) {
				if (b == 3 ) {
					continue POS2;
				}
				
				System.out.println( a + " , " + b);
			}
		}

System.out.println();
System.out.println("=============<break에서 라벨 사용>===============");

		// 4. Break에서 라벨 사용
		
POS3:	for ( int a = 0 ; a < 5 ; a++) {
			for (int b = 0 ; b <5 ; b++ ) {
				if (b == 3 ) {
					break POS3;
				}
		
		System.out.println( a + " , " + b);
			}
		}
		
		



	 }
	}
}
