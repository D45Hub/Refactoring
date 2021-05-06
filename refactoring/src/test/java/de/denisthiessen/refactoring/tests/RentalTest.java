package de.denisthiessen.refactoring.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import de.denisthiessen.refactoring.Movie;
import de.denisthiessen.refactoring.Rental;


public class RentalTest
{

    @Test
    public void testRentalMovies()
    {
        Movie movie1 = new Movie("Test Movie 1", 100);
        Movie movie2 = new Movie("Test Movie 2", 200);

        Rental rental1 = new Rental(movie1, 1);
        Rental rental2 = new Rental(movie2, 4);

        assertEquals(movie1, rental1.getMovie());
        assertEquals(movie2, rental2.getMovie());
    }

    @Test
    public void testRentalDaysRented()
    {
        Movie movie1 = new Movie("Test Movie 1", 100);
        Movie movie2 = new Movie("Test Movie 2", 200);

        Rental rental1 = new Rental(movie1, 1);
        Rental rental2 = new Rental(movie2, 4);

        assertEquals(1, rental1.getDaysRented());
        assertEquals(4, rental2);
    }
}
