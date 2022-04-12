package Ex;

class A {
	int data;
	A(int data) {
		this.data = data;
	}
	@Override
	public boolean equals(Object obj) {
		if (this.data == data ) {
			return true;
		} else {
			return false;
		}
	}
}

public class p_Quiz {

	public static void main(String[] args) {
	
		A a1 = new A(3);
		A a2 = new A(3);
		System.out.println(a1.equals(a2));
	}

}
