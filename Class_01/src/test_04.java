
public class test_04 {

	public static void main(String[] args) {
        int a = 10; 
        int b = 20;
        int c = 30;

        if (a<c && b<c) { //논리연산자
        	System.out.println("c가 가장 크다.");
        }
        
        
        if (a<c) { //중첩
        	if(b<c) {
        		System.out.println("C가 가장 크다.");
        	}
        }
        
        if(a>=c) {
        	System.out.println("a가 c보다 크다.");
        } else if(b>=3) {
        	System.out.println("b가 c보다 크다");
        } else {
        	System.out.println("c가 가장 크다.");
        }
}
}
//04. int a = 10, int b = 20, int c = 30
//if문으로 C가 가장 크다 라고 출력하기.
//3가지 방법