package chap19.EX08;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

/*
 	Application Default :MS949
 	
 	reader/writer의 하위 클래스를 사용하세요.
 	
 	1. 콘솔에서 한글을 읽어서
 	
 	C:\\Temp\\a\\aaa.txt (MS949)
 	C"\\Temp\\b\\bbb.txt (UTF-8)
 	파일에 쓰세요
 	
 	- a, b 폴더는 Application 에서 생성 하세요
 	
 	2. 파일에서 읽은 내용을 콘솔에 깨짐 없이 출력하ㅔㅅ요.
 	
 */

public class EX_Reader_Writer {
	public static void main(String[] args) {
		
//		File tempDir = new File("C:\\Temp\\a");
//		if (!tempDir.exists())	{		// 해당 경로에 파일이나 폴더가 존재하면 true, false(x)
//			tempDir.mkdir();}			// 폴더 생성 명령어.
//		
//		File tempDir2 = new File("C:\\Temp\\b");
//		if (!tempDir2.exists())	{		// 해당 경로에 파일이나 폴더가 존재하면 true, false(x)
//			tempDir2.mkdir();}			// 폴더 생성 명령어.
//		
		File aaa = new File("C:\\Temp\\a\\aaa.txt");
		File bbb = new File("C:\\Temp\\b\\bbb.txt");
		
		// 1. 콘솔에서 한글을 읽기
		int data = 0 ;
		
//		byte[] byteArray1 = new byte[100];
		
		try (
				InputStreamReader isr = new InputStreamReader(System.in,"MS949"); ){
			
			
			System.out.println("한글을 입력 하세요 >>> ");
			
		
			if (  ((data = isr.read()) != -1 )) {
				System.out.print((char) data);
			} 
//
//			while ( (data = isr.read()) != -1 ) {
//				System.out.print((char) data);
//			}		
//			System.out.println(isr.getEncoding());
			
		} catch (Exception e) {}
		
		
		// 2. C:\\Temp\\a\\aaa.txt (MS949) 파일에 쓰기
		
		try (	InputStreamReader isr = new InputStreamReader(System.in);
				Writer writer = new FileWriter("C:\\Temp\\a\\aaa.txt"); ){
		
			writer.write((char) data);
			writer.flush();
			
		} catch (IOException e1) {}
		
		
		// 3. C:\\Temp\\b\\bbb.txt (MS949) 파일에 쓰기
		
		try {	InputStreamReader isr = new InputStreamReader(System.in);
				OutputStream os = new FileOutputStream("C:\\Temp\\b\\bbb.txt");
				OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");		
				
			os.write((char) data);
			os.flush();
			
		} catch (Exception e) {}
		
		
		// 2.  파일에서 읽은 내용을 콘솔에 깨짐 없이 출력하세요.
		
	}
}
