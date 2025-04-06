package exo2;

import java.util.ArrayList;

public class AbonnementStandard implements TypeAbonnement{

    private ArrayList<Service> servicesStandards;

    public AbonnementStandard() {}

    public ArrayList<Service> obtenirServices() {
        return servicesStandards;
    }
}
