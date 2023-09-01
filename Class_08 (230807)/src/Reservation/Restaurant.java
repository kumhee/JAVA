package Reservation;

public class Restaurant {
	String name;
	int seatNumber;
	
	Restaurant () {

	}
	
	Restaurant (String name) {
		this.name = name;
	}
	
	Restaurant (String name, int seatNumber) {
		this.name = name;
		this.seatNumber = seatNumber;
	}

	void koreanName () {
		System.out.println("이름: ");
	}
	
	
	

}
