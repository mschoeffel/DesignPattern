package behaviour_patterns.observer;

import java.util.ArrayList;

public abstract class Subjekt {

    private ArrayList<Beobachter> beobachter;

    public Subjekt(){
        beobachter = new ArrayList<>();
    }

    public void meldeAn(Beobachter beobachter){
        if(!this.beobachter.contains(beobachter))
            this.beobachter.add(beobachter);
    }

    public void meldeAb(Beobachter beobachter){
        this.beobachter.remove(beobachter);
    }

    public void benachrichtige(){
        if(beobachter != null && !beobachter.isEmpty())
            beobachter.forEach(Beobachter::aktualisiere);
    }
}
