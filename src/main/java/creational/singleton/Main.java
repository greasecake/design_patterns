package creational.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        singleton1.setData("data1");

        Singleton singleton2 = Singleton.getInstance();
        assert singleton2.getData() == "data1";
    }
}
