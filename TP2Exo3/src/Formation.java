import java.util.HashMap;

/**
 * Classe Formation
 */
public class Formation {

    /**
     * Attribut identifiant qui est un String
     */
    private String identifiant;

    /**
     * Attribut coefficients qui est un HashMap de Matiere et de Double
     */
    public HashMap<Matiere, Double> coefficients;

    /**
     * Constructeur de la classe Formation
     * @param identifiant
     */
    public Formation (String identifiant){
        this.identifiant = identifiant;
        coefficients = new HashMap<>();
    }

    /**
     * Methode qui ajoute une matiere et son coefficient
     * @param m
     * @param coeff
     */
    public void ajoutMatiere(Matiere m, double coeff){
            if (!coefficients.containsKey(m)){
                coefficients.put(m, coeff);
            }
    }

    /**
     * Methode qui supprime une matiere
     * @param m
     */
    public void supMatiere(Matiere m){
        if(coefficients.containsKey(m)){
            coefficients.remove(m);
        }
    }

    /**
     * Methodes qui retourne le coefficient de la matiere donnée
     * @param m
     * @return un double
     */
    public double getCoeff(Matiere m){
        if(coefficients.containsKey(m)){
            return coefficients.get(m);
        }else{
            return -1;
        }
    }

}
