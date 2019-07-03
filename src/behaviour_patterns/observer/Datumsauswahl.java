package behaviour_patterns.observer;

import java.time.LocalDate;

public class Datumsauswahl extends Subjekt {

    private LocalDate date;

    public Datumsauswahl(){
        super();
    }

    public void setDate(LocalDate date){
        this.date = date;
        System.out.println("Datum wurde geändert");
        benachrichtige();
    }

    public LocalDate getDate(){
        return date;
    }
}
