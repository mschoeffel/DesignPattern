package behaviour_patterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class ExplicitAggregate<E> implements Aggregate<E> {

    private List<E> list;

    public ExplicitAggregate(){
        list = new ArrayList<>();
    }

    @Override
    public Iterator<E> createIterator() {
        return new ExplicitIterator<E>(list);
    }

    public void addList(E element) {
        if(!list.contains(element))
            list.add(element);
    }
}
