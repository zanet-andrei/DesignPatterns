### Corrigez le code de la classe ci-dessous sachant que *King* résulte de l'application du Design Pattern Singleton.

```Java
public class King {
    King uniqueInstance;
    
    public King(){
        // code du constructeur
    }
    
    public uniqueInstance getOccurrence() {
        if (uniqueInstance == null) uniqueInstance = new King();
        return uniqueInstance;
    }
}
```