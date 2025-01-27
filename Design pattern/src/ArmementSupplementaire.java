/**
 * La classe abstraite ArmementSupplementaire est une sous-classe de Voilier.
 * Elle sert de décoration pour un voilier en ajoutant des fonctionnalités supplémentaires.
 */
public abstract class ArmementSupplementaire extends Voilier{
    /**
     * Instance de Voilier à décorer.
     */
    public Voilier voilierADecorer;

    /**
     * Constructeur avec un voilier à décorer.
     * @param voilierADecorer Le voilier à décorer.
     */
    public ArmementSupplementaire(Voilier voilierADecorer) {
        this.voilierADecorer = voilierADecorer;
    }

    /**
     * Applique la stratégie de suivi de route du voilier décoré.
     */
    public void appliqueSuivreRoute(){
        voilierADecorer.appliqueSuivreRoute();
    }

    /**
     * Définit la stratégie de suivi de route pour le voilier décoré.
     * @param suivreRoute La nouvelle stratégie de suivi de route.
     */
    public void setSuivreRoute(SuivreRoute suivreRoute) {
        voilierADecorer.setSuivreRoute(suivreRoute);
    }

    /**
     * Retourne une représentation textuelle du voilier décoré.
     * @return Une chaîne de caractères représentant le voilier décoré.
     */
    public String toString() {
        return "Voilier à decorer: " + voilierADecorer.toString();
    }
}
