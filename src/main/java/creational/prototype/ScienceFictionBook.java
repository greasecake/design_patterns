package creational.prototype;

public class ScienceFictionBook extends Book{
    private final int numberOfAliens;

    public ScienceFictionBook(String name, int pages, int numberOfAliens) {
        super(name, pages);
        this.numberOfAliens = numberOfAliens;
    }

    public ScienceFictionBook copy() {
        ScienceFictionBook bookCopy = new ScienceFictionBook(this.getName(), this.getPages(), this.numberOfAliens);
        bookCopy.setPlot(this.getPlot());
        return bookCopy;
    }
}
