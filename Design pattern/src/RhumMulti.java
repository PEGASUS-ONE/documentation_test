/**
 * La classe RhumMulti est une sous-classe de Multicoque représentant un type spécifique de bateau.
 * Elle fournit plusieurs constructeurs pour créer des instances de RhumMulti avec des caractéristiques différentes.
 */
public class RhumMulti extends Multicoque{

    /**
     * Constructeur par défaut. 
     * Crée une instance de RhumMulti sans nom.
     */
    public RhumMulti(){}

    /**
     * Constructeur avec nom. 
     * @param nom Le nom du RhumMulti.
     */
    public RhumMulti(String nom){
        super(nom);
    }

    /**
     * Constructeur avec nom et nom du skipper.
     * @param nom Le nom du RhumMulti.
     * @param nomSkipper Le nom du skipper du RhumMulti.
     */
    public RhumMulti(String nom, String nomSkipper){
        super(nom, nomSkipper);
    }

    /**
     * Constructeur avec nom et stratégie de suivi de route.
     * @param nom Le nom du RhumMulti.
     * @param suivreRoute La stratégie de suivi de route pour le RhumMulti.
     */
    public RhumMulti(String nom, SuivreRoute suivreRoute){
        super(nom, suivreRoute);
    }

    /**
     * Constructeur avec nom, nom du skipper et stratégie de suivi de route.
     * @param nom Le nom du RhumMulti.
     * @param nomSkipper Le nom du skipper du RhumMulti.
     * @param suivreRoute La stratégie de suivi de route pour le RhumMulti.
     */
    public RhumMulti(String nom, String nomSkipper, SuivreRoute suivreRoute){
        super(nom, nomSkipper, suivreRoute);
    }
}
