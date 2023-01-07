package com.hormozhalimi.streams;

import java.util.List;

public class StreamsDemo {
    public static void show(){
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );


        var count2 = movies.stream()
                .filter(movie -> movie.getLikes()> 10)
                .count();
        
                /*
        int count = 0;
        for(var movie : movies)
            if(movie.getLikes() > 10)
                count++;

         */

    }
}
