package verhaltensmuster.beobachter;

import java.time.LocalDate;

public class Client {

    public static void main(String[] args){

        Datumsauswahl datumsauswahl = new Datumsauswahl();
        datumsauswahl.setDate(LocalDate.now());
        Kalender kalender = new Kalender(datumsauswahl);
        datumsauswahl.meldeAn(kalender);
        datumsauswahl.setDate(LocalDate.MIN);
    }

}
