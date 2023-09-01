
public class Student {

		String name; 
		int age; 
		String phoneNumber = "010-1234-5678";
		int studentNumber;
		
		
		Student() {
		}
		
		Student(String str1, int num1) {
			name = str1; 
			age = num1; 		
		}
		
		Student(String str1, int num1, String str2) {
			name = str1; 
			age = num1; 
			phoneNumber = str2;			
		}
		
		
		Student(String str1, int num1, String str2, int num2) {
			name = str1; 
			age = num1; 
			phoneNumber = str2;
			studentNumber = num2;
		}
		
		void printStudent( ) {
			System.out.println("이름 : " + name + ", 나이: " + age + ", 연락처: " + phoneNumber + ", 학번 : " +studentNumber);
		}


}
