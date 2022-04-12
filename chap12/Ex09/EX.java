package chap12.Ex09;

public class EX {
	public static void main(String[] args) {
		//1. SamsungPhone 타입으로 지정
		SamsungPhone s1 = new SamsungPhone();
		s1.printLogo();			// interface에서 상속되어 내려온 기능
		s1.sendCall();			//
		s1.receiveCall();
		s1.flash();
		
		System.out.println("============================");
		
		//2. Phone Interface 로 업캐스팅 
		PhoneInterface s2 = new SamsungPhone();
		s2.printLogo();
		s2.sendCall();
		s2.receiveCall();
		
		SamsungPhone ss = (SamsungPhone) s2 ; 	// s2 : PhoneInterface ==>> SamsungPhone 로 타입 변환
		ss.flash(); 	// flash는 다운 캐스팅 후 출력 
	}

}
