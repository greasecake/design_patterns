package structural.bridge;

import structural.bridge.abstraction.AdvancedRemote;
import structural.bridge.abstraction.BasicRemote;
import structural.bridge.abstraction.Remote;
import structural.bridge.implementation.Radio;
import structural.bridge.implementation.TV;

public class Main {
    public static void main(String[] args) {
        Radio radio = new Radio();
        Remote basicRemote = new BasicRemote(radio);
        System.out.println(radio.status());
        basicRemote.toggle();
        System.out.println(radio.status());
        basicRemote.volumeDown();
        System.out.println(radio.status());

        TV tv = new TV();
        AdvancedRemote advancedRemote = new AdvancedRemote(tv);
        advancedRemote.toggle();
        System.out.println(tv.status());
        advancedRemote.mute();
        System.out.println(tv.status());
        advancedRemote.volumeUp();
        System.out.println(tv.status());
    }
}
