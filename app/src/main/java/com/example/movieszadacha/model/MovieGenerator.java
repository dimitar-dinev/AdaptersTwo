package com.example.movieszadacha.model;

public class MovieGenerator {

    public Movie[] generateMovies() {
        Movie movie = new Movie("Lord Of The Rings", "Fantasy", 2001);
        Movie movie2 = new Movie("Interstellar", "Sci-Fi", 2014);
        Movie movie3 = new Movie("Harry Potter", "Fantasy", 2010);
        Movie movie4 = new Movie("The Godfather", "Drama", 1972);
        Movie movie5 = new Movie("Inception", "Sci-Fi", 2010);
        Movie movie6 = new Movie("There Will Be Blood", "Drama", 2007);
        Movie movie7 = new Movie("The Dark Knight", "Action", 2008);

        return new Movie[]{movie, movie2, movie3, movie4, movie5, movie6, movie7};
    }
}
