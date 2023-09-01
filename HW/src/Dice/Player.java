package Dice;

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

		return winner;
	}
	
	String play3(Player player1, Player player2) {
		String winner = player1.play(player2);
		if(winner.equals(player1.name)) {
			winner = this.play(player1);
			if(winner.equals("무승부")) {
				winner = rematch(this, player1);
			}
		}
		else if(winner.equals(player2.name)) {
			winner = player2.play(this);
			if(winner.equals("무승부")) {
				winner = rematch(this, player2);
			}
		}
		else {
			winner = player1.play(this);
			if(winner.equals("무승부")) {
				player1.dice = this.rollDice();
				player2.dice = rollDice();
				this.dice = rollDice();
				System.out.println("무승부입니다. 재경기합니다.");
				this.play3(player1, player2); //재귀함수 -> 함수 안에서 다시 함수 호출
			}
			else if(winner.equals(player1.name)) {
				winner = rematch(player1, player2);
			}
		}
		
		player1.dice = this.rollDice();
		player2.dice = rollDice();
		this.dice = rollDice();
		
		return winner;
	}
	
	int rollDice() {
		return (int) (Math.random()*6+1);
	}
	
	String rematch(Player player1, Player player2) {
		System.out.println("무승부입니다. 재경기합니다.");
		String winner = player1.play(player2);
		while(winner.equals("무승부")) {
			System.out.println("무승부입니다. 재경기합니다.");
			player1.dice = rollDice();
			player2.dice = rollDice();
			winner = player1.play(player2);
		}
		
		return winner;
	}
}
