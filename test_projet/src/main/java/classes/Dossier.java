package main.java.classes;


import java.util.ArrayList;

public class Dossier {
    int age;
    char sexe;
    float taille;
    String nom;
    String prenom;
    String[] categorieDossier;
    String[] statutTache;
    Tache[] taches;

    public Dossier(User user, String[] rangsCategorie, Tache[] taches){
        this.nom = user.getNom();
        this.prenom = user.getPrenom();
        this.categorieDossier = rangsCategorie;
        this.taches = taches;

    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public String[] getCategorieDossier() {
        return categorieDossier;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public char getSexe() {
        return sexe;
    }

    public void setSexe(final char sexe) {
        this.sexe = sexe;
    }

    public float getTaille() {
        return taille;
    }

    public void setTaille(final float taille) {
        this.taille = taille;
    }

    public void setNom(final String nom) {
        this.nom = nom;
    }

    public void setPrenom(final String prenom) {
        this.prenom = prenom;
    }

    public void setCategorieDossier(final String[] categorieDossier) {
        this.categorieDossier = categorieDossier;
    }

    public String[] getStatutTache() {
        return statutTache;
    }

    public void setStatutTache(final String[] statutTache) {
        this.statutTache = statutTache;
    }

}
