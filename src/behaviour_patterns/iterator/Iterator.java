package behaviour_patterns.iterator;

public interface Iterator<E> {

    void start();

    void onwards();

    boolean isFinished();

    E currentElement();
}
