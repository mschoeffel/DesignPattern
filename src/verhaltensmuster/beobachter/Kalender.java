package verhaltensmuster.beobachter;

import java.time.LocalDate;
import java.util.HashMap;

public class Kalender implements Beobachter {

    private Datumsauswahl datumsauswahl;
    private HashMap<LocalDate, String> termine;

    public Kalender(Datumsauswahl datumsauswahl) {
        this.datumsauswahl = datumsauswahl;
        termine = new HashMap<>();
    }

    @Override
    public void aktualisiere() {
        LocalDate aktuellesDatum = datumsauswahl.getDate();
        System.out.println("Kalender wurde aktualisiert");
        //Daten neu anzeigen
    }
}
