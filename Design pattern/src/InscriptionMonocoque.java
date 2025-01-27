/**
 * La classe InscriptionMonocoque est une sous-classe d'InscriptionVoilier.
 * Elle implémente la méthode factoryMethod pour créer des voiliers de type Monocoque.
 */
public class InscriptionMonocoque extends InscriptionVoilier{

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
            case Class40:
                return new Class40(nomVoilier, nomSkipper);

            case Imoca:
                return new Imoca(nomVoilier, nomSkipper);

            case RhumMono:
                return new RhumMono(nomVoilier, nomSkipper);

            default:
                return null;
        }
    }
}
