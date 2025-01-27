/**
 * La classe Velo est une sous-classe d'ArmementSupplementaire.
 * Elle ajoute la fonctionnalité d'un vélo comme armement supplémentaire pour un voilier.
 */
public class Velo extends ArmementSupplementaire {

    /**
     * Constructeur avec un voilier à décorer.
     * @param voilierADecorer Le voilier à décorer.
     */
    public Velo(Voilier voilierADecorer) {
        super(voilierADecorer);
    }

    /**
     * Retourne une représentation textuelle du voilier décoré avec l'armement supplémentaire.
     * @return Une chaîne de caractères représentant le voilier décoré avec un vélo comme armement supplémentaire.
     */
    @Override
    public String toString() {
        return super.toString() + "\n -Armement supplémentaire: Velo";
    }
}
