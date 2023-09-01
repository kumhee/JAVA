package DepartmentStore;

import java.util.Scanner;

public class Store {
	String brand;
	
	Store(){
		
	}
	
	Store(String brand){
		this.brand = brand;
	}
	
	String getBrand() {
		return brand;
	}
	
	void setBrand(String brand) {
		this.brand = brand;
	}
	
	void printBrand() {
		System.out.println("브랜드 : " + brand);
		return;
	}
	
	int salesVolumn() { //재고 - 판매량 = 잔여수량
	    Scanner scan = new Scanner(System.in);
	    System.out.println("구매하시겠습니까? 구매를 원하시면 구매하실 [수량]을 입력해주세요");
	    int input = scan.nextInt();
	    return input;
	}
	
	int addBuy() {
	    Scanner scan = new Scanner(System.in);
    	System.out.println("-------------------------------------");
	    System.out.println("추가 구매를 원하시면 1번, 주문을 완료하시려면 2번, 취소를 원하시면 3번을 입력해주세요");
	    System.out.println();
	    System.out.println("원하시는 날짜와 시간대에 픽업을 원하시면 4번을 입력해주세요");
	    int input = scan.nextInt();
	    return input;
	}

}
