
public class Math {

	public static int add(int a, int b) {
		return a + b;
	}
	
	public static double add(double a, double b) {
		return a + b;
	}
	
	public static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static double add(double...ds) { //double 여러개 전달 해주는 것.
		double sum = 0.0;
		
		for(double d : ds) { //객체같은 리스트 덩어리를 사용할 때, ds를 하나씩 꺼내와서 d에 넣을꺼야.
			sum += d;
		}
		
		return sum;
	}
}
// 도형 넓이 계산 - 원, 사각형 (직사각형, 정사각형, 마름모, 사다리꼴), 삼각형(이등면, 정삼각형, 예각, 둔각), 오각형
// 넓이 계산해서 출력.
// 사각형 변의 길이를 몇 개 입력할지?
// 자료형을 정수로 입력할지 실수로 입력할지?