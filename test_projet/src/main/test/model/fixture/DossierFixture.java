package main.test.model.fixture;

import java.util.ArrayList;

import main.java.classes.Dossier;
import main.java.classes.Tache;
import main.java.classes.User;

public class DossierFixture {
    public DossierFixture(){}
    public static Dossier getDefault(){
        UserFixture userFixture= new UserFixture();
        TacheFixture tacheFixture = new TacheFixture();

        User user = new User();
        user = userFixture.getDefault();

        String[] arrayCategories = {"FAMILLE", "TRAVAIL", "EXEPTIONNEL"};
        Tache[] arrayTaches = tacheFixture.getDefault();

        Dossier dossier =  new Dossier(user,arrayCategories,arrayTaches);
        return dossier;
    }

}
