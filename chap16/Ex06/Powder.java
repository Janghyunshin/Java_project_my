package chap16.Ex06;

public class Powder {
	public void doPrinting() { 
		System.out.println("파우더 재료로 출력합니다. ");
	}
	@Override
	public String toString() {
		return "재료는 파우더 입니다. ";
	}
}
