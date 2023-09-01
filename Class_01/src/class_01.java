
public class class_01 {
	public static void main(String[] args) { //프론트엔드
		int num = 123;
		double f = 123.1254;
		char c = 'a';
		String str = "\"Hello\"";
		boolean b = true;
				
		
		System.out.print(num + "\n");
		System.out.print(f + "\n");
		System.out.print(c + "\n");
		System.out.print(str + "\n");
		System.out.print(b + "\n");
		System.out.print("\n");
		System.out.print("");
	}
}

//ln = line new(줇바꿈)

// 컴퓨터는 바로다
// 1,0 -> 연산속도가 엄청 빠르다.
// 컴퓨팅 사고 -> 컴퓨터처럼 생각.
// 논리적 사고 -> 컴퓨팅, 수학적 사고력 
// 아스키 코드(ASKII CODE) -> a : 90 -> A...Z -> 76 ~ (알파벳을 숫자로 인식.)

// 기계어 <- 어셈블리어 <- 고급언어 <- 언어
// 컴파일러(통역사) -> 컴파일


// [변수] (변하는 수)
// 정수 - 양의 정수, 0 / 음의 정수 - -123, 456 ...
//	└>int(4 byte), long(8 byte), short(2 byte), byte ...
//		(합쳐서 씀)short int, long int, long long int, long long long int
// 실수 - 유리수, 무리수 - 123.0215, -1234.4325
//	└>double(8 byte), float(4 byte)...
//		short double, long float,
// 문자 - 'a', 'b', 'c', ... (1 byte)
//	└>char 
//	\n, \t, \a, \v
// 문자열 - "Hello"
//	└>String
// boolean - True or false -> 커퓨팅적
// void - 비어있다. 


// [연산자]
// 산술연산자 - +, -, *, /, % 
// 비교연산자 - <, >, <=, >=, ==, !=(같지않다)
// 부정연산자 - !
// 논리연산자 - &&(and), ||(or)
// 대입연산자 - a = b -> 우항의 값을 좌항에 대입한다. (b값을 a에 대입한다)
//			자료형 변수명 = 값
//			식별자 - 클래스를 만들 때,이름을 숫자로 적으니까 에러남. 
//			   특징이 있음. 숫자가 앞으로 오면 안된다. 텍스트 뒤로 가면 사용가능.(ex.index_123)
//			   특수문자는 언더바(_)만 사용이 가능 가능함.
// 			int, double, out, System, print ... 이런 것들을 변수로 사용할 수 없음.
//			변수 - 전부 소문자를 사용함. (snake - helloWorld)
//		클래스, 함수 - 첫 글자만 대문자 (camel - Print, Print_out)
// 증감연산자 - 값을 증가시키고, 감소시키고  =+, -=, *=, /+, %= 이 다섯개 모두 사용할 수 있음.
// 								  ++, -- -> 1씩증가, 1씩 뺌
// 			 전위증가, 전위감소 - ++num, --num -> 코드를 실행하기 전에 증가시키고 감소시킴.
// 			 소위증가, 소위감소 - num++, num-- -> 코드를 실행한 후에 ".
// 주석 -> 컴퓨터틑 못 읽고 사람만 읽을 수 있는 메모.











