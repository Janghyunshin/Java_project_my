package chap06_07.Ex02;

public class Example_Car {
	
	public static void main(String[] args) {

		//Car Class�� ��üȭ�ؼ� 5���� ��ü�� �����ؼ� ���� �Ҵ��ؼ� ����غ�����.
		
		
		/* <setter�� Ǫ�¹�> 
		 
		System.out.println(" << �ҳ�Ÿ >>");
		Car sonata = new Car();
		
		sonata.setColor("blue");
		sonata.setCompany("Hyundai");
		sonata.setModel("New");
		sonata.setMaxSpeed(150);
		
		System.out.println(sonata.getColor());
		System.out.println(sonata.getCompany());
		System.out.println(sonata.getModel());
		System.out.println(sonata.getMaxSpeed());
		*/
		
		// �� ������ ���� �Ҵ��ϰ� ����� ������. ���� ������ �ƴϴ�.
		// private ������ : ĸ��ȭ
		// setter�� ���ؼ� ���� �ο� : ������ �ԷµǴ� ���� ������ �� �ִ�.
		System.out.println(" << �ҳ�Ÿ >>");
		
		Car sonata = new Car();
		Car morning = new Car();
		Car k5 = new Car();
		Car k3 = new Car();
		Car genesis = new Car();
		Car grandeur = new Car();
		
		sonata.color = "blue";
		sonata.company = "Hyundai";
		sonata.model = "New";
		sonata.maxSpeed = 150; // -, 700 �� �̻��� ���� �� ������ ����
		
		System.out.println(sonata.color);
		System.out.println(sonata.company);
		System.out.println(sonata.model);
		System.out.println(sonata.maxSpeed);
	
		// setter�� ���ؼ� ���� �Ҵ�: RAM�� ���� �ο� �Ҷ� ���
		System.out.println(" << �׷��� >> ");
		grandeur.setCompany("����");
		grandeur.setColor("����");
		grandeur.setModel("�׷���");
		grandeur.setMaxSpeed(300);
		
		System.out.println(grandeur.getColor());
		System.out.println(grandeur.getCompany());
		System.out.println(grandeur.getModel());
		System.out.println(grandeur.getMaxSpeed());
		
		System.out.println(" << ��� >> ");
		
		
		morning.color = "white";
		morning.company = "������";
		morning.model = "2020";
		morning.maxSpeed = 120;
		
		System.out.println(morning.color);
		System.out.println(morning.company);
		System.out.println(morning.model);
		System.out.println(morning.maxSpeed);
		
		System.out.println(" << K5 >> ");
		
		
		k5.color = "red";
		k5.company = "KIA";
		k5.model = "2018";
		k5.maxSpeed = 170;
		
		System.out.println(k5.color);
		System.out.println(k5.company);
		System.out.println(k5.model);
		System.out.println(k5.maxSpeed);
		
		System.out.println(" << K3 >> ");
		
		
		k3.color = "black";
		k3.company = "KIA";
		k3.model = "2";
		k3.maxSpeed = 165;
		
		System.out.println(k3.color);
		System.out.println(k3.company);
		System.out.println(k3.model);
		System.out.println(k3.maxSpeed);
		
		System.out.println(" << ���׽ý�>> ");
		
		
		genesis.color = "gray";
		genesis.company ="Hyundai";
		genesis.model = "gv70";
		genesis.maxSpeed = 200;
		
		System.out.println(genesis.color);
		System.out.println(genesis.company);
		System.out.println(genesis.model);
		System.out.println(genesis.maxSpeed);
		
		//[����]: ��ĳ�ʷ� ������ �������� �޾Ƽ� �հ�, ���....>>
		
		
		
	}

}
