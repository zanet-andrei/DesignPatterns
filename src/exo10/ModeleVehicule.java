package exo10;

public abstract class ModeleVehicule {

    private String libelle;

    public ModeleVehicule() {
    }

    public String getLibelle() {
        return libelle;
    }

    abstract double cout();
}
