/**
 * La classe RhumMono est une sous-classe de Monocoque représentant un type spécifique de bateau.
 * Elle fournit plusieurs constructeurs pour créer des instances de RhumMono avec des caractéristiques différentes.
 */
public class RhumMono extends Monocoque{

    /**
     * Constructeur par défaut. 
     * Crée une instance de RhumMono sans nom.
     */
    public RhumMono(){}

    /**
     * Constructeur avec nom. 
     * @param nom Le nom du RhumMono.
     */
    public RhumMono(String nom){
        super(nom);
    }

    /**
     * Constructeur avec nom et nom du skipper.
     * @param nom Le nom du RhumMono.
     * @param nomSkipper Le nom du skipper du RhumMono.
     */
    public RhumMono(String nom, String nomSkipper){
        super(nom, nomSkipper);
    }

    /**
     * Constructeur avec nom et stratégie de suivi de route.
     * @param nom Le nom du RhumMono.
     * @param suivreRoute La stratégie de suivi de route pour le RhumMono.
     */
    public RhumMono(String nom, SuivreRoute suivreRoute){
        super(nom, suivreRoute);
    }

    /**
     * Constructeur avec nom, nom du skipper et stratégie de suivi de route.
     * @param nom Le nom du RhumMono.
     * @param nomSkipper Le nom du skipper du RhumMono.
     * @param suivreRoute La stratégie de suivi de route pour le RhumMono.
     */
    public RhumMono(String nom, String nomSkipper, SuivreRoute suivreRoute){
        super(nom, nomSkipper, suivreRoute);
    }
}
