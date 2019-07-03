package behaviour_patterns.visitor;

import java.util.ArrayList;

public class Warenkorb {

    private ArrayList<Element> produkte;

    public Warenkorb(){
        produkte = new ArrayList<>();
    }

    public float berechneGesamtpreis(){
        BerechnePreisBesucher preisBesucher = new BerechnePreisBesucher();

        for(Element element : produkte){
            element.nimmEntgegen(preisBesucher);
        }
        return preisBesucher.getPreis();
    }

    public String zeigeHtml(){
        HtmlBesucher htmlBesucher = new HtmlBesucher();

        for(Element element : produkte){
            element.nimmEntgegen(htmlBesucher);
        }

        return htmlBesucher.getHtml();
    }

    public void add(Element element){
        if(!produkte.contains(element))
            produkte.add(element);
    }

    public ArrayList<Element> getProdukte() {
        return produkte;
    }
}
