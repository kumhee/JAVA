import java.security.PublicKey;
import java.util.Scanner;

public class class_04_1차원배열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String[] arr = {"김포공항", "공항시장", "마곡나루", "가양", "증미", "당산", "국회의사당", "여의도"};
        
        
        System.out.println("열차선택 : ");       
        String station = sc.next();
        System.out.println("도착지 선택 : "); 
        String destination = sc.next();
        
        for (int i = 0; true ; i++) {  
        	if(station.equals("급행")) {
        		if(i%2 ==0) {
        			System.out.print(arr[i]+" ");
        		}
        	} else if(station.equals("일반")) {
        		System.out.print(arr[i]+" "); //일반
        	}
  	
        	if (destination.equals(arr[i])) {
        		break;
        	} 
        }
        
        
        
        //int 사용
//        String[] station = {"김포공항", "공항시장", "마곡나루", "양천향교", "가양", "증미", "당산", "국회의사당", "여의도"};
//		Scanner sc = new Scanner(System.in);
//		System.out.print("어떤 열차를 탈래? 1.일반 2.급행 ");
//		int str1 = sc.nextInt();
//		System.out.print("어디 역에서 내릴래? ");
//		int str2 = sc.nextInt();
//		
//		if(str1 == 1) {
//			for(int i=0; i<station.length; i++) {
//				System.out.print(station[i] + " ");
//				if(str2-1 == i) {
//					break;
//				}
//			}
//			System.out.println();
//		}
//		else if(str1 == 2) {
//			for(int i=0; i<str2-1; i++) {
//				if(i%2 == 0) { //모든 숫자를 2로 나누었을 때, 나머지가 0, 1
//					System.out.print(station[i] + " ");
//				}
//			}
//			System.out.println();
//		}
	}
}

// 배열
// 김포공항* - 공항시장 - 마곡나루* - 양천향교 - 가양* - 증미 - 당산* - 국회의사당 - 여의도*
// 9호선 급행

// 어떤 열차를 탈래? -> 급행인지 급행이 아닌지
// 어디역에서 내릴래 ? -> 위에 있는 역 중에 입력 (단, 급행열차는 일반역에 멈추지 않음)
// 내가 탄 열차가 지나온 역들이 쭉 출력.

// 힌트 - 급행역과 일반역에 번갈아가면서 존재한다.