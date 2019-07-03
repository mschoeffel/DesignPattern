package structural_patterns.wrapper;

import java.util.Date;

public abstract class VertragAddon extends Vertrag {

    private Vertrag vertrag;

    public VertragAddon(Vertrag vertrag){
        this.vertrag = vertrag;
    }

    public Vertrag getVertrag(){
        return vertrag;
    }

    @Override
    public void freigeben(){
        vertrag.freigeben();
    }

    @Override
    public void kuendigen(Date kuendigenDatum){
        vertrag.kuendigen(kuendigenDatum);
    }
}
