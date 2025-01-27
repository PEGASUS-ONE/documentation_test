import java.util.ArrayList;

public abstract class InscriptionVoilier {
    protected ArrayList<Voilier> voiliersInscrits = new ArrayList<Voilier>();

    public abstract Voilier factoryMethod(String nomVoilier, String nomSkipper, VoilierClass voilierClass);

    public void enregistrementVoilier(String nomVoilier, String nomSkipper, VoilierClass voilierClass){
        Voilier vo = factoryMethod(nomVoilier, nomSkipper, voilierClass);
        voiliersInscrits.add(vo);
    }

}
