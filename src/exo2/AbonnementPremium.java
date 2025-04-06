package exo2;

import java.util.ArrayList;

public class AbonnementPremium implements TypeAbonnement{

    private ArrayList<Service> servicesPremium;

    public AbonnementPremium() {}

    public ArrayList<Service> obtenirServices() {
        return servicesPremium;
    }
}
