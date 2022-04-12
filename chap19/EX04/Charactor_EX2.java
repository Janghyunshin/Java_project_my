package chap19.EX04;
/*
 * p.jangwoo@gmail.com , 팀장님한테도 전송, 완료시간 11:45
 * 힌트 : 배열의 방 26개 생성해서 for문을 사용해서 출력

 A ~ Z 까지의 아스키 코드값 출력
 
 =====================
 출력 결과
 A, 65
 B, 66
 ....
 Z, 90
 
  =====================
 a ~ z 까지의 아스키 코드 출력 
  
 출력 결과
 a, 97
 b, 98
 ....
 z,
 */

public class Charactor_EX2 {
	public static void main(String[] args) {
		// A ~ Z까지의 아스키 코드 출력
		char[] arr1 = new char[26];
		
	
		for (int i=0; i<arr1.length; i++) {
			arr1[i] = (char) (65 + i);
			System.out.println(arr1[i] + ", " + (65+i));
		}
		System.out.println();
		System.out.println("=============================");
		
		
		
		
		
		// a ~ z 까지의 아스키 코드 출력
		char[] arr2 = new char[26];
		
		for (int i=0; i<arr1.length; i++) {
			arr2[i] = (char) (97 + i);
			System.out.println(arr2[i] + ", " + (97+i));
		}
	}
}
