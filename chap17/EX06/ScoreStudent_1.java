package chap17.EX06;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
	Student(){}
	
	int score; 		// ������ �Է� , �ʵ��� �� �Ҵ� (1. ��ü ������ ����, 2. private (������, Setter, Getter)

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
}

public class ScoreStudent_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);		// System.in : �ܼ��� ���ؼ� ���� �ްڴ�.
        ArrayList<Student> arr = new ArrayList<Student>();

        boolean run = true;
        int studentNum = 0;
        int[] score1 = null;
        
        while(run) {
            System.out.println("----------------------------------------------------");
            System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
            System.out.println("----------------------------------------------------");
            System.out.println("����> ");
            
            int selectNo = scanner.nextInt();	// ����, if ���ǹ� �ۿ��� 
      
            if(selectNo == 1) {
                System.out.println("�л����� �Է��ϼ��� : ");
                	//�ڵ� �ۼ� 
                studentNum = scanner.nextInt();			// �л� �� ��ǲ ����.
                System.out.println("�Է¿Ϸ�");
                
            } else if(selectNo == 2) {
            		// �ڵ� �ۼ�
            	if (studentNum == 0 ) {			// studentNum�� �Ҵ� �޾ƾ� for ���� ������ ������ �� �ִ�.
            		System.out.println("�л� ���� ���� �Է��ϼ���.");
            	} else {
            		// for ���� ���ؼ� ��ǲ���� �л� �� ��ŭ ������ �Է�.
            		for (int i = 0; i<studentNum ; i++) {		//
            			// ��ü�� �����ؼ� ��ǲ ���� ���� Student ��ü�� score ������ �Ҵ�. 
            			Student student = new Student();	// �⺻ �����ڸ� ����ؼ� ��ü ����, ���� score �ʵ� ���� �Ҵ�. 
            			System.out.println((i + 1) + " ��° �л� ������ �Է� �ϼ���. ");
            			student.score = scanner.nextInt();	// �л������� �Է� �޾Ƽ� �ʵ忡 ���� �Ҵ�.
            			arr.add(student);	// ArrayList�� �ʵ��� ���� �Ҵ��� ��ü�� ArrayList�� ����
            			System.out.println("�Է� �Ϸ� ");	 // �Է� �Ϸ��� ��� �ϰ� ���� 
            		}
            	}
            } else if(selectNo == 3) {
            		// �ڵ� �ۼ�, ���� ����Ʈ ���, ArrayList �� ������ �Ҵ�� ��ü�� ����. ��ü ������, �ʵ��� ���� ���� ���
            	if (studentNum == 0) {
            		System.out.println("�л� ���� ���� �Է��ϼ���.");
            	} else {
            		for ( int i = 0 ; i < studentNum ; i++) { 	// ArrayList ��ü�� �����ͼ� Student.score �ʵ��� ���� ��� 
            			Student student = arr.get(i); 	// ArrayList�� get() ������ Student ��ü�� �����´�. 
            			// System.out.println(student.score); 	// �ʵ��� ���� ��ü�� ���� ���
            			System.out.println(student.getScore()); // �ʵ��� ���� getter�� ��� 
            		}
            	}
            	
             
            } else if(selectNo == 4) {
            	//�ڵ��ۼ�
            	if (studentNum == 0) {
            		System.out.println("�л� ���� ���� �Է��ϼ���. ");
            	} else {
            		int maxScore = 0 ; 		// �ִ� ������ �޴� �������� ����	< �ʱⰪ �Ҵ� > 
            		int sum = 0;		// �հ踦 �����ϴ� ��������		< �ʱⰪ �Ҵ� > 
            		// 1. ArrayList�� ��ü�� ������ �´�.  2. Student ��ü�� score �ʵ��� ���� �����ͼ� ó��
            		for (int i = 0; i < studentNum ; i++) {
            			Student student = arr.get(i);
            			// �ִ� ���� ������ �Ҵ�.
            			// 3�� �����ڸ� ����ؼ� �ִ밪�� ������ �Ҵ�.
            			maxScore = (student.score > maxScore) ? student.score : maxScore;
            			sum += student.score;	// sum = sum + student.score
            		}
            			// maxScore ������ �������� ���� �� , sum : ��� score ���� ���� ������ ��Ƽ� 
            		System.out.println("�ְ����� : " + maxScore);
            		System.out.println("������� : " + (float) sum / studentNum  );
            		
            	}
         
            } else if(selectNo == 5) {
            	//�ڵ��ۼ�
            	run = false;		// run false �϶� while���� �������´�.��

            	
              }
      
        }
        System.out.println ("���α׷� ����");
        scanner.close();
	}
}