package chap16.Ex06.Ex1;

public class Powder extends Meterial{	// 추상 클래스를 상속
	
	public void doPrinting() { 	// 추상 메소드를 구현
		System.out.println("파우더 재료로 출력합니다. ");
	}
	@Override
	public String toString() {
		return "재료는 파우더 입니다. ";
	}
}
