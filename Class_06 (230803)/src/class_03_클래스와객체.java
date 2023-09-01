
public class class_03_클래스와객체  {
	public static void main(String[] args) {
		Person kim = new Person ("KIM" ,23 , "010-1234-5678","서울시 마포구");
		Person choi = new Person ("choi" ,23, "010-2344-2233", "서울시 강동구");
		Person park = new Person ("park" ,23, "010-3421-1232", "경기도 군포시");

//		System.out.println("이름: " + kim.name + ", 나이 : " = kim.age);
		kim.speak(); kim.address(); kim.a();
		System.out.println();
		
		choi.speak(); choi.address(); choi.a();
		System.out.println();
		
		park.speak(); park.address(); park.a();
		System.out.println();
		
		
		
	}
}

//클래스 -> 파일 
//클래스 -> 설계도
//객체 -> 설계도를 사용하여 만든 것.

//생성자
//생성할 때, 객체한테 값을 전달해주는 것. (객체한테 만들어질때, 첨부파일 전달)