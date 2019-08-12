package main.java.classes;

public enum StatutTacheEnum {
    NON_COMMENCE(1,"Non commencé"),
    ANALYSE_EN_COURS(2,"Analyse en cours"),
    ESTIMATION_EN_COURS(3,"Estimation en cours"),
    EN_COURS(4,"En cours"),
    INTERRUPTION_PB_TECHNIQUE(5,"Interruption problème technique"),
    INTERRUPTION_PB_AUTRES(6,"Interruption problème autre"),
    EN_ATTENTE_VALIDATION(7,"En attente validation"),
    VALIDE(8,"Validé"),
    FIN(9,"Fin");

    public final int idStatut;
    public final String libelleStatut;


    StatutTacheEnum(final int idStatut, final String libelleStatut){
        this.idStatut = idStatut;
        this.libelleStatut = libelleStatut;
    }

    public int getIdStatut() {
        return idStatut;
    }

    public String getLibelleStatut() {
        return libelleStatut;
    }
}
