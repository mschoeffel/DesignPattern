package verhaltensmuster.besucher;

public class Client {

    public static void main(String[] args){

        Warenkorb warenkorb = new Warenkorb();
        warenkorb.add(new Buch(2, 5, "Super Buch"));
        warenkorb.add(new Buch(1, 15, "Story"));
        warenkorb.add(new Buch(5, 2, "Time"));

        System.out.println("Preis: " + warenkorb.berechneGesamtpreis());
        System.out.println("HTML: " + warenkorb.zeigeHtml());

    }

}
