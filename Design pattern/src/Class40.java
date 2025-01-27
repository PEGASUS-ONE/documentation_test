/**
 * La classe Class40 est une sous-classe de Monocoque représentant un type spécifique de bateau.
 * Elle fournit plusieurs constructeurs pour créer des instances de Class40 avec des caractéristiques différentes.
 */
public class Class40 extends Monocoque{

    /**
     * Constructeur par défaut. 
     * Crée une instance de Class40 sans nom.
     */
    public Class40(){}

    /**
     * Constructeur avec nom. 
     * @param nom Le nom du Class40.
     */
    public Class40(String nom){
        super(nom);
    }

    /**
     * Constructeur avec nom et nom du skipper.
     * @param nom Le nom du Class40.
     * @param nomSkipper Le nom du skipper du Class40.
     */
    public Class40(String nom, String nomSkipper){
        super(nom, nomSkipper);
    }

    /**
     * Constructeur avec nom et stratégie de suivi de route.
     * @param nom Le nom du Class40.
     * @param suivreRoute La stratégie de suivi de route pour le Class40.
     */
    public Class40(String nom, SuivreRoute suivreRoute){
        super(nom, suivreRoute);
    }

    /**
     * Constructeur avec nom, nom du skipper et stratégie de suivi de route.
     * @param nom Le nom du Class40.
     * @param nomSkipper Le nom du skipper du Class40.
     * @param suivreRoute La stratégie de suivi de route pour le Class40.
     */
    public Class40(String nom, String nomSkipper, SuivreRoute suivreRoute){
        super(nom, nomSkipper, suivreRoute);
    }
}
