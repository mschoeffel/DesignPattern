package creational_patterns.prototype;

public class Client {

    public static void main(String[] args) {
        Roster roster = new Roster();

        Holiday halfDayHoliday = roster.cloneHolidayObject("half_day");
    }
}
