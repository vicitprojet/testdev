package main.java.classes;

import java.util.Date;

public class Tache {
    String libelle;
    Integer id;
    String commentaire;
    Date dateCreation;
    Date dateFinEstime;
    Date dateFinReelle;
    Integer priorite;
    String Statut;

    public Tache(){

    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(final String libelle) {
        this.libelle = libelle;
    }

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(final String commentaire) {
        this.commentaire = commentaire;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(final Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDateFinEstime() {
        return dateFinEstime;
    }

    public void setDateFinEstime(final Date dateFinEstime) {
        this.dateFinEstime = dateFinEstime;
    }

    public Date getDateFinReelle() {
        return dateFinReelle;
    }

    public void setDateFinReelle(final Date dateFinReelle) {
        this.dateFinReelle = dateFinReelle;
    }

    public Integer getPriorite() {
        return priorite;
    }

    public void setPriorite(final Integer priorite) {
        this.priorite = priorite;
    }

    public String getStatut() {
        return Statut;
    }

    public void setStatut(final String statut) {
        Statut = statut;
    }

}
