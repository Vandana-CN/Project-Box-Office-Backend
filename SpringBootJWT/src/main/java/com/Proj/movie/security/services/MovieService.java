package com.Proj.movie.security.services;

import com.Proj.movie.models.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MovieService {
    Movie saveMovie(Movie movie);
    List<Movie> getAllMovies();
    Movie getMovieById(int id);

    void deleteMovie(int id);
}
