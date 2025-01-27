/**
 * Représente un voilier avec ses attributs de base et ses comportements.
 */
public abstract class Voilier {
    /**
     * Le nom du voilier.
     */
    public String nom;

    /**
     * Le nom du skipper du voilier.
     */
    public String nomSkipper;

    /**
     * La stratégie de suivi de route du voilier.
     */
    public SuivreRoute suivreRoute;

    /**
     * Constructeur par défaut de la classe Voilier.
     */
    public Voilier() {}

    /**
     * Constructeur qui initialise le nom du voilier.
     * @param nom Le nom du voilier.
     */
    public Voilier(String nom) {
        this.nom = nom;
    }

    /**
     * Constructeur qui initialise le nom du voilier et le nom du skipper.
     * @param nom Le nom du voilier.
     * @param nomSkipper Le nom du skipper.
     */
    public Voilier(String nom, String nomSkipper) {
        this.nom = nom;
        this.nomSkipper = nomSkipper;
    }

    /**
     * Constructeur qui initialise le nom du voilier et la stratégie de suivi de route.
     * @param nom Le nom du voilier.
     * @param suivreRoute La stratégie de suivi de route.
     */
    public Voilier(String nom, SuivreRoute suivreRoute) {
        this.nom = nom;
        this.suivreRoute = suivreRoute;
    }

    /**
     * Constructeur qui initialise le nom du voilier, le nom du skipper et la stratégie de suivi de route.
     * @param nom Le nom du voilier.
     * @param nomSkipper Le nom du skipper.
     * @param suivreRoute La stratégie de suivi de route.
     */
    public Voilier(String nom, String nomSkipper, SuivreRoute suivreRoute) {
        this.nom = nom;
        this.nomSkipper = nomSkipper;
        this.suivreRoute = suivreRoute;
    }

    /**
     * Définit la stratégie de suivi de route pour le voilier.
     * @param suivreRoute La stratégie de suivi de route.
     */
    public void setSuivreRoute(SuivreRoute suivreRoute) {
        this.suivreRoute = suivreRoute;
    }

    /**
     * Applique la stratégie de suivi de route du voilier.
     */
    public void appliqueSuivreRoute(){
        this.suivreRoute.suivreRoute();
    }

    /**
     * Renvoie le nom du voilier.
     * @return Le nom du voilier.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Définit le nom du voilier.
     * @param nom Le nom du voilier.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Renvoie la stratégie de suivi de route du voilier.
     * @return La stratégie de suivi de route.
     */
    public SuivreRoute getSuivreRoute() {
        return suivreRoute;
    }

    /**
     * Renvoie une représentation textuelle du voilier.
     * @return Une chaîne décrivant le voilier et sa route suivie.
     */
    public String toString(){
        if (suivreRoute == null){
            return "\n -Nom du voiler : " + nom + " ";
        } else {
            return "\n -Nom du voiler : " + nom + "\n -Route Suivie : " + suivreRoute;
        }
    }
}
