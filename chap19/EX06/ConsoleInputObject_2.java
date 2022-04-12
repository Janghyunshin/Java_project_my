package chap19.EX06;

import java.io.IOException;
import java.io.InputStream;

public class ConsoleInputObject_2 {

	public static void main(String[] args) throws IOException {
		
		InputStream is = System.in; 	// �ܼ��� ���ؼ� ��ǲ�� �ްڴ�.
		
		System.out.println("������ �Է��ϼ��� >>>");
		
		// 1. 1-byte ���� �б�
		int data;
		while ((data = is.read()) != '\r' ) {		//  '\r' ����
			System.out.print((char)data);
		}
		is.read(); 	//10 <== \n
		
		System.out.println();
		System.out.println();
		System.out.println("=================================");
		
		// 2. n-byte �б� ( byte[]�� ó�� ��ġ���� ���� ������ ����)
		byte[] byteArray1 = new byte [100];
		int count1 = is.read(byteArray1); 		// count1�� 100, 100, 30, -1		
		
		for(int i = 0 ; i < count1; i++) {
			System.out.println((char) byteArray1[i]);
			System.out.println(" : count1 = " + count1 );
		}
	}

}
