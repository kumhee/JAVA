package Reservation;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant ("세라피코", 30);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("예약자 성함을 입력해주세요");
		String input = scan.next();	
		System.out.println("인원 수를 입력해주세요");
		int num = scan.nextInt();	
		
		Consumer consumer = new Consumer(input, num);	
		consumer.reservationSeat(restaurant.seatNumber);
		
 
	}
}

