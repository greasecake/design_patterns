package creational.prototype;

public class Plot {
    private final int numberOfCharacters;
    private final boolean goodEnding;

    public Plot(int numberOfCharacters, boolean goodEnding) {
        this.numberOfCharacters = numberOfCharacters;
        this.goodEnding = goodEnding;
    }

    public int getNumberOfCharacters() {
        return numberOfCharacters;
    }

    public boolean isGoodEnding() {
        return goodEnding;
    }
}
