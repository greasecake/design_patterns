package creational.abstract_factory;

import creational.abstract_factory.sedan.truck.Sedan;
import creational.abstract_factory.sedan.truck.SedanFactory;
import creational.abstract_factory.truck.Truck;
import creational.abstract_factory.truck.TruckFactory;

public class Main {
    public static void main(String[] args) {
        TruckFactory truckFactory = (TruckFactory) CarFactoryProvider.getFactory(CarType.TRUCK);
        Truck truck = truckFactory.create();
        assert truck.getWeight() == 10000;

        SedanFactory sedanFactory = (SedanFactory) CarFactoryProvider.getFactory(CarType.SEDAN);
        Sedan sedan = sedanFactory.create();
        assert sedan.getWeight() == 2500;
    }
}
