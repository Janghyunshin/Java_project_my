package Ex;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		/* [���� 12] ��ǻ�Ϳ� ���� ������ ���� ���� �� ������ ������.
		 * ���ô� ���� �׸��� ����. ���ں��� ���� �����Ѵ�.
		 * ���ڰ� ���� ���� �� �� �ϳ��� �Է��ϰ� <Enter>Ű�� ġ��,
		 * ���α׷��� ���� ���� �� �߿��� �����ϰ� �ϳ��� �����ϰ� ��ǻ�Ͱ� �� ������ �Ѵ�.
		 * ���ڰ� �Է��� ���� �����ϰ� ������ ���� ���Ͽ� ���� �̰���� �Ǵ��Ѵ�.
		 * ���ڰ� ���� ���� �� ��� "�׸�"�� �Է��ϸ� ������ ������.
		 */
		Scanner sc = new Scanner(System.in);
		
		String str[] = {"����","����","��"};
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		
		while (true) {
			int i = (int)(Math.random()*3);
			System.out.println("���� ���� ��! >>");
			String name = sc.next(); 
			
			if(name.equals("�׸�")) {
				System.out.println("������ �����մϴ�...");
					break;
			}
			
			System.out.print("����� = " + name + ", ��ǻ�� = " + str[i]);
			if (name.equals("����")) {
				if(str[i].equals("����")) {
					System.out.println(" �����ϴ�.");
				}
				else if(str[i].equals("����")) {
					System.out.println(" ��ǻ�Ͱ� �̰���ϴ�.");
				}
				else if(str[i].equals("��")) {
					System.out.println(" ����ڰ� �̰���ϴ�.");
				}	
			}
			else if (name.equals("����")) {
				if(str[i].equals("����")) {
					System.out.println(" ����ڰ� �̰���ϴ�.");
				}
				else if(str[i].equals("����")) {
					System.out.println(" �����ϴ�.");
				}
				else if(str[i].equals("��")) {
					System.out.println(" ��ǻ�Ͱ� �̰���ϴ�.");
				}
			}
			else if (name.equals("��")) {
				if(str[i].equals("����")) {
					System.out.println(" ��ǻ�Ͱ� �̰���ϴ�.");
				}
				else if(str[i].equals("����")) {
					System.out.println(" ����ڰ� �̰���ϴ�.");
				}
				else if(str[i].equals("��")) {
					System.out.println(" �����ϴ�.");
				}
			}
		}
		sc.close();
	}
}
