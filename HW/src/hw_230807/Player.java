package hw_230807;

public class Player {
	int dice;
	String name;
	
	Player() {
		dice = rollDice();
		name = "알 수 없음";
	}
	
	Player(String name) {
		dice = rollDice();
		this.name = name;
	}
	
	String play(Player player) {
		String winner;
		if(this.dice > player.dice) {
			winner = this.name;
		} 
		else if(this.dice < player.dice) {
			winner = player.name;
		}
		else {
			winner = "무승부";
		}
		this.dice = rollDice();
		player.dice = rollDice();
		return winner;
	}
	
	String play3(Player player1, Player player2) {
		String winner = player1.play(player2);
		if(winner.equals(player1.name)) {
//			this.play(player1); 와 winner = this.play(player1); 같음 (두가지 중 하나 써도 딤.)
			winner = this.play(player1);
			//자기자신이랑 플레이어1 무승부가 나게되면?
			if(winner.equals("무승부")) {
				winner = this.rematch(this, player1);
			}
		} else if (winner.equals(player2.name)) {
			winner = player2.play(this);
			//자기자신이랑 플레이어2랑 무승부가 나게되면?			
			if(winner.equals("무승부")) {
				winner = this.rematch(this, player2);
			}
		} else {
			//플레이어1,2 무승부
			winner = player1.play(this);
			//자기자신도 무승부
			if(winner.equals("무승부")) {
				player1.dice = this.rollDice();
				player2.dice = rollDice();
				this.dice = rollDice();
				System.out.println("1. 무승부입니다. 재경기합니다.");
				this.play3(player1, player2); // 재귀함수 :  함수 안에서 다시 함수를 호출하는 것.
			} else if (winner.equals(player1.name)) {
				winner = this.rematch(player1, player2);
			}
		}
		
		player1.dice = this.rollDice();
		player2.dice = rollDice();
		this.dice = rollDice();
;		
		return winner;
	}
	
	int rollDice() {
		return (int) (Math.random()*6+1);
	}
	
	//재경기하는 함수
	String rematch(Player player1, Player player2) {
		System.out.println("2. 무승부입니다. 재경기합니다.");
		String winner = player1.play(player2);
		while(winner.equals("무승부")) {
			System.out.println("2. 무승부입니다. 재경기합니다.");
			player1.dice = rollDice();
			player2.dice = rollDice();
			winner = player1.play(player2);
		}
		return winner;
	}

}
