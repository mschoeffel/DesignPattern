package verhaltensmuster.kommando;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Spielfeld {

    private Queue<Spielzug> spielzuege;
    private Stack<Spielzug> undos;

    public Spielfeld(){
        spielzuege = new LinkedList<>();
        undos = new Stack<>();
    }

    public void QueueSpielzug(Spielzug spielzug){
        spielzuege.add(spielzug);
    }

    public void spiele(){
        while(!spielzuege.isEmpty()){
            Spielzug spielzug = spielzuege.poll();
            spielzug.ausfuehren();
            undos.push(spielzug);
        }
    }

    public void undo(){
        if(!undos.isEmpty()){
            Spielzug spielzug = undos.pop();
            spielzug.undo();
        }
    }

}
