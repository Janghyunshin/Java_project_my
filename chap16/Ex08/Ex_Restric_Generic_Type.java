package chap16.Ex08;

// ���ʸ� Ŭ������ ���� �ؼ� , Ÿ�� ���� (Apple, Strawberry, Banana��) , Pancil�� Ÿ������ ������ �� ������ ����
abstract class Fluit {
	public abstract void print();	// �߻� �޼ҵ�
}

class Apple extends Fluit{
	String name;
	int price;
	Apple (String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return name + "�̰� ������ " + price ; 
	}
	
	public void print() {
		System.out.println("����� ���� �Դϴ�.");
	}
}

class Strawberry extends Fluit{
	String name;
	int price;
	Strawberry (String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return name + "�̰� ������ " + price;
	}
	
	public void print() {
		System.out.println("����� ���� �Դϴ�.");
	}
}

class Banana extends Fluit{
	String name;
	int price;
	Banana (String name, int price) {
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return name + "�̰� ������ " + price;
	}
	
	public void print() {
		System.out.println("�ٳ����� ���� �Դϴ�.");
	}
	
}

class Pancil {
		String name;
		int price;
		Pancil (String name, int price) {
			this.name = name;
			this.price = price;
		}
		@Override
		public String toString() {
			return name + "�̰� ������ " + price;
		}
}

//���ʸ� Ŭ���� : Fluit Ÿ�Ը� �� �� ����. 
class F <T extends Fluit> { 	// DTO, VO 
								// DTO(Data Transfer Object) - getter, setter
								// VO(Value Object) - getter 
	private T t;				 // �����͸� �޾Ƽ� �����ϴ� �߰��� ������ ��. 
								 // �������� ���� �޾Ƽ� ����, �߰��� ����

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

public abstract class Ex_Restric_Generic_Type {
	public static void main(String[] args) {
		// 1. ���
		F<Apple> f1 = new F<Apple>();
			f1.setT(new Apple("���", 3000));
			System.out.println(f1.getT());
			f1.getT().print();
			System.out.println("====================");
		// 2. ����	
		F<Strawberry> f2 = new F<Strawberry>();
			f2.setT(new Strawberry("����", 2000));
			System.out.println(f2.getT());
			f2.getT().print();
			System.out.println("====================");
		// 3. �ٳ���	
		F<Banana> f3 = new F<Banana>();
			f3.setT(new Banana("�ٳ���", 2500));
			System.out.println(f3.getT());
			f3.getT().print();
			
		/*	 // Pancil Ÿ���� ������ �� ���� ���� �߻�
		F<Pancil> f4 = new F<Pancil>();
			f4.setT(new Pancil("����", 300));
			System.out.println(f4.getT());
		*/	
	}
}
