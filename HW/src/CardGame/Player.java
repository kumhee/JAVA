package CardGame;

import java.util.Scanner;

public class Player extends Card{
	int cardNumber;
	int count = 0;
	String name;
	Scanner sc = new Scanner(System.in);
	
	Player(String name) {
		this.name = name;
	}
	
	int inputPlayer() {
		System.out.println("카드 : {1.거지, 2.시민, 3.귀족, 4.왕}");
		System.out.println("플레이어 1 차례 : ");
		cardNumber = sc.nextInt();
		cardNumber = rand(cardNumber);
		super.arr[count++] = cardNumber;
		
		return cardNumber;
	}
	
	int rand(int cardNumber) {
		for(int k = 0; k < arr.length; k++) {
			if(arr[k] == cardNumber) {
				System.out.println("카드 : {1.거지, 2.시민, 3.귀족, 4.왕}");
				System.out.println("플레이어 1 차례 : ");
				cardNumber = sc.nextInt();
				k = -1;
				continue;
			}
			else if(arr[k] == 0) {
				break;
			}
		}
		return cardNumber;
	}
}
