package chap16.Ex08;

// 제너릭 클래스를 생성 해서 , 타입 제한 (Apple, Strawberry, Banana만) , Pancil를 타입으로 접근할 수 없도록 설정
abstract class Fluit {
	public abstract void print();	// 추상 메소드
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
		return name + "이고 가격은 " + price ; 
	}
	
	public void print() {
		System.out.println("사과는 과일 입니다.");
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
		return name + "이고 가격은 " + price;
	}
	
	public void print() {
		System.out.println("딸기는 과일 입니다.");
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
		return name + "이고 가격은 " + price;
	}
	
	public void print() {
		System.out.println("바나나는 과일 입니다.");
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
			return name + "이고 가격은 " + price;
		}
}

//제너릭 클래스 : Fluit 타입만 올 수 있음. 
class F <T extends Fluit> { 	// DTO, VO 
								// DTO(Data Transfer Object) - getter, setter
								// VO(Value Object) - getter 
	private T t;				 // 데이터를 받아서 전송하는 중간자 역할을 함. 
								 // 계층간에 값을 받아서 전송, 중간자 역할

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

public abstract class Ex_Restric_Generic_Type {
	public static void main(String[] args) {
		// 1. 사과
		F<Apple> f1 = new F<Apple>();
			f1.setT(new Apple("사과", 3000));
			System.out.println(f1.getT());
			f1.getT().print();
			System.out.println("====================");
		// 2. 딸기	
		F<Strawberry> f2 = new F<Strawberry>();
			f2.setT(new Strawberry("딸기", 2000));
			System.out.println(f2.getT());
			f2.getT().print();
			System.out.println("====================");
		// 3. 바나나	
		F<Banana> f3 = new F<Banana>();
			f3.setT(new Banana("바나나", 2500));
			System.out.println(f3.getT());
			f3.getT().print();
			
		/*	 // Pancil 타입은 접근할 수 없어 오류 발생
		F<Pancil> f4 = new F<Pancil>();
			f4.setT(new Pancil("연필", 300));
			System.out.println(f4.getT());
		*/	
	}
}
