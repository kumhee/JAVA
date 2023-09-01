
public class HW_02 {

	public static void main(String[] args) {
		System.out.println("----------------------01");
		int[][] arr = new int [5][5];
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
              arr[i][j] = 5*i+j+1;
          }
		}
		
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
              System.out.print(arr[i][j]+" ");
          }
          System.out.println();
		}
		
		
		
//        int num = 1; //0으로 하면 0 1 2 3 으로 시작하게 됨.
//        
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print(num + " ");
//                num++;
//            }
//            System.out.println();
//        }
        
        
		System.out.println("----------------------02");
        
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
              arr[j][i] = 5*i+j+1;  // 01번이랑 같고, i,j위치만 바꿔줌.
          }
		}
		
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
              System.out.print(arr[i][j]+" ");
          }
          System.out.println();
		}
		
		
		
		
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print((i + j * 5) + " ");
//            }
//            System.out.println();
//        }
        
        
		System.out.println("----------------------03");
        
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i%2==0) {
					arr[i][j] = 5*i+j+1;
				}
				else {
					arr[i][j] = 5*i-j+5;
				}
			}
		}
		
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
              System.out.print(arr[i][j]+" ");
          }
          System.out.println();
		}
        
        
		System.out.println("----------------------04");
        
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i%2==0) {
					arr[j][i] = 5*i+j+1;
				}
				else {
					arr[j][i] = 5*i-j+5;
				}
			}
		}
		
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
              System.out.print(arr[i][j]+" ");
	         }
	          System.out.println();
		}

	
	}
}
