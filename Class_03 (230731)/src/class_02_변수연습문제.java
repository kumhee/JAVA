
public class class_02_변수연습문제 {
	public static int a = 1;
	public static int b = 1; 

	public static void main(String[] args) {
		int a = 10;
		int b = 20; 
		
		System.out.println(a++);
		System.out.println(b++); //11, 21로 바뀌어서 시작
		func1();
		System.out.println("1. a: "+a+" ,b: "+b); //11, 21
		func2(a,b);
		System.out.println("2. a: "+a+" ,b: "+b); //11, 21
		func3();
		System.out.println("3. a: "+a+" ,b: "+b); //11, 21
		func4(); //2
		func5(); //2
		System.out.println("4. a: "+a+" ,b: "+b); //11, 21
		func6(a); //11
		func7(b); //21
		System.out.println("5. a: "+a+" ,b: "+b); //, 21
		func8(a);
		func9(b);
		func10();
		func11();
	}
	
	public static void func1() { //전역변수 : 2, 2
		a++;
		b++;
	}
	
	public static void func2(int a, int b) { //지역변수
		a++;
		b++; //12, 22
	}
	
	public static void func3() {
		int a = -1;
		int b = -2; 
	}
	
	public static int func4() {
		return a;
	}
	
	public static int func5() {
		return b;
	}
	
	public static int func6(int a) { 
		return a + 10; //21
	}
	
	public static int func7(int b) {
		return b + 10; //31
	}
	
	public static void func8(int a) {
	    System.out.println("6. a: " + a + " ,b: " + b);
	}

	public static void func9(int b) {
	    System.out.println("7. a: " + a + " ,b: " + b);
	}

	public static void func10() {
	    System.out.println("8. a: " + a + " ,b: " + b);
	}

	public static void func11() {
	    int a = -1;
	    int b = -2;
	    System.out.println("9. a: " + a + " ,b: " + b);
	}


}
