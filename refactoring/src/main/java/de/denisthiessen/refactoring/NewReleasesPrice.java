package de.denisthiessen.refactoring;

public class NewReleasesPrice extends Price
{

    @Override
    public int getPriceCode()
    {
        return Movie.NEW_RELEASE;
    }

    @Override
    public double getCharge(int daysRented)
    {
        return daysRented * 3;
    }

}
