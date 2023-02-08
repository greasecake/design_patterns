package structural.decorator;

import java.util.Scanner;

public class ConsoleDataSource implements DataSource {
    String data;

    @Override
    public void writeData(String data) {
        System.out.println(data);
    }

    @Override
    public String readData() {
        data = new Scanner(System.in).nextLine();
        return data;
    }
}
