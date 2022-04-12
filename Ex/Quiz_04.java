package Ex;

class E extends Object {	// �ڹ��� ��� Ŭ������ Object�� �ڽ� Ŭ���� �̴�.
									// Object Ŭ������ ���ǵ� �޼ҵ带 ����� �� �ִ�.
	String name;
	E () {}					// �⺻ ������ : Ŭ�������� �ٸ� �����ڰ� ���� �Ҷ� �ܺο��� �⺻�����ڸ� ȣ���Ҷ�
							// �����Ǹ� �ȵȴ�.
	E (String name) {
		this.name = name;	// �Ű����� �̸�, �����ο��� �Ű������� �޴� ������, �ʵ��� �������� ��� ����
	}							//this: �ڽ��� ��ü
	
	
	@Override
		public String toString() {		// ��ü ��ü�� ��½� toString()�� ȣ��
		
			return "�̸� : " + name;		//this.name	, 
		}
	
	@Override
		public boolean equals(Object obj) {		// e2.equals(a3);, ��ĳ���õ�
		
			if (this.name == ((E) obj).name) {	// �� ��ü�� name �ʵ��� ���� ��
				return true;
			} else {
				return false;
			}
		}

}

class Student2 {
	int studentID;
	String name;
	int kor;
	int eng;
	
	Student2(int studentID, String name, int kor, int eng) {
		this.studentID = studentID;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		
	}
	@Override
	public boolean equals(Object obj) {
		if(this.studentID == ((Student2)obj).studentID) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		return studentID + "," + name + "," + kor + "," + eng ;
	}
	
}
	


public class Quiz_04 {

	public static void main(String[] args) {
		Student2 s1 = new Student2(1111, "ȫ�浿", 90, 80);
		Student2 s2 = new Student2(1233, "�輺��", 100, 100);
		Student2 s3 = new Student2(1234, "������", 80, 90);
		Student2 s4 = new Student2(1111, "�����", 85, 95);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		System.out.println(s1.equals(s4)); 		//true	
		/* studentID�� ���� ��� ���� �л��̴� ��� ���
		��ü�� studentID �÷��� ���ؼ� ���� ��� ���� �л��̴� ��� ���
			 == : �⺻Ÿ�� : boolean, byte, short, int, long, double, float, char : 8��
					 ���� ��.
					 ����Ÿ���� ��� : ��ü�� �ּҸ� ��. �迭, ��ü, String (Ư���ϰ� ���)
					 	String : toString() ������ �Ǿ� �ִ�. equals (������)
					 	object�� toString() - ��ü ��ü�� println(a), ��Ű���̸�.Ŭ������@�ؽ��ڵ�
					 			//�������̵� �ؼ� ��ü�� �ʵ��� ������ ���
					 	, equals() :  == �� ����. , ��ü�� �ּҸ� ��
 					 	�� ������ �ؼ� ���
			*/		
		if (s1.equals(s2)) {
			System.out.println("s1�� s4�� ���� �л��Դϴ�. ");
		} else {
			System.out.println("s1�� s4�� �ٸ� �л��Դϴ�. ");
		}
		
		System.out.println(" ============== ");
		
		E e1 = new E (); 				// �⺻ ������ ȣ��: Heap�� �ʵ��� ���� ���� �ʱ�ȭ��.
		System.out.println(e1.name);	//null
		
		E e2 = new E ("�����");
		System.out.println(e2.name);
		
		E e3 = new E ("�����");
		System.out.println(e2 == e3); 	// ���� Ÿ�� ( == ) : ��ü�� �ּҸ� ��
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e2.equals(e3));	// Object�� equals() : (==) : ��ü�� �ּҸ� ��
		// Object�� toString(), equals() �� ������ �ؼ� ���.
		}
}

