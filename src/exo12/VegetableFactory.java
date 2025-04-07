package exo12;

public class VegetableFactory {

    public VegetableFactory() {}

    public Vegetable createVegetable(char vegetableType) {
        Vegetable vegetable;
        switch (vegetableType) {
            case 'A': vegetable = new Cabbage();
            case 'B': vegetable = new Carrot();
            case 'C': vegetable = new Leek();
            default: vegetable = new Potato();
        }
        return vegetable;
    }
}
