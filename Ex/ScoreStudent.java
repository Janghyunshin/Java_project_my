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
		            System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
		            System.out.println("----------------------------------------------------");
		            System.out.println("����> ");
		            int selectNo = scanner.nextInt();

		            if(selectNo == 1) {
		                System.out.println("�л����� �Է��ϼ��� : ");
		                Student_1Num = scanner.nextInt();
		                arr = new ArrayList(Student_1Num);
		                System.out.println("�Է¿Ϸ�");

		            } else if(selectNo == 2) {
		                if (Student_1Num == 0) {
		                    System.out.println("�л����� ���� �Է��ϼ���.");
		                } else {
		                System.out.println("�л��� ��ŭ ������ �Է��Ͻÿ� : ");
		                for (int i = 0; i < Student_1Num; i++) {
		                    Student_1 Student_1 = new Student_1();
		                    System.out.print((i+1) + " �� �л� ������ �Է��ϼ��� : ");
		                    Student_1.score = scanner.nextInt();
		                    arr.add(Student_1);
		                System.out.println("�Է¿Ϸ�");
		                }
		                }
		            } else if(selectNo == 3) {
		                if (Student_1Num == 0) {
		                    System.out.println("�л����� ���� �Է��ϼ���.");
		                } else {
		                for (int i = 0; i < Student_1Num; i++) {
		                    Student_1 Student_1 = arr.get(i);
		                    System.out.println(Student_1.score);
		                }
		                }
		            } else if(selectNo == 4) {
		                    if (Student_1Num == 0) {
		                        System.out.println("�л����� ���� �Է��ϼ���.");
		                    } else {
		                        int maxScore = 0;
		                        int sum = 0;
		                        for (int i = 0; i < Student_1Num; i++) {
		                            Student_1 Student_1 = arr.get(i);
		                            maxScore = (Student_1.score > maxScore) ? Student_1.score : maxScore;
		                            sum += Student_1.score;
		                        }
		                        System.out.println("�ְ����� : " + maxScore);
		                        System.out.println("������� : " + (float) sum / Student_1Num);
		                    }
		            } else if(selectNo == 5) {

		            	run = false;

		            }

		        }

		        System.out.println ("���α׷� ����");

		    }

		}







