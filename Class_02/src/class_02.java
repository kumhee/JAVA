import java.util.Scanner;

public class class_02 {

	public static void main(String[] args) {
		// break
//		for(int i=0; i<10; i++) {
//			System.out.println(i);
//			if(i==5) {
//				break;
//			}
//		}
//		
//		for (int i=0; i<10; i++) {
//			for (int j=0; j<10; j++) {
//				System.out.println("i: "+i+" ,j: "+j);
//				if (j == 5) {
//					break;
//				}
//			}
			
			
			// continue
//			for(int i=0; i<100; i++) {
//				if(i%2 == 1) {
//					continue;
//				}
//				System.out.println(i);
//			
//			}
			
			//-----------예제
//			for(int i=10; i>=0; i--) {
//				if(i==0) {
//					System.out.println("발사!");
//					break;
//				}
//				System.out.println(i);
//			}
			
		
		
		
			//-----------예제01. / 구구단 : Scanner 1을 입력하면 홀수단, 2를 입력하면 짝수단.
//			01-1
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.print("숫자를 입력하세요: ");
//			int j = sc.nextInt();
//		        
//				if (j == 1 ) {
//					System.out.println("홀수단: " ); 
//					for(int x=3; x<=9 ;x++){
//						System.out.println("-----"+x+"단"+"-----");
//						for(int i=1; i<=9; i++) {
//							System.out.println(x+" X "+i+" = " + x*i ); 
//						} 
//					}
//				} else if (j == 2) {	
//		            System.out.println("짝수단: ");
//		            for (int x = 2; x <= 8; x += 2) {
//		                System.out.println("-----" + x + "단" + "-----");
//		                for (int i = 1; i <= 9; i++) {
//		                    System.out.println(x + " X " + i + " = " + x * i);
//		                }
//		            }
//				} else {
//					System.out.println();
//				}
		
//			01-2

		

				//-----------예제02. / 5개 입력받아서 최고점,최하점,평균 점수 
				Scanner scan = new Scanner(System.in);
		        int max = 0;
		        int min = 100;
		        int sum = 0;
		        int avg = sum / 5;
		        
		        int A = 0;
		        int B = 0;
		        int C = 0;
		        int D = 0;
		        int F = 0;
		        
		        
		        for (int x = 1; x <= 5; x++) {
		            System.out.println("점수를 입력하세요: ");
		            int score = scan.nextInt();
		            
		            if (max < score) {
		                max = score;
		            } 
		            if (min > score) {
		            	min = score;
		            } 
		            if(score >= 90) {
		            	System.out.println("A학점");
		            	A++;
		            }
		            else if (score >= 80) {
		            	System.out.println("B학점");
		            	B++;
		            }
		        }
		        
		        
		        
		        System.out.println("A: "+A+"B: "+B+"C: "+C+"D: "+F+"F: ");
		        System.out.println("최고점은 "+max+"점 입니다.");
		        System.out.println("최하점은 "+min+"점 입니다.");
		        
		        
		        
		        System.out.println("평균은"+avg+"점 입니다.");
		        
		        
				
		
		
		
		
		
	}

}
