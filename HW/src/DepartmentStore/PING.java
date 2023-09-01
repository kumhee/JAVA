package DepartmentStore;

import java.util.Scanner;

public class PING extends GolfWear implements golfWearPoint{
    private static int price = 10000;
    private int point;
    private String bestItem;
    
    PING(String cag){
    	this.setCag(cag);
    }
	
	PING(){
		super("PING", "퍼터");
	}
	
    @Override
	public int givePoint() {
        int input = super.input;// 사용자 입력 수량 가져오기
        int addPoint = super.input * 100; // 입력에 기반한 포인트 계산
        System.out.println("포인트가 적립되었습니다.: " + addPoint + " point");
        return point; // 적립된 포인트 반환
    }
   
	String pingEvent() {
		Scanner scan = new Scanner(System.in);
    	System.out.println();
	    System.out.println("PING에서 현재 진행중인 이벤트를 확인하려면 y를 입력해주세요");
	    String input = scan.next();
		
		if (input.equals("y")) {
			System.out.println();
			System.out.println("---------------------[EVENT]---------------------");
			System.out.println();
			System.out.println("              SPECIAL DRAW EVENT");
			System.out.println("70만원 상당의 PING 골프백을 100원에 구매할 수 있는 특별한 기회!");
			System.out.println("   응모하기는 1번, 참여방법을 확인하시려면 2번을 입력해주세요");
			System.out.println();
			System.out.println("-------------------------------------------------");
			int in = scan.nextInt();
			switch(in) {
			case 1 :
				System.out.println("드로우 응모가 완료 되었습니다.");
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
//				return bestItem(); 
			case 2 :	
			}	
		} else {
			System.err.println("잘못입력하셨습니다. 다시 입력해주세요.");
			return pingEvent();
		}
		return input; 
	}
     
    @Override
    String bestItem() {
		Scanner scan = new Scanner(System.in);
    	System.out.println();
	    System.out.println("PING에서 가장 인기있는 제품을 확인해보시겠습니까? 네/아니오");
	    String inputItem = scan.next();
	    if(inputItem.equals("네")) {
	    	System.out.println();
	    	System.out.println("iCROSSOVER");
	    	System.out.println("i시리즈로 재탄생한 iCrossover!");
	    	System.out.println("스윙 속도가 빠르고 롱아이언 대안을 찾는 골퍼들을 위한 크로스오버!");
	    	System.out.println("일관된 샷, 높은 발사각, 빠른 볼스피드로 비거리가 증가되었습니다.");
	    	System.out.println();
	    	return "";
	    } else if(inputItem.equals("아니오")) {
	    	System.out.println("이용해 주셔서 감사합니다");
	    } else {
	    	
	    }
    	return ""; 
    }
}

