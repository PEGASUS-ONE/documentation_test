public class RhumMulti extends Multicoque{
    public RhumMulti(){}

    public RhumMulti(String nom){
        super(nom);
    }

    public RhumMulti(String nom, String nomSkipper){
        super(nom, nomSkipper);
    }

    public RhumMulti(String nom, SuivreRoute suivreRoute){
        super(nom, suivreRoute);
    }

    public RhumMulti(String nom, String nomSkipper, SuivreRoute suivreRoute){
        super(nom, nomSkipper, suivreRoute);
    }
}
