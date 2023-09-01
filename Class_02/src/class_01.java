
public class class_01 {

	public static void main(String[] args) {
		//for(1. 초기식;2. 조건식;3.증감식)
//		for(int i = 0 ; i<10 ; i++) {
//			System.out.println(i);
//		}
//		
//		//while(조건식)
//		int i = 0; //for문의 초기식
//		while(i<10) {
//			System.out.println(i++);
//			//i++; //for문의 증감식
//		}
		
		
		
		//예제--------(0 2 4 6 8 10 ...100)짝수만 출력
//        for (int x = 0; x <= 100; x++) {
//            if (x % 2 == 0) {
//                System.out.println(x);
//            }
//        }
//        
//		int y = 1; 
//		while(y <= 100) {
//			if(y % 2 == 0) {
//				System.out.println(y);
//				//i++; ----> 위의 if문 사용안하고 i++; 추가해도 됨.
//			}
//		}
		
		
		
		//예제--------구구단 (2단부터 9단까지)
		//2x1=2
		//2x2=4
//		for(int x=2; x<=9 ;x++){
//			System.out.println("-----"+x+"단"+"-----");
//			for(int i=1; i<=9; i++) {
//				System.out.println(x+" X "+i+" = " + x*i ); 
//			} 
//		}
		
		// 구구단 while문
		int i=2;
		while (i<1) {
			int j=1;
			System.out.println("-----"+i+"단"+"-----");
			while(j<10) {
				System.out.println(i+" X "+j+" = " + i*j );
				j++;
			}
			i++;
		}
		
	}
}
// 반복문
// <for문>
//	for(1. 초기식;2. 조건식;3.증감식) {
//	코드
//	}	
//	1. 초기식: 처음 시작을 정해준다. -> 어디부터 시작할래? -- 시작
//	2. 조건식: 특정 조건을 만족할 때 반복. -> 언제부터 할래? -- 끝
//	3. 증감식: 시작부터 끝까지 도달. -> 어떻게 진행할래? -- 중간


// <while문>
//	while(조건식) {
//	코드
//	}
//	언제까지 할래? -> 끝


// <for문의 특징>
//	for(1.초기식, 초기식, 초기식; 2.; 3. 증감식, 증감식, 증감식)
//	예) for(int i=0, j=1, k=10; i=10 && j<20 && j<20 || k<100; i++, j+=2, k*2)

//	for(;2. 조건식;) //조건식만 들어간 while문 (초기식이 빠짐)


// break, continue
// switch -> break를 쓰면 switch문을 빠져나옴.
//	- break : for문, while문, switch문, 빠져나오게 함.

//	- continue : for문, while문을 건너띌 수 있게 도와줌. -> 내 아래 코드 더 이상 실행하지말고 계속해줘





