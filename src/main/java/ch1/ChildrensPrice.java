package ch1;

/**
 * Created by Shawn on 2016/5/29.
 */
public class ChildrensPrice extends Price {
    @Override
    public double getPrice(int daysRented) {
        double amount = 1.5;
        if (daysRented > 3)
            amount += (daysRented - 3) * 1.5;
        return amount;
    }
}
