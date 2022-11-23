package com.Proj.movie.security.services;
//
//public class MovieServiceImpl {
//
//}


import com.Proj.movie.models.Movie;
import com.Proj.movie.repository.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService{
    @Autowired
    private MovieRepo movieRepo;
    public MovieServiceImpl(MovieRepo movieRepo) {
        this.movieRepo = movieRepo;
    }
    @Override
    public Movie saveMovie(Movie movie)
    {
        return movieRepo.save(movie);
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieRepo.findAll();
    }

    @Override
    public Movie getMovieById(int id) {
        return null;
    }

    @Override
    public void deleteMovie(int id)
    {
        movieRepo.findById(id);
        movieRepo.deleteById(id);
    }
}


