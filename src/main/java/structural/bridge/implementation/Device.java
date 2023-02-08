package structural.bridge.implementation;

public interface Device {
    void enable();
    void disable();
    void setVolume(int volume);
    int getVolume();
    boolean getEnabled();
    String status();
}
