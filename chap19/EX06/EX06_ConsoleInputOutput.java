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
		
		// 1. System.in : �ֿܼ��� ��ǲ
		InputStream is = System.in;
		
		System.out.println("�ѱ��� �Է��ϼ��� >>> ");
		byte[] byteArray1 = new byte[100];
		
		int count1 = is.read(byteArray1);
		String str1 = new String(byteArray1, 0, count1, Charset.defaultCharset());
		System.out.println(str1);
		is.close();
		
		// 2. FileOutputStream : ��ǲ���� ���� ���Ͽ� ���� 
		File outFile = new File ("src/chap19/EX06/input.txt");
		OutputStream os1 = new FileOutputStream(outFile);
		str1.getBytes(Charset.defaultCharset());
		os1.write(byteArray1);
		os1.write('\n');
		
		os1.flush();
		os1.close();
	
		
		// 3. FileInputStream : ����� ������ ������ �о�´�. 
		File inFile = new File ("src/chap19/EX06/input.txt");
		InputStream is1 = new FileInputStream(inFile);
		byte[] byteArray2 = new byte[100];
		
		int count2;
		
		count2 = is1.read(byteArray2);		// �迭 ���ο� \r\n ����.
		System.out.println(new String (byteArray2, 0, count2, Charset.defaultCharset()));
		is1.close();
		
		// 4. system.out : �ֿܼ� ��� 
	
		OutputStream os2 = System.out;
		String str2 = new String (byteArray2, Charset.defaultCharset());
		str2.getBytes(Charset.defaultCharset());
		os2.write(byteArray2);
		os2.flush();
		os2.close();
	}

}
