package de.denisthiessen.refactoring;

import java.util.Enumeration;
import java.util.Vector;


public class Customer
{
    private String name;
    private Vector<Rental> rentals = new Vector<Rental>();

    public Customer(String newname)
    {
        name = newname;
    };

    public void addRental(Rental arg)
    {
        rentals.addElement(arg);
    };

    public String getName()
    {
        return name;
    };

    public String statement()
    {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration<Rental> enum_rentals = rentals.elements();
        String result = "Rental Record for " + this.getName() + "\n";
        result += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";

        while (enum_rentals.hasMoreElements())
        {
            Rental each = (Rental) enum_rentals.nextElement();
            // add frequent renter points
            frequentRenterPoints = each.calculateRenterPoints();
            // show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + "\t" + each
                    .getDaysRented() + "\t" + String.valueOf(each.getCharge()) + "\n";
            totalAmount += each.getCharge();
        }
        // add footer lines
        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String
                .valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";
        return result;
    }

    public String htmlStatement()
    {
        Enumeration<Rental> enumRentals = rentals.elements();
        String result = "<h1>Rentals for <em>" + getName() + "</em></h1><p>\n";
        while (enumRentals.hasMoreElements())
        {
            Rental each = (Rental) enumRentals.nextElement();
            // show figures for each rental
            result += each.getMovie().getTitle() + ": " + String
                    .valueOf(each.getCharge()) + "" + "<br>\n";
        }
        // add footer lines
        result += "<p>You owe <em>" + String.valueOf(getTotalCharge()) + "</em></p>\n";
        result += "On this rental you earned <em>" + String
                .valueOf(getTotalFrequentRenterPoints()) + "</em> frequent renter points</p>";
        return result;
    }

    private double getTotalCharge()
    {
        double result = 0;
        Enumeration<Rental> enumRentals = rentals.elements();
        while (enumRentals.hasMoreElements())
        {
            Rental each = (Rental) enumRentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }

    private int getTotalFrequentRenterPoints()
    {
        int result = 0;
        Enumeration<Rental> enumRentals = rentals.elements();
        while (enumRentals.hasMoreElements())
        {
            Rental each = (Rental) enumRentals.nextElement();
            result += each.calculateRenterPoints();
        }
        return result;
    }

}
