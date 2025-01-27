/**
 * La classe Imoca est une sous-classe de Monocoque représentant un type spécifique de bateau.
 * Elle fournit plusieurs constructeurs pour créer des instances d'Imoca avec des caractéristiques différentes.
 */
public class Imoca extends Monocoque{

    /**
     * Constructeur par défaut. 
     * Crée une instance d'Imoca sans nom.
     */
    public Imoca() {}

    /**
     * Constructeur avec nom. 
     * @param nom Le nom de l'Imoca.
     */
    public Imoca(String nom){
        super(nom);
    }

    /**
     * Constructeur avec nom et nom du skipper.
     * @param nom Le nom de l'Imoca.
     * @param nomSkipper Le nom du skipper de l'Imoca.
     */
    public Imoca(String nom, String nomSkipper){
        super(nom, nomSkipper);
    }

    /**
     * Constructeur avec nom et stratégie de suivi de route.
     * @param nom Le nom de l'Imoca.
     * @param suivreRoute La stratégie de suivi de route pour l'Imoca.
     */
    public Imoca(String nom, SuivreRoute suivreRoute){
        super(nom, suivreRoute);
    }

    /**
     * Constructeur avec nom, nom du skipper et stratégie de suivi de route.
     * @param nom Le nom de l'Imoca.
     * @param nomSkipper Le nom du skipper de l'Imoca.
     * @param suivreRoute La stratégie de suivi de route pour l'Imoca.
     */
    public Imoca(String nom, String nomSkipper, SuivreRoute suivreRoute){
        super(nom, nomSkipper, suivreRoute);
    }
}
