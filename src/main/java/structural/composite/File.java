package structural.composite;

class File implements FileSystemComponent {
    private final String name;
    private final int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void showDetails() {
        System.out.println("File: " + name + " of size: " + size + " MB");
    }
}
