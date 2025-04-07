package exo10;

public class VehiculeAvecOption1 extends Decorateur {

    public VehiculeAvecOption1(ModeleVehicule modeleDecore) {
        super(modeleDecore);
    }

    @Override
    String getDescription() {
        return getModeleDecore().getLibelle() + ", " + getLibelle();
    }

    @Override
    public double cout() {
        return getModeleDecore().cout() + 1;
    }
}
