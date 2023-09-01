package RPGGame;

public class Monster extends Unit{
	private String type; //물, 불, 풀
	
	Monster() { //기본 생성자
		this.type = "기본";
	}

	Monster(String name) { //생성자
		super(1, name, 100, 1);
		this.type = "기본";
	}
			
	Monster(String name, int level) { //생성자
		super(1, name, 100, level);
		this.type = "기본";
	}
	
	Monster(String name, int level, String type) { //생성자
		super(1, name, 100, level);
		this.type = type;
	}
	
	Monster(int attack, String name, int hp, int level, String type) {
		super(attack, name, hp, level);
		this.type = type;
	}
	
	Monster(Unit unit, String type) {
		super(unit);
		this.type = type;
	}
	
	String getType() {
		return type;
	}
	
	@Override
	public String toString() {
		return super.toString() + "경험치 : " + this.type;
	}
		
	void attack(Character character) {
		super.attack();
		character.setHp(character.getHp() - super.getAttack());
		System.out.println(character.getName() + "이(가) " + super.getAttack() + "만큼의 피해를 입었습니다.");
		if(character.getHp() <= 0) {
			character.die();
		}
	}	
	
	int attack(Monster character) {
		super.attack();
		character.setHp(character.getHp() - super.getAttack());
		System.out.println(character.getName() + "이(가) " + super.getAttack() + "만큼의 피해를 입었습니다.");
		if(character.getHp() <= 0) {
			character.die();
		}
		return 1;
	}
}