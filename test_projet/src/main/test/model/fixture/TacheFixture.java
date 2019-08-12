package main.test.model.fixture;

import main.java.classes.Tache;

public class TacheFixture {
    public Tache[] getDefault(){
        Tache tache1 = new Tache();
        Tache tache2 = new Tache();
        Tache tache3 = new Tache();
        Tache tache4 = new Tache();
        tache1.setLibelle("lib1");
        tache2.setLibelle("lib2");
        tache3.setLibelle("lib3");
        tache4.setLibelle("lib4");
        tache1.setCommentaire("commentaire1");
        tache2.setCommentaire("commentaire2");
        tache3.setCommentaire("commentaire3");
        tache4.setCommentaire("commentaire4");
        Tache[] taches = {tache1,tache2,tache3,tache4};
        return taches;
    }
}
