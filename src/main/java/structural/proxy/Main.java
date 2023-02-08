package structural.proxy;

public class Main {
    public static void main(String[] args) {
        Image image = new ImageProxy("test_10mb.jpg");

        image.display();  // loading is deferred until display() is called
    }
}
