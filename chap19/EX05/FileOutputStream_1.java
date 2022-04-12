package chap19.EX05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//InputStream : 추상 클래스 	<==  FileInputstream 구현한 클래스 		<== 읽어올때
//OutputStream: 추상 클래스 	<==  FileOutputStream 구현한 클래스 	<== 쓰기 

//FileInputStream : byte() 단위 데이터 읽기.
//FileOutputStream : byte() 단위 데이터 쓰기.

//Windows 콘솔, 메모장 Enter를 넣으면 : \r\n이 엔터다 \r은 생략해도 된다.
//Mac : \n


public class FileOutputStream_1 {
	public static void main(String[] args) throws IOException {

		// 1. 입력 파일 생성 (존재하지 않음)
		File outFile = new File ("src/chap19/EX05/FileOutput1.txt");
		
		// 2. 1-byte 쓰기
		OutputStream os1 = new FileOutputStream(outFile);
			//FileOutputStream에 존재하지 않는 파일을 넣으면 실행시 생성됨.
			//FileInputStream 경로에 파일이 존재해야함. , 예외발생, 
		
		
		os1.write('J');										// write : IOException
		os1.write('A');
		os1.write('V');
		os1.write('A');
		os1.write('\r'); 	// 13	엔터 		<== 생략 가능 
		os1.write('\n');	// 10	엔터
		
			// 중요 : write() 메소드는 버퍼(메모리)에 쓰기, 버퍼가 꽉차면 파일에 쓰기 
			// 		flush(): 버퍼에 저장된 내용을 파일에 강제로 쓰기 할때 사용.
		
		os1.flush(); 	// 버퍼가 꽉차지 않더라도 강제로 파일에 쓰기를 한다. <== 생략가능, 	write()를 사용하면 flush() 사용할 것을 권장.
		os1.close();	// close() 호출시 flush()가 먼저 작동됨.
		
		// 2. n-byte 단위 쓰기 ( byte[]의 offset 부터 length 개의 byte 데이터 쓰기
		
		OutputStream os2 = new FileOutputStream(outFile);		// 덮어쓰기. 
							// FileOutPutStream(File o , Boolean append) 	append = true : 이어쓰기 ,
							// 												append = false : 덮어쓰기 (기본 값)
		
		byte[] byteArray1 = "Hello!".getBytes();	// String ---> byte로 변환, getBytes()
		
		os2.write(byteArray1);
		os2.write('\n'); 				// \r은 생략가능,	\n만 넣어도 Windows에서 Enter 처리가 됨. 
		
		os2.flush();
		os2.close();
		
		// 3. n-byte 단위 쓰기 (byte[] 의 offset 부터 length 객의 byte 데이터 쓰기.
		
		OutputStream os3 = new FileOutputStream(outFile, true); 	// 이어쓰기
		
		byte[] byteArray2 = "Better the last smile than the first laughter".getBytes();
		
		os3.write(byteArray2, 7, 8); 	// offset 7, length 8
										// write 일때 : 7byte 뒤에서 8byte 읽어서 저장
										// 주의 : read 일때는 반대로 처리/
		os3.flush();
		os3.close();
		
		
		
		
		
		
		
		
		
		
		
	}
}
