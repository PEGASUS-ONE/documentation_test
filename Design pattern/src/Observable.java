public interface Observable {
    public void ajouterObservateur(Observateur observer);
    public void retirerObservateur(Observateur observer);
    public void notifierObservateur();
}
