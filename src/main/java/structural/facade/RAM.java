package structural.facade;

class RAM {
    public void load(long position, byte[] data) {
        System.out.println("Loading data into memory at position: " + position);
    }
}
