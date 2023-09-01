
public class class_01_다형성 {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.speak();
		Dog dog = new Dog();
		dog.speak();
//		Cat cat = new Cat();
//		cat.speak();
		
		Animal cat = new Cat();
		cat.speak();
		
//		Tiger tiger = new Dog(); 불가능
//		Tiger tiger = new Cat(); 불가능
		
//		Animal tiger = new Animal();
//		tiger.speak(); //동물이 소리를 낸다.
//		tiger = new Tiger();
//		tiger.speak(); //어흥
		
		Animal tiger = new Animal();
		tiger.speak(); //동물이 소리를 낸다.
		Animal tigertiger = new Tiger();
		tigertiger.speak(); //어흥
		Tiger tiger2 = new Tiger();
		
		Animal ani1 = dog ; //dog, cat, tiger 넣는것마다 해당하는게 출력됨.
		ani1.speak();
		Tiger ti1 = (Tiger)animal;
		ti1 = (Tiger) tigertiger;
	}
}

class Animal {
	public void speak() {
		System.out.println("동물이 소리를 낸다.");
	}
}

class Dog extends Animal {
	@Override
	public void speak() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal {
	@Override
	public void speak() {
		System.out.println("야옹");
	}
}

class Tiger extends Animal {
	@Override
	public void speak() {
		System.out.println("어흥");
	}
}

// [다형성]
// 1. 메서드 오버하이딩, 메서드 오버로딩
// 2. 참조변수 - 객체 캐스팅

// 캐스팅 (int) Math.random
// 객체 캐스팅 (character)monster

// 다형성에서 부모-자식 관계에서 캐스팅을 사용할 수 있다. 
// 이 때, 참조변수가 사용할 수 있는 멤버으 ㅣ개수가 실제 인스턴스의 멤버의 변수보다 작아야 한다. 
// <부모> <= 자식 (자식은 부모의 모든것을 가지고있음.)



// 부모자식 관계로 설명 :

//class parent{}
//class child extends Parent{}
//class Person{}
//
//Parent p1 = new Parent();
//Child c1 = new Child();
//Parent p2 = new Child(); //가능해짐.
//Child c2 = new Parent(); //불가능.
//Person pp = new Person();

// 참조 변수의 타입변환 (캐스팅)
// p1(new Parent), p2(new Child)
// c1 = (Child) p1
// c1 = (Child) p2
// c1 = (Child) pp -> 불가능

// p1 = c1; (부모한테 자식을 넣는다) -> 가능  == p1 = (Child)c1; :캐스팅 생략 가능.
// Parent parent = new Child(); -> 가능


