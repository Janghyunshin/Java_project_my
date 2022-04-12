package chap14.Ex03;

public class Multicatch_2 {

	public static void main(String[] args) {
		
		// 1. Exception���� ��� ���ܸ� ó�� �� �� �ִ�.
			// ��� ���ܴ� Exception�� ��� �޴´�.
		
		try {
			System.out.println( 10/0 );
			int num = Integer.parseInt("10A");
		} catch (Exception e) {
			//try {} ������� �߻��ϴ� ��� ���ܴ� Exception Ŭ������ ��� ó��
			System.out.println("���� ó�� (Exception) ");
		}
		
		// 2. catch ����� ������ �߸��� ��� : Exception�� catch�� �������� ��ġ �ؾ� �Ѵ�. 
		
		/*
		try {
			System.out.println( 10/0 );
			int num = Integer.parseInt("10A");
		} catch (Exception e) {
			//try{} ������� �߻��ϴ� ��� ���ܴ� Exception Ŭ������ ��� ó��
		} catch (ArithmeticException e) {
			
		} catch (NumberFormatException e) {
			
		}
		*/
		
		// 3. catch ����� �ùٸ� ���� : �ֻ��� Exception�� catch ����� �������� ��ġ
		
		System.out.println("���α׷� ����");
		
		try {
			System.out.println( 10/0 );
			int num = Integer.parseInt("10A");
			
		} catch (ArithmeticException e) {		// ��������
			
		} catch (NumberFormatException e) {
			
		} catch (Exception e) {					// �ֻ��� �θ��� Exception�� �������� ��ġ

		}
		
		// 4. �������� exception�� �����ؼ� ����
		
		try {
			System.out.println( 10/0 );
			int num = Integer.parseInt("10A");
			
		} catch (ArithmeticException | NumberFormatException e) {
			// �������� exception�� ����
			
		} catch (Exception e) {
			
		}
		
		
		
	}

}
