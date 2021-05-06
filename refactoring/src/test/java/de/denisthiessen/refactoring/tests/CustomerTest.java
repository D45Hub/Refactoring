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
        Movie movie1 = new Movie("Test Movie 1", Movie.CHILDRENS);
        Movie movie2 = new Movie("Test Movie 2", Movie.NEW_RELEASE);
        Movie movie3 = new Movie("Test Movie 3", Movie.REGULAR);

        Rental rental1 = new Rental(movie1, 1);
        Rental rental2 = new Rental(movie2, 4);
        Rental rental3 = new Rental(movie3, 2);

        Customer testCustomer = new Customer("TestCustomer");
        testCustomer.addRental(rental1);
        testCustomer.addRental(rental2);
        testCustomer.addRental(rental3);

        assertEquals(
                "Rental Record for TestCustomer\n\tTitle\t\tDays\tAmount\n\tTest Movie 1\t\t1\t1.5\n\tTest Movie 2\t\t4\t12.0\n\tTest Movie 3\t\t2\t2.0\nAmount owed is 15.5\nYou earned 3 frequent renter points",
                testCustomer.statement());
    }

    @Test
    public void testCustomerHTMLStatement()
    {
        Movie movie1 = new Movie("Test Movie 1", Movie.CHILDRENS);
        Movie movie2 = new Movie("Test Movie 2", Movie.NEW_RELEASE);
        Movie movie3 = new Movie("Test Movie 3", Movie.REGULAR);

        Rental rental1 = new Rental(movie1, 1);
        Rental rental2 = new Rental(movie2, 4);
        Rental rental3 = new Rental(movie3, 2);

        Customer testCustomer = new Customer("TestCustomer");
        testCustomer.addRental(rental1);
        testCustomer.addRental(rental2);
        testCustomer.addRental(rental3);

        assertEquals(
                "<h1>Rentals for <em>TestCustomer</em></h1><p>\nTest Movie 1: 1.5<br>\nTest Movie 2: 12.0<br>\nTest Movie 3: 2.0<br>\n<p>You owe <em>15.5</em></p>\nOn this rental you earned <em>3</em> frequent renter points</p>",
                testCustomer.htmlStatement());
    }

    @Test
    public void testCustomerName()
    {
        Customer testCustomer = new Customer("TestCustomer");
        assertEquals("TestCustomer", testCustomer.getName());
    }

}
