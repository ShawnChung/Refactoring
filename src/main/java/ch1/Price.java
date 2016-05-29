package ch1;

/**
 * Created by Shawn on 2016/5/29.
 */
public abstract class Price {
    public abstract double getPrice(int daysRented);
    public int getFrequentRenterPoints(int daysRented) {
        int frequentRenterPoints = 1;
        return frequentRenterPoints;
    }
}
