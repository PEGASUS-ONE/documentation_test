import java.util.ArrayList;

/**
 * La classe Categorie implémente l'interface Observateur.
 * Elle représente une catégorie de voiliers et suit les abandons dans cette catégorie.
 */
public class Categorie implements Observateur{
    /**
     * Le nom de la catégorie.
     */
    public String nomCategorie;

    /**
     * La liste des abandons dans cette catégorie.
     */
    public ArrayList<Abandon> listeAbandons;

    /**
     * Constructeur avec le nom de la catégorie.
     * Initialise une liste vide pour les abandons.
     * @param nomCategorie Le nom de la catégorie.
     */
    public Categorie (String nomCategorie){
        this.nomCategorie = nomCategorie;
        listeAbandons = new ArrayList<>();
    }

    /**
     * Retourne la liste des abandons dans cette catégorie.
     * @return La liste des abandons.
     */
    public ArrayList<Abandon> getListeAbandons(){
        return listeAbandons;
    }

    /**
     * Actualise l'état de la catégorie en ajoutant le dernier abandon si celui-ci appartient à la catégorie.
     * @param observable L'objet observable qui a changé.
     */
    @Override
    public void actualise(Observable observable) {
        // Obtenir le dernier abandon, si il est de sa catégorie, l'ajouter à sa liste
        DirectionCourse direction = (DirectionCourse) observable;
        Abandon dernierAbandon = direction.getDernierAbandon();
        if (dernierAbandon.getClasseVoilier() == nomCategorie){
            listeAbandons.add(dernierAbandon);
        }
    }

    /**
     * Retourne une représentation textuelle de la catégorie et de ses abandons.
     * @return Une chaîne de caractères représentant la catégorie et ses abandons.
     */
    @Override
    public String toString() {
        return "Categorie{" +
                "nomCategorie='" + nomCategorie + '\'' +
                ", listeAbandons=" + listeAbandons +
                '}';
    }
}
