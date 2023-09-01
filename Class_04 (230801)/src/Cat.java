
public class Cat extends Animal{
	
	String name;
	int age;
	
	Cat(String name, int age) {;
		//super();
		this.name = name;
		this.age = age;
	}
	
	void eat() {
		System.out.println("야옹");
	}
	
	void sleep() {
		System.out.println("고양이가 잠을 잡니다.");
	}

}


// 식당이라는 부모클래스를 만들어서, 식당->한식, 양식 종류가 어느나라 음식인지, 식당이름, 평점 (부모클래스)
// 가게 하나하나 -> 메뉴, 테이블 수 (자식 클래스)