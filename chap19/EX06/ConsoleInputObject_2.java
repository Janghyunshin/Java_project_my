package chap19.EX06;

import java.io.IOException;
import java.io.InputStream;

public class ConsoleInputObject_2 {

	public static void main(String[] args) throws IOException {
		
		InputStream is = System.in; 	// 콘솔을 통해서 인풋을 받겠다.
		
		System.out.println("영문만 입력하세요 >>>");
		
		// 1. 1-byte 단위 읽기
		int data;
		while ((data = is.read()) != '\r' ) {		//  '\r' 까지
			System.out.print((char)data);
		}
		is.read(); 	//10 <== \n
		
		System.out.println();
		System.out.println();
		System.out.println("=================================");
		
		// 2. n-byte 읽기 ( byte[]의 처음 위치에서 읽은 데이터 저장)
		byte[] byteArray1 = new byte [100];
		int count1 = is.read(byteArray1); 		// count1은 100, 100, 30, -1		
		
		for(int i = 0 ; i < count1; i++) {
			System.out.println((char) byteArray1[i]);
			System.out.println(" : count1 = " + count1 );
		}
	}

}
