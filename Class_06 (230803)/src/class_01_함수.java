import java.util.Scanner;

public class class_01_함수 {
	public static void main(String[] args) {
		int arr[][] = new int[8][8];
		
		for (int i = 0; i < 8; i++) {
            //코드
			func1(arr, i);
        }
	}
	
	static void func1(int[][] arr, int i) {
		for (int j = 0; j < 8; j++) {
			arr[i][j]  = (i*8)+j+1;
			printArr(arr, i, j);
        }
		newLine();
	}
	
	
	
	static void printArr(int[][] arr, int i, int j) {
		System.out.print(arr[i][j] + " ");
	}
	
	static void newLine() {
		System.out.println();
	}
}

// [함수] - 긴 코드를 압축해서 간단하게 쓸 수 있도록 도와주는 코드
// for(){
//	코드 -> 함수로 대체 가능.
// }

// 