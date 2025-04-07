package exo9;

import java.util.ArrayList;
import java.util.HashMap;

public class FabriqueLocalite {
    HashMap<ArrayList<String>, Localite> localites;

    public FabriqueLocalite() {
        localites = new HashMap<>();
    }

    public Localite getLocalite(ArrayList<String> proprietes) {
        Localite localite = localites.get(proprietes);
        if (localite == null) {
            localite = new Localite(proprietes.get(0), proprietes.get(1), proprietes.get(2), proprietes.get(3));
            localites.put(proprietes, localite);
        }
        return localite;
    }
}
