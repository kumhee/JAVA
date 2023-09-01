
public class Japanese extends Restaurant{
	String[]menu; //= new String[3]; //식당에는 3개의 메뉴가 있다.
	int[]price; //= new int[3];
	
	Japanese() {
		setting();
	}
	
	Japanese(String nation, String name, int point){
		super(nation, name, point); //string으로 부모한테 보냄.
		this.setting();
	}
	
	Japanese(String nation, String name, int point, String menu,
			int price) {
		super(nation, name, point);
		
		setting();
		this.menu[0] = menu;
		this.price[0] = price;
	}
	
	Japanese(String nation, String name, int point, String[]menu,
			int[]price) {
		super(nation, name, point);
		this.menu = menu;
		this.price = price;
	}
	
	void setting() {
		menu = new String[3];
		price = new int[3];
		
		for(int i=0; i<menu.length; i++) {
			menu[i] = "SOLD OUT";
			price[i] = 0;
		}
	}
	
	void printRes() {
		super.printRes();
		for(int i=0; i<menu.length; i++) {
			System.out.println("메뉴: "+menu[i]+ " , 가격: "+price[i]);
		}
	}
	
}
