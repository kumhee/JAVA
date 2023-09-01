import java.util.Scanner;


public class class_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a;  // 변수선언
		double d = 123.123; //변수선언과 초기화를 같이 함.
		 a = 12; // 변수 초기화
		 a = a + 100; // 초기화 이전에 쓰레기 값이 들어가있다. 
		
		a = scan.nextInt();
		System.out.println("a : " + a);
		
		d = scan.nextDouble();
		System.out.println("b : " + d);
		
		String str;
		str = scan.next();
		System.out.println("str: " + str); //hello world를 입력했을 때, 앞의 "hello"만 출력됨.
		
		str = scan.next();
		System.out.println("str: " + str); //hello world 앞 뒤 단어 둘 다 출력됨.
		
		scan.nextLine();
		str = scan.nextLine();
		System.out.println("str: " + str); //앞에 scan.nextLine(); 추가하면 hello world 뒤에 작성한 모든 문장이 잘 출력됨.
		
		
		// 01. 실수 2개를 입력받고, 두 개의 합을 출력하세요.
		//01-1
		System.out.println("첫 번째 실수를 입력하세요: "); 
		double num1 = scan.nextDouble();		
		
		System.out.println("두 번째 실수를 입력하세요: ");
        double num2 = scan.nextDouble();		
		
        double result = num1 + num2;
        System.out.println("두 실수의 합은: " + result);
		
        //02-2
        double d1, d2;
        System.out.print("실수 2개를 입력해주세요: ");
        d1 = scan.nextDouble();
        d2 = scan.nextDouble();
        
        System.out.println("두 수의 합: " + (d1+d2));
        
        
        // 02. 철수, 영희가 엄마가 둘 다 시험에서 100점 맞으면 - 사용자 2개
        // int & double 두 가지 방법.
        System.out.print("점수 2개를 입력해주세요: ");
        d1 = scan.nextDouble(); //        int i1 = scan.nextInt();
        d2 = scan.nextDouble();//         int i2 = scan.nextInt();
//        								  boolean b = d1==100&&d2==100
        
        System.out.println("철수: " + d1 + "점, 영희: " + d2 + "점, 성공: " + (d1 == 100 && d2 == 100));
//		System.out.println("철수: " + i1 + "점, 영희: " + i2 + "점, 성공: " + (i1 == 100 && i2 == 100));
		


	}
}


// 출력 - System.out
// 입력 - System.in












