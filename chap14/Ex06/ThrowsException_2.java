package chap14.Ex06;

// �Ϲ� ���� (Checked Exception) : ������ �ܰ迡�� ����,
	// 1.  ���� ó��
	// 2. throws�� ���� (�̷��)

	// main �޼ҵ忡 throws�� ���� ��Ű�� ���, Exception�� �߻��� ��� ������ ����� �ְ� ����.


public class ThrowsException_2 {

	public static void main(String[] args) throws ClassNotFoundException {

		// ���������� ������ ���� �մϴ�. ClassNotFoundException �� �߻����� �ʴ´�.
		Class cls = Class.forName("java.lang.Object");
		
		// ���������� ������ ���� ���� �ʴ´�. ClassNotFoundException �� �߻�
		Class cls2 = Class.forName("java.lang.Object00");
		
	}

}
