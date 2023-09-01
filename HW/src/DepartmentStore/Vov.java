package DepartmentStore;

import java.util.Scanner;

public class Vov extends Casual implements CasualPoint{
    private int point;
    
    Vov(String cag){
    	this.setCag(cag);
    }
    
	Vov(){
		super("Vov", "원피스"); //brand, cag
	}
	
    @Override
	public int givePoint() {
        int input = super.input;// 사용자 입력 수량 가져오기
        int addPoint = super.input * 150; // 입력에 기반한 포인트 계산
        System.out.println("포인트가 적립되었습니다.: " + addPoint + " point");
        return point; // 적립된 포인트 반환
    }
    
    String vovEvent() {
		Scanner scan = new Scanner(System.in);
    	System.out.println();
	    System.out.println("VOV에서 현재 진행중인 이벤트를 확인하려면 y를 입력해주세요");
	    String input = scan.next();
		
		if (input.equals("y")) {
			System.out.println();
			System.out.println("---------------------[EVENT]---------------------");
			System.out.println();
			System.out.println("              SPECIAL DRAW EVENT");
			System.out.println("100만원 상당의 VOV 아우터를 100원에 구매할 수 있는 특별한 기회!");
			System.out.println("   응모하기는 1번, 참여방법을 확인하시려면 2번을 입력해주세요");
			System.out.println();
			System.out.println("-------------------------------------------------");
			int in = scan.nextInt();
			switch(in) {
			case 1 :
				System.out.println("드로우 응모가 완료 되었습니다.");
				break;
			case 2 :	
				System.out.println("- 응모하기 버튼 클릭하기");
				System.out.println("- 8월 28일 당첨 발표 및 100원 구매 가능 (2명)");
				System.out.println("- 응모기간 : 08.11(금) - 08.21(월)");
				System.out.println();
				System.out.println("응모하시려면 1번을 입력해주세요.");
			}
			int inAgain = scan.nextInt();
			switch(inAgain) {
			case 1 :
				System.out.println("드로우 응모가 완료 되었습니다!");
				break;
			case 2 :	
			}
		} else {
			System.err.println("잘못입력하셨습니다. 다시 입력해주세요.");
			return vovEvent();
		}
		return input; 
	}
}
