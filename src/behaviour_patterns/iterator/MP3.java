package behaviour_patterns.iterator;

public class MP3 {

    public String title;
    public String artist;
    public String album;

    public MP3(String title, String artist, String album) {
        this.title = title;
        this.artist = artist;
        this.album = album;
    }

    public String toString() {
        return title + " : " + artist + " - " + album;
    }

}
