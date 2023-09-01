package Student;

public class Student {
	static final int studentNum = 0;
	static int count = 0;
	
	Student(){
		this.count = count;
	}
	
	Student(int count) {
        for (int i = 1; i <= 5; i++) {
            String studentID = count + "000" + i;
            
            System.out.println(studentID);
        }
    }
}
