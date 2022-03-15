package chap06_07.Ex02;

public class Example_Car {
	
	public static void main(String[] args) {

		//Car Class를 객체화해서 5개의 객체를 생성해서 값을 할당해서 출력해보세요.
		
		
		/* <setter로 푸는법> 
		 
		System.out.println(" << 소나타 >>");
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
		
		// 각 변수의 값을 할당하고 출력해 보세요. 권장 사항은 아니다.
		// private 변수명 : 캡슐화
		// setter를 통해서 값을 부여 : 변수의 입력되는 값을 제어할 수 있다.
		System.out.println(" << 소나타 >>");
		
		Car sonata = new Car();
		Car morning = new Car();
		Car k5 = new Car();
		Car k3 = new Car();
		Car genesis = new Car();
		Car grandeur = new Car();
		
		sonata.color = "blue";
		sonata.company = "Hyundai";
		sonata.model = "New";
		sonata.maxSpeed = 150; // -, 700 값 이상을 넣을 수 없도록 제어
		
		System.out.println(sonata.color);
		System.out.println(sonata.company);
		System.out.println(sonata.model);
		System.out.println(sonata.maxSpeed);
	
		// setter를 통해서 값을 할당: RAM의 값을 부여 할때 사용
		System.out.println(" << 그랜져 >> ");
		grandeur.setCompany("현대");
		grandeur.setColor("빨강");
		grandeur.setModel("그랜져");
		grandeur.setMaxSpeed(300);
		
		System.out.println(grandeur.getColor());
		System.out.println(grandeur.getCompany());
		System.out.println(grandeur.getModel());
		System.out.println(grandeur.getMaxSpeed());
		
		System.out.println(" << 모닝 >> ");
		
		
		morning.color = "white";
		morning.company = "쉐보레";
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
		
		System.out.println(" << 제네시스>> ");
		
		
		genesis.color = "gray";
		genesis.company ="Hyundai";
		genesis.model = "gv70";
		genesis.maxSpeed = 200;
		
		System.out.println(genesis.color);
		System.out.println(genesis.company);
		System.out.println(genesis.model);
		System.out.println(genesis.maxSpeed);
		
		//[문제]: 스캐너로 임의의 정수값을 받아서 합계, 평균....>>
		
		
		
	}

}
