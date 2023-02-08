package structural.facade;

class CPU {
    public void freeze() {
        System.out.println("CPU is frozen");
    }
    public void jump(long position) {
        System.out.println("Jumped to position: " + position);
    }
    public void execute() {
        System.out.println("CPU is executing");
    }
}
