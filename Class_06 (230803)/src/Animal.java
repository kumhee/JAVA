
public class Animal {
	String species;
	String name;
	int age;
	
	Animal () {
		name = "";
		age = 0;
	}
	
	Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void info() {
		System.out.println("이름: " + name + ", 나이: " + age + " 살");
	}
	
	void sleep() {
		System.out.println(name+"이(가) 배를 보이며 잠을 잡니다.");
	}
	
	void eat() {
		System.out.println(name+"이(가) 간식을 먹습니다.");
	}
	
	void walk() {
		System.out.println(name+"이(가) 산책을 하고있습니다.");
	}

}
