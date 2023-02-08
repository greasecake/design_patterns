package structural.facade;

class SSD {
    public byte[] read(long lba, int size) {
        System.out.println("Reading data from hard drive at position: " + lba + " of size: " + size);
        return new byte[size];
    }
}
