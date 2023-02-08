package structural.facade;

class ComputerFacade {
    private final CPU cpu;
    private final RAM ram;
    private final SSD ssd;

    public ComputerFacade() {
        cpu = new CPU();
        ram = new RAM();
        ssd = new SSD();
    }

    public void startComputer() {
        cpu.freeze();
        ram.load(100, ssd.read(100, 10));
        cpu.jump(100);
        cpu.execute();
    }
}
