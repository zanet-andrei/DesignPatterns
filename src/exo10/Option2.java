package exo10;

public class Option2 extends Decorateur {

    public Option2(ModeleVehicule modeleDecore) {
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
