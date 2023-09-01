package Restaurant;

public class Kids extends Cafe{
	String[] selectMenu = {"아이스크림", "사탕"};
	
	Kids() {
		super();
	}
	
	String selectCafeMenu() {
		return selectMenu[0];
	}
	
	void kidsAsk() {
		System.out.println("메뉴를 선택해주세요.");
	}
	
	void kidsMenu () {
		System.out.println("1. : " +this.selectMenu[0]+ ", 2. : " +selectMenu[1]);
	}

}
