package creation.abstract_factory;

import creation.abstract_factory.sedan.truck.Sedan;
import creation.abstract_factory.sedan.truck.SedanFactory;
import creation.abstract_factory.truck.Truck;
import creation.abstract_factory.truck.TruckFactory;

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
