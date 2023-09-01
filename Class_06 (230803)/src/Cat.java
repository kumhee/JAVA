
public class Cat extends Animal{
	String play2;

	Cat(String name, int age, String play2) {
		super(name,age);
		this.play2 = play2;
	}

	void sleep() {
		super.sleep();
	}
	
	void eat() {
		super.eat();
	}
	
	void walk() {
		super.walk();
	}
	
	void play2() {
		System.out.println("취미는 " + play2);
	}

	

}
