package hw_230807;

public class Main {

	public static void main(String[] args) {
		Player player1 = new Player("플레이어1");
		Player player2 = new Player("플레이어2");
		Player player3 = new Player("플레이어3");
		
//		System.out.println("player1 : " + player1.dice);
//		System.out.println("player2 : " + player1.dice);
		
		String winner = player1.play(player2);
//		while(winner.equals("무승부")) {
//			System.out.println("무승부입니다. 재경기합니다.");
//			winner = player1.play(player2);
//		}
//		
//		System.out.println("승자는 " + winner + "입니다.");
		
		winner = player1.play3(player2, player3);
		System.out.println("세명 중 승자는 " + winner + "입니다.");
		

	}

}
