package behaviour_patterns.iterator;

public class Client {

    public static void main(String[] args) {
        MusicLibrary<MP3> bibliothek = new MusicLibrary<>();

        bibliothek.getTitle().add(new MP3("John", "Doe", "SingIt"));
        bibliothek.getTitle().add(new MP3("Marry", "Doe", "SingYou"));
        bibliothek.getTitle().add(new MP3("Pony", "John", "You"));
        bibliothek.getTitle().add(new MP3("True", "Hey", "Maybe"));
        bibliothek.getTitle().add(new MP3("False", "Hey", "Maybe"));

        Iterator<MP3> iterator = bibliothek.createIterator();
        while (!iterator.isFinished()) {
            iterator.onwards();
            bibliothek.play(iterator.currentElement());
        }

    }

}
