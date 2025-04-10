package exo2;

import java.util.Collection;

public abstract class Abonnement {
    Collection<Service> services;

    abstract void ajouterService(Service service);
    abstract void supprimerService(Service service);
    abstract void getService(int position);
}
