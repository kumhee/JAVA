
public class class_03_Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

// [쓰레드 - Thread] : 프로그램의 작업 흐름

// 멀티쓰레드 -> 멀티쓰레닝 (MultiThreading) : 쓰레드를 동시에 실행시킨다.

//쓰레드 사용방법:
// 1. Thread클래스를 상속받아 사용하기.
// 2. Runnable 인터페이스를 상속받아 사용하기.


//쓰레드의 문제점:
// 데이터 경쟁(race condition) -> 여러개의 쓰레드가 동시에 공유된 데이터 접근하여 발생할 수 있는 문제.
// 해결방밥 : synchronized 키워드 사용
//		  -> 원하는 코드에 한 번에 쓰레드 하나씩만 접근 가능하게 동기화해준다.