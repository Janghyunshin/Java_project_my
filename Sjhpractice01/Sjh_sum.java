package Sjhpractice01;
public class Sjh_sum {
	public static void main(String[] args) {
		
		 /*
	     * For 문을 사용해서 1부터 1000까지 4의 배수만 더한 값:      평균값:	double 형식
	     *      
	     */
		
	    int sum = 0;
	    for (int i=0 ; i<=1000 ; i+=4) {
	    	sum += i;
	    	System.out.println("1부터 1000까지 4의 배수만 더한값 : " +sum);
	    }
	    
	    System.out.println("=========== 답 =============");
	    double sum1 = 0 ; // 더한 값을 저장하는 변수
	    double j = 0 ; 	  // 4의 배수를 카운트 하는 변수
	    for (int i = 1; i <= 1000 ; i++) {
	    	if (i % 4 == 0) { //
	    		sum1 += i ;  // sum = sum + i 		// 4의 배수만 더한다.
	    		j++;
	    	}    		
	    	}
	    System.out.println("합은 :" + sum1);
	    System.out.println("평균은:" + sum1 / j);
	    System.out.println(j);
	}

}
