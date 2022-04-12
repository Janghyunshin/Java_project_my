package chap19.EX04;

/*
 	ASCII 코드 값 출력 : 1byte = 8bit, 제일 처음비트는 부호 비트, 7bit
 		1 ~ 32비트 까지는 : 출력을 할 수 없는 특수한 코드, 예) null , 헤더의 시작, 경고음(7) 개행 10, (LF)...
 		127 : delete.
 		
 		실제 출력 가능은 33번 비트 ~ 126번 비트
 		영문, 숫자, 특수문자
 		
 		출력
 		===================================
 		ASCII	문자		아스키코드	문자
 		===================================
 		33		! 		34		&
 		35		#		36		$
 		.......
 		126		~		
 */


public class Ascii_Code_Print {
	public static void main(String[] args) {

		char[] arr1 = new char[94];
//		
//		System.out.println("===================================");
//		System.out.println("ASCII\t문자\t\tASCII\t문자");
//		System.out.println("===================================");
//		for(int i=33; i < 127; i+=2) {
//			System.out.println(i + "\t" + (char)i + "\t\t" + (i+1) + "\t" + (char) (i+1));
//		}
		
		
		
		
		
//		for(int i=0; i<arr1.length; i+=2) {
//			char c1 = '!';
//			arr1[i] = (char) (c1 + i);
//			j = (i+1);
//			System.out.println((int)arr1[i] +"\t"+ (char)arr1[i]+"\t\t" +(int) arr1[j]+"\t"+ (char)arr1[j]);
//		}
		


	}
}
