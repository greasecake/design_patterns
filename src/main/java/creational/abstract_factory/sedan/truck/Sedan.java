package creational.abstract_factory.sedan.truck;

import creational.abstract_factory.Car;

public class Sedan implements Car {
    @Override
    public int getWeight() {
        return 2500;
    }
}
