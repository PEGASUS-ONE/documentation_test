/**
 * La classe InscriptionMulticoque est une sous-classe d'InscriptionVoilier.
 * Elle implémente la méthode factoryMethod pour créer des voiliers de type Multicoque.
 */
public class InscriptionMulticoque extends InscriptionVoilier{

    /**
     * Implémente la méthode factoryMethod pour créer un voilier spécifique en fonction de la classe du voilier.
     * @param nomVoilier Le nom du voilier.
     * @param nomSkipper Le nom du skipper du voilier.
     * @param voilierClass La classe du voilier.
     * @return Une instance de Voilier correspondant à la classe spécifiée.
     */
    @Override
    public Voilier factoryMethod(String nomVoilier, String nomSkipper, VoilierClass voilierClass){
        switch(voilierClass){
            case Multi50:
                return new Multi50(nomVoilier, nomSkipper);
            case Ultim:
                return new Ultim(nomVoilier, nomSkipper);
            case RhumMulti:
                return new RhumMulti(nomVoilier, nomSkipper);
            default:
                return null;
        }
    }
}
