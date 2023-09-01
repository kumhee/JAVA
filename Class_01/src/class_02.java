
public class class_02 { 
	public static void main(String[] args) {//산술연산자
		System.out.println(5+2);
		System.out.println(5-2);
		System.out.println(5*2);
		System.out.println(5/2.0);
		System.out.println(5%2);
		
		System.out.println(5<2); //비교연산자
		System.out.println(5>6);
		System.out.println(5<=6);
		System.out.println(6>=6);
		System.out.println(5==5);
		System.out.println(6!=5);
		
		System.out.println(!(5==5)); //부정연산자
		
		int a = 1;
		int b = 2;
		
		System.out.println(a > b);
		System.out.println(a * b);
		System.out.println(!(a == b));
		
		//b가 1보다 크고 10보다 작은지?
		//System.out.println(1<b<10); //아래처럼 적어야 함.
		System.out.println(1<b && b<10);   //논리연산자 - &&(and)
		
		//a, b 둘 중 하나라도 음수인지?
		System.out.println(a<0 || b<0); //대입연산자
		
		int num_123 = 123;
		
		num_123 = num_123 + 100;
		num_123 += 100; 
		
		System.out.println(num_123); //323 증감연산자
		
		System.out.println(num_123++); //323
		System.out.println(++num_123); //325
		System.out.println(num_123); //325
		System.out.println(--num_123); //324
		System.out.println(num_123--); //324
		System.out.println(num_123); //323
		
		
		

	}
}











