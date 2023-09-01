package Movie;

public class Main {
	public static void main(String[] args) {
		Movie movie = new Movie("기생충", 132);
		SF sfMovie = new SF("인터스텔라", 169);
		Comedy comedyMovie = new Comedy("써니", 124);
		
		movie.playMovie();
		//movie.displayGenre();
		sfMovie.playMovie();
		sfMovie.displayGenre();
		comedyMovie.playMovie();
		comedyMovie.displayGenre();
	}
}