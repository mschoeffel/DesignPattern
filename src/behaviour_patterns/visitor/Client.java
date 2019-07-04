package behaviour_patterns.visitor;

public class Client {

    public static void main(String[] args) {

        Chart chart = new Chart();
        chart.add(new Book(2, 5, "Super Book"));
        chart.add(new Book(1, 15, "Story"));
        chart.add(new Book(5, 2, "Time"));

        System.out.println("Price: " + chart.calculatePrice());
        System.out.println("HTML: " + chart.showHtml());

    }

}
