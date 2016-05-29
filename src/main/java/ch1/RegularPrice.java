package ch1;

/**
 * Created by Shawn on 2016/5/29.
 */
public class RegularPrice extends Price {
    @Override
    public double getPrice(int daysRented) {
        double amount = 2;
        if(daysRented > 2)
            amount += (daysRented - 2) * 1.5;
        return amount;
    }
}
