package chap14.Ex06;

// 일반 예외 (Checked Exception) : 컴파일 단계에서 예외,
	// 1.  직접 처리
	// 2. throws로 전가 (미룬다)

	// main 메소드에 throws를 전가 시키는 경우, Exception이 발생될 경우 정보를 출력해 주고 중지.


public class ThrowsException_2 {

	public static void main(String[] args) throws ClassNotFoundException {

		// 정상적으로 파일이 존재 합니다. ClassNotFoundException 이 발생되지 않는다.
		Class cls = Class.forName("java.lang.Object");
		
		// 정상적으로 파일이 존재 하지 않는다. ClassNotFoundException 이 발생
		Class cls2 = Class.forName("java.lang.Object00");
		
	}

}
