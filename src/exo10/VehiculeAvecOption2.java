package exo10;

public class VehiculeAvecOption2 extends Decorateur {

    public VehiculeAvecOption2(ModeleVehicule modeleDecore) {
        super(modeleDecore);
    }

    @Override
    String getDescription() {
        return getModeleDecore().getLibelle() + ", " + getLibelle();
    }

    @Override
    public double cout() {
        return getModeleDecore().cout() + 2;
    }
}
