package Movie;

public class SF extends Movie{//행동: 장르 소개
	private static final String genre = "SF";
	SF(String title, int duration) {
		super(title, duration);
	}
	
	static final void displayGenre() {
		System.out.println("장르 : " + genre);
	}
}