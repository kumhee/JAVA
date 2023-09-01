
public class class_01_method_overriding {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Cat cat = new Cat();
		
		animal.makeSound();
		cat.makeSound();
	}
}

class Animal {
	void makeSound() {
		System.out.println("동물이 울음소리를 낸다.");
	}
}

class Cat extends Animal {
	@Override
	void makeSound() {
		System.out.println("야옹");
	}
}

// [오버라이딩 - method_overriding]
//	부모 클래스의 메서드를 자식 클래스에서 재정의하는 것.
//	부모 클래스의 동작을 자기 동잣으로 바꾼다. 

//	굳이 부모 클래스를 수정하지 않고, 자식 클래스에서 메서드 기능을 변경할 수 있다. 

// 주성 = 컴퓨터가 읽지 못하는 메모

// 컴퓨터사 읽을 수 잇는 메모 - @override

// 오바라이딩 할 메서드는 접근지정자(public), 반환 자료형, 이름, 매개변수 개수, 자료형이 부모클래스와 일치해야 한다. 

// 실습: 영화(제목, 상영시간) 1. 영화제목, 상영시간을 출력해주는 메소드. 2. 영화장르 출력
//	영화장르 2-3개 만들어서 메인에서 출력