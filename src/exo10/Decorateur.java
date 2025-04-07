package exo10;

public abstract class Decorateur extends ModeleVehicule {
    private ModeleVehicule modeleDecore;

    public Decorateur(ModeleVehicule modeleDecore) {
        this.modeleDecore = modeleDecore;
    }

    public ModeleVehicule getModeleDecore() {
        return modeleDecore;
    }

    public double cout() {
        return getModeleDecore().cout();
    }

    abstract String getDescription();
}
