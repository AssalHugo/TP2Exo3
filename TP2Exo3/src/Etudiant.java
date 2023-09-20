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

    public void ajouter(Matiere matiere, double note) {
        this.resultats.get(matiere).add(note);
    }
}
