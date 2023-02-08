package structural.bridge.implementation;

public abstract class BasicDevice implements Device {
    protected boolean isEnabled = false;
    protected int volume = 50;

    @Override
    public void enable() {
        isEnabled = true;
    }

    @Override
    public void disable() {
        isEnabled = false;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = Math.min(Math.max(volume, 0), 100);
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public boolean getEnabled() {
        return isEnabled;
    }
}
