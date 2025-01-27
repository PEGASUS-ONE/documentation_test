/**
 * La classe Ultim est une sous-classe de Multicoque représentant un type spécifique de bateau.
 * Elle fournit plusieurs constructeurs pour créer des instances d'Ultim avec des caractéristiques différentes.
 */
public class Ultim extends Multicoque{

    /**
     * Constructeur par défaut. 
     * Crée une instance d'Ultim sans nom.
     */
    public Ultim(){}

    /**
     * Constructeur avec nom. 
     * @param nom Le nom de l'Ultim.
     */
    public Ultim(String nom){
        super(nom);
    }

    /**
     * Constructeur avec nom et nom du skipper.
     * @param nom Le nom de l'Ultim.
     * @param nomSkipper Le nom du skipper de l'Ultim.
     */
    public Ultim(String nom, String nomSkipper){
        super(nom, nomSkipper);
    }

    /**
     * Constructeur avec nom et stratégie de suivi de route.
     * @param nom Le nom de l'Ultim.
     * @param suivreRoute La stratégie de suivi de route pour l'Ultim.
     */
    public Ultim(String nom, SuivreRoute suivreRoute){
        super(nom, suivreRoute);
    }

    /**
     * Constructeur avec nom, nom du skipper et stratégie de suivi de route.
     * @param nom Le nom de l'Ultim.
     * @param nomSkipper Le nom du skipper de l'Ultim.
     * @param suivreRoute La stratégie de suivi de route pour l'Ultim.
     */
    public Ultim(String nom, String nomSkipper, SuivreRoute suivreRoute){
        super(nom, nomSkipper, suivreRoute);
    }
}
