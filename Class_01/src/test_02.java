import java.util.Scanner;

public class test_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
        int score = sc.nextInt();

		if (score >= 90) {
			System.out.println("A입니다.");
        } else if (score >= 80) {
        	System.out.println("B입니다.");
        } else if (score >= 70) {
        	System.out.println("C입니다.");
        } else if (score >= 60) {
        	System.out.println("D입니다.");
        } else {
        	System.out.println("F입니다.");
        }
		

	}

}
//02. 점수 하나 입력 -> 학점 A,B,C,D,F (90 80 70 60 50)