import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Etudiant {

    private Identite identite;

    private Formation formation;

    private HashMap<Matiere, List<Double>> resultats;

    public Etudiant(Identite identite, Formation formation) {
        this.identite = identite;
        this.formation = formation;
        this.resultats = new HashMap<Matiere, List<Double>>();
    }

    /**
     * Methode qui ajoute une note à une matiere
     * @param matiere
     * @param note
     * @return
     */
    public boolean ajouter(Matiere matiere, double note) {

        if (this.formation.getCoeff(matiere) == -1 || (note < 0 || note > 20)){

            return false;
        }

        if (this.resultats.containsKey(matiere)) {
            this.resultats.get(matiere).add(note);
            return true;
        }
        else {
            List<Double> resultats = new ArrayList<Double>();
            resultats.add(note);
            this.resultats.put(matiere, resultats);
            return true;
        }

    }

    /**
     * Methode qui retourne la moyenne d'une matiere
     * @param matiere
     * @return
     */
    public double moyenne(Matiere matiere) {

        double moyenne = 0;

        if (this.resultats.containsKey(matiere)) {
            for (double note : this.resultats.get(matiere)) {
                moyenne += note;
            }
            moyenne /= this.resultats.get(matiere).size();
        }
        return moyenne;
    }

    public double moyenne(){

        double repMoyenne = 0;
        double coeffTotal = 0;

        for (Matiere matiere : this.resultats.keySet()) {
            repMoyenne += this.moyenne(matiere) * this.formation.getCoeff(matiere);
            coeffTotal += this.formation.getCoeff(matiere);
        }

        return (repMoyenne / coeffTotal);
    }

    public HashMap<Matiere, List<Double>> getResultats() {
        return resultats;
    }
}
