package creational.abstract_factory;

public abstract class CarFactory<T extends Car> {
    public abstract T create();
}
