package behaviour_patterns.iterator;

public interface Aggregate<E> {

    Iterator<E> createIterator();
}
