package exo8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Job job = new Job();
        job.ajouterTache("Premiere tache");
        job.ajouterTache("Deuxieme tache");
        job.ajouterTache("Troisieme tache");

        Gardien gardien = new Gardien();

        gardien.ajouterMemento(job.sauverEtatMemento());

        ArrayList<String> memoire = gardien.getMemento(0).getEtat();

        for (String string : memoire) {
            System.out.println(string);
        }
    }
}
