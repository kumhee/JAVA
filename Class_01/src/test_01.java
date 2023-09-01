import java.util.Scanner;

public class test_01 {

	public static void main(String[] args) {
		//01
        int money;
        String menu;

        Scanner scan = new Scanner(System.in);

        System.out.println("1.콜라: 1000원, 2번. 사이다: 1200원, 3. 제로: 1500원");
        money = scan.nextInt(); 
        menu = scan.next(); 

        switch (menu) {
            case "콜라":
                if (money >= 1000) {
                    System.out.println("콜라가 나왔습니다. 거스름돈은 " + (money - 1000) + "원 입니다.");
                } else {
                    System.out.println("돈이 부족합니다.");
                }
                break;
            case "사이다":
                if (money >= 1200) {
                    System.out.println("사이다가 나왔습니다. 거스름돈은 " + (money - 1200) + "원 입니다.");
                } else {
                    System.out.println("돈이 부족합니다.");
                }
                break;
            case "제로":
                if (money >= 1500) {
                    System.out.println("제로가 나왔습니다. 거스름돈은 " + (money - 1500) + "원 입니다.");
                } else {
                    System.out.println("돈이 부족합니다.");
                }
                break;
            default:
                System.out.println("잘못된 입력입니다");
		}
	}
}






//01. 자판기 만들기
//	금액을 넣어주세요: (입력)
//	메뉴를 선택해주세요 : (메뉴1 -> 가격), (메뉴2 -> 가격) ... (입력) 메뉴 선택  
//	잔액이 부족합니다. or 메뉴가 나왔습니다. 거스름돈 ??원이 나왔습니다.

//02. 점수 하나 입력 -> 학점 A,B,C,D,F (90 80 70 60 50)

//03. 점수 5개를 입력받아 최고점을 출력.

//04. int a = 10, int b = 20, int c = 30
//	if문으로 C가 가장 크다 라고 출력하기.
//	3가지 방법
