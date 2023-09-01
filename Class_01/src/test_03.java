import java.util.Scanner;

public class test_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int max = 0;

        System.out.println("점수를 입력하세요: ");
        int n1 = sc.nextInt();
        if (max < n1) {
            max = n1;
        }

        System.out.println("점수를 입력하세요: ");
        int n2 = sc.nextInt();
        if (max < n2) {
            max = n2;
        }

        System.out.println("점수를 입력하세요: ");
        int n3 = sc.nextInt();
        if (max < n3) {
            max = n3;
        }

        System.out.println("점수를 입력하세요: ");
        int n4 = sc.nextInt();
        if (max < n4) {
            max = n4;
        }

        System.out.println("점수를 입력하세요: ");
        int n5 = sc.nextInt();
        if (max < n5) {
            max = n5;
        }

        System.out.println("최대값은 " + max + "입니다.");
		
	}
}
		
		
		
		
//		Scanner scan = new Scanner(System.in);
//
//        double[] scores = new double[5];
//
//        for (int i = 0; i < 5; i++) {
//            System.out.print("점수 " + (i + 1) + " 입력: ");
//            scores[i] = scan.nextDouble();
//        }
//
//        double maxScore = findMaxScore(scores);
//        System.out.println("최고점: " + maxScore);
//
//        scan.close();
//    }
//
//    public static double findMaxScore(double[] scores) {
//        double max = scores[0];
//        for (int i = 1; i < scores.length; i++) {
//            if (scores[i] > max) {
//                max = scores[i];
//            }
//        }
//        return max;


//	}
//
//}
//03. 점수 5개를 입력받아 최고점을 출력.