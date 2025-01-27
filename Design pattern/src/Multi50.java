/**
 * La classe Multi50 est une sous-classe de Multicoque représentant un type spécifique de bateau.
 * Elle fournit plusieurs constructeurs pour créer des instances de Multi50 avec des caractéristiques différentes.
 */
public class Multi50 extends Multicoque{

    /**
     * Constructeur par défaut. 
     * Crée une instance de Multi50 sans nom.
     */
    public Multi50(){}

    /**
     * Constructeur avec nom. 
     * @param nom Le nom du Multi50.
     */
    public Multi50(String nom){
        super(nom);
    }

    /**
     * Constructeur avec nom et nom du skipper.
     * @param nom Le nom du Multi50.
     * @param nomSkipper Le nom du skipper du Multi50.
     */
    public Multi50(String nom, String nomSkipper){
        super(nom, nomSkipper);
    }

    /**
     * Constructeur avec nom et stratégie de suivi de route.
     * @param nom Le nom du Multi50.
     * @param suivreRoute La stratégie de suivi de route pour le Multi50.
     */
    public Multi50(String nom, SuivreRoute suivreRoute){
        super(nom, suivreRoute);
    }

    /**
     * Constructeur avec nom, nom du skipper et stratégie de suivi de route.
     * @param nom Le nom du Multi50.
     * @param nomSkipper Le nom du skipper du Multi50.
     * @param suivreRoute La stratégie de suivi de route pour le Multi50.
     */
    public Multi50(String nom, String nomSkipper, SuivreRoute suivreRoute){
        super(nom, nomSkipper, suivreRoute);
    }
}
