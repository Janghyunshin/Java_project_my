package fruit_ex;

import java.util.ArrayList;
import java.util.Scanner;

/*		����� �ٷ�� ���� �Դϴ�. ������ �����ڿ� super() �޼ҵ� ���.
 	�������ϵ� �����ؼ� ���� (�ڹ� ����, ��������(exe)
 	�Ϸ�ð� : 11�� 20��
 	
 */
class Fruit {
	String fruitName; 	// ���� �̸�
	String color; 		// ���� ����
	int large;			// ���� ũ��
	
	
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



	public String toString() { 	// ������ ������ ����ϴ� �޼ҵ�
		return "������ �̸�: <" +  fruitName + "> �̰�, " + "������ <" + color + "> �̰�, ũ��� <" + large +"> �Դϴ�.";
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
		
		/*	1. �ڵ� �ۼ�  : ��ĳ�ʸ� ��ǲ �޴� �ڵ� 
		 ���� >>
		 ========================================================
		 1. ���	|	2. ������	|	3. �ٳ���	|	4. �������	| 5. ���� 
		 ========================================================
		 
		 ���� >> 1 
		 ���ϸ� :
		 ����	  : 
		 ũ��  : 
		 */

		while(true) {
		System.out.println("========================================================================");
		System.out.println("1. ���	|	2. ������	|	3. �ٳ���	|	4. �������	| 5. ����");
		System.out.println("========================================================================");
		System.out.print("���� >> ");
		int No = sc.nextInt();
		
		if (No == 1) {
			System.out.print("- ���ϸ� : ");
			String fruitName = sc.next();
			System.out.print("- ���� : ");
			String color = sc.next();
			System.out.print("- ũ�� : ");
			int large = sc.nextInt();
			
			fruitList.add(new Apple(fruitName, color, large));
			System.out.println(" 1. ����� ������ ����� �ԷµǾ����ϴ�.");
			
		}else if (No == 2) {
			System.out.print("- ���ϸ� : ");
			String fruitName = sc.next();
			System.out.print("- ���� : ");
			String color = sc.next();
			System.out.print("- ũ�� : ");
			int large = sc.nextInt();
			
			fruitList.add(new Orange(fruitName, color, large));
			System.out.println(" 2. �������� ������ ����� �ԷµǾ����ϴ�.");
		}else if (No == 3) {
			System.out.print("- ���ϸ� : ");
			String fruitName = sc.next();
			System.out.print("- ���� : ");
			String color = sc.next();
			System.out.print("- ũ�� : ");
			int large = sc.nextInt();
			
			fruitList.add(new Banana(fruitName, color, large));
			System.out.println(" 1. ����� ������ ����� �ԷµǾ����ϴ�."); 
			
		}else if (No == 4) {
			for (Fruit k : fruitList) {
				System.out.println(k);
			}
		}else if (No == 5) {
			break;
		}
	}
		
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
		
		// 2. �ڵ� �ۼ� : ��ĳ�ʷ� ��ǲ���� ������ ������ ��ü�� �����ؼ� ArrayList�� ���� 
		
		
		/*
		// 3. ���� >> 4   ArrayList�� ��� ��ü�� �����ͼ� ��ü�� ������� ��, Enhanced For ���� ����ؼ�
		��� ���:
			������ �̸�: <���> �̰�, ������ <������>�̰�, ũ��� <10> �Դϴ�.
			������ �̸�: <������> �̰�, ������ <��������>�̰�, ũ��� <20> �Դϴ�.
			������ �̸�: <�ٳ���> �̰�, ������ <�����>�̰�, ũ��� <30> �Դϴ�.
		*/
	}
}
