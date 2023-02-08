package structural.bridge.implementation;

public class TV extends BasicDevice {
    @Override
    public String status() {
        return String.format("TV is %s, volume: %s",
                isEnabled ? "on" : "off",
                isEnabled ? volume : "n/a");
    }
}
