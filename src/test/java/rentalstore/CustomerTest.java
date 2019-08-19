package rentalstore;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    @Test
    public void should_return_REGULAR_statement_rent_two_days() {
        Customer customer = new Customer("test");
        Rental rental = new Rental(new Movie("title1", Movie.REGULAR), 2, new RegularRental());
        customer.addRental(rental);

        String statement = customer.textStatement();

        assertEquals("Rental Record for test\n" +
                "\ttitle1\t2.0\n" +
                "Amount owed is 2.0\n" +
                "You earned 1 frequent renter points", statement);
    }

    @Test
    public void should_return_REGULAR_statement_rent_three_days() {
        Customer customer = new Customer("test");
        Rental rental = new Rental(new Movie("title1", Movie.REGULAR), 3, new RegularRental());
        customer.addRental(rental);

        String statement = customer.textStatement();

        assertEquals("Rental Record for test\n" +
                "\ttitle1\t3.5\n" +
                "Amount owed is 3.5\n" +
                "You earned 1 frequent renter points", statement);
    }

    @Test
    public void should_return_NEW_RELEASE_statement_rent_three_days() {
        Customer customer = new Customer("test");
        Rental rental = new Rental(new Movie("title1", Movie.NEW_RELEASE), 3, new ReleaseRental());
        customer.addRental(rental);

        String statement = customer.textStatement();

        assertEquals("Rental Record for test\n" +
                "\ttitle1\t9.0\n" +
                "Amount owed is 9.0\n" +
                "You earned 2 frequent renter points", statement);
    }

    @Test
    public void should_return_NEW_RELEASE_statement_rent_one_days() {
        Customer customer = new Customer("test");
        Rental rental = new Rental(new Movie("title1", Movie.NEW_RELEASE), 1, new ReleaseRental());
        customer.addRental(rental);

        String statement = customer.textStatement();

        assertEquals("Rental Record for test\n" +
                "\ttitle1\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1 frequent renter points", statement);
    }

    @Test
    public void should_return_CHILDRENS_statement_rent_three_days() {
        Customer customer = new Customer("test");
        Rental rental = new Rental(new Movie("title1", Movie.CHILDRENS), 3, new ChildrenRental());
        customer.addRental(rental);

        String statement = customer.textStatement();

        assertEquals("Rental Record for test\n" +
                "\ttitle1\t1.5\n" +
                "Amount owed is 1.5\n" +
                "You earned 1 frequent renter points", statement);
    }

    @Test
    public void should_return_CHILDRENS_statement_rent_four_days() {
        Customer customer = new Customer("test");
        Rental rental = new Rental(new Movie("title1", Movie.CHILDRENS), 4, new ChildrenRental());
        customer.addRental(rental);

        String statement = customer.textStatement();

        assertEquals("Rental Record for test\n" +
                "\ttitle1\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1 frequent renter points", statement);
    }

    @Test
    public void should_return_not_rent_any_movie_statement() {
        Customer customer = new Customer("test");

        String statement = customer.textStatement();

        assertEquals("Rental Record for test\n" +
                "Amount owed is 0.0\n" +
                "You earned 0 frequent renter points", statement);
    }

    @Test
    public void should_return_REGULAR_htmlStatement_rent_two_days() {
        Customer customer = new Customer("test");
        Rental rental = new Rental(new Movie("title1", Movie.REGULAR), 2, new RegularRental());
        customer.addRental(rental);

        String statement = customer.htmlStatement();

        assertEquals("<H1>Rental Record for <EM>test</EM></H1><P>" +
                "title1: 2.0<BR>" +
                "<P>You owe<EM>2.0</EM></P>" +
                "On this rental you earned <EM>1</EM> frequent renter points<P>", statement);
    }

    @Test
    public void should_return_REGULAR_htmlStatement_rent_three_days() {
        Customer customer = new Customer("test");
        Rental rental = new Rental(new Movie("title1", Movie.REGULAR), 3, new RegularRental());
        customer.addRental(rental);

        String statement = customer.htmlStatement();

        assertEquals("<H1>Rental Record for <EM>test</EM></H1><P>" +
                "title1: 3.5<BR>" +
                "<P>You owe<EM>3.5</EM></P>" +
                "On this rental you earned <EM>1</EM> frequent renter points<P>", statement);
    }

    @Test
    public void should_return_NEW_RELEASE_htmlStatement_rent_three_days() {
        Customer customer = new Customer("test");
        Rental rental = new Rental(new Movie("title1", Movie.NEW_RELEASE), 3, new ReleaseRental());
        customer.addRental(rental);

        String statement = customer.htmlStatement();

        assertEquals("<H1>Rental Record for <EM>test</EM></H1><P>" +
                "title1: 9.0<BR>" +
                "<P>You owe<EM>9.0</EM></P>" +
                "On this rental you earned <EM>2</EM> frequent renter points<P>", statement);
    }

    @Test
    public void should_return_NEW_RELEASE_htmlStatement_rent_one_days() {
        Customer customer = new Customer("test");
        Rental rental = new Rental(new Movie("title1", Movie.NEW_RELEASE), 1, new ReleaseRental());
        customer.addRental(rental);

        String statement = customer.htmlStatement();

        assertEquals("<H1>Rental Record for <EM>test</EM></H1><P>" +
                "title1: 3.0<BR>" +
                "<P>You owe<EM>3.0</EM></P>" +
                "On this rental you earned <EM>1</EM> frequent renter points<P>", statement);
    }

    @Test
    public void should_return_CHILDRENS_htmlStatement_rent_three_days() {
        Customer customer = new Customer("test");
        Rental rental = new Rental(new Movie("title1", Movie.CHILDRENS), 3, new ChildrenRental());
        customer.addRental(rental);

        String statement = customer.htmlStatement();

        assertEquals("<H1>Rental Record for <EM>test</EM></H1><P>" +
                "title1: 1.5<BR>" +
                "<P>You owe<EM>1.5</EM></P>" +
                "On this rental you earned <EM>1</EM> frequent renter points<P>", statement);
    }

    @Test
    public void should_return_CHILDRENS_htmlStatement_rent_four_days() {
        Customer customer = new Customer("test");
        Rental rental = new Rental(new Movie("title1", Movie.CHILDRENS), 4, new ChildrenRental());
        customer.addRental(rental);

        String statement = customer.htmlStatement();

        assertEquals("<H1>Rental Record for <EM>test</EM></H1><P>" +
                "title1: 3.0<BR>" +
                "<P>You owe<EM>3.0</EM></P>" +
                "On this rental you earned <EM>1</EM> frequent renter points<P>", statement);
    }

    @Test
    public void should_return_not_rent_any_movie_htmlStatement() {
        Customer customer = new Customer("test");

        String statement = customer.htmlStatement();

        assertEquals("<H1>Rental Record for <EM>test</EM></H1><P>" +
                "<P>You owe<EM>0.0</EM></P>" +
                "On this rental you earned <EM>0</EM> frequent renter points<P>", statement);
    }


}
