package chap04;

public class Review01 {
	public static void main(String[] args) {
		
		for(int i=0;  ; i++) {
			if(i>10) {
				break;
			}
		System.out.print(i + " ");
		}
		
		System.out.println();
		
		int i= 0;
		while (i<=10) {
			System.out.print(i+ " " );
			i++;
		}
		
		System.out.println();
		System.out.println("=======================");
		
		int s= 0;
		do {
			System.out.print( s + " ");
			s++;
		} while (s <= 10);
		
		
		
	}

}