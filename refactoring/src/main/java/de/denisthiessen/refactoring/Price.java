package de.denisthiessen.refactoring;

public abstract class Price
{
    public abstract int getPriceCode();

    public abstract double getCharge(int daysRented);
}
