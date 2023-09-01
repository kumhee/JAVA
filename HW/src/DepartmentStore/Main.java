package DepartmentStore;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Store store = new Store();
		GolfWear golfwear = new GolfWear();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("원하시는 카테고리의 번호를 입력해주세요   1. 골프웨어  2. 캐쥬얼");
		int input = scan.nextInt();	
		switch(input) {
		case 1:
			//골프웨어객체
			GolfWear golfWear = new PXG();
			int n = golfWear.inputSelected();
			if(n == 1) {
				if(golfWear instanceof PXG) {
					golfWear.salesVolumn();
					golfWear.addBuy();
					PXG pxg = (PXG)golfWear;
					pxg.givePoint();
					pxg.pxgEvent();
					pxg.bestItem();
				}
			} else if(n == 2) {
				PING ping = new PING();
				ping.salesVolumn();
				ping.addBuy();
				ping.givePoint();
				ping.pingEvent();
				ping.bestItem();
			} 
			break;
		case 2:
			//골프웨어객체
			Casual casual = new Recto();
			int s = casual.inputSelected();
			if(s == 1) {
				if(casual instanceof Recto) {
					casual.salesVolumn();
					casual.addBuy();
					Recto recto = (Recto)casual;
					recto.givePoint();
					recto.rectoEvent();
				}
			} else if(s == 2) {
				Vov vov = new Vov();
				vov.salesVolumn();
				vov.addBuy();
				vov.givePoint();
				vov.vovEvent();
			} 
		}
		
//		golfwear.pxgList.add(new PXG());
//		golfwear.pxgList.get(0); // arr[0]
		
	}
}
