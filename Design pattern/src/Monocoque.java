/**
 * Représente un monocoque, qui est un type spécifique de voilier.
 */
public abstract class Monocoque extends Voilier{

    /**
     * Constructeur par défaut de la classe Monocoque.
     */
    public Monocoque(){}

    /**
     * Constructeur qui initialise le nom du monocoque.
     * @param nom Le nom du monocoque.
     */
    public Monocoque(String nom){
        super(nom);
    }

    /**
     * Constructeur qui initialise le nom du monocoque et le nom du skipper.
     * @param nom Le nom du monocoque.
     * @param nomSkipper Le nom du skipper.
     */
    public Monocoque(String nom, String nomSkipper){
        super(nom, nomSkipper);
    }

    /**
     * Constructeur qui initialise le nom du monocoque et la stratégie de suivi de route.
     * @param nom Le nom du monocoque.
     * @param suivreRoute La stratégie de suivi de route.
     */
    public Monocoque(String nom, SuivreRoute suivreRoute){
        super(nom, suivreRoute);
    }

    /**
     * Constructeur qui initialise le nom du monocoque, le nom du skipper et la stratégie de suivi de route.
     * @param nom Le nom du monocoque.
     * @param nomSkipper Le nom du skipper.
     * @param suivreRoute La stratégie de suivi de route.
     */
    public Monocoque(String nom, String nomSkipper ,SuivreRoute suivreRoute){
        super(nom, nomSkipper, suivreRoute);
    }

    /**
     * Renvoie une représentation textuelle du monocoque.
     * @return Une chaîne décrivant le monocoque et sa route suivie.
     */
    public String toString(){
        return super.toString() + "\n -Type : Monocoque ";
    }
}
