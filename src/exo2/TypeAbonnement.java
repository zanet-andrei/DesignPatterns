package exo2;

import java.util.ArrayList;
import java.util.Collection;

public abstract class TypeAbonnement {
    private Collection<Service> services;

    public TypeAbonnement() {
        services = new ArrayList<Service>();
        // Garnir avec les services partagés entre tous les abonnements
    }

    abstract Service obtenirService(int index);
    abstract void supprimerService(Service service);
    abstract void ajouterService(Service service);
}
