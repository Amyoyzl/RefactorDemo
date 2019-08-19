package rentalstore;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    @Test
    public void should_return_REGULAR_statement_rent_two_days() {
        Customer customer = new Customer("test");
        Rental rental = new Rental(new Movie("title1", 0), 2);
        customer.addRental(rental);

        String statement = customer.statement();

        assertEquals(statement, "Rental Record for test\n" +
                "\ttitle1\t2.0\n" +
                "Amount owed is 2.0\n" +
                "You earned 1 frequent renter points");
    }

}
