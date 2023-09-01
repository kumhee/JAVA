package DepartmentStore;

import java.util.ArrayList;
import java.util.Scanner;

public class Casual extends Store{
	private String cag;
	private static int sales; //판매량
	private int stock; //재고
	int input;
	
	Casual(){
		this.stock = 30;
	}
	
	Casual(String brand, String cag){
		super(brand);
		this.setCag(cag);
		this.stock = 30;
	}
	
	Casual(String brand, String cag, int sales){
		super(brand);
		this.sales = sales;
		this.stock = 30;
	}
	
	Casual(String brand, String cag, int sales, int stock){
		super(brand);
		this.sales = sales;
		this.stock = stock;
	}
	
	
	int getSales() {
		return sales;
	}
	
	void setSales(int sales) {
		this.sales = sales;
	}
	
	int getStock() {
		return stock = 30;
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
		System.out.println("원하시는 브랜드를 입력해주세요   1. RECTO  2. VOV");
		int input = scan.nextInt();	
		switch(input) {
		case 1: 
			System.out.println();
			System.out.println("RECTO에서 가장 인기 있는 제품 : " + new Recto().getCag());
			System.out.println("------------------------------------");
			System.out.println("원하시는 제품을 선택해주세요.");
			ArrayList<Recto> rectoList = new ArrayList<>();
			rectoList.add(new Recto("셔츠"));
			rectoList.add(new Recto("아우터"));
			rectoList.add(new Recto("백팩"));
    		for (int i=0; i<rectoList.size(); i++) {
    			rectoList.get(i);
				System.out.print(i+1 + "." + rectoList.get(i).getCag() + "  ");
    		}
    		String inputPectoCag = scan.next(); 		
    		while(true) {
    			if(inputPectoCag.equals("셔츠")||inputPectoCag.equals("아우터")||inputPectoCag.equals("백팩")) {
    				break;
        		}
    			System.out.println();
				System.err.println("잘못 입력했습니다. 다시 입력해주세요");
				inputPectoCag = scan.next();
    		}
    		System.out.println();
			System.out.println(inputPectoCag + "을 선택하셨습니다");
			
			return input;
		case 2:
			System.out.println();
			System.out.println("VOV에서 가장 인기 있는 제품 : " + new Vov().getCag());
			System.out.println("------------------------------------");
			System.out.println("원하시는 제품을 선택해주세요.");
			ArrayList<Vov> vovList = new ArrayList<>();
			vovList.add(new Vov("원피스"));
			vovList.add(new Vov("가디건"));
			vovList.add(new Vov("숄더백"));
    		for (int i=0; i<vovList.size(); i++) {
    			vovList.get(i);
				System.out.print(i+1 + "." + vovList.get(i).getCag() + "  ");
    		}
    		String inputVovCag = scan.next();	
    		while(true) {
    			if(inputVovCag.equals("원피스")||inputVovCag.equals("가디건")||inputVovCag.equals("숄더백")) {
    				break;
        		}
    			System.out.println();
				System.err.println("잘못 입력했습니다. 다시 입력해주세요");
				inputVovCag = scan.next();
    		}
    		System.out.println();
			System.out.println(inputVovCag + "을 선택하셨습니다");
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
	        return 0;
	    }
	    return input;
	}
	
	@Override
	int addBuy() {
	    int input = super.addBuy();
	    
	    if (input == 1) { // input이 1일 경우 추가구매
			System.out.println();
	    	System.out.println("-------------------------------------");
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
	
	String rectoEvent() {
		return rectoEvent();
	}
	
	
}
