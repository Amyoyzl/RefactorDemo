package rentalstore;

public class ReleaseRental implements BaseRental {
    @Override
    public double calculateAmount(int dayRented) {
        return dayRented  * 3;
    }
}
