package creational.abstract_factory.truck;

import creational.abstract_factory.CarFactory;

public class TruckFactory extends CarFactory<Truck> {
    public Truck create() {
        return new Truck();
    }
}
