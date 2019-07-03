package behaviour_patterns.command;

public class Chess {

    Field field;

    public Chess() {
        field = new Field();
    }

    public void pieceMove(Piece piece, Position neuePosition) {
        Move move = new Move(piece, neuePosition);
        field.queueTurns(move);
        field.play();
    }

    public void undo() {
        field.undo();
    }
}
