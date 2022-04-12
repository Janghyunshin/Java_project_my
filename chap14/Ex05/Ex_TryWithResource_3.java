package chap14.Ex05;
// 자동 리소스(객체) 제거
	// 1. AutoCloseable 인터페이스를 구현
	// 2. close() 메소드 재정의 

// 필드의 값 할당. 생성자 호출시 필드에 값을 부여.

class Abc implements AutoCloseable {
	String name;
	int studentID;
	int kor;
	int eng;
	int math;
	double avg;		// 평균 계산
	
	Abc (String name, int studentID, int kor, int eng, int math) {
		this.name = name; this.studentID = studentID;  this.kor = kor;
		this.eng =eng; this.math = math; 
		this.avg=(double) (kor + eng + math) / 3 ;
	}
	
	@Override
	public void close() throws Exception {
			// 초기화 전의 메모리 값을 출력 
				
			if (name != null || studentID != 0 || kor != 0 || eng != 0 || math != 0 || avg != 0.0) {
				name = null; studentID = 0; kor = 0; eng = 0; math = 0; avg = 0.0;
				System.out.println("리소스가 해제되었습니다.");
				
				// 초기화 후 메모리의 값을 출력 
			}

	}
	
}
public class Ex_TryWithResource_3 {

	public static void main(String[] args) {
		// 1. 객체의 모든 필드를 초기화하고 자동으로 close();
			try (Abc abc1 = new Abc("신장현",01, 50, 60, 70); ) {
				
			} catch (Exception e) {
				
			} // close() 호출 없이도 자동으로 close()
			
			System.out.println("====================");
			
		// 2. 수동 close(), finally 블락에서 close() 호출
			Abc abc2 = null;
			
			try {
				abc2 = new Abc("이순신", 22, 60, 80, 100);
			} catch (Exception e) {
				
			} finally {
				if (abc2.name != null || abc2.studentID != 0 || abc2.kor != 0 || abc2.eng != 0 || abc2.math != 0
						|| abc2.avg != 0.0) {
					
					try {
						abc2.close();
					} catch (Exception e){
						e.printStackTrace();
					}
				}
			}
	}	

}
