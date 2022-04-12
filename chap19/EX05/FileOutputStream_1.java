package chap19.EX05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//InputStream : �߻� Ŭ���� 	<==  FileInputstream ������ Ŭ���� 		<== �о�ö�
//OutputStream: �߻� Ŭ���� 	<==  FileOutputStream ������ Ŭ���� 	<== ���� 

//FileInputStream : byte() ���� ������ �б�.
//FileOutputStream : byte() ���� ������ ����.

//Windows �ܼ�, �޸��� Enter�� ������ : \r\n�� ���ʹ� \r�� �����ص� �ȴ�.
//Mac : \n


public class FileOutputStream_1 {
	public static void main(String[] args) throws IOException {

		// 1. �Է� ���� ���� (�������� ����)
		File outFile = new File ("src/chap19/EX05/FileOutput1.txt");
		
		// 2. 1-byte ����
		OutputStream os1 = new FileOutputStream(outFile);
			//FileOutputStream�� �������� �ʴ� ������ ������ ����� ������.
			//FileInputStream ��ο� ������ �����ؾ���. , ���ܹ߻�, 
		
		
		os1.write('J');										// write : IOException
		os1.write('A');
		os1.write('V');
		os1.write('A');
		os1.write('\r'); 	// 13	���� 		<== ���� ���� 
		os1.write('\n');	// 10	����
		
			// �߿� : write() �޼ҵ�� ����(�޸�)�� ����, ���۰� ������ ���Ͽ� ���� 
			// 		flush(): ���ۿ� ����� ������ ���Ͽ� ������ ���� �Ҷ� ���.
		
		os1.flush(); 	// ���۰� ������ �ʴ��� ������ ���Ͽ� ���⸦ �Ѵ�. <== ��������, 	write()�� ����ϸ� flush() ����� ���� ����.
		os1.close();	// close() ȣ��� flush()�� ���� �۵���.
		
		// 2. n-byte ���� ���� ( byte[]�� offset ���� length ���� byte ������ ����
		
		OutputStream os2 = new FileOutputStream(outFile);		// �����. 
							// FileOutPutStream(File o , Boolean append) 	append = true : �̾�� ,
							// 												append = false : ����� (�⺻ ��)
		
		byte[] byteArray1 = "Hello!".getBytes();	// String ---> byte�� ��ȯ, getBytes()
		
		os2.write(byteArray1);
		os2.write('\n'); 				// \r�� ��������,	\n�� �־ Windows���� Enter ó���� ��. 
		
		os2.flush();
		os2.close();
		
		// 3. n-byte ���� ���� (byte[] �� offset ���� length ���� byte ������ ����.
		
		OutputStream os3 = new FileOutputStream(outFile, true); 	// �̾��
		
		byte[] byteArray2 = "Better the last smile than the first laughter".getBytes();
		
		os3.write(byteArray2, 7, 8); 	// offset 7, length 8
										// write �϶� : 7byte �ڿ��� 8byte �о ����
										// ���� : read �϶��� �ݴ�� ó��/
		os3.flush();
		os3.close();
		
		
		
		
		
		
		
		
		
		
		
	}
}