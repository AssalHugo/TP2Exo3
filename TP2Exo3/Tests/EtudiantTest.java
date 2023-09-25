import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EtudiantTest {

    @Test
    public void testAjouter_Etudiant_MatiereNonExistante_1() {
        Matiere math = new Matiere("Maths");
        List<Double> res = new ArrayList<>();
        res.add(12.5);
        HashMap<Matiere, List<Double>> finito = new HashMap<>();
        finito.put(math, res);

        Identite id = new Identite("Grandjean", "Matheo", "grandj161u");
        Formation formation = new Formation("grandj161u");
        formation.ajoutMatiere(math, 0.5);
        Etudiant etu = new Etudiant(id, formation);

        etu.ajouter(math, 12.5);


        assertEquals(finito, etu.getResultats(), "Les deux hasmap ne sont pas les memes");

    }

    @Test
    public void testAjouter_Etudiant_MatiereExistante_2(){
        Matiere math = new Matiere("Maths");
        List<Double> res = new ArrayList<>();
        res.add(12.5);
        res.add(14.5);
        HashMap<Matiere, List<Double>> finito = new HashMap<>();
        finito.put(math, res);

        Identite id = new Identite("Grandjean", "Matheo", "grandj161u");
        Formation formation = new Formation("grandj161u");
        formation.ajoutMatiere(math, 0.5);
        Etudiant etu = new Etudiant(id, formation);

        etu.ajouter(math, 12.5);
        etu.ajouter(math,14.5);

        assertEquals(finito, etu.getResultats(), "Les deux hasmap ne sont pas les memes");
    }

    @Test
    public void testAjouter_Etudiant_MatierePasFormation_3(){
        Matiere math = new Matiere("Maths");
        Identite id = new Identite("Grandjean", "Matheo", "grandj161u");
        Formation formation = new Formation("grandj161u");
        Etudiant etu = new Etudiant(id, formation);

        assertEquals(false, etu.ajouter(math, 12.5), "La Matiere est dans la formation");
    }

    @Test
    public void testAjouter_Etudiant_NoteInf0_4(){
        Matiere math = new Matiere("Maths");
        Identite id = new Identite("Grandjean", "Matheo", "grandj161u");
        Formation formation = new Formation("grandj161u");
        formation.ajoutMatiere(math, 0.5);
        Etudiant etu = new Etudiant(id, formation);

        assertEquals(false, etu.ajouter(math, -1), "La note -1 ne doit pas etre accepté");
    }

    @Test
    public void testAjouter_Etudiant_NoteSup20(){
        Matiere math = new Matiere("Maths");
        Identite id = new Identite("Grandjean", "Matheo", "grandj161u");
        Formation formation = new Formation("grandj161u");
        formation.ajoutMatiere(math, 0.5);
        Etudiant etu = new Etudiant(id, formation);

        assertEquals(false, etu.ajouter(math, 22), "La note 22 ne doit pas etre accepté");
    }

    @Test
    public void testAjouter_Etudiant_Moyenne1Matiere(){
        Matiere math = new Matiere("Maths");
        Identite id = new Identite("Grandjean", "Matheo", "grandj161u");
        Formation formation = new Formation("grandj161u");
        formation.ajoutMatiere(math, 0.5);
        Etudiant etu = new Etudiant(id, formation);

        etu.ajouter(math,20);
        etu.ajouter(math,0);

        assertEquals(10.0, etu.moyenne(math), "la moyenne doit etre 10" );
    }


}
