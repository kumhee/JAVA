package DepartmentStore;

import java.util.ArrayList;
import java.util.Scanner;

public class GolfWear extends Store{
	private String cag;
	private static int sales; //판매량
	private int stock; //재고
	int input;

	
	GolfWear(){
		this.stock = 30;
	}
	
	GolfWear(String brand, String cag){
		super(brand);
		this.setCag(cag);
		this.stock = 30;
	}
	
	GolfWear(String brand, String cag, int sales){
		super(brand);
		this.sales = sales;
		this.stock = 30;
	}
	
	GolfWear(String brand, String cag, int sales, int stock){
		super(brand);
		this.sales = sales;
		this.stock = stock;
	}
	
	
	static int getSales() {
		return sales;
	}
	
	void setSales(int sales) {
		this.sales = sales;
	}
	
	int getStock() {
		return stock;
	}
	
	void setStock(int stock) {
		this.stock = stock;
	}

	String getCag() {
		return cag;
	}

	void setCag(String cag) {
		this.cag = cag;
	}
	
	int inputSelected() {
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("원하시는 브랜드를 입력해주세요   1. PXG  2. PING");
		int input = scan.nextInt();	
		switch(input) {
		case 1: 
			System.out.println();
			System.out.println("PXG에서 가장 인기 있는 제품 : " + new PXG().getCag());
			System.out.println("------------------------------------");
			System.out.println("원하시는 제품을 선택해주세요.");
			ArrayList<PXG> pxgList = new ArrayList<>();
			pxgList.add(new PXG("티셔츠"));
			pxgList.add(new PXG("드라이버"));
			pxgList.add(new PXG("아이언"));
    		for (int i=0; i<pxgList.size(); i++) {
				pxgList.get(i);
				System.out.print(i+1 + "." + pxgList.get(i).getCag() + "  ");
    		}
    		String inputPxgCag = scan.next(); 		
    		while(true) {
    			if(inputPxgCag.equals("티셔츠")||inputPxgCag.equals("드라이버")||inputPxgCag.equals("아이언")) {
    				break;
        		}
    			System.out.println();
				System.err.println("잘못 입력했습니다. 다시 입력해주세요");
				inputPxgCag = scan.next();
    		}
    		System.out.println();
			System.out.println(inputPxgCag + "을 선택하셨습니다");
			
			return input;
		case 2:
			System.out.println();
			System.out.println("PING에서 가장 인기 있는 제품 : " + new PING().getCag());
			System.out.println("------------------------------------");
			System.out.println("원하시는 제품을 선택해주세요.");
			ArrayList<PING> pingList = new ArrayList<>();
			pingList.add(new PING("퍼터"));
			pingList.add(new PING("우드"));
			pingList.add(new PING("샌드"));
    		for (int i=0; i<pingList.size(); i++) {
    			pingList.get(i);
				System.out.print(i+1 + "." + pingList.get(i).getCag() + "  ");
    		}
    		String inputPingCag = scan.next();	
    		while(true) {
    			if(inputPingCag.equals("퍼터")||inputPingCag.equals("우드")||inputPingCag.equals("샌드")) {
    				break;
        		}
    			System.out.println();
				System.err.println("잘못 입력했습니다. 다시 입력해주세요");
				inputPxgCag = scan.next();
    		}
    		System.out.println();
			System.out.println(inputPingCag + "을 선택하셨습니다");
			default:
				return input;
		}

	}
	
	@Override
	int salesVolumn() { //재고 - 판매 = 잔여수량 
	    input = super.salesVolumn();
	    
	    if (input > getStock()) { // 판매 수량이 재고보다 많으면
			System.out.println();
	        System.out.println("재고가 부족합니다.");
	        System.err.println("남은 수량: " + (stock - input));
	        stock = stock - input;
	    } else if (input <= getStock()) { // 판매 수량이 재고보다 작거나 같다면
			System.out.println();
	        System.out.println("구매 가능합니다.");
	        System.err.println("남은 수량: " + (stock - input));
	        stock = stock - input;
	    } else {
			System.out.println();
	        System.err.println("잘못 입력하셨습니다. 정확한 수량을 입력해주세요.");
	    }
	    return input;
	}
	
	@Override
	int addBuy() {
	    int input = super.addBuy();
	    
	    if (input == 1) { // input이 1일 경우 추가구매
			System.out.println();
	        System.out.println("추가 구매를 진행합니다.");

	        Scanner scan = new Scanner(System.in);
	        System.out.println("추가 구매할 수량을 입력하세요:");
	        int inputAdd = scan.nextInt();

	        if (inputAdd > getStock()) {
	            System.out.println("재고가 부족하여 추가 구매가 불가능합니다.");
	        } else if(inputAdd <= getStock()){
	    		System.out.println();
	            System.out.println("추가 구매가 완료되었습니다.");
	            System.err.println("남은 수량: " + ((stock) - inputAdd));
	            stock = (stock) - inputAdd;
	        }
	    } else if (input == 2) { 
			System.out.println();
	        System.out.println("!!!주문이 완료되었습니다.");
	    } else if(input == 3) { // input이 3일 경우 주문취소
	    	System.err.println("주문이 취소되었습니다.");
		} else if(input == 4) {
			Consumer consumer = new Consumer("");
			consumer.preOrder();
		}else {
	        System.err.println("잘못된 입력입니다. 1 또는 2를 입력해주세요.");
	    }
		return input;
	}

	String bestItem() {
		return bestItem();
	}
	
		
}
