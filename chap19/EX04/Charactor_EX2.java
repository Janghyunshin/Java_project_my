package chap19.EX04;
/*
 * p.jangwoo@gmail.com , ��������׵� ����, �Ϸ�ð� 11:45
 * ��Ʈ : �迭�� �� 26�� �����ؼ� for���� ����ؼ� ���

 A ~ Z ������ �ƽ�Ű �ڵ尪 ���
 
 =====================
 ��� ���
 A, 65
 B, 66
 ....
 Z, 90
 
  =====================
 a ~ z ������ �ƽ�Ű �ڵ� ��� 
  
 ��� ���
 a, 97
 b, 98
 ....
 z,
 */

public class Charactor_EX2 {
	public static void main(String[] args) {
		// A ~ Z������ �ƽ�Ű �ڵ� ���
		char[] arr1 = new char[26];
		
	
		for (int i=0; i<arr1.length; i++) {
			arr1[i] = (char) (65 + i);
			System.out.println(arr1[i] + ", " + (65+i));
		}
		System.out.println();
		System.out.println("=============================");
		
		
		
		
		
		// a ~ z ������ �ƽ�Ű �ڵ� ���
		char[] arr2 = new char[26];
		
		for (int i=0; i<arr1.length; i++) {
			arr2[i] = (char) (97 + i);
			System.out.println(arr2[i] + ", " + (97+i));
		}
	}
}
