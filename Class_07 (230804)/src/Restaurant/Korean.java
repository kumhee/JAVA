package Restaurant;

public class Korean extends Bistro{
	String[] selectMenu = {"제육", "비빔밥"};

	Korean() {
		super();
	}
	
	String selectKorean() {
		return selectMenu[0];
	}
	
	void koreanAsk() {
		System.out.println("메뉴를 선택해주세요.");
	}
	
	void koreanMenu () {
		System.out.println("1. : " +this.selectMenu[0]+ ", 2. : " +selectMenu[1]);
	}

}
