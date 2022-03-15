package chap10.Ex04;

class Animal2 {
	void run () {
	}
}

class Tiger extends Animal2 { // ȣ���̴� �׹߷� �޸��ϴ�.
	@Override
	void run () { 
		System.out.println("ȣ���̴� �׹߷� �޸��ϴ�. ");
	}
	void tigerEat () {
		System.out.println("ȣ���̴� ������ �Խ��ϴ�. ");
	}
}

class Eagle extends Animal2 { // �������� �ϴ��� ���ϴ�.
	@Override
	void run () {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
	void eagleEat () {
		System.out.println("�������� �ٸ� ���� ��� �Խ��ϴ�.");
	}
}

class Snake extends Animal2 { // ���� ���ٴմϴ�.
	@Override
	void run () {
		System.out.println("���� ���ٴմϴ�.");
	}
}




public class MethodOverriding_2 {

	public static void main(String[] args) {

		// 1.  ��� ��ü�� Animal2 Ÿ������ ��ĳ�����ؼ� ����.
		
		Animal2 at = new Tiger();
		Animal2 ae = new Eagle();
		Animal2 as = new Snake();
		
		at.run();
		ae.run();
		as.run();
		
		
		// 2. Animal2 �迭�� �� ��ü ����
		Animal2[] animal2 = { at, ae, as }; // ��üŸ�Թ迭 �迭�̸� = {��ü, ��ü, ��ü};
		
		// 3. for ������ �迭�� ��ü�� ���. run()
		System.out.println("========== for�� =============");
		for ( int i = 0 ; i < animal2.length; i++) {
			animal2[i].run();
		}
		// 4. Enhanced for ���� ����ؼ� ��ü�� run() �޼ҵ� ���
		System.out.println("========== ���� for�� =============");
		for ( Animal2 k : animal2 ) {
			k.run();
		}
		// 5. �ٿ� ĳ���� ( instanceof ����ؼ� ) ��� --> tigerEat(), eagleEat() �޼ҵ� ���
		System.out.println("========== �ٿ�ĳ���� =============");
		if (at instanceof Tiger) {
			Tiger a_down = (Tiger) at;
			a_down.tigerEat();
		}
		if (ae instanceof Eagle) {
			Eagle b_down = (Eagle) ae;
			b_down.eagleEat();
		}
		
		
		
	}
}
