package exo2;

import java.util.ArrayList;

public abstract class Client {

    TypeAbonnement typeAbonnement;

    public ArrayList<Service> obtenirServices() {
        return typeAbonnement.obtenirServices();
    }

}
