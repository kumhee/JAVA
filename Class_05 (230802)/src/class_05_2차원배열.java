
public class class_05_2차원배열 {
	public static void main(String[] args) {
		int [][] arr = new int [8][8];
		
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                arr[i][j] = i+1;
//            }
//        }
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                arr[j][i] = i+1;
            }
        }
		
		for(int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}	
		
		System.out.println("---------------------1번");
		
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                arr[j][i] = (j*8)+i+1;
            }
        }
		
		for(int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}	
		
		System.out.println("---------------------2번");
		
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				if((i >= 8/2 && i%2 == 1) || (j >= 8/2 && j%2 == 1)) {
					arr[i][j] = i*8+j+1;
				}
				else if((i < 8/2 && i%2 == 0) || (j < 8/2 && j%2 == 0)) {	
					arr[i][j] = i*8+j+1;
				}
				else {
					arr[i][j] = 0;
				}
				
				if(i > 0 || j>0 || i < arr.length-1 || j < arr.length-1) {
					
				}
			}
		}
		
		for(int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
}

// 2차원 배열 : 한 줄짜리 1차원 배열을 여러개 사용.
// 반목문 안에 반복문

//	String[][] arr = new String[7][8]
//	8개짜리 배열이 있다.