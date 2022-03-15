package Ex;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		/* [문항 12] 컴퓨터와 독자 사이의 가위 바위 보 게임을 만들어보자.
		 * 예시는 다음 그림과 같다. 독자부터 먼저 시작한다.
		 * 독자가 가위 바위 보 중 하나를 입력하고 <Enter>키를 치면,
		 * 프로그램은 가위 바위 보 중에서 랜덤하게 하나를 선택하고 컴퓨터가 낸 것으로 한다.
		 * 독자가 입력한 값과 랜덤하게 선택한 값을 비교하여 누가 이겼는지 판단한다.
		 * 독자가 가위 바위 보 대신 "그만"을 입력하면 게임을 끝난다.
		 */
		Scanner sc = new Scanner(System.in);
		
		String str[] = {"가위","바위","보"};
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		while (true) {
			int i = (int)(Math.random()*3);
			System.out.println("가위 바위 보! >>");
			String name = sc.next(); 
			
			if(name.equals("그만")) {
				System.out.println("게임을 종료합니다...");
					break;
			}
			
			System.out.print("사용자 = " + name + ", 컴퓨터 = " + str[i]);
			if (name.equals("가위")) {
				if(str[i].equals("가위")) {
					System.out.println(" 비겼습니다.");
				}
				else if(str[i].equals("바위")) {
					System.out.println(" 컴퓨터가 이겼습니다.");
				}
				else if(str[i].equals("보")) {
					System.out.println(" 사용자가 이겼습니다.");
				}	
			}
			else if (name.equals("바위")) {
				if(str[i].equals("가위")) {
					System.out.println(" 사용자가 이겼습니다.");
				}
				else if(str[i].equals("바위")) {
					System.out.println(" 비겼습니다.");
				}
				else if(str[i].equals("보")) {
					System.out.println(" 컴퓨터가 이겼습니다.");
				}
			}
			else if (name.equals("보")) {
				if(str[i].equals("가위")) {
					System.out.println(" 컴퓨터가 이겼습니다.");
				}
				else if(str[i].equals("바위")) {
					System.out.println(" 사용자가 이겼습니다.");
				}
				else if(str[i].equals("보")) {
					System.out.println(" 비겼습니다.");
				}
			}
		}
		sc.close();
	}
}
