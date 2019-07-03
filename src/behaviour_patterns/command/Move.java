package behaviour_patterns.command;

public class Move extends Turn {

    private Position newPosition;
    private Position oldPosition;

    public Move(Piece piece, Position newPosition) {
        super(piece);
        this.newPosition = newPosition;
    }

    @Override
    public void action() {
        this.oldPosition = getPiece().getPosition();
        getPiece().move(newPosition);
        System.out.println("Piece moved");
    }

    @Override
    public void undo() {
        getPiece().move(oldPosition);
        System.out.println("Piece moved back");
    }
}
