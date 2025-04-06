package exo3;

public class Fichier extends Composant {

    private String nomComposant;

    public Fichier(String nomComposant ) {
        nomComposant = nomComposant;
    }

    public String afficher() {
        return this.nomComposant;
    }
}
