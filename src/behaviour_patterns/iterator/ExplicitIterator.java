package behaviour_patterns.iterator;

import java.util.List;

public class ExplicitIterator<E> implements Iterator<E> {

    private int currentPosition;
    private List<E> list;

    public ExplicitIterator(List<E> list){
        this.list = list;
        start();
    }

    @Override
    public void start() {
        currentPosition = -1;
    }

    @Override
    public void next() {
        if(!isFinished())
            currentPosition++;
    }

    @Override
    public boolean isFinished() {
        return currentPosition >= (list.size()-1);
    }

    @Override
    public E currentElement() {
        if(currentPosition <= -1)
            return null;
        return list.get(currentPosition);
    }
}
