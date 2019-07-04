package behaviour_patterns.observer;

import java.time.LocalDate;
import java.util.HashMap;

public class Calendar implements Observer {

    private DatePick datePick;
    private HashMap<LocalDate, String> appointments;

    public Calendar(DatePick datePick) {
        this.datePick = datePick;
        appointments = new HashMap<>();
    }

    @Override
    public void refresh() {
        LocalDate actualDate = datePick.getDate();
        System.out.println("Calendar was updated");
        //Refresh view
    }
}
