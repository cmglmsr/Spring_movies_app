package com.demo.movies.services;

import com.demo.movies.model.Movie;
import com.demo.movies.repositories.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> getSingleMovie(String imdbId) {
        return movieRepository.findByImdbId(imdbId);
    }
}
