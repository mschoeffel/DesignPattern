package verhaltensmuster.iterator;

import java.util.ArrayList;

public class Musikbibliothek<E> {

    ArrayList<E> titel;

    public Musikbibliothek() {
        titel = new ArrayList<>();
    }

    public ArrayList<E> getTitel() {
        return titel;
    }

    public Iterator<E> erzeugeIterator(){
        ZufallsIterator<E> iterator = new ZufallsIterator(titel);
        return iterator;
    }

    public void play(E titel){
        System.out.println("Spiele Titel: " + titel.toString());
    }
}
