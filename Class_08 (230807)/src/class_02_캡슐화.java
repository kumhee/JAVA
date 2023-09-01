
public class class_02_캡슐화 {

	public static void main(String[] args) {
		Movie movie = new Movie("기생충", 132);
		//Movie movie2 = new Movie();
		
		movie.playMovie();
		//System.out.println(movie.title + movie.duration); 정보 은닉 성공
		//movie.duration += 10;
		
		movie.setDuration(142);
		System.out.println(movie.getTitle() + movie.getDuration());
	}

}

// [캡슐화 (Encapsulation)]
//	객체 지향 프로그래민에서 사용되는 개념
//	객체의 상태를 보호하기 위해 데이터(변수)와 기능(메서드) 하나로 묶는 것을 말한다. 

// 왜 쓰는지? 
//	보안성 : 외부에서 객체 내부에 직접적으로 접근하는 것을 제한함으로써 객체의 무결성을 유지하고, 객체의 사용방법을 간소화할 수 있다. 

// 캡슐화 이후에는 당연히 내부 상태를 외부에서 직접적으로 수정할 수 없음.
// 접근 제한자(Access Modifier)
//	public**, protected, default, private**
//	- public** : 모든 코드에서 접근이 가능하다. 
//	- protected : 동일패키지 내에서는 모두 접근이 가능하지만, 외부 패키짇에서는 상속을 받은 클래스 내부에서만 접근이 가능하다. 
//	- default :  동일 패키지 내에서만 접근이 가능하다. 
//	- private** : 해당 클래스 내부에서만 접근이 가능하다. 

// 정보은닉(information hiding)
//	정보은낵을 하기 위해서 가장 많이 쓰이는 : private int num; (인스턴스 변수로 만들 수 있음.)
//	getNum(), setNum(int num) : getter, setter 메서드라고 불림.

//	getter, setter : 인스턴스 변수의 값을 변경하는 역할을 한다. 
//	-> 게터와 세터를 통해 정보은닉을 유지하고, 외부에서도 필요한 데이터에 접근을 가능하게 힌디.





