
public class class_2차원배열 {

	public static void main(String[] args) {
int[][] arr = new int[8][8];
		
		int i = 0;
		int j = 0;
		int round = 1;
		int direct = 1;
		
		while(true) {
			if(round %2 == 1) {
				arr[i][j] = 8*i+j+1;
			}
			else {
				arr[i][j] = 0;
			}

			if(direct == 1) {
				j++;
				if(j == arr.length - i) {
					j--;
					direct = 2;
				}
			} else if(direct == 2) {
				i++;
				if(i == j) {
					direct = 3;
				}
			} else if(direct == 3) {
				j--;
				if(j == arr.length - i - 1) {
					direct = 4;
				}
			} else if(direct == 4) {
				i--;
				if(i == j) {
//				if(i == 1 + j) {
//					if(round %2 == 1) {
//						arr[i][j] = 8*i+j+1;
//					}
					j++;
					direct = 1;
					round++;
					break;
				}
			}
			
			
			if(i == 4 && j == 4) {
				break;
			}
		}
		
		for(i=0; i<arr.length; i++) {//arr.length -> row의 길이
			for(j = 0; j<arr[0].length; j++) { //arr[0].length -> col의 길이
				if(arr[i][j] < 10) {
					System.out.print(" " + arr[i][j] + " ");
				}
				else {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}
