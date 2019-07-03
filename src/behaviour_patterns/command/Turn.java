package behaviour_patterns.command;

public abstract class Turn {

    private Piece piece;

    public Turn(Piece piece) {
        this.piece = piece;
    }

    public Piece getPiece() {
        return piece;
    }

    public abstract void action();

    public abstract void undo();
}
