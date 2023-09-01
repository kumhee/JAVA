import java.util.Scanner;

public class class_02_조건문 {

	public static void main(String[] args) {
		int a = 1;
		
		if(10 < a) {
			System.out.println("안녕하세요");
		} else if (a > 5) {
			System.out.println("반갑습니다");
		} else if (a > 6) {
			System.out.println("안녕");
		} else {
			System.out.println("안녕히가세요");
		}
		
		
		int num = 1;
		switch(num) {
		case 12: //if (num == 12)
			System.out.println(num);
		case 1 : //else if
			num *= 10;
		case-5 : //else if
			--num;
		case (int)10.25: //else if
			System.out.println(num<2);;
		case 'a': //else if
			System.out.println("안녕하세요");
		default: //else
			System.out.println("종착역입니다.");
		}//num이 1이면 1부터 실행이되고, 12면 12부터 출력. 하지만 2면 case에 해당하는 2라는 숫자가 없어서 "종착역입니다"만 출력이됨.
		
		
		
		//입력 Scanner 둘이서 가위바위보, 누가 이겼는지.
		//조건문을 통해서 "---입니다."라고 출력.
		//1입력: 가위, 2입력: 바위, 3입력: 보 
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();		
		
		if(a == 1 ) {
			System.out.println("가위입니다.");
		} else if(a == 2) {
			System.out.println("바위입니다.");
		} else if(a == 3) {
			System.out.println("보입니다.");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}

		
		switch(a) {
		case 1:
			System.out.println("가위입니다.");
			break;
		case 2:
			System.out.println("바위입니다.");
			break;
		case 3:
			System.out.println("보입니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		} 
	}

}

// 조건문