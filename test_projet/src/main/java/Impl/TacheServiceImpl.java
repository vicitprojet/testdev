package main.java.Impl;

import main.java.classes.Tache;
import main.java.services.TacheService;

public class TacheServiceImpl implements TacheService {

    @Override
    public void recupererAllCarac(final Tache[] taches) {
        for (Tache  t : taches){
            System.out.println("------------------"+"\n");
            System.out.println(t.getLibelle()+"\n");
            System.out.println(t.getCommentaire()+"\n");
            //System.out.println(t.getStatut()+"\n");
            System.out.println("------------------");
        }
    }
}
