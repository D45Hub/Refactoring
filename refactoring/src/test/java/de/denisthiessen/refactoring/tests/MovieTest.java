package de.denisthiessen.refactoring.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import de.denisthiessen.refactoring.Movie;


public class MovieTest
{

    @Test
    public void testPriceCode()
    {
        Movie movie1 = new Movie("Test Movie 1", 100);
        Movie movie2 = new Movie("Test Movie 2", 200);

        assertEquals(100, movie1.getPriceCode());
        assertEquals(200, movie2.getPriceCode());

        movie2.setPriceCode(150);
        assertEquals(150, movie2.getPriceCode());
    }

    @Test
    public void testMovieTitle()
    {
        Movie movie1 = new Movie("Test Movie 1", 100);
        Movie movie2 = new Movie("Test Movie 2", 200);

        assertEquals("Test Movie 1", movie1.getTitle());
        assertEquals("Test Movie 2", movie2.getTitle());
    }
}
