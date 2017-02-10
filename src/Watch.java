
public class Watch {

	public static void main(String[] args) {
		Movie spilgrim = new Movie("Scott Pilgrim vs The World", 5);
		Movie avengers = new Movie("The Avengers", 4);
		Movie sw = new Movie("Star Wars: A New Hope", 4);
		Movie airbender = new Movie("Avatar: The Last Airbender", 2);
		Movie wchicks = new Movie("White Chicks", 1);
		System.out.println(wchicks.getTicketPrice());
		NetflixQueue queue = new NetflixQueue();
		queue.addMovie(sw);
		queue.addMovie(wchicks);
		queue.addMovie(airbender);
		queue.addMovie(avengers);
		queue.addMovie(spilgrim);
		queue.printMovies();
		System.out.println("the best movie is " + queue.getBestMovie());
		System.out.println("the second best movie is " + queue.movies.get(1));
	}

}
