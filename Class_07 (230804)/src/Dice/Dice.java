package Dice;

import java.util.Scanner;
import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Player player = new Player();
		Player computer = new Player();
		
		for (int i=0; i<3; i++) { //3번

            int playerValue = player.rollDice();
            int computerValue = computer.rollDice();
            
            System.out.println("라운드 " + (i + 1));
            System.out.println("주사위를 굴리려면 숫자를 입력하세요.");
            sc.nextLine();
            
            System.out.println("Player: " + playerValue);
            System.out.println("Computer: " + computerValue);
            
         // 승패 판단
            if (playerValue > computerValue) {
                System.out.println("Player가 이겼습니다!");
            } else if (playerValue < computerValue) {
                System.out.println("컴퓨터가 이겼습니다!");
            } else {
                System.out.println("무승부 입니다!");
            }
            System.out.println();	
		}	
	}
}

class Player {
	
	int result;
	
	//주사위값을 만드는 함수
    // 주사위 값 생성 함수
    Player() {
        rollDice();
    }
	
	public int rollDice() {
		// 랜덤으로 주사위 값 생성 (1~6)
        Random random = new Random();
        this.result = random.nextInt(6) + 1;
        return this.result;
	}	
}

