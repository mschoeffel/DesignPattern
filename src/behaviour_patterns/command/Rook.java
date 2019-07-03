package behaviour_patterns.command;

public class Rook extends Piece {

    public Rook(boolean isComputer, Position startPosition) {
        super(isComputer, startPosition);
    }

    @Override
    protected void validateMove(Position movePosition) {
        if (movePosition.x != getPosition().x && movePosition.y != getPosition().y) {
            throw new RuntimeException("Rook isn't allowed to move diagonal");
        }
    }
}
