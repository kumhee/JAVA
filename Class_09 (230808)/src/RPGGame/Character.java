package RPGGame;

public class Character extends Unit{
	private double experience; //인스턴수 변수
	
	Character() { //기본 생성자
		this.experience = 0;
	}

	Character(String name) { //생성자
		super(1, name, 100, 1);
		this.experience = 0;
	}
			
	Character(String name, int level) { //생성자
		super(1, name, 100, level);
		this.experience = 0;
	}
	
	Character(String name, int level, double experience) { //생성자
		super(1, name, 100, level);
		this.experience = experience;
	}
	
	Character(int attack, String name, int hp, int level, double experience) {
		super(attack, name, hp, level);
		this.experience = experience;
	}
	
	Character(Unit unit) {
		super(unit);
		this.experience = 0;
	}
	
	Character(Unit unit, double experience) {
		super(unit);
		this.experience = experience;
	}
	
	@Override
	public String toString() {
		return super.toString() + "경험치 : " + this.experience;
	}
	
	void attack(Monster monster) {
		super.attack();
		monster.setHp(monster.getHp() - super.getAttack());
		System.out.println(monster.getName() + "이(가) " + super.getAttack() + "만큼의 피해를 입었습니다.");
		if(monster.getHp() <= 0) {
			monster.die();
			this.clear();
		}
	}	
	
	void clear() {
		System.out.println("전투를 성공적으로 클리어하였습니다.");
		System.out.println(experience);
		getExperience();
	}
	
	void getExperience() {
		this.experience += (int)(Math.random()*90)+10;
		if(this.experience >= 100) {
			super.setLevel(getLevel()+1);
			System.out.println(super.getName() + "의 레벨이 상승합니다." );
			System.out.println("현재 " + super.getName() + "의 레벨은 " + this.getLevel() + "입니다.");
			this.experience -= 100;
		}
	}
	
	void avoid() {
		System.out.println("전투에서 도망쳤습니다. 나약한 녀석!!!");
	}
}