package Ex;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
			
		/* 임의의 운동의 이름을 넣고 해당 운동원의 구성원(명수)를 넣어서 출력하는 프로그램을 작성 후 , 
		 전체 합 및 평균을 구하는 프로그램을 작성하세요.
		 예)
		 입력 >>
		 탁구 2 야구 9 축구 11 농구 6 씨름 2    <== nextline() 활용 
		 
		 출력 >> 
		 탁구: 2, 야구: 9, 축구: 11, 농구: 6, 씨름: 2 
		 운동종목의 구성원 총 합계:
		 운동종목의 평균 구성원 수 
		 
		 "그만" 이라고 입력하면 프로그램 종료
		 */
		Scanner sc = new Scanner(System.in);
		
		String[] sports = {"축구", "농구", "야구", "탁구", "씨름"}; 
		int[] num = {11,6,9,2,2};
		
		String name = null; // 스캐너로 과목의 문자열을 받는 변수
		
		int i = 0;			// 방번호를 담는 변수
		int sum = 0;
		double avg = 0;
		
		int name2 = 0;
		
		System.out.print("입력 >> ");
		 while (true) {		// 특정 조건을 만족 할때 까지 계속 루프 돌아감.
			 
			 name = sc.next();	//스캐너로 과목 이름을 받아서 변수 name에 할당. 
			 name2 = sc.nextInt();
			 
			 if (name.equals("그만")) {	//주의: name은 참조변수 이므로 ==를 사용하지 않고 equals
				 System.out.println("프로그램을 종료합니다.");
				 break;
			 }
			 for (i=0; i<sports.length; i++) {
				 if (sports[i].equals(name)) {
					 System.out.println(sports[i] + ": " + num[i]);
					 break;
				 }		 
			 }
			 for (i=0; i<num.length; i++) {
				 if (num[i] == (name2)) {
				 sum += num[i];
				 avg = (double) sum / num.length;
				 break;
				 }
				
			 }
			 System.out.println("운동종목의 구성원 총 합계 : " + sum);
			 System.out.println("운동종목의 평균 구성원 수 : " + avg);
		 }
		
		 sc.close();
	}
}