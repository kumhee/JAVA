import java.util.Scanner;

public class class_02_조건문예제 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tie = 0;
		int lose = 0;
		int win = 0;
		
		for (int i=0; i<5; i++) {
			System.out.println("플레이어1 : ");
			int player1 = sc.nextInt();
			System.out.println("플레이어2 : ");
			int player2 = sc.nextInt();
			
			while(true) { //a != 1 && a != 2 && a != 3
				if( player1 == 1 || player1 == 2 || player1 == 3) {
					break;
				}else if( player2 == 1 || player2 == 2 || player2 == 3) {
					break;
				}
				System.out.println("잘못입력했습니다.");
				player1 = sc.nextInt();
			}
			
			if(player1 == player2) {//a.equals(b)
				System.out.println("무승부");
				tie++;
			} else if(player1==1 && player2 == 2) {
				System.out.println("패배");
				lose++;
			} else if(player1 == 1 && player2 == 3) {
				System.out.println("승리");
				win++;
			}
			if(player1 == 2) {
				if(player2==1) {
					System.out.println("승리");
					win++;
				} else if(player2==3) {
					System.out.println("패배");
					lose++;
				}
			} 
			if(player1 == 3) {
				if(player2==1) {
					System.out.println("패배");
					lose++;
				} else if(player2==2) {
					System.out.println("승리");
					win++;
				} 
			}
		}
		System.out.println(win + "승 " + tie + "무 " + lose + "패 ");
		
		
		
		
		
		//switch 활용
//		for (int i=0; i<5; i++) {
//			if(a == b) {//a.equals(b)
//				System.out.println("무승부");
//			} else {
//				switch(a) {
//				case 1:
//					if(b==2) {
//						System.out.println("패배");
//					} else if(b==3) {
//						System.out.println("승리");
//					}
//					break;
//				case 2:
//					switch(b) {
//					case 1:
//						System.out.println("승리");
//					case 3:
//						System.out.println("패배");
//					}
//					break;
//				case 3:
//					if(b==1) {
//						System.out.println("패배");
//					} else if(b==2) {
//						System.out.println("승리");
//					} 
//					break;
//				}
//			}
//		}
		
	}
}

//반복문 : 두 명이서 게임을 5번했을 때, 누가 이겼는지, 혹은 첫번째 사람이 몇승 몇무 몇패인지 