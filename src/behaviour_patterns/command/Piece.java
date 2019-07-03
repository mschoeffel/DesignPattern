package behaviour_patterns.command;

public abstract class Piece {
    private boolean isComputer;
    private Position position;

    public Piece(boolean isComputer, Position startPosition) {
        this.isComputer = isComputer;
        this.position = startPosition;
    }

    public void move(Position newPosition) {
        validateMove(newPosition);
        position = newPosition;
    }

    protected void validateMove(Position movePosition) {
        if (movePosition.x < 1 || movePosition.x > 8) {
            throw new RuntimeException("X-Position needs to be between 1 and 8");
        }
        if (movePosition.y < 1 || movePosition.y > 8) {
            throw new RuntimeException("Y-Position needs to be between 1 and 8");
        }
    }


    public boolean isComputer() {
        return isComputer;
    }

    public void setComputer(boolean computer) {
        isComputer = computer;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
