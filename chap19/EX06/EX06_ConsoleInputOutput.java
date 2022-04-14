package chap19.EX06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

// �ֿܼ��� �迭 100 byte ����  �ѱ��� ��ǲ ���� ���� Input.txt�� ���� �� (Charset�� default)
// input.txt ���Ͽ��� ���� �о �ܼ�(system.out)�� ����ؼ� �ֿܼ� ��� 
// ��Ʈ: 
	//1. System.in : �ֿܼ��� ��ǲ
	//2. FileOutputStream : ��ǲ���� ���� ���Ͽ� ����
	//3. FileInputStream : ����� ������ ������ �о�´�.
	//4. system.out : �ֿܼ� ��� 

// �Ϸ�ð� : 6:20�б��� ���ܴ� throws ó��


public class EX06_ConsoleInputOutput {
	public static void main(String[] args) throws IOException {
		
		// 1. System.in : �ֿܼ��� �ѱ��� ��ǲ
		InputStream is = System.in; 	// new�� �������� �ʰ� ���Ḹ ����, �ֿܼ��� ��ǲ ���� �޴´�.
		
		System.out.println("�ѱ��� �Է��ϼ��� >>> ");
		
		byte[] byteArray1 = new byte[100];
		int count1 = is.read(byteArray1); 	// byteArray1�� byte�� \r \n 	, count1 �迭�� ���� ���� ����,   
		// int data = is.read(); // �ѱ��� ó������ ���Ѵ�, data���� 1bytee read�� ���� ���� .

		//�� ���
//		String str1 = new String(byteArray1, 0, count1, Charset.defaultCharset());
//		System.out.println(str1);
		
		// 2. FileOutputStream : ��ǲ���� ���� ���Ͽ� ���� 
		File outFile = new File ("src/chap19/EX06/input.txt");
		OutputStream os1 = new FileOutputStream(outFile); 	// ���� ���� 
		
		os1.write(byteArray1);	// ���� (RAM)���� ������
		os1.flush();			// ���ۿ� ���� ������ ���Ͽ� ����
	
		
		// 3. FileInputStream : ����� ���Ͽ��� ���� �о�´�. 
//		File inFile = new File ("src/chap19/EX06/input.txt");
		InputStream is1 = new FileInputStream(outFile); 	// read() : �ѱ��� ó�� ���Ѵ�. read(byte[]) : �ѱ� ó��.
		byte[] byteArray2 = new byte[100];
		
		int count2 = is1.read(byteArray2);	// read(byte[]) : �ѱ�ó�� 
		// int data2 = fis.read();			// read() : 1-byte �� ó�� 
//		System.out.println(new String (byteArray2, 0, count2, Charset.defaultCharset()));
		
		System.out.println();
		System.out.println("���Ͽ��� ���� ������ �ֿܼ� ����մϴ�. >>>>");
		System.out.println();
		
		// 4. system.out : �о�� �迭�� �ֿܼ� ��� 
	
		OutputStream os2 = System.out; 	// �ֿܼ� ��� : byte[]
		
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
