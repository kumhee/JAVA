package Movie;

public class Main {
	public static void main(String[] args) {
		Movie movie = new Movie("기생충", 132);
		SFMovie sfMovie = new SFMovie("인터스텔라", 169);
		ComedyMovie comedyMovie = new ComedyMovie("써니", 124);
		
		movie.playMovie();
		movie.displayGenre();
		sfMovie.playMovie();
		sfMovie.displayGenre();
		comedyMovie.playMovie();
		comedyMovie.displayGenre();
	}
}