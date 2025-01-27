import java.util.ArrayList;

public class Categorie implements Observateur{
    public String nomCategorie;
    public ArrayList<Abandon> listeAbandons;


    public Categorie (String nomCategorie){
        this.nomCategorie = nomCategorie;
        listeAbandons = new ArrayList<>();
    }

    public ArrayList<Abandon> getListeAbandons(){
        return listeAbandons;
    }

    @Override
    public void actualise(Observable observable) {
        //obtenir le dernier abandon, si il est de sa catégorie, l'ajouter à sa liste
        DirectionCourse direction = (DirectionCourse) observable;
        Abandon dernierAbandon = direction.getDernierAbandon();
        if (dernierAbandon.getClasseVoilier() == nomCategorie){
            listeAbandons.add(dernierAbandon);
        }
    }

    @Override
    public String toString() {
        return "Categorie{" +
                "nomCategorie='" + nomCategorie + '\'' +
                ", listeAbandons=" + listeAbandons +
                '}';
    }
}
