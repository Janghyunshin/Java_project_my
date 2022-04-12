package chap13.Ex10.Ex2;

class Abc {		
	// 1. ��ü ���� �� �ʵ忡 ���� ���� �Ҵ�. (d1)
	// 2. �����ڸ� ���ؼ� �� �Ҵ� (d2)
	// 3. setter�� ���ؼ� �� �Ҵ� (d3)
	
	Def d;			// �ʵ� ���
					// ������ ���
	
	Abc() {}		// �⺻ ������
	
	Abc (Def d) {	// �����ڸ� ���ؼ� �ʵ��� �⺻ �� �Ҵ� 
		this.d = d; 
	}
	
	void setDef (Def d) {	// setter�� ���ؼ� �ʵ��� �⺻ �� �Ҵ� 
		this.d = d;
	}
	
	interface Def {		// Abc.Def
		void run();
		void fly();
	}
	
	void ghi() {
		d.run();
		d.fly();
	}
	
	
}

public class InnerInterface_1_2 {

	public static void main(String[] args) {
		// 1. ��ü ������ �ʵ��� ���� �Ҵ�.
		
		Abc d1 = new Abc();
		
		d1.d = (Abc.Def) new Abc.Def() {
			
			@Override
			public void run() {
				System.out.println("�ι߷� �ݴϴ�.");
			}
			
			@Override
			public void fly() {
				System.out.println("�ϴ��� ���� ���մϴ�.");
			}
		};
		d1.ghi();
		
		// 2. �����ڸ� ���ؼ� �� �Ҵ� (d2)
		Abc d2 = new Abc(
			new Abc.Def() {
			
				@Override
				public void run() {
					System.out.println("�׹߷� �ݴϴ�.");
				}
			
				@Override
				public void fly() {
					System.out.println("�ϴ��� ���� ���մϴ�.");
				}
			});
		d2.ghi();
		System.out.println("====================");
		
		// 3. setter�� ���ؼ� �� �Ҵ� (d3)
		Abc d3 = new Abc();
		d3.setDef(new Abc.Def() {
			
			@Override
			public void run() {
				System.out.println("�ι߷� �ݴϴ�.");
			}
			
			@Override
			public void fly() {
				System.out.println("�ϴ��� �� �� �ֽ��ϴ�.");
			}
		});
		d3.ghi();
		
		
	}

}
