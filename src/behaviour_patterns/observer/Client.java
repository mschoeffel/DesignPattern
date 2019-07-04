package behaviour_patterns.observer;

import java.time.LocalDate;

public class Client {

    public static void main(String[] args) {

        DatePick datePick = new DatePick();
        datePick.setDate(LocalDate.now());
        Calendar calendar = new Calendar(datePick);
        datePick.register(calendar);
        datePick.setDate(LocalDate.MIN);
    }

}
