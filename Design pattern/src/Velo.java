public class Velo extends ArmementSupplementaire {

    public Velo(Voilier voilierADecorer) {
        super(voilierADecorer);
    }


    @Override
    public String toString() {
        return super.toString() + "\n -Armement supplémentaire: Velo";
    }
}
