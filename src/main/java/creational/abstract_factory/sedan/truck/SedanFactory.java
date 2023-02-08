package creational.abstract_factory.sedan.truck;

import creational.abstract_factory.CarFactory;

public class SedanFactory extends CarFactory<Sedan> {
    public Sedan create() {
        return new Sedan();
    }
}
