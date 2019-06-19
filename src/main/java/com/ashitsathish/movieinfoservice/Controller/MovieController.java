package com.ashitsathish.movieinfoservice.Controller;

import com.ashitsathish.movieinfoservice.models.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("moveId") String movieId){
        return new Movie(movieId, "Test Name");
    }
}
