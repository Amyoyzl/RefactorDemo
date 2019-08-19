package rentalstore;

import java.util.List;

public class TextStatement extends Statement {
    @Override
    public String createHeader(String name) {
        return "Rental Record for " + name + "\n";
    }

    @Override
    public String createRentalsDetail(List<Rental> rentals) {
        String details = "";
        for (Rental rental : rentals) {
            double thisAmount = rental.calculateAmount();
            details += "\t" + rental.getMovie().getTitle() + "\t" + thisAmount + "\n";
        }
        return details;
    }

    @Override
    public String createFooter(double totalAmount, int frequentRenterPoints) {
        String result = "Amount owed is " + totalAmount + "\n";
        result += "You earned " + frequentRenterPoints + " frequent renter points";
        return result;
    }

}
