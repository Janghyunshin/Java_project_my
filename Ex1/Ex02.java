package Ex1;
public class Ex02 {
	public static void main(String[] args) {
		// 3/2일 수업 내용 
		int sum = 0; // 합한 값을 저장
		int num = 1;
		
		while (num <= 100 ) { //while 문을 사용할 때
			sum += num ; // sum = sum + num;
			num++;
		}
		System.out.println("1부터 100까지의 합은 : " + sum);
	}

}
