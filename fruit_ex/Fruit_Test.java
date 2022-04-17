package fruit_ex;

import java.util.ArrayList;
import java.util.Scanner;

/*		상속을 다루는 문제 입니다. 하위의 생성자에 super() 메소드 사용.
 	실행파일도 압축해서 제출 (자바 파일, 실행파일(exe)
 	완료시간 : 11시 20분
 	
 */
class Fruit {
	String fruitName; 	// 과일 이름
	String color; 		// 과일 색깔
	int large;			// 과일 크기
	
	
	Fruit () {}
	Fruit (String fruitName, String color, int large) {
		this.fruitName = fruitName;
		this.color = color;
		this.large = large;
	}
	
	// getter . setter
	public String getFruitName() {return fruitName;}
	public void setFruitName(String fruitName) {this.fruitName = fruitName;}

	public String getColor() {return color;}
	public void setColor(String color) {this.color = color;}
	
	public int getLarge() {return large;}
	public void setLarge(int large) {this.large = large;}



	public String toString() { 	// 과일의 정보를 출력하는 메소드
		return "과일의 이름: <" +  fruitName + "> 이고, " + "색깔은 <" + color + "> 이고, 크기는 <" + large +"> 입니다.";
	}
}

class Apple extends Fruit {

	Apple (String fruitName, String color, int large) {
		super.fruitName = fruitName;
		super.color = color;
		super.large = large;
	}
}

class Orange extends Fruit {
	Orange (String fruitName, String color, int large) {
		super.fruitName = fruitName;
		super.color = color;
		super.large = large;
	}
}

class Banana extends Fruit {
	Banana (String fruitName, String color, int large) {
		super.fruitName = fruitName;
		super.color = color;
		super.large = large;
	}
}

public class Fruit_Test {
	public static void main(String[] args) {

		ArrayList<Fruit> fruitList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		/*	1. 코드 작성  : 스캐너를 인풋 받는 코드 
		 선택 >>
		 ========================================================
		 1. 사과	|	2. 오렌지	|	3. 바나나	|	4. 정보출력	| 5. 종료 
		 ========================================================
		 
		 선택 >> 1 
		 과일명 :
		 색깔	  : 
		 크기  : 
		 */

		while(true) {
		System.out.println("========================================================================");
		System.out.println("1. 사과	|	2. 오렌지	|	3. 바나나	|	4. 정보출력	| 5. 종료");
		System.out.println("========================================================================");
		System.out.print("선택 >> ");
		int No = sc.nextInt();
		
		if (No == 1) {
			System.out.print("- 과일명 : ");
			String fruitName = sc.next();
			System.out.print("- 색깔 : ");
			String color = sc.next();
			System.out.print("- 크기 : ");
			int large = sc.nextInt();
			
			fruitList.add(new Apple(fruitName, color, large));
			System.out.println(" 1. 사과의 정보가 제대로 입력되었습니다.");
			
		}else if (No == 2) {
			System.out.print("- 과일명 : ");
			String fruitName = sc.next();
			System.out.print("- 색깔 : ");
			String color = sc.next();
			System.out.print("- 크기 : ");
			int large = sc.nextInt();
			
			fruitList.add(new Orange(fruitName, color, large));
			System.out.println(" 2. 오렌지의 정보가 제대로 입력되었습니다.");
		}else if (No == 3) {
			System.out.print("- 과일명 : ");
			String fruitName = sc.next();
			System.out.print("- 색깔 : ");
			String color = sc.next();
			System.out.print("- 크기 : ");
			int large = sc.nextInt();
			
			fruitList.add(new Banana(fruitName, color, large));
			System.out.println(" 1. 사과의 정보가 제대로 입력되었습니다."); 
			
		}else if (No == 4) {
			for (Fruit k : fruitList) {
				System.out.println(k);
			}
		}else if (No == 5) {
			break;
		}
	}
		
		System.out.println("프로그램이 종료되었습니다.");
		
		// 2. 코드 작성 : 스캐너로 인풋받은 값으로 각각의 객체를 생성해서 ArrayList에 저장 
		
		
		/*
		// 3. 선택 >> 4   ArrayList의 모든 객체를 가져와서 객체를 출력했을 때, Enhanced For 문을 사용해서
		출력 결과:
			과일의 이름: <사과> 이고, 색깔은 <빨간색>이고, 크기는 <10> 입니다.
			과일의 이름: <오렌지> 이고, 색깔은 <오렌지색>이고, 크기는 <20> 입니다.
			과일의 이름: <바나나> 이고, 색깔은 <노란색>이고, 크기는 <30> 입니다.
		*/
	}
}
