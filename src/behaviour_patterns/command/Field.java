package behaviour_patterns.command;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Field {

    private Queue<Turn> turns;
    private Stack<Turn> undos;

    public Field() {
        turns = new LinkedList<>();
        undos = new Stack<>();
    }

    public void queueTurns(Turn turn) {
        turns.add(turn);
    }

    public void play() {
        while (!turns.isEmpty()) {
            Turn turn = turns.poll();
            turn.action();
            undos.push(turn);
        }
    }

    public void undo() {
        if (!undos.isEmpty()) {
            Turn turn = undos.pop();
            turn.undo();
        }
    }

}
