package exo7;

public abstract class Objet3D {

    abstract public void affichage();

    public void manipulation() {
        initialisation();
        affichage();
        finishing();
    }

    public void initialisation() {};
    public void finishing() {};
}
