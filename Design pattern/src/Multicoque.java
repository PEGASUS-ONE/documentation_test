public abstract class Multicoque extends Voilier{

    public Multicoque() {}

    public Multicoque(String nom){
        super(nom);
    }

    public Multicoque(String nom, String nomSkipper){
        super(nom, nomSkipper);
    }

    public Multicoque(String nom, SuivreRoute suivreRoute){
        super(nom, suivreRoute);
    }

    public Multicoque(String nom, String nomSkipper ,SuivreRoute suivreRoute){
        super(nom, nomSkipper, suivreRoute);
    }

    public String toString(){
        return super.toString() + "Type : Multicoque "  ;
    }
}
