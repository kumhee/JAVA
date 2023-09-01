
public class Person {
	String name;
	int age;
	String phoneNember;
	String address;
	
//	Person() { //첨부파일 없다 = 기본 생성자
//		
//	}
	
	Person(String name){
		//이름만
	}
	
	Person(String name, int age , String phoneNember, String address) {
		this.name = name;
		this.age = age;
		this.phoneNember = phoneNember;
		this.address = address;
	}
	
	void speak() {
		System.out.println("이름 : " + name + ", 나이 : " + age + ", 전화번호 : " + phoneNember);
	}
	
	void address() {
		System.out.println("주소 : " + address);
	}
	
	void a() {
		System.out.println(name + "의 주소");
	}
	

	
	 




}

