package chap05;
import java.util.Arrays;
public class SjhArr3 {
	public static void main(String[] args) {
	
		int[] arr2 = new int[300];
		for ( int i = 0; i < arr2.length; i++) {
			arr2[i] = (i+1) * 3;
		}
		
		for ( int i = 100; i < arr2.length; i++) {
			if(i%2 ==1)
				System.out.println(i + " ¹øÂ°¹æ " + arr2[i]);
		}
	}
}
