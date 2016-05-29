package ch1;

/**
 * Created by Shawn on 2016/5/29.
 */
public class Rental {
    private Movie _movie;         // 影片
    private int _daysRented;              // 租期

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public double getAmount() {
        return this.getMovie().getPrice(getDaysRented());
    }

    public int getFrequentRenterPoints() {

        return this.getMovie().getFrequentRenterPoints(getDaysRented());
    }
}
