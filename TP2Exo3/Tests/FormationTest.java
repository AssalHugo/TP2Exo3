import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FormationTest {

    @Test
    public void testAjoutMatiere() {
        //Chargement des données
        Formation formation = new Formation("identifiant");
        Matiere m = new Matiere("nom");

        //Appel de la méthode à tester
        formation.ajoutMatiere(m, 1.0);

        //Vérification des résultats
        assertEquals(formation.getCoeff(m), 1.0, "Le coefficient de la matière devrait être 0.0");
    }

    @Test
    public void testAjoutMatiereDeja() {
        //Chargement des données
        Formation formation = new Formation("identifiant");
        Matiere m = new Matiere("nom");
        Matiere m1 = new Matiere("nom");

        //Appel de la méthode à tester
        formation.ajoutMatiere(m, 1.0);
        formation.ajoutMatiere(m1, 2.0);


        //Vérification des résultats
        assertEquals(formation.getCoeff(m), 1.0, "Le coefficient de la matière devrait être 0.0");
    }

    @Test
    public void testSupMatiere() {
        //Chargement des données
        Formation formation = new Formation("identifiant");
        Matiere m = new Matiere("nom");

        //Appel de la méthode à tester
        formation.ajoutMatiere(m, 1.0);
        formation.supMatiere(m);

        //Vérification des résultats
        assertEquals(formation.getCoeff(m), -1.0, "La matiere ne doit plus exister");
    }
}
