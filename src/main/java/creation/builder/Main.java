package creation.builder;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder()
                .withColor("Orange")
                .withEngine(new CarEngine(800))
                .withOptions(new String[]{"Leather seats", "CarPlay"})
                .build();

        assert Objects.equals(car.getColor(), "Orange");
    }
}
