
public class class_02_지역변수전역변수 {
	static int a;
	static int b; //static추가
	
	public static void main(String[] args) {
		System.out.println(a);
	}

}

// 지역변수 : 특정 지역에서만 사용가능

// 전역변수 : 전지역에서 사용가능
//	장점 - 모든 곳에서 접근이 가능.
//	단점 - 모든 곳에서 접근이 가능 (보안성)
//	함수 안, 밖 구분 - 변수가 선언된 위치가 어디의 지역변수.
//	지역의 구분은 항상 {}사이.

// 변수 선언 : 1. {}사이.	2. ()사이-> 옆에보면 {}