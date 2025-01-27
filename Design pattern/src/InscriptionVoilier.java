import java.util.ArrayList;

/**
 * La classe abstraite InscriptionVoilier représente un modèle pour l'inscription des voiliers.
 * Elle contient une liste de voiliers inscrits et fournit une méthode pour l'enregistrement des voiliers.
 */
public abstract class InscriptionVoilier {
    /**
     * Liste des voiliers inscrits.
     */
    protected ArrayList<Voilier> voiliersInscrits = new ArrayList<Voilier>();

    /**
     * Méthode abstraite pour créer un voilier. 
     * Doit être implémentée par les sous-classes.
     * @param nomVoilier Le nom du voilier.
     * @param nomSkipper Le nom du skipper du voilier.
     * @param voilierClass La classe du voilier.
     * @return Une instance de Voilier.
     */
    public abstract Voilier factoryMethod(String nomVoilier, String nomSkipper, VoilierClass voilierClass);

    /**
     * Enregistre un voilier en utilisant la méthode factoryMethod.
     * Ajoute le voilier créé à la liste des voiliers inscrits.
     * @param nomVoilier Le nom du voilier.
     * @param nomSkipper Le nom du skipper du voilier.
     * @param voilierClass La classe du voilier.
     */
    public void enregistrementVoilier(String nomVoilier, String nomSkipper, VoilierClass voilierClass){
        Voilier vo = factoryMethod(nomVoilier, nomSkipper, voilierClass);
        voiliersInscrits.add(vo);
    }
}
