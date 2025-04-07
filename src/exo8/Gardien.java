package exo8;

import java.util.ArrayList;

public class Gardien {

    private ArrayList<Memento> memoire;

    public Gardien() {
        this.memoire = new ArrayList<>();
    }

    public void ajouterMemento(Memento memento) {
        this.memoire.add(memento);
    }

    public Memento getMemento(int index) {
        return this.memoire.get(index);
    }
}
