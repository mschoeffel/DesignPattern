package behaviour_patterns.observer;

import java.time.LocalDate;

public class DatePick extends Subject {

    private LocalDate date;

    public DatePick() {
        super();
    }

    public void setDate(LocalDate date) {
        this.date = date;
        System.out.println("Date was changed");
        notice();
    }

    public LocalDate getDate() {
        return date;
    }
}
