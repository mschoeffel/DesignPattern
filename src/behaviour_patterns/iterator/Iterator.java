package behaviour_patterns.iterator;

public interface Iterator<E> {
    void start();
    void next();
    boolean isFinished();
    E currentElement();
}
