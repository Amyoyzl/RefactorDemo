package rentalstore;

public class ChildrenRental implements BaseRental {
    @Override
    public double calculateAmount(int dayRented) {
        double amount = 1.5;
        if (dayRented > 3) {
            amount += (dayRented - 3) * 1.5;
        }
        return amount;
    }
}
