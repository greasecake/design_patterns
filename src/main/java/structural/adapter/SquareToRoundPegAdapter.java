package structural.adapter;

public class SquareToRoundPegAdapter extends RoundPeg {
    private final SquarePeg peg;

    public SquareToRoundPegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public int getRadius() {
        return (int) (peg.getWidth()*Math.sqrt(2)/2);
    }
}
