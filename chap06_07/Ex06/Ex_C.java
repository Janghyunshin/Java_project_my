package chap06_07.Ex06;

import chap06_07.Ex05.C;	// ctrl + shift + o
							// class의 접근 제한자가 public 

public class Ex_C {

	public static void main(String[] args) {

		// 다른 클래스에 존재함 / public만 접근 / model, color 메모리로 접근 불가
		// model과 color는 setter를 public 통해서 값을 넣어서 출력 
		
		C c = new C();	// 다른 패키지 이므로 import
		
		// company, model, color 는 다른 패키지에서 접근 불가, setter를 통해서 메모리 값을 할당하도록 구성
		c.maxSpeed = 300;	// 다른 패키지의 클래스에서 public , protected (상속 설정)
		
		// setter를 통해서 메모리의 값을 부여
		c.setModel("에쿠스");
		c.setColor("검정");
		c.setMaxSpeed(300);
		
		c.print();
		
	}

}
