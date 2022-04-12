package chap19.EX03;

import java.io.UnsupportedEncodingException;

// UTF-16 고정 길이 : 한글, 영문 모두 2byte로 표기
// UTF-8 가변 길이 : 영어 : 1byte, 한글 : 3byte

public class UTF16_VS_UTF8 {
	public static void main(String[] args) throws UnsupportedEncodingException {

		byte[] b1 = "abc".getBytes("UTF-16");	// 문자열을 ==> byte[] (throws로 예외 미뤄둠)
				// BOM 식별 코드 2byte
				// abc : 6byte
		
		byte[] b2 = "abc".getBytes("UTF-8");
		
		System.out.println(b1.length);	// 8 : BOM(2) + 6(abc)
		System.out.println(b2.length);	// 3 
		
		System.out.println(new String (b1, "UTF-16"));
		System.out.println(new String (b2, "UTF-8"));
		
		for (byte b : b1) {
			System.out.printf("%02X" , b); 	// 16진수로 출력
			System.out.println();
		}
		System.out.println("===========================");
		
		
		for (byte b : b2) {
			System.out.printf("%02X" , b); 
			System.out.println();
		}
		System.out.println("===========================");
		
		byte[] b3 = "가나다".getBytes("UTF-16");
		byte[] b4 = "가나다".getBytes("UTF-8");
		
		System.out.println(b3.length); 	// 8   // BOM(2byte) + 2byte
		System.out.println(b4.length);	// 9   // 한글 3byte
		
		for (byte b : b3) {
			System.out.printf("%02X", b);
		}
		System.out.println();
		
		for (byte b : b4) {
			System.out.printf("%02X", b);
		}
		System.out.println();
		
		System.out.println(new String (b3, "UTF-16"));
		System.out.println(new String (b4, "UTF-8"));
		
		
	}
}
