package creation.abstract_factory.sedan.truck;

import creation.abstract_factory.CarFactory;

public class SedanFactory extends CarFactory<Sedan> {
    public Sedan create() {
        return new Sedan();
    }
}
