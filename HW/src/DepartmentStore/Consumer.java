package DepartmentStore;

import java.util.Scanner;

public class Consumer {
	private String name;
	
	Consumer(String name){
		this.name = name;
	}
	
	
	String preOrder() {
		Scanner scan = new Scanner(System.in);	
		System.out.println("예약자 성함과 원하시는 날짜 그리고 시간을 입력해주세요.");	
		System.out.print("예약자 성함: ");
		String inputName = scan.next();	
		

		//월,일 입력
        System.out.print("월: ");
		int inputMonth = scan.nextInt();	
        
        System.out.print("일: ");
		int inputDay = scan.nextInt();	
        
        if (inputMonth > 12 || inputMonth <= 0 || inputDay > 31 || inputDay <= 0) {
            System.out.println("잘못입력하셨습니다");
            System.out.println("다시 입력해주세요.");
            return preOrder();
        } 
			
        System.out.print("");
		System.err.println("픽업 방문 가능시간 : 9:00 - 18:00"); 
		System.out.print("시간: ");
		String inputTime = scan.next();	
		

		System.out.println("=========================");
		System.out.println();
		System.out.println("예약자 성함: " + inputName);
		System.out.println("날짜: " + inputMonth + "월 " + inputDay + "일");
		System.out.println("시간: " + inputTime);
		System.out.println();
		System.out.println("=========================");
		
		System.out.println("예약자 정보가 맞는지 확인해주세요. 맞다면 1번, 수정을 원하시면 2번을 입력해 진행해주세요.");
		
		int input = scan.nextInt();
		if(input == 1) {  //1번입력하면 예약완료
			System.out.println("예약이 완료되었습니다.");
			System.out.println();
		} else if(input == 2) {  //2번입력 : 예약자 정보 수정 - preOrder처음으로 되돌아감.
			return preOrder();			
		} 
		return "";
	}

	String givePoint() {
		return givePoint();
	}
}
