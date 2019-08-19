package rentalstore;

public class RegularRental implements BaseRental {
    @Override
    public double calculateAmount(int dayRented) {
        double amount = 2;
        if (dayRented > 2) {
            amount += (dayRented - 2) * 1.5;
        }
        return amount;
    }
}
