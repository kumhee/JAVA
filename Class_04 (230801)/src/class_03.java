import java.util.ArrayList;

public class class_03 {

	public static void main(String[] args) {
		Restaurant res = new Restaurant();
//		res.printRes();
		
		
		Korean korean = new Korean();
		//korean.printRes();
		
		Japanese jap = new Japanese();
		//jap.printRes();
		
		American ame = new American();
		//ame.printRes();
		
		Korean kor2 = new Korean("대한민국", "한식당",2, "백반", 5000);
		kor2.printRes();
		
		System.out.println();
		
		String[] menu = {"초밥", "라멘", "우동"};
		int[] price = {1000, 8000, 7000};	
		Japanese jap2 = new Japanese("일본", "일식당", 4, menu, price);
		jap2.printRes();
		
		System.out.println();
		
		String[] menu1 = {"피자", "파스타", "샐러드"};
		int[] price1 = {3000, 6000, 9000};
		American ame2 = new American("미국", "양식당", 4, menu1, price1);
		ame2.printRes();
		
		System.out.println();
		
//		jap2.setPoint(1);
//		jap2.setPoint(1);
//		jap2.setPoint(1);
//		jap2.setPoint(1);
//		jap2.setPoint(1);
//		jap2.printRes();
		
		//Korean[]korea = new Korean[5]; //배열
		ArrayList<Korean> koreaList = new ArrayList<>();
		System.out.println("size: "+koreaList.size());
		koreaList.add(korean);
		System.out.println("size: "+koreaList.size());
		koreaList.add(kor2);
		System.out.println("size: "+koreaList.size());
		
		Korean kor3 = new Korean("대한민국", "국밥", 3, "국밥", 6000);
		koreaList.add(kor3);
		
		koreaList.add(new Korean("대한민국", "김밥", 4, "김밥", 4000));

//		System.out.println(koreaList.get(2).name);
//		koreaList.remove(2);
//
//		System.out.println("size: "+koreaList.size());
//		
//		System.out.println("-----------------01.");
//		
//		koreaList.get(0).printRes();
//		koreaList.get(1).printRes();
//		koreaList.get(2).printRes();
		
		System.out.println("-----------------01방법을 반복문으로 간단하게");
		
		for(int i=0; i<koreaList.size();i++) {
			koreaList.get(i).printRes();
		}	
	}
}
// 객체는 배열에 못넣나?
// String[] -> 객체 배열

// 배열(Array) List
// ArrayList
//	ArrayList 특징 : 객체밖에 못 넣는다.
//	ArrayList는 사이즈가 유동적이다. 
// (배열의 단점 : 사이즈를 지정해줘야 한다.)
//	ex) ArrayList<객체> = new ArrayList<>();
