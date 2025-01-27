public class SecondeBarre extends ArmementSupplementaire {

    public SecondeBarre(Voilier voilierADecorer) {
        super(voilierADecorer);
    }


    @Override
    public String toString() {
        return super.toString() + "\n -Armement supplémentaire: Seconde barre";
    }
}