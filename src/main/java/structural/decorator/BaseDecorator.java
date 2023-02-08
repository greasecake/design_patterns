package structural.decorator;

public class BaseDecorator implements DataSource {
    private final DataSource wrapee;

    public BaseDecorator(DataSource dataSource) {
        this.wrapee = dataSource;
    }

    @Override
    public void writeData(String data) {
        wrapee.writeData(data);
    }

    @Override
    public String readData() {
        return wrapee.readData();
    }
}
