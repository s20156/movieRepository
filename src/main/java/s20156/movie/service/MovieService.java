package s20156.movie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import s20156.movie.model.Movie;
import s20156.movie.utils.MovieCategories;

import java.util.List;

@Service
public class MovieService {
    public List<Movie> getMovies() {
        return List.of(new Movie("Mr Bean", "John Birkin", MovieCategories.Comedy), new Movie("Matrix", "Larry and Andy Wachowski", MovieCategories.Action), new Movie("Lord of the Rings", "Peter Jackson", MovieCategories.Fantasy));
    }

    public Movie getMovieById(Long id) {
        return new Movie(id, "Terminator", "James Cameron", MovieCategories.Action);
    }

    public Movie sendMovie(Movie movie) {
        return movie;
    }

    public Movie updateMovie(Long id, Movie movie) {
        return movie;
    }
}
