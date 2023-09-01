package Restaurant;
	
public class American extends Bistro{
	String[] selectMenu = {"피자", "파스타"};
	
//	American(){
//		super("","",1);
//	}
	
	American() {
		super();
	}
	
	String selectAmerican() {
		return selectMenu[0];
	}
	
	void americanAsk() {
		System.out.println("메뉴를 선택해주세요.");
	}
	
	void americanMenu () {
		System.out.println("1. : " +this.selectMenu[0]+ ", 2. : " +selectMenu[1]);
	}
	
	
}


