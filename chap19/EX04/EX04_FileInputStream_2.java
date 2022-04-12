package chap19.EX04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

// FileInputStream
// is1: MS949 한글로 읽기 처리, throws로 처리하지말고 try(with resource) , 예외 처리.

// is2: UTF-8로 한글 읽기 처리, try 예외 처리


public class EX04_FileInputStream_2 {

	public static void main(String[] args) {
		File infile1 = new File("src\\chap19\\EX04\\files\\file-ms949.txt");
		
		int data1 = 0;
		byte [] arr1 = new byte[100];
		
		try (InputStream is1 = new FileInputStream(infile1)) {
			while ((data1 = is1.read(arr1)) != -1 ) {
				String str1  = new String(arr1, Charset.forName("MS949"));
				System.out.println(str1);
			}
			
		} catch (IOException e) {
			System.out.println("예외가 발생했습니다.");
		}
		
		System.out.println("=======================");
		
		// 2.
		File infile2 = new File("src\\chap19\\EX04\\files\\file-utf-8.txt");
		
		InputStream is2 = null;
		int data2 = 0;
		byte [] arr2 = new byte[100];
		
		try {
			is2 = new FileInputStream(infile2);
				while ((data2 = is2.read(arr2)) != -1 ) {
					String str2 = new String (arr2, Charset.forName("UTF-8"));
					System.out.println(str2);
				}
			} catch (IOException e) {
				System.out.println("예외가 발생했습니다.");
			} finally {
				
				if(is2 != null) { 		//is1_1이 null이 아닐때 객체를 메모리에서 제거
					try {
						is2.close();
					} catch (IOException e) {
					}
				}
		
			}
		
	}

}
