package exo10;

public class Option1 extends Decorateur {

    public Option1(ModeleVehicule modeleDecore) {
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
