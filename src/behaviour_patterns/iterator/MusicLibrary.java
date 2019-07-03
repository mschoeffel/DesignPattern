package behaviour_patterns.iterator;

import java.util.ArrayList;

public class MusicLibrary<E> {

    ArrayList<E> title;

    public MusicLibrary() {
        title = new ArrayList<>();
    }

    public ArrayList<E> getTitle() {
        return title;
    }

    public Iterator<E> createIterator() {
        RandomIterator<E> iterator = new RandomIterator(title);
        return iterator;
    }

    public void play(E title) {
        System.out.println("Play title: " + title.toString());
    }
}
