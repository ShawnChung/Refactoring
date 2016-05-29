package ch1;

/**
 * Created by Shawn on 2016/5/29.
 */
public class NewReleasePrice extends Price {
    @Override
    public double getPrice(int daysRented) {
        return daysRented * 3;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        int frequentRenterPoints = super.getFrequentRenterPoints(daysRented);
        // add bonus for a two day new release rental
        if (daysRented > 1)
            frequentRenterPoints++;
        return frequentRenterPoints;
    }
}
