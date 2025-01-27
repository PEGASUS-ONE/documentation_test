/**
 * Représente un multicoque, qui est un type spécifique de voilier.
 */
public abstract class Multicoque extends Voilier{

    /**
     * Constructeur par défaut de la classe Multicoque.
     */
    public Multicoque() {}

    /**
     * Constructeur qui initialise le nom du multicoque.
     * @param nom Le nom du multicoque.
     */
    public Multicoque(String nom){
        super(nom);
    }

    /**
     * Constructeur qui initialise le nom du multicoque et le nom du skipper.
     * @param nom Le nom du multicoque.
     * @param nomSkipper Le nom du skipper.
     */
    public Multicoque(String nom, String nomSkipper){
        super(nom, nomSkipper);
    }

    /**
     * Constructeur qui initialise le nom du multicoque et la stratégie de suivi de route.
     * @param nom Le nom du multicoque.
     * @param suivreRoute La stratégie de suivi de route.
     */
    public Multicoque(String nom, SuivreRoute suivreRoute){
        super(nom, suivreRoute);
    }

    /**
     * Constructeur qui initialise le nom du multicoque, le nom du skipper et la stratégie de suivi de route.
     * @param nom Le nom du multicoque.
     * @param nomSkipper Le nom du skipper.
     * @param suivreRoute La stratégie de suivi de route.
     */
    public Multicoque(String nom, String nomSkipper ,SuivreRoute suivreRoute){
        super(nom, nomSkipper, suivreRoute);
    }

    /**
     * Renvoie une représentation textuelle du multicoque.
     * @return Une chaîne décrivant le multicoque et sa route suivie.
     */
    public String toString(){
        return super.toString() + "Type : Multicoque ";
    }
}
