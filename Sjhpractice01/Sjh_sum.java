package Sjhpractice01;
public class Sjh_sum {
	public static void main(String[] args) {
		
		 /*
	     * For ���� ����ؼ� 1���� 1000���� 4�� ����� ���� ��:      ��հ�:	double ����
	     *      
	     */
		
	    int sum = 0;
	    for (int i=0 ; i<=1000 ; i+=4) {
	    	sum += i;
	    	System.out.println("1���� 1000���� 4�� ����� ���Ѱ� : " +sum);
	    }
	    
	    System.out.println("=========== �� =============");
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
