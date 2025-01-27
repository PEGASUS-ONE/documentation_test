public class InscriptionMonocoque extends InscriptionVoilier{

    @Override
    public Voilier factoryMethod(String nomVoilier, String nomSkipper, VoilierClass voilierClass){
        switch(voilierClass){
            case Class40:
                return new Class40(nomVoilier, nomSkipper);

            case Imoca:
                return new Imoca(nomVoilier, nomSkipper);

            case RhumMono:
                return new RhumMono(nomVoilier, nomSkipper);
        }
        return null;
    }
}
