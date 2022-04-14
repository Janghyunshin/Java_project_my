package chap19.EX06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

// 콘솔에서 배열 100 byte 이하  한글을 인풋 받은 값을 Input.txt로 저장 후 (Charset은 default)
// input.txt 파일에서 값을 읽어서 콘솔(system.out)을 사용해서 콘솔에 출력 
// 힌트: 
	//1. System.in : 콘솔에서 인풋
	//2. FileOutputStream : 인풋받은 값을 파일에 저장
	//3. FileInputStream : 저장된 파일의 내용을 읽어온다.
	//4. system.out : 콘솔에 출력 

// 완료시간 : 6:20분까지 예외는 throws 처리


public class EX06_ConsoleInputOutput {
	public static void main(String[] args) throws IOException {
		
		// 1. System.in : 콘솔에서 한글을 인풋
		InputStream is = System.in; 	// new로 생성하지 않고 연결만 설정, 콘솔에서 인풋 값을 받는다.
		
		System.out.println("한글을 입력하세요 >>> ");
		
		byte[] byteArray1 = new byte[100];
		int count1 = is.read(byteArray1); 	// byteArray1에 byte로 \r \n 	, count1 배열에 값이 들어온 갯수,   
		// int data = is.read(); // 한글을 처리하지 못한다, data에는 1bytee read한 값이 저장 .

		//내 답안
//		String str1 = new String(byteArray1, 0, count1, Charset.defaultCharset());
//		System.out.println(str1);
		
		// 2. FileOutputStream : 인풋받은 값을 파일에 저장 
		File outFile = new File ("src/chap19/EX06/input.txt");
		OutputStream os1 = new FileOutputStream(outFile); 	// 덮어 쓰기 
		
		os1.write(byteArray1);	// 버퍼 (RAM)에만 쓰여짐
		os1.flush();			// 버퍼에 쓰인 내용을 파일에 쓰기
	
		
		// 3. FileInputStream : 저장된 파일에서 값을 읽어온다. 
//		File inFile = new File ("src/chap19/EX06/input.txt");
		InputStream is1 = new FileInputStream(outFile); 	// read() : 한글을 처리 못한다. read(byte[]) : 한글 처리.
		byte[] byteArray2 = new byte[100];
		
		int count2 = is1.read(byteArray2);	// read(byte[]) : 한글처리 
		// int data2 = fis.read();			// read() : 1-byte 씩 처리 
//		System.out.println(new String (byteArray2, 0, count2, Charset.defaultCharset()));
		
		System.out.println();
		System.out.println("파일에서 읽은 내용을 콘솔에 출력합니다. >>>>");
		System.out.println();
		
		// 4. system.out : 읽어온 배열을 콘솔에 출력 
	
		OutputStream os2 = System.out; 	// 콘솔에 출력 : byte[]
		
//		String str2 = new String (byteArray2, Charset.defaultCharset());
//		str2.getBytes(Charset.defaultCharset());
		
		os2.write(byteArray2);
		os2.flush();
		
		is.close();
		is1.close();
		os1.close();
		os2.close();
	}

}
