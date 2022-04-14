package chap19.EX07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

//PrintStream: Filter Stream (�߰� ����� �����ϴ� Stream) , ��� ��Ʈ���� �ʿ�
 	// �پ��� ������� ��¿� Ưȭ�� ��Ʈ���̴�.. flush()�� ȣ������ �ʾƵ� �ڵ����� flush()
	// println(), print(), printf()
	// ���� ���, �ܼ� ���, ... 


public class PrintStreamExample {
	public static void main(String[] args) {
		//1. File ��ü ����.
		File outfile1 = new File("src\\chap19\\EX07\\printstream1.txt");
		File outfile2 = new File("src\\chap19\\EX07\\printstream2.txt");
		
		//2. PrintStream (FileOutputStream(File))	<== ���Ͽ� ��� 
		
		try (	OutputStream os1 = new FileOutputStream(outfile1);
				PrintStream ps = new PrintStream(os1); ){			// Filter ��Ʈ�� (�߰������ ���� ) , ��� ��Ʈ���� �ʿ�.
				
			ps.println(5.8); 	// double ���			<== ����� ���� ����
			ps.print( 3 + " �ȳ� " + 12345 + "\n" );		//<== ����� ���� ����(x)
			ps.printf("%d �� ȣ��Ǿ����ϴ�. \n ", 7);			// "%d" : int ���� ȣ��
			ps.printf("%s %f", "�ȳ�", 5.8);				// %s :  string ȣ��, %f : double ȣ��
			
			// ps.flush() <== �ڵ����� ȣ��
		
		} catch (Exception e) {}
		
		// 3. PrintStream(File) 	<== ���Ͽ� ���			
		
		try (	PrintStream ps = new PrintStream(outfile2); ){
			
			ps.println(5.8); 	// double ���			<== ����� ���� ����
			ps.print( 3 + " �ȳ� " + 12345 + "\n" );		//<== ����� ���� ����(x)
			ps.printf("%d �� ȣ��Ǿ����ϴ�. \n ", 7);			// "%d" : int ���� ȣ��
			ps.printf("%s %f", "�ȳ�", 5.8);				// %s :  string ȣ��, %f : double ȣ��
			
		} catch (FileNotFoundException e) {
			
		}
	
		//4. PrintStream ps = System.out ;	<== �ֿܼ� ���

		try (
				OutputStream os2 = System.out;
				PrintStream ps = new  PrintStream(os2); ){
			
			ps.println(5.8); 	// double ���			<== ����� ���� ����
			ps.print( 3 + " �ȳ� " + 12345 + "\n" );		//<== ����� ���� ����(x)
			ps.printf("%d �� ȣ��Ǿ����ϴ�. \n ", 7);			// "%d" : int ���� ȣ��
			ps.printf("%s %f", "�ȳ�", 5.8);				// %s :  string ȣ��, %f : double ȣ��
			
		} catch (Exception e) { }
		
		System.out.println("===============================");

		
		//5. PrintStream ps = System.out ;	<== �ֿܼ� ���
		try (
				PrintStream ps = System.out; ){
			
			ps.println(5.8); 	// double ���			<== ����� ���� ����
			ps.print( 3 + " �ȳ� " + 12345 + "\n" );		//<== ����� ���� ����(x)
			ps.printf("%d �� ȣ��Ǿ����ϴ�. \n ", 7);			// "%d" : int ���� ȣ��
			ps.printf("%s %f", "�ȳ�", 5.8);				// %s :  string ȣ��, %f : double ȣ��
			
		} catch (Exception e) { }
		
	}
}
