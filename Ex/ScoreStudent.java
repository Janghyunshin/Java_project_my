package Ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student_1{
	int score; 
}

public class ScoreStudent {
	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);
		        ArrayList<Student_1> arr = new ArrayList<Student_1>();

		        boolean run = true;
		        int Student_1Num = 0;
		        while(run) {
		            System.out.println("----------------------------------------------------");
		            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
		            System.out.println("----------------------------------------------------");
		            System.out.println("선택> ");
		            int selectNo = scanner.nextInt();

		            if(selectNo == 1) {
		                System.out.println("학생수를 입력하세요 : ");
		                Student_1Num = scanner.nextInt();
		                arr = new ArrayList(Student_1Num);
		                System.out.println("입력완료");

		            } else if(selectNo == 2) {
		                if (Student_1Num == 0) {
		                    System.out.println("학생수를 먼저 입력하세요.");
		                } else {
		                System.out.println("학생수 만큼 점수를 입력하시오 : ");
		                for (int i = 0; i < Student_1Num; i++) {
		                    Student_1 Student_1 = new Student_1();
		                    System.out.print((i+1) + " 번 학생 점수를 입력하세요 : ");
		                    Student_1.score = scanner.nextInt();
		                    arr.add(Student_1);
		                System.out.println("입력완료");
		                }
		                }
		            } else if(selectNo == 3) {
		                if (Student_1Num == 0) {
		                    System.out.println("학생수를 먼저 입력하세요.");
		                } else {
		                for (int i = 0; i < Student_1Num; i++) {
		                    Student_1 Student_1 = arr.get(i);
		                    System.out.println(Student_1.score);
		                }
		                }
		            } else if(selectNo == 4) {
		                    if (Student_1Num == 0) {
		                        System.out.println("학생수를 먼저 입력하세요.");
		                    } else {
		                        int maxScore = 0;
		                        int sum = 0;
		                        for (int i = 0; i < Student_1Num; i++) {
		                            Student_1 Student_1 = arr.get(i);
		                            maxScore = (Student_1.score > maxScore) ? Student_1.score : maxScore;
		                            sum += Student_1.score;
		                        }
		                        System.out.println("최고점수 : " + maxScore);
		                        System.out.println("평균점수 : " + (float) sum / Student_1Num);
		                    }
		            } else if(selectNo == 5) {

		            	run = false;

		            }

		        }

		        System.out.println ("프로그램 종료");

		    }

		}







