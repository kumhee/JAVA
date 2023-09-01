
public class class_03_객체와클래스 {

	public static void main(String[] args) {
		Person nam = new Person("Nam", 31); 
		nam.sayHello();
		System.out.println(nam.name);
		System.out.println(nam.age);
		
		Person kim = new Person("Kim", 20);
		kim.sayHello();
		System.out.println(kim.name);
		System.out.println(kim.age);
		
		System.out.println("-----------------------------");
		
		Dog dog1 = new Dog();
		dog1.age = 5;
		dog1.name = "푸들";
		dog1.sayHello();
		
		Dog dog2 = new Dog();
		dog2.age = 2;
		dog2.name = "치와와";
		dog2.sayHello();
		
		dog1.ageCal();
		dog2.ageCal();		
	
		System.out.println(dog1.compareToAge(nam.age)); 
		System.out.println(dog2.compareToAge(nam.age));
		printA(dog1.compareToAge(nam.age), dog1.name, nam.name);
		printA(dog2.compareToAge(nam.age), dog2.name, nam.name);
		
		dog1.printB(nam);
		dog2.printB(nam);
		
		System.out.println("-----------------------------");
		
		Car car = new Car();
		car.say();
		
		Car car1 = new Car();
		car1.name = "현대";
		car1.color = "white";
		car1.say();
		
		Car car2 = new Car();
		car2.name = "기아";
		car2.color = "gray";
		car2.say();
	}
	
	public static void printA(boolean b, String dog, String person) {
		if(b) {
			System.out.println(dog + "의 나이가 " +person+ "의 나이보다 더 많습니다.");
		} else {
			System.out.println(dog + "의 나이가 " +person+ "의 나이보다 더 적습니다.");
		}
	}
}

// 객체와 클래스 : 객체 개념
//	자바 <객체지향프로그래밍> : 객체사용을 지향하는 언어다.

// 	클래스
//	객체 : 설계도를 통해 만들어진 것.

//	[접근제어자] class 클래스명 {
//	인스턴스 변수
//	자료형 변수명1;
//	자료형 변수명2;...
//
//	생성자
//	클래스명(매개변수1, 매개변수2,.....)
// 
//	메소드
//	자료형 함수명(배개변수1, 매개변수2, ...) {
//  코드
//	반환값
//	}
// }