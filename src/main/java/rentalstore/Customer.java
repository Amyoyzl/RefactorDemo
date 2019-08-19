package rentalstore;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public String getName() {
        return name;
    }

    public String textStatement() {
        return new TextStatement().createStatement(this);
    }

    public String htmlStatement() {
        return new HtmlStatement().createStatement(this);
    }

    public double calculateTotalAmount() {
        double totalAmount = 0;
        for (Rental rental : this.rentals) {
            totalAmount += rental.calculateAmount();
        }
        return totalAmount;
    }

    public int calculateFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        for (Rental rental : this.rentals) {
            frequentRenterPoints++;
            if ((rental.getMovie().getPriceCode() == Movie.NEW_RELEASE) && rental.getDayRented() > 1) {
                frequentRenterPoints++;
            }
        }
        return frequentRenterPoints;
    }

}
