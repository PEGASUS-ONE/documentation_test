/**
 * La classe SecondeBarre est une sous-classe d'ArmementSupplementaire.
 * Elle ajoute une seconde barre comme armement supplémentaire pour un voilier.
 */
public class SecondeBarre extends ArmementSupplementaire {

    /**
     * Constructeur avec un voilier à décorer.
     * @param voilierADecorer Le voilier à décorer.
     */
    public SecondeBarre(Voilier voilierADecorer) {
        super(voilierADecorer);
    }

    /**
     * Retourne une représentation textuelle du voilier décoré avec l'armement supplémentaire.
     * @return Une chaîne de caractères représentant le voilier décoré avec une seconde barre comme armement supplémentaire.
     */
    @Override
    public String toString() {
        return super.toString() + "\n -Armement supplémentaire: Seconde barre";
    }
}
