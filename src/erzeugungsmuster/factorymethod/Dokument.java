package erzeugungsmuster.factorymethod;

public abstract class Dokument {
    private int belegnummer;

    public int getBelegnummer(){
        return belegnummer;
    }

    public void setBelegnummer(int belegnummer) {
        if(belegnummer > 0) {
            this.belegnummer = belegnummer;
        }
    }

    public boolean isValid(){
        return belegnummer > 0;
    }
}
