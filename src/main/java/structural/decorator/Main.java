package structural.decorator;

public class Main {
    public static void main(String[] args) {
        String TEST_DATA = "Hello, World!";

        DataSource plainData = new ConsoleDataSource();
        plainData.writeData(TEST_DATA);

        DataSource encryptedData = new EncryptionDecorator(
                                    new ConsoleDataSource());
        encryptedData.writeData(TEST_DATA);
    }
}
