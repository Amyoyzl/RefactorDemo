package rentalstore;

public class Rental {
    private Movie movie;
    private int dayRented;
    private BaseRental baseRental;

    public Rental(Movie movie, int dayRented, BaseRental baseRental) {
        this.movie = movie;
        this.dayRented = dayRented;
        this.baseRental = baseRental;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDayRented() {
        return dayRented;
    }

    public double calculateAmount() {
        return baseRental.calculateAmount(this.dayRented);
    }
}
