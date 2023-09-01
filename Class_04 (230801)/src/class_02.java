
public class class_02 {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Dog dog = new Dog("강아지", 4);
		Cat cat = new Cat("고양이", 5);
		
		dog.eat();
		dog.sleep();
		System.out.println(dog.name + " " + dog.age);
		cat.eat();
		cat.sleep();
		System.out.println(cat.name + " " + cat.age);
		
		animal.eat();
		animal.sleep();
		System.out.println(animal.name + " " + animal.age);

	
	}

}
// [상속(inheritance) : 자식에게 물려주는 것.]

// 부모 클래스 (parent class), 기반 클래스 (base class)
//	: 부모 클래스는 보통 자식 클래스가 공통적으로 가지는 필드와 메서드를 정의할 떄 사용한다. 
//	ex) 부모클래스명 {}

// 자식 클래스 (child class), 파생 클래스(derived class)
//	: 자식 클래스는 보통 부모 클래스에게 상속을 받아 새로운 클래스를 만드는 것. 속성, 메서드들을 물려받을 수 있다.
//	ex) 자식클래스명 extends 부모클래스명{}
//	자식클래스에서 부모클래스에게 상속을 받아 속성과 메소드를 사용하려면 super키워드를 사용해야 한다.