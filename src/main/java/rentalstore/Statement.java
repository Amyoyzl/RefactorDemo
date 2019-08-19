package rentalstore;

import java.util.List;

public abstract class Statement {
    abstract String createHeader(String name);

    abstract String createRentalsDetail(List<Rental> rentals);

    abstract String createFooter(double totalAmount, int frequentRenterPoints);

    String createStatement(Customer customer) {
        String result = createHeader(customer.getName());
        result += createRentalsDetail(customer.getRentals());
        result += createFooter(customer.calculateTotalAmount(), customer.calculateFrequentRenterPoints());
        return result;
    }
}
