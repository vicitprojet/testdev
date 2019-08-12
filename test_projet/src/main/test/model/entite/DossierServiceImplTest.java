package main.test.model.entite;

import org.junit.jupiter.api.Test;

import main.java.Impl.DossierServiceImpl;
import main.java.classes.Dossier;
import main.java.classes.User;
import main.test.model.fixture.DossierFixture;
import main.test.model.fixture.UserFixture;

public class DossierServiceImplTest {
    private DossierServiceImpl dossierServiceImpl;
    private UserFixture userFixture;
    @Test
    public void recupererNomPrenomTest(){
        DossierServiceImpl dossierServiceImpl = new DossierServiceImpl();
        Dossier dossierTest;
        dossierTest = DossierFixture.getDefault();
        dossierServiceImpl.recupererNomPrenom(dossierTest);
    }

    @Test
    public void recupererCategories(){
        DossierServiceImpl dossierServiceImpl = new DossierServiceImpl();
        Dossier dossierTest;
        dossierTest = DossierFixture.getDefault();
        dossierServiceImpl.recupererCategorie(dossierTest);
    }

    @Test
    public void afficherTaches(){

    }

}
