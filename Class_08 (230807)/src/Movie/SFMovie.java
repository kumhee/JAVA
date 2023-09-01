package Movie;

public class SFMovie extends Movie{
	SFMovie(String title, int duration){
		super(title, duration);
	}
	
	@Override
	void displayGenre() {
		System.out.println("장르: SF");
	}
}

