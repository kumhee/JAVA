package Restaurant;

public class Cafe extends Restaurant{
	String[] selectCag = {"Bakery", "Kids"};
		
	Cafe () {
		super();
	}
	
	Cafe (String name, String location, int point) {
		super (name, location, point);
	}

	void name1() {
		System.out.println("1. : " +this.selectCag[0]+ ", 위치: " +location+ ", 평점: " +point);
	}
	
	void name2() {
		System.out.println("2. : " +this.selectCag[1]+ ", 위치: " +location+ ", 평점: " +point);
	}
	
	void selectCafe() {
		System.out.println(selectCag[0] + " 혹은 " + selectCag[1] + "을 선택해주세요");
	}
	
	

	
//	void name() {
//		System.out.println("상호명: " +this.cag+ ", 위치: " +location+ ", 평점: " +point);
//	}
}
