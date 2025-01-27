public class Ultim extends Multicoque{
    public Ultim(){}

    public Ultim(String nom){
        super(nom);
    }

    public Ultim(String nom, String nomSkipper){
        super(nom, nomSkipper);
    }

    public Ultim(String nom, SuivreRoute suivreRoute){
        super(nom, suivreRoute);
    }

    public Ultim(String nom, String nomSkipper, SuivreRoute suivreRoute){
        super(nom, nomSkipper, suivreRoute);
    }
}
