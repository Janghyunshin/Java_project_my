package chap16.EX13;

// 두 점의 좌표 값을 사용해서 넓이를 구하는 프로그램을 작성 하세요. 제너릭 메소드를 사용

class Point <T, V> {		// 한 점의 좌표를 담는 클래스
	T x;	// 한 점의 x 좌표
	V y;	// 한 점의 y 좌표
	
	Point (T x, V y) {		// 생성자. Setter 대신  생성자를 통해서 좌표값 할당.
		this.x = x;
		this.y = y;
	}
	
	public T getX () {
		return x;
	}
	
	public V getY () {
		return y;
	}
}

class GenericMethod {
	public static <T, V> double makeRectangle (Point <T,V> p1, Point<T,V> p2) {
		// 코드 작성
		// 내 답 
		double left = (double) p1.getX();
		double right = (double) p2.getX();
		double bottom = (double) p1.getY();
		double top = (double) p2.getY();

		
		double width = right - left;
		double height = top - bottom;
	
		return width * height;	// 가로 * 세로 = 넓이를 리턴 
		
		// 선생님 답
		//double width = (double) p2.getX() - (double) p1.getX();
		//double height = (double) p2.getY() - (double) p1.getY();
		
		
	}
}

public class EX_Make_Rectangle {
	public static void main(String[] args) {
		Point<Double , Double> p1 = new Point <Double,Double>(1.0, 2.0);
		Point<Double , Double> p2 = new Point <Double,Double>(10.0, 50.0);
		double rect = GenericMethod.<Double,Double> makeRectangle(p1, p2);
		System.out.println("두 점의 넓이는 : " + rect + " 입니다. ");
	}

}
