package exo10;

public class VehiculeAvecOption3 extends Decorateur {

    public VehiculeAvecOption3(ModeleVehicule modeleDecore) {
        super(modeleDecore);
    }

    @Override
    String getDescription() {
        return getModeleDecore().getLibelle() + ", " + getLibelle();
    }

    @Override
    public double cout() {
        return getModeleDecore().cout() + 3;
    }
}
