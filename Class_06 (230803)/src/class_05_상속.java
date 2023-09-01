import java.util.Scanner;

public class class_05_상속 {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Dog dog = new Dog("푸들", 3, "산책");
		Cat cat = new Cat("샴", 2, "공놀이");
		
		Scanner scan = new Scanner(System.in);
		System.out.println(dog.name+" 또는 "+cat.name+"를입력하세요");
		
		String input = scan.next();		
		
		if(input.equals(dog.name)) {
			dog.sleep();
			dog.eat();
			dog.walk();
			dog.info();
			dog.play();
		} else if(input.equals(cat.name)){
			cat.sleep();
			cat.eat();
			cat.walk();
			cat.info();
			cat.play2();
		} else {
			System.out.println("잘못입력했습니다.");
		}
		System.out.println();
	}
}

// [상속] - 클래스 간의 관계 (상하관계)
//	내가 가지고 있는 속성 = 인스턴스 변수, 내가 할 수 있는 행동(메소드)들이 다른 클래스에도 이미 있다면, 
//	똑같이 생긴 설계도를 또 만들어야되네? 라고 생각할 수 있다.
//	다른 설계도를 베껴올 수 있었으면 좋겠다. 해서 나온게 "부모 클래스"

// 부모 클래스 (이미 만들어져 있는 설계도)
// 자식 클래스 (베껴서 새로 작성할 설계도)