
public class Monster {
	String name;
	int health;

	Monster(String name, int health) {
		this.name = name;
		this.health = health;
	}
	
	void printInfo() {
		System.out.println("이름 : "+name+", 체력 : "+health);
	}
	
	void attack() {
		System.out.println(name+"이(가) 공격을 시전합니다!");
	}

}
