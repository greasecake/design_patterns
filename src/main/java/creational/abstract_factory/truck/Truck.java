package creational.abstract_factory.truck;

import creational.abstract_factory.Car;

public class Truck implements Car {
    @Override
    public int getWeight() {
        return 10_000;
    }
}
