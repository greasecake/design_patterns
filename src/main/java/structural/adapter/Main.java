package structural.adapter;

public class Main {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(10);

        RoundPeg roundPeg = new RoundPeg(10);
        assert roundHole.fits(roundPeg);

        SquarePeg smallSquarePeg = new SquarePeg(10);
        assert roundHole.fits(new SquareToRoundPegAdapter(smallSquarePeg));

        SquarePeg largeSquarePeg = new SquarePeg(15);
        assert !roundHole.fits(new SquareToRoundPegAdapter(largeSquarePeg));
    }
}
