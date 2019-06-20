package verhaltensmuster.iterator;

public class MP3 {

    public String titel;
    public String artist;
    public String album;

    public MP3(String titel, String artist, String album) {
        this.titel = titel;
        this.artist = artist;
        this.album = album;
    }

    public String toString(){
        return titel + " : " + artist + " - " + album;
    }

}
