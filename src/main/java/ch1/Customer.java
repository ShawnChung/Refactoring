package ch1;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Shawn on 2016/5/29.
 */
public class Customer {
    private String _name;                                 // 姓名
    private Vector _rentals = new Vector();               // 租借記錄

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

    public String statement() {
        double totalAmount = 0;                     // 總消費金額
        int frequentRenterPoints = 0;       // 常客積點
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";

        while(rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement(); // 取得一筆租借記錄

            //determine amounts for each line
            double thisAmount = each.getAmount();

            // add frequent renter points（累加 常客積點）
            frequentRenterPoints += each.getFrequentRenterPoints();

            // show figures for this rental（顯示此筆租借資料）
            result += "\t" + each.getMovie().getTitle() + "\t" +
                    String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }

        // add footer lines（結尾列印）
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) +
                " frequent renter points";
        return result;
    }
}
