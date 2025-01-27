public class RhumMono extends Monocoque{
    public RhumMono(){}

    public RhumMono(String nom){
        super(nom);
    }

    public RhumMono(String nom, String nomSkipper){
        super(nom, nomSkipper);
    }

    public RhumMono(String nom, SuivreRoute suivreRoute){
        super(nom, suivreRoute);
    }

    public RhumMono(String nom, String nomSkipper, SuivreRoute suivreRoute){
        super(nom, nomSkipper, suivreRoute);
    }

}
