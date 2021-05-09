package s20156.movie.model;

import s20156.movie.utils.MovieCategories;

public class Movie {
    private Long id;
    private String name;
    private String director;
    private MovieCategories category;

    public Movie(Long id, String name, String director, MovieCategories category) {
        this.id = id;
        this.name = name;
        this.director = director;
        this.category = category;
    }

    public Movie(String name, String director, MovieCategories category) {
        this.name = name;
        this.director = director;
        this.category = category;
    }

    public Movie() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public MovieCategories getCategory() {
        return category;
    }

    public void setCategory(MovieCategories category) {
        this.category = category;
    }
}
