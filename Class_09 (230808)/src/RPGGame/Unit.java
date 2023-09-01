package RPGGame;

public class Unit {
	private int attack;
	private String name;
	private int hp;
	private int level;
	
	Unit() {
		attack = 1;
		name = "초보자";
		hp = 100;
		level = 1;
	}
	
	Unit(String name) {
		attack = 1;
		this.name = name;
		hp = 100;
		level = 1;
	}
	
	Unit(int attack, String name, int hp, int level) {
		this.attack = attack;
		this.name = name;
		this.hp = hp;
		this.level = level;
	}
	
	Unit(Unit unit) {
		this.attack = unit.attack;
		this.name = unit.name;
		this.hp = unit.hp;
		this.level = unit.level;
	}
	
	String getName() {
		return name;
	}
	
	int getHp() {
		return hp;
	}
	
	void setHp(int hp) {
		this.hp = hp;
	}
	
	int getAttack() {
		return attack;
	}
	
	int getLevel() {
		return level;
	}
	
	void setLevel(int level) {
		this.level = level;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + ", 레벨 : " + level + ", 체력 : " + hp + ", 공격력 : " + attack;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj.getClass().equals(this.getClass())) {
//			return this.name == obj.name && this.attack == obj.attack;
//		}
//	}
	
	public boolean equals(Unit unit) {
		return this.name == unit.name && this.attack == unit.attack;
	}
	
	void attack() {
		System.out.println(name + "이(가) 공격을 시전합니다.");
	}	
	
	void die() {
		System.out.println(name + "이(가) 사망하였습니다.");
	}
}