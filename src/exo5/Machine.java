package exo5;

public class Machine {

    private Etat normal, eco, rapide;
    private Etat etatActuel;

    public Machine() {
        this.normal = new EtatNormal();
        this.eco = new EtatEco();
        this.rapide = new EtatRapide();
        this.etatActuel = this.normal;
    }

    public void reinitialiser() {
        etatActuel.reinitialiser();
    }

    public void demarrer() {
        etatActuel.demarrer();
    }

    public void mettreEnPause() {
        etatActuel.mettreEnPause();
    }

    public void arreter() {
        etatActuel.arreter();
    }
}
