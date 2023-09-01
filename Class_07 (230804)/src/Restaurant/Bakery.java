package Restaurant;

public class Bakery extends Cafe{
	String[] selectMenu = {"라떼", "아이스아메리카노"};

	Bakery() {
		super();
	}
	
	String selectBakeryMenu() {
		return selectMenu[0];
	}
	
	void bakeryAsk() {
		System.out.println("메뉴를 선택해주세요.");
	}
	
	void bakeryMenu () {
		System.out.println("1. : " +this.selectMenu[0]+ ", 2. : " +selectMenu[1]);
	}

}
