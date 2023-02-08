package structural.bridge.implementation;

public class Radio extends BasicDevice {
    @Override
    public String status() {
        return String.format("Radio is %s, volume: %s",
                isEnabled ? "on" : "off",
                isEnabled ? volume : "n/a");
    }
}
