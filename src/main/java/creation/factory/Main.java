package creation.factory;

public class Main {
    public static void main(String[] args) {
        assert new CarFactory().getVehicle(CarType.TRUCK) instanceof Truck;
    }
}
