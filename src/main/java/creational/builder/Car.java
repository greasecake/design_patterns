package creational.builder;

public class Car {
    private final CarEngine engine;
    private final String color;
    private final String[] options;

    private Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.color = builder.color;
        this.options = builder.options;
    }

    public CarEngine getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    public String[] getOptions() {
        return options;
    }

    public static class CarBuilder {
        private CarEngine engine;
        private String color;
        private String[] options;

        public CarBuilder withEngine(CarEngine engine) {
            // validate
            this.engine = engine;
            return this;
        }
        public CarBuilder withColor(String color) {
            this.color = color;
            return this;
        }
        public CarBuilder withOptions(String[] options) {
            this.options = options;
            return this;
        }
        public Car build() {
            return new Car(this);
        }
    }
}
