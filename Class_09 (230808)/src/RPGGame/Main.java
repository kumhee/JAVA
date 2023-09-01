package RPGGame;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Unit unit = new Unit("캐릭터");
		Character p1 = new Character(unit);
		Character p2 = new Character(unit);
		Job water = new Job(unit, "마법사");
		Monster m1 = new Monster("멧돼지", 100);
		
		Scanner sc = new Scanner(System.in);
		
		//p1.printInfo();
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.equals(p2));
		
		for(int i=0; i>=0; i++) { 
			System.out.println("몬스터가 나타났습니다. 전투를 시작하겠습니까? (y, n) :");
			System.out.println(m1);;
			
			String fightYN = sc.next();
			
			if(fightYN.equals("y")) {
				p1.attack(m1);
			} else {
				m1.attack();
				p1.avoid();
			}
		}
	}
}