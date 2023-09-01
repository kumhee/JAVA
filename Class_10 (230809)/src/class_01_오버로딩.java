
public class class_01_오버로딩 {

	public static void main(String[] args) {
		System.out.println(Math.add(1, 2));
		System.out.println(Math.add(1.5, 2.456));
		System.out.println(Math.add(1, 2, 3));
		System.out.println(Math.add(1.0,0.5, 3.2,4.5,6.1,7.1,8.2));

	}
}

// [다형성 - polymorephism]

// 1. 메서드 오버로딩 - overloading - 메서드를 선언할 때, 똑같은 이름 메서드.
//	메서드 오버라이딩 : 자식클래스에서 동일한 이름과 매개변수를 가진 메서드를 정의하여 부모 클래스의 메서드를 대처하는 것.
//	메서드 오버로딩 : 같은 이름의 메서드를 매개변수의 개수, 타입, 순서 등의 차이를 이용하여 메서드 자체를 여러 개 정의하는 것.