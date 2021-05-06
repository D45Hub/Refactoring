package de.denisthiessen.refactoring;

public class Rental
{
    private Movie movie;
    private int daysRented;

    public Rental(Movie newmovie, int newdaysRented)
    {
        movie = newmovie;
        daysRented = newdaysRented;
    }

    public int getDaysRented()
    {
        return daysRented;
    }

    public Movie getMovie()
    {
        return movie;
    }

    public double getCharge()
    {
        double result = 0;
        switch (movie.getPriceCode())
        {
            case Movie.REGULAR:
                result += 2;
                if (daysRented > 2)
                    result += (daysRented - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                result += daysRented * 3;
                break;
            case Movie.CHILDRENS:
                result += 1.5;
                if (daysRented > 3)
                    result += (daysRented - 3) * 1.5;
                break;
        }
        return result;
    }
}