package rentalstore;

public class Rental {
    private Movie movie;
    private int dayRented;

    public Rental(Movie movie, int dayRented) {
        this.movie = movie;
        this.dayRented = dayRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDayRented() {
        return dayRented;
    }

    public double calculateAmount() {
        double amount = 0;
        switch (movie.getPriceCode()) {
            case Movie.REGULAR:
                amount += 2;
                if (this.dayRented > 2) {
                    amount += (this.dayRented - 2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                amount += this.dayRented * 3;
                break;
            case Movie.CHILDRENS:
                amount += 1.5;
                if (this.dayRented > 3) {
                    amount += (this.dayRented - 3) * 1.5;
                }
                break;
        }
        return amount;
    }
}
