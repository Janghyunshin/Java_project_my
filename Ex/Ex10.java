package Ex;
public class Ex10 {
	public static void main(String[] args) {
		/* ���� 10. �ݺ����� �̿��Ͽ� 369 ���ӿ��� �ڼ��� �ľ� �ϴ� ��츦
		 * ������� ȭ�鿡 ����غ���. 1���� �����ϸ� 99������ �Ѵ�.
		 */
		for (int i=1; i<=99; i++) {
			if (i % 10 == 3 || i % 10 == 6|| i % 10 == 9) {
				if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9) //||�� or
					System.out.println(i + " �ڼ� ¦¦");
				else
					System.out.println(i + " �ڼ� ¦");
			}
			else if(i / 10 == 3 || i / 10 == 6 || i / 10 == 9)
				System.out.println(i + " �ڼ� ¦");
		}
	}
}
