import java.util.Scanner;

public class HW_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] cardGame = {"거지","시민","귀족","왕"};
		int score1 = 0;
		int score2 = 0;
		
		for (int i=0; i<4; i++) {
			System.out.println("카드 : {1.거지, 2.시민, 3.귀족, 4.왕}");
			System.out.println("플레이어1 차례 : ");
			int player1 = sc.nextInt();
			
			System.out.println("플레이어2 차례 : ");
			int player2 = sc.nextInt();
			
			if((player1 == 1 && player2 == 4) || (player1 == 4 && player2 == 1)) {
				System.out.println("노예와 왕이 만났습니다!");

				if (player1 > player2) {
					score1+=4;
				} else if (player2 > player1) {
					score2+=4;
				} 
				break;
			}
			else if (player1 > player2) {
				score1++;
			} else if (player2 > player1) {
				score2++;
			}
		}
		
		if(score1 > score2) {
			System.out.println("Player 1이 승리하였습니다.");
		} else if (score1 < score2) {
			System.out.println("Player 2이 승리하였습니다.");
		} else {
			System.out.println("무승부입니다.");
		}
	}
}	
		
		
		
		
		
		
		
		
		
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("[왕거지게임]");
//
//        System.out.print("계급을 입력해주세요: ");
//        String input = scanner.nextLine();
//
//        if (input.equals("노예")) {
//            System.out.println("죽었습니다");
//        } else {
//            System.out.println("살아남습니다");
//        }
//
//        scanner.close();

