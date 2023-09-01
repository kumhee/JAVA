package Movie;

public class ComedyMovie extends Movie{
	ComedyMovie(String title, int duration){
		super(title, duration);
	}
	
	@Override
	void displayGenre() {
		System.out.println("장르: Comedy");
	}
}
