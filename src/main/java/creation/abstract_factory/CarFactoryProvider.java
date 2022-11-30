package creation.abstract_factory;

import creation.abstract_factory.sedan.truck.SedanFactory;
import creation.abstract_factory.truck.TruckFactory;

public class CarFactoryProvider {
    public static CarFactory getFactory(CarType carType) {
        switch (carType) {
            case TRUCK:
                return new TruckFactory();
            case SEDAN:
                return new SedanFactory();
        }
        throw new RuntimeException("Unknown car type");
    }
}