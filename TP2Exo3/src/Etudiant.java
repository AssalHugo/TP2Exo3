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

    public boolean ajouter(Matiere matiere, double note) {

        if (this.formation.getCoefficients && note >= 0 && note <= 20) {
            this.resultats.get(matiere).add(note);
            return true;
        }
        return false;

    }
}
