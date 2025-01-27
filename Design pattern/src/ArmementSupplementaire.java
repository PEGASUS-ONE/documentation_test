public abstract class ArmementSupplementaire extends Voilier{
    public Voilier voilierADecorer;

    public ArmementSupplementaire(Voilier voilierADecorer) {
        this.voilierADecorer = voilierADecorer;
    }

    public void appliqueSuivreRoute(){
        voilierADecorer.appliqueSuivreRoute();
    }

    public void setSuivreRoute(SuivreRoute suivreRoute) {
        voilierADecorer.setSuivreRoute(suivreRoute);
    }

    public String toString() {
        return "Voilier à decorer: " + voilierADecorer.toString();
    }
}
