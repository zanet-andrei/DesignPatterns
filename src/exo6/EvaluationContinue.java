package exo6;

import java.util.ArrayList;

public class EvaluationContinue implements Aggregate {

    private String prenomNomEleve;
    private String intituleMatiere;

    //private Integer[] notesControle;

    private ArrayList<Integer> notesControle;

    public EvaluationContinue(String prenomNomEleve,
                              String intituleMatiere) {
        this.prenomNomEleve = prenomNomEleve;
        this.intituleMatiere = intituleMatiere;
        //this.notesControle = new Integer[10];
        this.notesControle = new ArrayList<>();
    }

    public void ajouterControle(Integer note) {}

    public Iterator iterator() {
        return new EvaluationsIterator(notesControle);
    }
}
