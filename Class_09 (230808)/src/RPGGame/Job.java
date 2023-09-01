package RPGGame;

public class Job extends Character{
	private String job; //마법사:물1, 전사:불2, 궁수:풀3
	private int skillType; 
	private static final String[] jobList = {"마법사", "전사", "궁수"};
	
	Job() { //기본 생성자
		job = jobList[0];
		skillType = 1; //물
	}

	Job(String name) { //생성자
		super(name);
		job = jobList[0];
		skillType = 1; //물
	}
			
	Job(String name, int level) { //생성자
		super(name, level);
		job = jobList[0];
		skillType = 1; //물
	}
	
	Job(String name, int level, double experience, String job) { //생성자
		super(1, name, 100, level, experience);
		this.job = job;
		skillSetting();
	}
	
	Job(int attack, String name, int hp, int level, double experience, String job) {
		super(attack, name, hp, level, experience);
		this.job = job;
		skillSetting();
	}
	
	Job(Unit unit, String job) {
		super(unit);
		this.job = job;
		skillSetting();
	}
	
	Job(Unit unit, double experience, String job) {
		super(unit, experience);
		this.job = job;
	}
	
	Job(Character character, String job) {
		super(character);
		this.job = job;
	}
	
	@Override
	public String toString() {
		return super.toString() + "경험치 : " + this.job;
	}
		
	void skill(Monster monster) {
		int attack = super.getAttack();
		if(monster.getType().equals("물")) {
			if(skillType == 2) {
				attack *= 0.5;
			}
			else if(skillType == 3) {
				attack *= 2;
			}
		} else if(monster.getType().equals("불")) {
			if(skillType == 1) {
				attack *= 0.5;
			}
			else if(skillType == 3) {
				attack *= 3;
			}
		} else if(monster.getType().equals("풀")) {
			if(skillType == 2) {
				attack *= 0.5;
			}
			else if(skillType == 1) {
				attack *= 2;
			}
		}
		
		monster.setHp(monster.getHp() - attack);
		System.out.println(monster.getName() + "이(가) " + attack + "만큼의 피해를 입었습니다.");
		if(monster.getHp() <= 0) {
			monster.die();
			this.clear();
		}
	}
	
	private void skillSetting() {
		for(int i=0; i<jobList.length; i++) {
			if(job.equals(jobList[i])) {
				skillType = i+1;
			}
		}
	}
}