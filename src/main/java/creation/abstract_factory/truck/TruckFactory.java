package creation.abstract_factory.truck;

import creation.abstract_factory.CarFactory;

public class TruckFactory extends CarFactory<Truck> {
    public Truck create() {
        return new Truck();
    }
}
