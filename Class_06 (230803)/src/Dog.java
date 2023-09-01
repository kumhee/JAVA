
public class Dog extends Animal{
	String play;
	
	Dog(String name, int age, String play) {
		super(name,age);
		this.play = play;
	}
	
	void sleep() {
		super.sleep();
		System.out.println("강아지는 잠을 자는걸 좋아해");
	}
	
	void eat() {
		super.eat();
	}
	
	void walk() {
		super.walk();
	}
	
	void play() {
		System.out.println("취미는 "+ play);
	}
	
//	void sleep() {
//		System.out.println("The animal is eating.");
//	}
//	
//	void eat() {
//		System.out.println("The animal is sleeping.");
//	}
//	
//	void walk() {
//		System.out.println("The animal is walking.");
//	}



}
