package Ex;
public class Ex10 {
	public static void main(String[] args) {
		/* 문항 10. 반복문을 이용하여 369 게임에서 박수를 쳐야 하는 경우를
		 * 순서대로 화면에 출력해보자. 1부터 시작하며 99까지만 한다.
		 */
		for (int i=1; i<=99; i++) {
			if (i % 10 == 3 || i % 10 == 6|| i % 10 == 9) {
				if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9) //||은 or
					System.out.println(i + " 박수 짝짝");
				else
					System.out.println(i + " 박수 짝");
			}
			else if(i / 10 == 3 || i / 10 == 6 || i / 10 == 9)
				System.out.println(i + " 박수 짝");
		}
	}
}
