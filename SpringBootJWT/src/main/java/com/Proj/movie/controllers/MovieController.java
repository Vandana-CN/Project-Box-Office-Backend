package com.Proj.movie.controllers;

import com.Proj.movie.models.Movie;
import com.Proj.movie.security.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/test/movie")
public class MovieController {

    @Autowired
    private MovieService movieService;
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Movie> saveMovie(@RequestBody Movie movie)
    {
        System.out.println("movie");
        return new ResponseEntity<Movie>(movieService.saveMovie(movie), HttpStatus.CREATED);
    }
   // @GetMapping("/allmovies")
//    public List<Movie> getAllMovies()
//    {
//        return movieService.getAllMovies();
//    }
    @GetMapping("/allmovies")
    public ResponseEntity<?> getAllMovies() {
        try {
            List<Movie> movies = movieService.getAllMovies();

            if (movies == null || movies.isEmpty()) {
                return ResponseEntity.status(HttpStatus.NO_CONTENT).body("No movies found");
            }

            return ResponseEntity.ok(movies);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error retrieving movies: " + e.getMessage());
        }
    }
//    @GetMapping("{id}")
//    public ResponseEntity<Movie> getMovieById(@PathVariable("id")int id)
//    {
//        return new ResponseEntity<Movie>(movieService.getMovieById(id),HttpStatus.OK);
//    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteMovie(@PathVariable("id")int id)
    {
        movieService.deleteMovie(id);
        return new ResponseEntity<String>("Student deleted successfully",HttpStatus.OK);
    }


}
