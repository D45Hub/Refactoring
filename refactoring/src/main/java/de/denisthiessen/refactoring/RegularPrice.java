package de.denisthiessen.refactoring;

public class RegularPrice extends Price
{

    @Override
    public int getPriceCode()
    {
        return Movie.REGULAR;
    }

}
