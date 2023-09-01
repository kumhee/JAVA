import java.util.Scanner;

public class class_04_equals {

	public static void main(String[] args) {
		String greeting = "Hello";
		String sentence = greeting + "Professor";	
		String world = "Hello World.";
		String hello = "Hello World";

		System.out.println(sentence);
		System.out.println(sentence.length()); // 몇글자인지
		System.out.println(sentence.toLowerCase()); // 소문자로
		System.out.println(sentence.toUpperCase()); // 대문자로
		System.out.println(greeting.replace("l","z")); // l을 z로 바꾼다.
		System.out.println(greeting.substring(2)); // substring(a): a부터 끝까지 지움
		System.out.println(sentence.substring(2,9)); // substring(a,b) a부터 b전까지
	
		System.out.println(sentence.charAt(4)); // 4번째 글자가 출력됨.
		System.out.println(sentence.indexOf("l")); //l이 2번째가 있다고 알려주는 문자가 출력됨. , 문자열에서 가장 앞에 있는 친구를 찾아서 반환.
		System.out.println(sentence.indexOf("p"));
		System.out.println(sentence.lastIndexOf("l")); // 가장 뒤에 있는 친구 반환
		
		System.out.println(greeting.concat(sentence));
		System.out.println(greeting.equals("hello"));
		System.out.println(greeting.equalsIgnoreCase("hello"));
		System.out.println(greeting.compareTo("Aello"));
		System.out.println(greeting.compareTo("Hello"));
		System.out.println(greeting.compareTo("Hezzo")); // l보다 z가 14번째 뒤에 있다고 출력됨.
	
		
		System.out.println("------------");
		
		
		
//		[연습문제]
		// 01-1
		System.out.println(world.indexOf("."));
		
		// 01-2
        int index = 0;
        int cnt = 0;
        
        while(true) {
        	//cnt++; 마침표 포함해서 세주는 위치
        	if(world.charAt(index)=='.') {
        		break;
        	}
        	cnt++;
        	index++;
        }
        
        System.out.println(cnt);
		
		
        
		//02
		String str1 = "HELLO World";
		String str2 = "hello WorlD";
        
		//02-1
		System.out.println(str1.toLowerCase().equals(str2.toLowerCase()));
		
		if (str1.length() != str2.length()) {
			System.out.println(false);
			return;
		}
		
		//02-2
		System.out.println((int)'a'); //97
		int a = 'A'; //65
		System.out.println(a); 
		
		for(int i=0; i<str1.length();i++) {
			int x = str1.charAt(i);
			int y = str2.charAt(i);
			
			if(x > 96) {
				x -= 32;
			}
			if(y > 96) {
				y -= 32;
			}
			if (x != y) {
				System.out.println(false);
				return;
			}
		}
		System.out.println(true);
		
		
		
		//03
		String str = "Hello world.";
		int cnt1 = 0;
		
		for(int i=0; i<str.length() ;i++) {
			if(str.charAt(i) == 'l') {
				cnt1++;
			}
		}
		System.out.println(cnt1);
		
		cnt1 = 0;
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
			for(int i=0; i<str.length() ;i++) {
//				if(str.charAt(i) == s.charAt(0)) {
//					cnt1++;
//				}
				if(s.equals(str.substring(i,i+1))) {
					cnt1++;
				}
			}
			System.out.println(cnt1);
			
			cnt = 0;
			while(str.length() > 0) {
				if (str.indexOf('l') != -1) {
					cnt++;
					str = str.substring(str.indexOf('l')+1);
				} else {
					break;
				}
			}
			System.out.println(cnt);
			
			

//		int helloCount = world.length(); world.replace("h", "").length();
	}
}
// String : 변수가 아니다.
// 클래스 : 객체다.

// public class String {
// char[] c;
// 
// boolean equals(char c2) {}

// [연습문제]
// 1. String world = "Hello World." -> 해당 프로그램에 모든 문장은 마침표로 이루어져 있다라는 
//    가정 하에, length를 사용하지 않고,총 길이를 출력해보자.

// 2. equalsIgnoreCase를 사용하지 않고, 2개의 문자열을 서로 비교해보자.

// 3. 문자열에 indexOf 처음이나 마지막에 특정 위치를 알 수 있었다. 그러면 해당 문자열에 원하는
//    문자가 몇 개 들어있는지 말해주는 프로그램을 짜보자.