package verhaltensmuster.iterator;

public class Client {

    public static void main(String[] args){
        Musikbibliothek<MP3> bibliothek = new Musikbibliothek<>();

        bibliothek.getTitel().add(new MP3("John", "Doe", "SingIt"));
        bibliothek.getTitel().add(new MP3("Marry", "Doe", "SingYou"));
        bibliothek.getTitel().add(new MP3("Pony", "John", "You"));
        bibliothek.getTitel().add(new MP3("True", "Hey", "Maybe"));
        bibliothek.getTitel().add(new MP3("False", "Hey", "Maybe"));

        Iterator<MP3> iterator = bibliothek.erzeugeIterator();
        while(!iterator.istFertig()){
            iterator.weiter();
            bibliothek.play(iterator.aktuellesElement());
        }

    }

}
