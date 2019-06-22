package verhaltensmuster.besucher;

import verhaltensmuster.besucher.Besucher;
import verhaltensmuster.besucher.Buch;

public class BerechnePreisBesucher extends Besucher {

    private float preis;

    public BerechnePreisBesucher(){
        preis = 0;
    }

    public float getPreis() {
        return preis;
    }

    @Override
    public void besucheBuch(Buch buch) {
            preis += buch.getPreis() * buch.getAnzahl();
    }
}
