public class class_01_함수 {

	public static void main(String[] args) {
		System.out.println(function1());
		function2(2);
		System.out.println(sum(10, 30));
	}
	
	public static int function1() {
		return 1;
	}
	
	public static void function2(int x) {
		System.out.println(x);
		return;
	}
	
	public static int sum(int x, int y) {
		return x+y;
	}
}



// [함수] <- f(x) : 입력값이 있고, 출력값이 있는 것.

//	자료형 함수명(x-매개변수) {}
// 	 코드
//	 반환값
//	}

//	- 매개변수의 특징 : 자료형 변수명, 여러개가 올 수 있다. -> void 매개변수가 없다. 
//		- 반환값 -> 여러개가 올 수 있지만, 반환값은 단 하나다. -> void 반환값이 없다.
//					
//
//
//
