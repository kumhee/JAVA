package Restaurant;

public class Bistro extends Restaurant{
	String[] selectCag = {"양식", "한식"};
	
	Bistro() {
		super();
	}
	
	Bistro (String name, String location, int point) {
		super (name, location, point);
	}
	
	void name1() {
		System.out.println("1. : " +this.selectCag[0]+ ", 위치: " +location+ ", 평점: " +point);
	}
	
	void name2() {
		System.out.println("2. : " +this.selectCag[1]+ ", 위치: " +location+ ", 평점: " +point);
	}
	
	void selectRes() {
		System.out.println(selectCag[0] + " 혹은 " + selectCag[1] + "을 선택해주세요");
	}
	
	
	
	
//	String res() {
//		return selectCag[0];
//	}
//
//	boolean res2(String str) {
//		return  str.equals(selectCag[0]);
//	}
	
	//자료형 함수명(매개변수) {리턴값}
//	void resName() {
//		System.out.println("상호명: " +this.resName+ ", 위치: " +location+ ", 평점: " +point);
//	}
}
