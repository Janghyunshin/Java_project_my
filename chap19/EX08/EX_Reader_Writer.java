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
 	
 	reader/writer�� ���� Ŭ������ ����ϼ���.
 	
 	1. �ֿܼ��� �ѱ��� �о
 	
 	C:\\Temp\\a\\aaa.txt (MS949)
 	C"\\Temp\\b\\bbb.txt (UTF-8)
 	���Ͽ� ������
 	
 	- a, b ������ Application ���� ���� �ϼ���
 	
 	2. ���Ͽ��� ���� ������ �ֿܼ� ���� ���� ����ϤĤ���.
 	
 */

public class EX_Reader_Writer {
	public static void main(String[] args) {
		
//		File tempDir = new File("C:\\Temp\\a");
//		if (!tempDir.exists())	{		// �ش� ��ο� �����̳� ������ �����ϸ� true, false(x)
//			tempDir.mkdir();}			// ���� ���� ��ɾ�.
//		
//		File tempDir2 = new File("C:\\Temp\\b");
//		if (!tempDir2.exists())	{		// �ش� ��ο� �����̳� ������ �����ϸ� true, false(x)
//			tempDir2.mkdir();}			// ���� ���� ��ɾ�.
//		
		File aaa = new File("C:\\Temp\\a\\aaa.txt");
		File bbb = new File("C:\\Temp\\b\\bbb.txt");
		
		// 1. �ֿܼ��� �ѱ��� �б�
		int data = 0 ;
		
//		byte[] byteArray1 = new byte[100];
		
		try (
				InputStreamReader isr = new InputStreamReader(System.in,"MS949"); ){
			
			
			System.out.println("�ѱ��� �Է� �ϼ��� >>> ");
			
		
			if (  ((data = isr.read()) != -1 )) {
				System.out.print((char) data);
			} 
//
//			while ( (data = isr.read()) != -1 ) {
//				System.out.print((char) data);
//			}		
//			System.out.println(isr.getEncoding());
			
		} catch (Exception e) {}
		
		
		// 2. C:\\Temp\\a\\aaa.txt (MS949) ���Ͽ� ����
		
		try (	InputStreamReader isr = new InputStreamReader(System.in);
				Writer writer = new FileWriter("C:\\Temp\\a\\aaa.txt"); ){
		
			writer.write((char) data);
			writer.flush();
			
		} catch (IOException e1) {}
		
		
		// 3. C:\\Temp\\b\\bbb.txt (MS949) ���Ͽ� ����
		
		try {	InputStreamReader isr = new InputStreamReader(System.in);
				OutputStream os = new FileOutputStream("C:\\Temp\\b\\bbb.txt");
				OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");		
				
			os.write((char) data);
			os.flush();
			
		} catch (Exception e) {}
		
		
		// 2.  ���Ͽ��� ���� ������ �ֿܼ� ���� ���� ����ϼ���.
		
	}
}
