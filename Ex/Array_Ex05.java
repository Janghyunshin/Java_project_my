package Ex;
public class Array_Ex05 {
	public static void main(String[] args) {
		// ���� 5�� : �迭�� �̿��ؼ� 1~10���� ���� ��� �Ͻÿ�
		int[] scores = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		for (int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
			System.out.println(sum);
	}

}