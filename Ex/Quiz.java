package Ex;

import java.util.Scanner;

public class Quiz {

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
		
		Scanner sc = new Scanner (System.in);
		System.out.println("운동 이름과 구성원 수를 공백을 이용해서 입력 하세요. ");
		System.out.println("예) 입력 >>> 탁구 2 야구 9 축구 11 농구 6 씨름 2");
		
		String str; 	// 전체 String 값을 인풋 받는 변수
		String[] array ; 	// 공백을 기준으로 잘라서 배열에 저장하는 변수
		int sum ;	// 운동의 구성원의 멤버의 합을 저장하는 변수
		int memberCount = 0;
		double avg;	// 평균을 구하는 변수 : (double) 전체 구성원의 합 / 종목의 수 
		int b;		// 각 종목의 구성원을 담는 변수
		
		do {
			sum = 0;
			avg = 0;
			b = 0;
			str = sc.nextLine();	// sc.next() : 공백까지만 String
									// sc.nextLine():
			if (str.equals("그만")) {break;}	// str은 참조 자료형이므로 str.equals()
			
			array = str.split(" ");	// str을 공백을 기준으로 잘라서 arr 배열에 저장
			
			for ( int i = 0;  i<array.length ; i++) { // arr.length : 배열의 index 0 ~ 마지막 방까지
				if (i%2 !=0 ) {		// i : 방의 번호이고 숫자만 가지고 온다.
					b = Integer.parseInt(array[i]);		// 각 방의 String 타입을 정수로 변환
					sum += b;		// sum = sum + b	// sum : 전체 구성원의 합  
					memberCount ++;	// avg = sum / memberCount 
				}
			}
			avg = (double) sum / memberCount;	// 평균
			
			System.out.println(str);
			System.out.println("구성원의 총합 : " + sum);
			System.out.println("구성원의 평균 : " + avg);
			
		} while (true);
		
		
		
		
		
		
	}

}
