package chap04;
public class For_Ex03 {
	public static void main(String[] args) {

		//For �⺻ �۵�
		
		int a; 		//��������, ��� �ۿ��� ����� ���� , ����(o), �ʱⰪ (x)
		for ( a = 0 ; a < 5 ; a++) {
			System.out.print(a + " ");		//
		}
		
		System.out.println();
		System.out.println("��� �ۿ��� ��� :" + a);
		
		System.out.println("=========================");
		
		for (int b = 0 ; b <= 10 ; b++ ) {
			System.out.println( b );
		}
		// System.out.println(b); //for �� �������� ��ȿ��. (����)
		
		System.out.println("=================");
		int c ; 
		for ( c = 10 ; c > 0 ; c--) {
			System.out.println( c );
		}
		
		/* 2�� ����� ��� */
		for (int i = 0 ; i < 100 ; i += 2 ) {
			System.out.print( i + " " );
		}
		
		System.out.println();
		System.out.println();
		
		/* for�� ������ �ʱⰪ�� �������� ���� ������ �Ҵ��� �� �ִ�. */
		for (int i=0, j=0 ; i < 10 ; i++, j++) {
			System.out.println( i + " * " + j + " : " + (i * j));
		}
		
		// *for ���� ����ؼ� 1���� 10���� * ���� ��� (1*2*3..... 10)
		int s=1;
		for ( int i = 1 ; i <= 10 ; i++) {
			s *= i ; 		//s = s * i
		}
		System.out.println("1���� 10���� ���� ��: " + s);
		
		
		// for ���� ����ؼ� 1���� 100���� ���Ѱ��� ���
		
	    int sum = 0;
	    for ( int i = 1 ; i <= 100; i++) {
	    	sum += i;
	    }
	    System.out.println("1���� 100���� ���Ѱ� : " +sum);
	    
	    /* ���� for �� : 1�� ~ 9�� ���� ������ ��� */
	    System.out.println("========������ ���========");
	    
	    for (int i = 1; i <=9 ; i++) { // i: ���� ���
	    	for ( int j =1; j <=9; j++) {
	    		System.out.println( i + " * " + j + " = " + ( i * j));
	    	}
	    	System.out.println("=======================");
	    }
	    
	    /*
	     *  For ������ ���� ���� �߻� , ������ ���� ���
	    for ( int i = 0 ; ; i++) {
	    	System.out.print( i + " ");  //0, 1, 2, 3 .....................
	    }
	    */
	    
	    /*
	    for ( ; ; ) {
	    	System.out.println("���� ����");
	    }
	    */
	    System.out.println("========================");
	    
	    // ���� ���� Ż��
	    
	    for ( int i = 0 ;  ; i++) {
	    	
	    	if ( i> 100 ) { 
	    		break; 		 // ���� ������ ���� 
	    	}
	    	System.out.println(i);
	    }
	    	System.out.println("=====================");
	   
		 /*
		  * For ���� ����ؼ� 1���� 1000���� 4�� ����� ���� ��:      ��հ�:	double ����
		  *      
		  */
	    
	    double sum1 = 0 ; // ���� ���� �����ϴ� ����
	    double j = 0 ; 	  // 4�� ����� ī��Ʈ �ϴ� ����
	    for (int i = 1; i <= 1000 ; i++) {
	    	if (i % 4 == 0) { //
	    		sum1 += i ;  // sum = sum + i 		// 4�� ����� ���Ѵ�.
	    		j++;
	    	}    		
	    	}
	    System.out.println("���� :" + sum1);
	    System.out.println("�����:" + sum1 / j);
	    System.out.println(j);
	    
	    
	    
	    }
}
