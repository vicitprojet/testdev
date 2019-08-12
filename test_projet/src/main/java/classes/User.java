package main.java.classes;

public class User{
    int age;

    char sexe;

    float taille;

    String nom;

    String prenom;

    public User(){ }

    public char getSexe() {
        return sexe;
    }

    public int getAge() {
        return age;
    }

    public float getTaille() {
        return taille;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public void setSexe(final char sexe) {
        this.sexe = sexe;
    }

    public void setTaille(final float taille) {
        this.taille = taille;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(final String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(final String prenom) {
        this.prenom = prenom;
    }

}