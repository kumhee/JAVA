
public class class_01_변수 {
	public static void main(String[] args) {
		int a = 10;
		float b = (float)10.0;
		float c = (float)20.25;
		String str; //char 변수들의 집합, 속에 메소드도 들어있다. (String은 객체로 되어있다.)
		
		System.out.println("----------------산술연산자");
		//산술연산자 : 변수 혹은 값이 연산할 때, 더 높은 자료형으로 변환되서
		System.out.println(a+1); //11
		System.out.println(a+b); //20.0
		System.out.println(a/b); //10 / 10.0 = 1.0
		System.out.println(b/c); //20.25 / 10.0 = 0.5
		System.out.println(a/3); //나누어 떨어지지 않고, 자료형이 int여서 int로 출력됨.(3)
		System.out.println(a%b); //0.0
		System.out.println(b%c); //10.0
		System.out.println(a%3); //1
		
		System.out.println("----------------비교연산자");
		double d1 = 10.0;
		double d2 = 20.25;
		System.out.println(d1 < d2);
		
		boolean b2 = d1 >= d2; //true
		System.out.println(b2); //true
		System.out.println(!b2); //false
		System.out.println(d1 == 10.0);
		System.out.println(d2 != 20.25); //뒤에서 숨어있는 숫자로 인해서 false가 나옴. 
		System.out.println((int) d2*10000  == (int) 20.25*10000); //*10000을 해서 자리수를 잘라주면 제대로된 결과값이 나옴.
		
		System.out.println("-> " + (d1 < d2 && b2 )); // T && F =F
		System.out.println("-> " + (d1 == 10.0 || d2 != 20.25 ));
		//d1이 10.0이랑 같아? 또는 d2가 20.25랑 같지 않아?
		
		System.out.println(d1 < d2 && b2 || d1 == 10.0); // T && F || T =-> F||T = true		
		
		int n1 = 1;
		int n2 = 2;
		int n3 = 3;
		
		System.out.println(n1 >= --n2 || n3 != 3 && n3 > n2 && n3-- > n2++); // T || F && T && T // T && T && T -> T 
		System.out.println(n3-- > n2++);
		
		System.out.println("----------------증감연산자");
		d1 += 11;
		System.out.println(d1); //21.0
		d2 /=4; // -> d2 = d2 / 4; 
		System.out.println(d2); //5.0625
		
		d1%=d2; // -> d1 = d1 % d2;// 나머지 정수 ? //5.0625 * 4 -> 20.25
		System.out.println(d1); //21.0 - 20.25(위에서 나온 값을 빼준 결과값이 출력됨.)
		
		System.out.println(d2++);
		System.out.println(d2); // +1이 증가됨.
		System.out.println(--d2);
		
		System.out.println("----------------");
		
		int num1 = 10;
		int num2 = 20;
	
		System.out.println((num1++) + (num2++)); //단순히 10+20
		System.out.println("num1: " + num1 + ", num2: " + num2); //위의 코드가 실행되고 1이 증가해서 11, 21
		
		
		
		
		
		
	}
}

// 변수 : 종류가 많다.

// 1. 연산자
// 2. 산술연산자 :  -, +, *, /, %
// 3. 비교연산자 : 값 2개를 비교하는 것. <, >, <=, >=, ==, !=     boolean값이 반환된다.
// 4. 대입연산자 : a = b -> "a는 b다."가 아닌 b의 값을 a에 대입한다.
// 5. 부정연산자 : ! (뒤집개) true를 false를 바꿔주고, false를 true로 바꿔줌.
// 6. 증감연산자 : 자기 자신에게 값을 더한다, 뺀다, 등...
//				ex) a = a+10; -> a += 10이렇게 줄일 수 있음. (+=. -=. *=, /=, %= : 12%=5-< 12%5
//				++, -- 
//	++a, --a : 전위 - 해당 코드를 시작하기 전에 값을 1 증가 or 감소시킨다.  
//	a++, --a : 후위 - 해당 코드를 시작하고 나서 값을 1 증가 or 감소시킨다.
// 
// 7. 논리연산자 : (1) &&(and연산자) : 양 쪽 둘 다 true일때만 true
//					T && T = True 
//					T && F = False
//					F && T = False
//					F && F = False 
//				(2) ||(or연산자) : boolean을 대상으로 한 연산자

