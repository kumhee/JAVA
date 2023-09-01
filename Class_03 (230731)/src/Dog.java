
public class Dog {
	String name = "백구";
	int age = 3;
	
	void sayHello() {
		System.out.println("멍멍 : " +name+", 왈왈 : "+age);
	}
	
	void ageCal() {
		System.out.println("사람 나이로 환산하면 " + (24 + (age-2)*4) + "세입니다.");
	}
	
	boolean compareToAge(int personAge) {
		return 24 + (age-2)*4 > personAge;
	}
	
	void printB(Person person) {
		if(24 + (age-2)*4 > person.age) {
			System.out.println(name + "의 나이가 " +person.name+ "의 나이보다 더 많습니다.");
		} else {
			System.out.println(name + "의 나이가 " +person.name+ "의 나이보다 더 적습니다.");
		}
	}
}
// 24 + (강아지나이-2)*4 = 사람나이