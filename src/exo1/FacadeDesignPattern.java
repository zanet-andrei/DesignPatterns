package exo1;



import java.util.ArrayList;

public class FacadeDesignPattern {

    private HautFourneau hautFourneau;
    private ArrayList<Reacteur> reacteurs;

    public FacadeDesignPattern() {}

    public void securisationSite() {
        for (int i = 0; i < 3; i++) {
            reacteurs.get(i).couper();
        }
        DistributionGaz.fermer();
        reacteurs.get(1).setPourcentagePuissance(0.1);
        reacteurs.get(1).setDebitEauDansCoeur(reacteurs.get(1).getDebitEauDansCoeur() + 0.5);
        hautFourneau.setTemperature(200);
        Securite.declencherAlarme();
        Securite.afficherMessageSurEcrans("Evacuation immediate");
        Securite.composerNumeroTelephone("112");
        Securite.lancerGenerateurElectrique();
        Securite.lancerProcedureRecuperation();
    }

}
