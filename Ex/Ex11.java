package Ex;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		/*[���� 11] ���� �ڵ�� ���� ����� ������ ¦�� �̷絵�� 2���� �迭�� �ۼ��϶�.
		 * �׸��� ���� ���ÿ� ���� ���� �̸��� �Է¹޾� ������ ����ϴ� ���α׷��� �ۼ��϶�.
		 *  "�׸�"�� �Է¹����� �����Ѵ�. 
		 *  (Java�� �ε��� 0�� �����Ƿ� score[0]�� ���)
		 */
		Scanner sc = new Scanner(System.in);
		String course [] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int score [] = {95, 88, 76, 62, 55};
		
		while(true){
			System.out.print("���� �̸� >> ");
			String name=sc.next();
			
			if (name.equals("�׸�")) 
				break;
			else {
				for (int i=0; i<course.length; i++) {
					if(course[i].equals(name)) {
						System.out.println(course[i] + " �� ������ " + score[i]);
					}
					if(!course[i].equals(name)) {
						System.out.println("���� �����Դϴ�.");
						break;
					}
				}
				
			}
		}
		sc.close();
	}
}
