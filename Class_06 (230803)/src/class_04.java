import java.util.Scanner;

public class class_04 {

	public static void main(String[] args) {
		Player p1 = new Player("Seon", 1);
		Monster m1 = new Monster ("멧돼지", 100);
		p1.infor();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i>=0; i++) { 
			System.out.println("몬스터가 나타났습니다. 전투를 시작하겠습니까? (y, n) :");
			m1.printInfo();
			
			String fightYN = sc.next();
			
			if(fightYN.equals("y")) {
				p1.fight();
				p1.clear((int)(Math.random()*90)+10);
			} else {
				m1.attack();
				p1.avoid();
				
			}
		
		}
	}
}
