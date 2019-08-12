package main.java.Impl;

import java.util.ArrayList;

import main.java.classes.CategorieEnum;
import main.java.services.DossierService;
import main.java.classes.Dossier;

public class DossierServiceImpl implements DossierService {

    @Override
    public Dossier recupererNomPrenom(Dossier dossier) {
        System.out.println(dossier.getNom()+dossier.getPrenom());
        return null;
    }

    @Override
    public Dossier recupererCategorie(Dossier dossier) {
        String[] arrayList;

        arrayList = dossier.getCategorieDossier();
        for (String categorie : arrayList )
        {
            System.out.println(CategorieEnum.valueOf(categorie).getCleMessage());
        }

        return null;
    }

}
