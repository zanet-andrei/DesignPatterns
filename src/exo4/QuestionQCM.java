package exo4;

public class QuestionQCM implements Prototype {

    private int numeroApparitionDansQCM;
    private String libelleQuestion;
    private String choixReponse1;
    private String choixReponse2;
    private String choixReponse3;
    private String choixReponse4;
    private int numeroChoixReponseCorrecte;
    private Double tempsLimitePourRepondre;
    private double pointsSiBonneReponse;
    private Double pointsNegatifsSiMauvaiseReponse;

    public QuestionQCM(int numeroApparitionDansQCM,
                       String libelleQuestion,
                       String choixReponse1,
                       String choixReponse2,
                       String choixReponse3,
                       String choixReponse4,
                       int numeroChoixReponseCorrecte,
                       Double tempsLimitePourRepondre,
                       double pointsSiBonneReponse,
                       Double pointsNegatifsSiMauvaiseReponse) {
        this.numeroApparitionDansQCM = numeroApparitionDansQCM;
        this.libelleQuestion = libelleQuestion;
        this.choixReponse1 = choixReponse1;
        this.choixReponse2 = choixReponse2;
        this.choixReponse3 = choixReponse3;
        this.choixReponse4 = choixReponse4;
        this.numeroChoixReponseCorrecte = numeroChoixReponseCorrecte;
        this.tempsLimitePourRepondre = tempsLimitePourRepondre;
        this.pointsSiBonneReponse = pointsSiBonneReponse;
        this.pointsNegatifsSiMauvaiseReponse = pointsNegatifsSiMauvaiseReponse;
    }

    public Prototype clone() {
        return new QuestionQCM(numeroApparitionDansQCM,
                libelleQuestion,
                choixReponse1,
                choixReponse2,
                choixReponse3,
                choixReponse4,
                numeroChoixReponseCorrecte,
                tempsLimitePourRepondre,
                pointsSiBonneReponse,
                pointsNegatifsSiMauvaiseReponse);
    }
}
