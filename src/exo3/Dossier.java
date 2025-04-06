package exo3;

import java.util.ArrayList;

public class Dossier {

    private String nomComposant;
    private ArrayList<Composant> composants;

    public Dossier(String nomComposant) {
        this.nomComposant = nomComposant;
    }

    public String afficher() {
        return nomComposant;
    }

    public void ajouter(Composant composant) {
        composants.add(composant);
    }

    public void supprimer(Composant composant) {
        composants.remove(composant);
    }

    public Composant accesEnfant(int index) {
        return composants.get(index);
    }
}
