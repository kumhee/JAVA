import java.util.Scanner;

public class class_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		
		//01-for문 사용
//		for( ; true ; ) {
//			System.out.println("숫자입력 : ");
//			int player = scan.nextInt();
//		
//			if(player < 0) {
//				System.out.println("합 : "+ sum);
//				System.out.print("종료");	
//				break;
//			} else if (player > 9) {
//				System.out.println("두 자리 수는 더하지 않습니다.");
//				System.out.println("합 : "+ sum);
//				continue;	
//			} else {
//				sum+=player;
//			}
//			System.out.println("합 : "+ sum);
//		}
		
		
		//02-while문 사용
		while(true) {
			int player = scan.nextInt();		
			if(player < 0) {
				break;
			} else if (player > 9) {
				continue;	
			}
			
			sum+=player;
		}
		System.out.println("합 : "+ sum);
		
		
		//사용자가 숫자를 계속입력 -> 입력된 값을 합해서 출력해주면 된다.
		//사용자가 음수를 입력하면 종료.
		//사용자가 두 자리 수 이상을 입력하면 더해지지 않아야 한다 
	}

}

//[break, continue]

// break 멈춰
// switch, 반복문 : switch, 반복문 더 이상 실행하지말고 멈춰줘.

// continue 계속해줘
// 반복문 : 내 아래의 코드를 무시하고 반복문 계쏙 실행해줘.