package de.denisthiessen.refactoring.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import de.denisthiessen.refactoring.Movie;


public class MovieTest
{

    @Test
    public void testPriceCode()
    {
        Movie movie1 = new Movie("Test Movie 1", Movie.CHILDRENS);
        Movie movie2 = new Movie("Test Movie 2", Movie.NEW_RELEASE);

        assertEquals(Movie.CHILDRENS, movie1.getPriceCode());
        assertEquals(Movie.NEW_RELEASE, movie2.getPriceCode());

        movie2.setPriceCode(Movie.REGULAR);
        assertEquals(Movie.REGULAR, movie2.getPriceCode());
    }

    @Test
    public void testMovieTitle()
    {
        Movie movie1 = new Movie("Test Movie 1", Movie.REGULAR);
        Movie movie2 = new Movie("Test Movie 2", Movie.NEW_RELEASE);

        assertEquals("Test Movie 1", movie1.getTitle());
        assertEquals("Test Movie 2", movie2.getTitle());
    }
}
