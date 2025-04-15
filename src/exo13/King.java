package exo13;

public class King {
    private static King uniqueInstance;

    private King(){
        // code du constructeur
    }

    public static King getOccurrence() {
        if (uniqueInstance == null) uniqueInstance = new King();
        return uniqueInstance;
    }
}