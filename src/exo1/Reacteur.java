package exo1;

public class Reacteur {

    private int numero;
    private double pourcentagePuissance;
    private double debitEauDansCoeur;

    public Reacteur() {}

    public void couper() {}

    public double getDebitEauDansCoeur() {
        return debitEauDansCoeur;
    }

    public void setPourcentagePuissance(double pourcentagePuissance) {
        this.pourcentagePuissance = pourcentagePuissance;
    }

    public void setDebitEauDansCoeur(double debitEauDansCoeur) {
        this.debitEauDansCoeur = debitEauDansCoeur;
    }
}
