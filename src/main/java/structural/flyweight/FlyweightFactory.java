package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

class FlyweightFactory {
    private final Map<String, Flyweight> flyweights = new HashMap<>();

    public Flyweight getFlyweight(String key) {
        if (!flyweights.containsKey(key)) {
            flyweights.put(key, new Flyweight(key));
        }
        return flyweights.get(key);
    }
}
