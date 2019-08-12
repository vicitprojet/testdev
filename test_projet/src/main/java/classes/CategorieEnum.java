package main.java.classes;

public enum CategorieEnum {
    FAMILLE(1,"Famille"),
    TRAVAIL(2,"Travail"),
    VACANCES(3,"Vacances"),
    EXEPTIONNEL(4,"Exptionnel");

    public final Integer rang;
    public final String message;

    CategorieEnum(final int rang, final String message) {
        this.rang = rang;
        this.message = message;
    }

    public Integer getRang() {
        return this.rang;
    }

    public String getCleMessage() {
        return this.message;
    }

}
