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
		
		// 1. System.in : 콘솔에서 인풋
		InputStream is = System.in;
		
		System.out.println("한글을 입력하세요 >>> ");
		byte[] byteArray1 = new byte[100];
		
		int count1 = is.read(byteArray1);
		String str1 = new String(byteArray1, 0, count1, Charset.defaultCharset());
		System.out.println(str1);
		is.close();
		
		// 2. FileOutputStream : 인풋받은 값을 파일에 저장 
		File outFile = new File ("src/chap19/EX06/input.txt");
		OutputStream os1 = new FileOutputStream(outFile);
		str1.getBytes(Charset.defaultCharset());
		os1.write(byteArray1);
		os1.write('\n');
		
		os1.flush();
		os1.close();
	
		
		// 3. FileInputStream : 저장된 파일의 내용을 읽어온다. 
		File inFile = new File ("src/chap19/EX06/input.txt");
		InputStream is1 = new FileInputStream(inFile);
		byte[] byteArray2 = new byte[100];
		
		int count2;
		
		count2 = is1.read(byteArray2);		// 배열 내부에 \r\n 들어간다.
		System.out.println(new String (byteArray2, 0, count2, Charset.defaultCharset()));
		is1.close();
		
		// 4. system.out : 콘솔에 출력 
	
		OutputStream os2 = System.out;
		String str2 = new String (byteArray2, Charset.defaultCharset());
		str2.getBytes(Charset.defaultCharset());
		os2.write(byteArray2);
		os2.flush();
		os2.close();
	}

}
