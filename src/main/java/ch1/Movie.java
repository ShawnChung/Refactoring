package ch1;

/**
 * Created by Shawn on 2016/5/29.
 */
public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;        // 名稱
    private Price _price;       // 價格

    public Movie(String title, int priceCode){
        _title = title;
        setPrice(priceCode);
    }

    public double getPrice(int daysRented) {
        return this._price.getPrice(daysRented);
    }

    public void setPrice(int priceCode) {
        switch(priceCode){   // 取得影片出租價格
            case Movie.REGULAR:                     // 普通片
                this._price = new RegularPrice();
                break;
            case Movie.NEW_RELEASE:         // 新片
                this._price = new NewReleasePrice();
                break;

            case Movie.CHILDRENS:           // 兒童片
                this._price = new ChildrensPrice();
                break;
        }
    }

    public int getFrequentRenterPoints(int daysRented) {
        return this._price.getFrequentRenterPoints(daysRented);
    }

    public String getTitle() {
        return _title;
    }

    // jjhou add
    public static void main(String[] args) {
        System.out.println("Refactoring, a First Example, step1");

        Movie m1 = new Movie("Seven", Movie.NEW_RELEASE);
        Movie m2 = new Movie("Terminator", Movie.REGULAR);
        Movie m3 = new Movie("Star Trek", Movie.CHILDRENS);

        Rental r1 = new Rental(m1, 4);
        Rental r2 = new Rental(m1, 2);
        Rental r3 = new Rental(m3, 7);
        Rental r4 = new Rental(m2, 5);
        Rental r5 = new Rental(m3, 3);

        Customer c1 = new Customer("jjhou");
        c1.addRental(r1);
        c1.addRental(r4);

        Customer c2 = new Customer("gigix");
        c2.addRental(r1);
        c2.addRental(r3);
        c2.addRental(r2);

        Customer c3 = new Customer("jiangtao");
        c3.addRental(r3);
        c3.addRental(r5);

        Customer c4 = new Customer("yeka");
        c4.addRental(r2);
        c4.addRental(r3);
        c4.addRental(r5);

        System.out.println(c1.statement());
        System.out.println(c2.statement());
        System.out.println(c3.statement());
        System.out.println(c4.statement());
    }
}
