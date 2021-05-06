package de.denisthiessen.refactoring;

public class Movie
{
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private Price price;
    private String title;
    private int priceCode;

    public Movie(String newtitle, int newpriceCode)
    {
        title = newtitle;
        setPriceCode(newpriceCode);
    }

    public int getPriceCode()
    {
        return price.getPriceCode();
    }

    public void setPriceCode(int arg)
    {
        switch (arg)
        {
            case REGULAR:
                price = new RegularPrice();
                break;
            case CHILDRENS:
                price = new ChildrensPrice();
                break;
            case NEW_RELEASE:
                price = new NewReleasesPrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }

    public String getTitle()
    {
        return title;
    };

    public double getCharge(int daysRented)
    {
        return price.getCharge(daysRented);
    }

    public int calculateRenterPoints(int daysRented)
    {
        if ((priceCode == Movie.NEW_RELEASE) && daysRented > 1)
        {
            return 2;
        }

        return 1;
    }
}