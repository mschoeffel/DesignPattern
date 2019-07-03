package behaviour_patterns.iterator;

import java.util.ArrayList;
import java.util.Collections;

public class RandomIterator<E> implements Iterator {

    private int currentPosition;
    private ArrayList<E> list;
    private ArrayList<E> randomOrder;

    public RandomIterator(ArrayList<E> list) {
        this.list = list;
        start();
    }

    @Override
    public void start() {
        randomOrder = new ArrayList<>(list);
        Collections.shuffle(randomOrder);
        currentPosition = -1;
    }

    @Override
    public void onwards() {
        if (!isFinished())
            currentPosition++;
    }

    @Override
    public boolean isFinished() {
        return currentPosition >= (randomOrder.size() - 1);
    }

    @Override
    public Object currentElement() {
        if (currentPosition == -1) {
            return null;
        }
        return randomOrder.get(currentPosition);
    }
}
