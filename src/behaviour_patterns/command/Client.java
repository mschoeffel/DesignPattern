package behaviour_patterns.command;

public class Client {

    public static void main(String[] args) {
        Chess chess = new Chess();
        Rook t = new Rook(false, new Position((short) 1, (short) 2));
        chess.pieceMove(t, new Position((short) 5, (short) 2));
        chess.undo();
    }
}
