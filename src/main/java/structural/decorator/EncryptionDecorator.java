package structural.decorator;

import java.util.Base64;

public class EncryptionDecorator extends BaseDecorator {
    public EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        super.writeData(encode(data));
    }

    private String encode(String data) {
        return Base64.getEncoder().encodeToString(data.getBytes());
    }

    @Override
    public String readData() {
        return decode(super.readData());
    }

    private String decode(String readData) {
        return new String(Base64.getDecoder().decode(readData));
    }
}
