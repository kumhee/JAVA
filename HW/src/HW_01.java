
public class HW_01 {

	public static void main(String[] args) {	
		System.out.println("----------------------01");
		for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
		
		
		System.out.println("----------------------02");
		
		
		for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
		
		
		System.out.println("----------------------03");
		
		
		for (int i = 0; i < 5; i++) {
		    for (int j = 0; j < 5; j++) {
		        if (i + j < 4) {
		            System.out.print(" ");
		        } else {
		            System.out.print("*");
		        }
		    }
		    System.out.println();
        }
		
		
		System.out.println("----------------------04");
		

		for (int i = 0; i < 5; i++) {
		    for (int j = 0; j < 5; j++) {
		        if (i > j) {
		            System.out.print(" ");
		        } else {
		            System.out.print("*");
		        }
            }
            System.out.println();
        }
	}

}

