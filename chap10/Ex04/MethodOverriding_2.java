package chap10.Ex04;

class Animal2 {
	void run () {
	}
}

class Tiger extends Animal2 { // 호랑이는 네발로 달립니다.
	@Override
	void run () { 
		System.out.println("호랑이는 네발로 달립니다. ");
	}
	void tigerEat () {
		System.out.println("호랑이는 동물을 먹습니다. ");
	}
}

class Eagle extends Animal2 { // 독수리는 하늘을 납니다.
	@Override
	void run () {
		System.out.println("독수리는 하늘을 납니다.");
	}
	void eagleEat () {
		System.out.println("독수리는 다른 새를 잡아 먹습니다.");
	}
}

class Snake extends Animal2 { // 뱀은 기어다닙니다.
	@Override
	void run () {
		System.out.println("뱀은 기어다닙니다.");
	}
}




public class MethodOverriding_2 {

	public static void main(String[] args) {

		// 1.  모든 객체는 Animal2 타입으로 업캐스팅해서 생성.
		
		Animal2 at = new Tiger();
		Animal2 ae = new Eagle();
		Animal2 as = new Snake();
		
		at.run();
		ae.run();
		as.run();
		
		
		// 2. Animal2 배열에 각 객체 저장
		Animal2[] animal2 = { at, ae, as }; // 객체타입배열 배열이름 = {객체, 객체, 객체};
		
		// 3. for 문으로 배열의 객체를 출력. run()
		System.out.println("========== for문 =============");
		for ( int i = 0 ; i < animal2.length; i++) {
			animal2[i].run();
		}
		// 4. Enhanced for 문을 사용해서 객체의 run() 메소드 출력
		System.out.println("========== 향상된 for문 =============");
		for ( Animal2 k : animal2 ) {
			k.run();
		}
		// 5. 다운 캐스팅 ( instanceof 사용해서 ) 출력 --> tigerEat(), eagleEat() 메소드 출력
		System.out.println("========== 다운캐스팅 =============");
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
