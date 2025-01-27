public class Imoca extends Monocoque{
    public Imoca() {}

    public Imoca(String nom){
        super(nom);
    }

    public Imoca(String nom, String nomSkipper){
        super(nom, nomSkipper);
    }

    public Imoca(String nom, SuivreRoute suivreRoute){
        super(nom, suivreRoute);
    }

    public Imoca(String nom, String nomSkipper, SuivreRoute suivreRoute){
        super(nom, nomSkipper, suivreRoute);
    }
}
