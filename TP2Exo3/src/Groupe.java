import java.util.HashMap;

public class Groupe {

    private HashMap<Formation, Etudiant> etudiants;

    public Groupe() {
        this.etudiants = new HashMap<Formation, Etudiant>();
    }

    /**
     * Methode qui ajoute un etudiant à un groupe, on peut ajouter un étudiant à un groupe
     * uniquement si le groupe et l’étudiant ont la même formation
     * @param etudiant
     * @param formation
     * @return
     */
    public boolean ajouter(Etudiant etudiant, Formation formation) {

        if (!this.etudiants.containsKey(formation)){

            return false;
        }
        else {


        }
    }

}
