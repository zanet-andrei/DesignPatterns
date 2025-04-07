package exo8;

import java.util.ArrayList;

public class Job {
    private ArrayList<String> tachesDejaEffectuees;

    public Job() {
        tachesDejaEffectuees = new ArrayList<>();
    }

    public void ajouterTache(String tache) {
        tachesDejaEffectuees.add(tache);
    }

    public Memento sauverEtatMemento() {
        return new Memento(tachesDejaEffectuees);
    }

    public void chargerEtatMemento(Memento memento) {
        tachesDejaEffectuees = memento.getEtat();
    }
}
