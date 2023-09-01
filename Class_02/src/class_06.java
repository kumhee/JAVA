import java.util.Scanner;

public class class_06 {

	public static void main(String[] args) {
//		int[][] student = new int [6][4];
//		
//		for(int i=0; i<6; i++) {
//			for(int j=0; j<4; j++) {
//				student[i][j] = 20; 
//			}
//		}
//		for (int i=0; i<6; i++) {
//			for(int j=0; j<4;j++) {
//				System.out.print(student[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		
		
		
		//10X10배열을 만들어서 1-100까지 다 넣어주고, 사각형으로 출력.
        int[][] x = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                x[i][j] = (i*10)+j+1;
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
		}
		
		

	
	}
}
// 1차원 배열
//	

// 다차원 배열
//	int(자료형)[][]배열명 = new 자료형[크기][크기]
//	
//	