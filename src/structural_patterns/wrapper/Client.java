package structural_patterns.wrapper;

public class Client {

    public static void main(String[] args){
        KaufVertrag kaufVertrag = new KaufVertrag();
        kaufVertrag.freigeben();

        AddonArchivierung kaufVertragMitArchivierung = new AddonArchivierung(kaufVertrag);
        kaufVertragMitArchivierung.freigeben();
        kaufVertragMitArchivierung.archivieren();

        AddonVerschlüsselung kaufVertragMitBeidem = new AddonVerschlüsselung(kaufVertragMitArchivierung);
        kaufVertragMitBeidem.verschluesseln();
        kaufVertragMitBeidem.freigeben();
        ((AddonArchivierung)kaufVertragMitBeidem.getVertrag()).archivieren();
    }
}
