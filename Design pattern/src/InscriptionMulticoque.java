public class InscriptionMulticoque extends InscriptionVoilier{

    @Override
    public Voilier factoryMethod(String nomVoilier, String nomSkipper, VoilierClass voilierClass){
        switch(voilierClass){
            case Multi50:
                return new Multi50(nomVoilier, nomSkipper);
            case Ultim:
                return new Ultim(nomVoilier, nomSkipper);
            case RhumMulti:
                return new RhumMulti(nomVoilier, nomSkipper);
        }
        return null;
    }

}
