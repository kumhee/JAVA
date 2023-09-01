package Restaurant;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant ();
		Bistro bistro = new Bistro ("식당", "김포", 10);
		Cafe cafe = new Cafe ("카페", "강남", 8);
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println( cafe.cag+" 또는 "+ bistro.cag+"을 입력하세요");
		
		String input = scan.next();	
		
		
		if(input.equals("카페")) {
			cafe.name1();
			cafe.name2();	
			System.out.println();
			cafe.selectCafe();
		}else if (input.equals("식당")) {
			bistro.name1();
			bistro.name2();
			System.out.println();
			bistro.selectRes();
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		American american = new American();
		Korean korean = new Korean();
		
		String inputMenu = scan.next();	
		if (inputMenu.equals("양식")) {
			System.out.println();
			american.americanAsk();
			american.americanMenu();
		} else if (inputMenu.equals("한식")) {
			System.out.println();
			korean.koreanAsk();
			korean.koreanMenu();
		} else {
		}
		
		Kids kids = new Kids();
		Bakery bakery = new Bakery();
		
		if (inputMenu.equals("베이커리")) {
			System.out.println();
			bakery.bakeryAsk();
			bakery.bakeryMenu();
		} else if (inputMenu.equals("키즈")) {
			System.out.println();	
			kids.kidsAsk();
			kids.kidsMenu();
		} else {
		}
		
		
		
		
		
//		if (input.equals(bistro.selectCag[0])) {
//			System.out.println(bistro.res2(input));
//		}
		
//		System.out.println(bistro.selectRes[0].equals(input));
//		System.out.println(bistro.res().equals(input));
		

	}

}
