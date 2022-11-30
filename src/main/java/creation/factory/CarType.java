package creation.factory;

import java.util.function.Supplier;

public enum CarType {
    SEDAN(Sedan::new),
    TRUCK(Truck::new);

    private Car vehicle;

    Car getVehicle() {
        return vehicle;
    }

    CarType(Supplier<Car> constructor) {
    }
}
