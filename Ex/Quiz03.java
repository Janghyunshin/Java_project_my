package Ex;
				// �ڹٴ� ���� ����� �Ұ� ,
class Student { // �θ� Ŭ���� , ��� Ŭ������ Object Ŭ������ ��� �մϴ�.
				//
	String name;			// �л��̸�
	int studentID;			// �й�
	int kor;				// ��������
	int eng;				// ��������
	int math;				// ��������
	
	int sum;				// ���� ��
	double avg;				// ���� ���
	
	void hobby () {
		System.out.println("�� �л��� ��̴� �Դϴ�.");
	}

	@Override
	public String toString() {		// Object Ŭ������ �޼ҵ�, ��ü ��ü�� ����� ��  , [��Ű����.Ŭ������@�ؽ��ڵ� 
		return "�̸� : " + name + " , �й� : " + studentID + " , ����: " + kor + " , ����: " +eng +
				" , ����: " + math + " , �հ� : " + sum + " , ���: " + avg + " �Դϴ�.";
	}
	
	
}

class S_ö�� extends Student {
	
	S_ö�� () {} // ������: 1. Ŭ������� ����, 2. ����Ÿ���� ����� �Ѵ�.
	
	S_ö�� (String a, int b, int c, int d, int e) {	// ������ : ��ü�� �����Ҷ� �޸��� �ʱⰪ�� �Ҵ� �Ҷ� ���.
		super.name = a;				// super : �θ�(super) Ŭ����,  this: �ڱ��ڽ��� ��ü
		super.studentID = b;
		super.kor = c;
		super.eng = d;
		super.math = e;
		
		super.sum = c + d + e;
		super.avg = (double) sum / 3; 	// ����� ��� �Ҷ��� (double)�� ĳ����
	}
	
	@Override
	void hobby() {
		System.out.println("ö���� ��̴� ���� �Դϴ�.");
	}
}

class S_���� extends Student {
	
	S_���� () {}
	
	S_���� (String a, int b, int c, int d, int e) {
		super.name = a;
		super.studentID = b;
		super.kor = c;
		super.eng = d;
		super.math = e;
		super.sum = c + d + e;
		super.avg = (double) (c + d + e) / 3;
	}

	@Override
	void hobby() {
		System.out.println("������ ��̴� ���� �Դϴ�.");
	}
}

class S_���� extends Student {
	
	S_���� () {}
	
	S_���� (String a, int b, int c, int d, int e) {	//������
		super.name = a;
		super.studentID = b;
		super.kor = c;
		super.eng = d;
		super.math = e;
		super.sum = c + d + e;
		super.avg = (double) (c + d + e) / 3;
	}

	@Override
	void hobby() {
		System.out.println("������ ��̴� �౸ �Դϴ�.");	
	}
}

public class Quiz03 {

	public static void main(String[] args) {

		Student cs2 = new S_ö��("ö��", 01, 55, 70, 85);
		Student yh2 = new S_����("����", 02, 75, 80, 85);
		Student ys2 = new S_����("����", 03, 100, 90, 80);
		
		Student[]arr2 = {cs2,yh2,ys2}; // �迭ȭ 
		
		//for��
		for (int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
			arr2[i].hobby();
		}
		
		System.out.println("============================");
		
		for (Student g : arr2) {
			System.out.println(g);
			g.hobby();
		}
		
	}

}
