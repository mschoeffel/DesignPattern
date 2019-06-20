package verhaltensmuster.iterator;

import java.util.ArrayList;
import java.util.Collections;

public class ZufallsIterator<E> implements Iterator{

    private int aktuellePosition;
    private ArrayList<E> list;
    private ArrayList<E> zufallReihenfolge;

    public ZufallsIterator(ArrayList<E> list){
        this.list = list;
        start();
    }

    @Override
    public void start() {
        zufallReihenfolge = new ArrayList<>(list);
        Collections.shuffle(zufallReihenfolge);
        aktuellePosition = -1;
    }

    @Override
    public void weiter() {
        if(!istFertig())
            aktuellePosition++;
    }

    @Override
    public boolean istFertig() {
        return aktuellePosition >= (zufallReihenfolge.size() -1);
    }

    @Override
    public Object aktuellesElement() {
        if(aktuellePosition == -1){
            return null;
        }
        return zufallReihenfolge.get(aktuellePosition);
    }
}
