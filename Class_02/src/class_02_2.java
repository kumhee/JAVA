import java.util.Scanner;

public class class_02_2 {

	public static void main(String[] args) {
		//반복문
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int input = sc.nextInt();
		
		if(input == 1) {
    	    for(int j = 3; j<10; j+=2) {
    			System.out.println("---------" + j +"단---------");
    			for(int i = 1; i<10; i++) {
    				System.out.println(j + " X " + i + " = " + i*j);
    			}
    		}
	    }

	    else if(input == 2) {
	        for(int j = 2; j<10; j+=2) {
    			System.out.println("---------" + j +"단---------");
    			for(int i = 1; i<10; i++) {
    				System.out.println(j + " X " + i + " = " + i*j);
    			}
    		}
	    }
		
//-------------------------------------------------------------------------------	
		
		for(int j = 2; j<10; j++) {
		    if(input==1 && j%2 == 1) {
    			System.out.println("---------" + j +"단---------");
    			for(int i = 1; i<10; i++) {
    				System.out.println(j + " X " + i + " = " + i*j);
    			}
		    }
		    else if(input==2 && j%2 == 0) {
    			System.out.println("---------" + j +"단---------");
    			for(int i = 1; i<10; i++) {
    				System.out.println(j + " X " + i + " = " + i*j);
    			}
		    }
		}

//-------------------------------------------------------------------------------
		
		for(int j = 2; j<10; j++) {
		    if((input==1 && j%2 == 1) || (input==2 && j%2 == 0)) {
    			System.out.println("---------" + j +"단---------");
    			for(int i = 1; i<10; i++) {
    				System.out.println(j + " X " + i + " = " + i*j);
    			}
		    }
		}
		
//-------------------------------------------------------------------------------
		
		if(input == 1) input+=2;
		for(int j = input; j<10; j+=2) {
			System.out.println("---------" + j +"단---------");
			for(int i = 1; i<10; i++) {
				System.out.println(j + " X " + i + " = " + i*j);
			}
		}
		
//-------------------------------------------------------------------------------
	}
}
