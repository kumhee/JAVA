import java.util.Scanner;

public class class_05 {

	public static void main(String[] args) {
		//내가 입력한 것들 중에 있는지 없는지로 찾을때:
//		String[]str = new String[5];
//		
		Scanner scan = new Scanner(System.in);
//		for(int i=0; i<5;i++) {
//			str[i]=scan.next();
//		}
//		
//		for(int i=0; i<5;i++) {
//			System.out.println(str[i]);
//		}
		
		//입력되어있는 [i]들 중에서 있는지 없는지로 찾을때:
		String[]str = {"자바","파이썬","안드로이드","플러터","루비"};
		

		
		
		
		//String 5개짜리 -> 사용자 입력 받은 값이 배열에 들어있는지 없는지 찾아보는 프로그램.
		String menu = scan.next();
		
		for(int i=0;i<5;i++) {
			if(menu.equals(str[i])) {
				System.out.println("있습니다.");
				break;
			}
			if(i == 4){
				System.out.println("없습니다.");
			}
		}


        

		
		
	}

}
