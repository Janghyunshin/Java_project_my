package Ex;
public class Ex04 {
	public static void main(String[] args) {
		/* ����4. for ���� �̿��ؼ� �������� ���� �ﰢ���� ����ϴ� �ڵ带 �ۼ�
		 * for ���� �̿��ؼ� ���� ����� ���� �ﰢ���� ����ϴ� �ڵ� �ۼ�
		 * *
		 * **
		 * ***
		 * ****
		 */
		for (int i=1; i<5; i++) {
			for (int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
