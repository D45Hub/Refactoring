package de.denisthiessen.refactoring.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import de.denisthiessen.refactoring.Customer;
import de.denisthiessen.refactoring.Movie;
import de.denisthiessen.refactoring.Rental;


public class CustomerTest
{

    @Test
    public void testCustomerStatement()
    {
        Movie movie1 = new Movie("Test Movie 1", 100);
        Movie movie2 = new Movie("Test Movie 2", 200);
        Movie movie3 = new Movie("Test Movie 3", 50);

        Rental rental1 = new Rental(movie1, 1);
        Rental rental2 = new Rental(movie2, 4);
        Rental rental3 = new Rental(movie3, 2);

        Customer testCustomer = new Customer("TestCustomer");
        testCustomer.addRental(rental1);
        testCustomer.addRental(rental2);
        testCustomer.addRental(rental3);

        assertEquals(
                "Rental Record for TestCustomer\n\tTitle\t\tDays\tAmount\n\tTest Movie 1\t\t1\t0.0\n\tTest Movie 2\t\t4\t0.0\n\tTest Movie 3\t\t2\t0.0\nAmount owed is 0.0\nYou earned 3 frequent renter points",
                testCustomer.statement());
    }

    @Test
    public void testCustomerName()
    {
        Customer testCustomer = new Customer("TestCustomer");
        assertEquals("TestCustomer", testCustomer.getName());
    }

}
