package strukturmuster.dekorierer;

import java.util.Date;

public class KaufVertrag extends Vertrag {
    @Override
    public void freigeben() {
        setFreigegeben(istGueltigLogik());
    }

    @Override
    public void kuendigen(Date kuendigenDatum) {
        if(kuendigenDatum.after(getVertragsbeginn())){
            setVertragsende(kuendigenDatum);
        }
    }

    private boolean istGueltigLogik(){
        //Prüfen nach Kriterien
        return true;
    }
}
