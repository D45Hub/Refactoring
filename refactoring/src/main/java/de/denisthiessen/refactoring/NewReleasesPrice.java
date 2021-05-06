package de.denisthiessen.refactoring;

public class NewReleasesPrice extends Price
{

    @Override
    public int getPriceCode()
    {
        return Movie.NEW_RELEASE;
    }

}
