package rentalstore;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    @Test
    public void should_return_REGULAR_statement_rent_two_days() {
        Customer customer = new Customer("test");
        Rental rental = new Rental(new Movie("title1", Movie.REGULAR), 2);
        customer.addRental(rental);

        String statement = customer.statement();

        assertEquals("Rental Record for test\n" +
                "\ttitle1\t2.0\n" +
                "Amount owed is 2.0\n" +
                "You earned 1 frequent renter points", statement);
    }

    @Test
    public void should_return_REGULAR_statement_rent_three_days() {
        Customer customer = new Customer("test");
        Rental rental = new Rental(new Movie("title1", Movie.REGULAR), 3);
        customer.addRental(rental);

        String statement = customer.statement();

        assertEquals("Rental Record for test\n" +
                "\ttitle1\t3.5\n" +
                "Amount owed is 3.5\n" +
                "You earned 1 frequent renter points", statement);
    }

    @Test
    public void should_return_NEW_RELEASE_statement_rent_three_days() {
        Customer customer = new Customer("test");
        Rental rental = new Rental(new Movie("title1", Movie.NEW_RELEASE), 3);
        customer.addRental(rental);

        String statement = customer.statement();

        assertEquals("Rental Record for test\n" +
                "\ttitle1\t9.0\n" +
                "Amount owed is 9.0\n" +
                "You earned 2 frequent renter points", statement);
    }

    @Test
    public void should_return_NEW_RELEASE_statement_rent_one_days() {
        Customer customer = new Customer("test");
        Rental rental = new Rental(new Movie("title1", Movie.NEW_RELEASE), 1);
        customer.addRental(rental);

        String statement = customer.statement();

        assertEquals("Rental Record for test\n" +
                "\ttitle1\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1 frequent renter points", statement);
    }


}
