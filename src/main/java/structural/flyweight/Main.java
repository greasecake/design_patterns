package structural.flyweight;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();

        Flyweight flyweight1 = flyweightFactory.getFlyweight("A");
        Flyweight flyweight2 = flyweightFactory.getFlyweight("A");
        Flyweight flyweight3 = flyweightFactory.getFlyweight("B");

        System.out.println(flyweight1 == flyweight2);  // prints "true"
        System.out.println(flyweight1 == flyweight3);  // prints "false"
    }
}
