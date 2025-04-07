package exo8;

import java.util.ArrayList;

public class Memento {
    private ArrayList<String> etat;

    public Memento(ArrayList<String> etat) {
        this.etat = etat;
    }

    public ArrayList<String> getEtat() {
        return etat;
    }

}
