package structural_patterns.wrapper;

public class Client {

    public static void main(String[] args){
        BuyContract kaufVertrag = new BuyContract();
        kaufVertrag.release();

        AddonFiling kaufVertragMitArchivierung = new AddonFiling(kaufVertrag);
        kaufVertragMitArchivierung.release();
        kaufVertragMitArchivierung.archive();

        AddonEncryption kaufVertragMitBeidem = new AddonEncryption(kaufVertragMitArchivierung);
        kaufVertragMitBeidem.encrypt();
        kaufVertragMitBeidem.release();
        ((AddonFiling)kaufVertragMitBeidem.getContract()).archive();
    }
}
