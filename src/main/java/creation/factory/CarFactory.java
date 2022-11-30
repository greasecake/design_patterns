package creation.factory;

public class CarFactory {
    public Car getVehicle(CarType carType) {
        return carType.getVehicle();
    }
}
