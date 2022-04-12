package chap14.Ex05;
// �ڵ� ���ҽ�(��ü) ����
	// 1. AutoCloseable �������̽��� ����
	// 2. close() �޼ҵ� ������ 

// �ʵ��� �� �Ҵ�. ������ ȣ��� �ʵ忡 ���� �ο�.

class Abc implements AutoCloseable {
	String name;
	int studentID;
	int kor;
	int eng;
	int math;
	double avg;		// ��� ���
	
	Abc (String name, int studentID, int kor, int eng, int math) {
		this.name = name; this.studentID = studentID;  this.kor = kor;
		this.eng =eng; this.math = math; 
		this.avg=(double) (kor + eng + math) / 3 ;
	}
	
	@Override
	public void close() throws Exception {
			// �ʱ�ȭ ���� �޸� ���� ��� 
				
			if (name != null || studentID != 0 || kor != 0 || eng != 0 || math != 0 || avg != 0.0) {
				name = null; studentID = 0; kor = 0; eng = 0; math = 0; avg = 0.0;
				System.out.println("���ҽ��� �����Ǿ����ϴ�.");
				
				// �ʱ�ȭ �� �޸��� ���� ��� 
			}

	}
	
}
public class Ex_TryWithResource_3 {

	public static void main(String[] args) {
		// 1. ��ü�� ��� �ʵ带 �ʱ�ȭ�ϰ� �ڵ����� close();
			try (Abc abc1 = new Abc("������",01, 50, 60, 70); ) {
				
			} catch (Exception e) {
				
			} // close() ȣ�� ���̵� �ڵ����� close()
			
			System.out.println("====================");
			
		// 2. ���� close(), finally ������� close() ȣ��
			Abc abc2 = null;
			
			try {
				abc2 = new Abc("�̼���", 22, 60, 80, 100);
			} catch (Exception e) {
				
			} finally {
				if (abc2.name != null || abc2.studentID != 0 || abc2.kor != 0 || abc2.eng != 0 || abc2.math != 0
						|| abc2.avg != 0.0) {
					
					try {
						abc2.close();
					} catch (Exception e){
						e.printStackTrace();
					}
				}
			}
	}	

}
