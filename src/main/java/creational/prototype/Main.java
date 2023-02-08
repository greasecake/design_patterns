package creational.prototype;

public class Main {
    public static void main(String[] args) {
        ScienceFictionBook book = new ScienceFictionBook("Hitchhiker's Guide", 224, 42);
        book.setPlot(new Plot(54, true));
        ScienceFictionBook bookCopy = book.copy();
        assert bookCopy.getPlot().isGoodEnding();
    }
}
