package com.demo.movies.repositories;

import com.demo.movies.model.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {

    // Dynamic queries, no implementation needed.
    // Identifier should be unique, if not, multiple objects will be returned.
    Optional<Movie> findByImdbId(String imdbId);
}
