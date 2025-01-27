import java.util.ArrayList;
import java.util.Iterator;

public class DirectionCourse implements Observable{
    private ArrayList<Observateur> Observateurs;
    private ArrayList<Abandon> Abandons;

    public DirectionCourse(){
        Observateurs = new ArrayList<>();
        Abandons = new ArrayList<>();
    }

    public void simulationCourse(){

    }

    public Abandon getDernierAbandon(){
        return Abandons.getLast();
    }

    public ArrayList<Abandon> getAbandons(){
        return Abandons;
    }

    public ArrayList<Observateur> getObservateurs(){
        return Observateurs;
    }

    @Override
    public void ajouterObservateur(Observateur observateur) {
        if(!Observateurs.contains(observateur)){
            Observateurs.add(observateur);
        }
        else {
            System.out.println("Cet observateur est déjà enregistré");
        }
    }

    @Override
    public void retirerObservateur(Observateur observateur) {
        if(Observateurs.contains(observateur)){
            Observateurs.remove(observateur);
        }
        else {
            System.out.println("Cet observateur n'est pas dans la liste des observateurs enregistrés");
        }

    }

    @Override
    public void notifierObservateur() {
        for (Observateur observateur : Observateurs) {
            observateur.actualise(this);
        }
    }
}
