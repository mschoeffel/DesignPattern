package erzeugungsmuster.abstractfactory;

public class ProbusJalousieAktor extends JalousieAktor {

    @Override
    public void auf(float wert){
        //Jalousie öffnen
        super.auf(wert);
    }

    @Override
    public void ab(float wert){
        //Jalousie schließen
        super.ab(wert);
    }
}
