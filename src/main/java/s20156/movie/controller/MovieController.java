package s20156.movie.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import s20156.movie.model.Movie;
import s20156.movie.service.MovieService;

import java.util.List;

@RestController
@RequestMapping
public class MovieController {
    private MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public ResponseEntity<List<Movie>> getMovies() {
        List<Movie> all = movieService.getMovies();
        return ResponseEntity.ok(all);
    }
}
