package Ex;
public class Max_Ex06 {
	public static void main(String[] args) {
		// �־��� �迭�� �׸񿡼� �ִ밪�� ���غ����� (for ���� �̿��ϼ���)
		int max = 0;
		int[] array= {4,5,1,2,3};
		// �ۼ���ġ
		for (int i = 0; i<array.length; i++) {
			if (max<array[i]) {
			max = array[i];
			}
		}
		System.out.println("max : " + max);
	}
}
