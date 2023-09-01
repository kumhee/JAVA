package Reservation;

public class Consumer {
	private String name;
	private int seatNumber;
	
	private Consumer() {
		
	}
	
	Consumer(String name, int seatNumber){
		this.name = name;
		this.seatNumber = seatNumber;
	}
	
	String getName() {		
		return name;
	}
	
	int getSeatNumber() {		
		return seatNumber;
	}
	
	void reservationName (String name) {
		if(name.equals(name)) {
			System.out.println("예약이 확인되었습니다.");
		} else {
			System.out.println("확인된 예약이 없습니다.");
		}
	}
	
	void reservationSeat(int input) {
		if(seatNumber > input) {
			System.out.println("예약인원을 초과하였습니다. 다시 입력해주세요.");
		} else if (seatNumber <= input) {
			seatNumber = input-seatNumber;
			System.out.println("남은 좌석 수: "+seatNumber);	
		}
	}
	
}
