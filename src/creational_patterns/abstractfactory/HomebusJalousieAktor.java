package creational_patterns.abstractfactory;

public class HomebusJalousieAktor extends JalousieAktor {

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
