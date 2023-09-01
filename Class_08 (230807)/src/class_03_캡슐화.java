
public class class_03_캡슐화 {

	public static void main(String[] args) {
		Account kim = new Account("110-3432-55464", 100000000);

		System.out.println("계좌의 잔액은 "+ kim.getBalance() + "입니다.");
		
		kim.deposite(100000000);
		kim.deposite(-100000000);
		
		kim.withdraw(100000000);
		kim.withdraw(999999999);
		
		System.out.println("계좌의 잔액은 " + kim.getBalance() + "입니다.");

	}

}

// 캡슐화 - 정보은닉
// 은행 계좌 클래스
// 계좌번호 - 변동 불가, 잔액 - 변동가능

// [실습]
// 1번.
//	식당 + 좌석 수, 소비자 -> 예약자명, 인원 수 (예약할 수 있게)
//	남은 좌석 수보다 인원수가 더 맣으면 예약불가. 
//	오버라이딩, 캡슐화 사용하기.

// 2번.
//	RPG게임
//	유닛 - ( 캐릭터, 몬스터 ) - ( 직업 )
//	공격하고 레벨업 하는 프로그램. (유닛 : 공격, 레벨업, 체력)
//	몬스터 - 타입
//	캐릭터 레벨업 - 경험치
//	직업 - 직업이름




