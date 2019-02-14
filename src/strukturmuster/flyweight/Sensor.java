package strukturmuster.flyweight;

public abstract class Sensor {

    private double kalibrierFaktor;

    public Sensor(double kalibrierFaktor){
        this.kalibrierFaktor = kalibrierFaktor;
    }

    public void schreibe(double messwert){
        double kalibrierterWert = messwert * kalibrierFaktor;
        double umgerechneterWert = rechneUm(kalibrierterWert);
        schreibeInDatenbank(umgerechneterWert);
    }

    protected double rechneUm(double messwert){
        return messwert;
    }

    private void schreibeInDatenbank(double wert){
        //In Datenbank schreiben
    }
}
