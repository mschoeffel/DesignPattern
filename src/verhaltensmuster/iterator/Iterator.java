package verhaltensmuster.iterator;

public interface Iterator<E> {

    void start();
    void weiter();
    boolean istFertig();
    E aktuellesElement();
}
