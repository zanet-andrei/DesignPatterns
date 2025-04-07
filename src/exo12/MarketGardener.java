package exo12;

public class MarketGardener {

    private VegetableFactory vegetableFactory;

    public MarketGardener() {
        vegetableFactory = new VegetableFactory();
    }

    public void sow (char code) {
        Vegetable vegetable = vegetableFactory.createVegetable(code);
        // Reste du code..
        return;
    }

    public Vegetable harvest (char code) {
        Vegetable vegetable = vegetableFactory.createVegetable(code);
        // Reste du code..
        return vegetable;
    }
}
