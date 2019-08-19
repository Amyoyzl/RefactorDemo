package rentalstore;

import java.util.List;

public class HtmlStatement extends Statement {
    @Override
    public String createHeader(String name) {
        return "<H1>Rental Record for <EM>" + name + "</EM></H1><P>";
    }

    @Override
    public String createRentalsDetail(List<Rental> rentals) {
        String details = "";
        for (Rental rental : rentals) {
            double thisAmount = rental.calculateAmount();
            details += rental.getMovie().getTitle() + ": " + thisAmount + "<BR>";
        }
        return details;
    }

    @Override
    public String createFooter(double totalAmount, int frequentRenterPoints) {
        String result = "<P>You owe<EM>" + totalAmount + "</EM></P>";
        result += "On this rental you earned <EM>" + frequentRenterPoints + "</EM> frequent renter points<P>";
        return result;
    }

}
