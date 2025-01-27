/**
 * L'interface Observateur représente un observateur dans le modèle Observer.
 * Elle définit une méthode pour actualiser l'état de l'observateur lorsque l'objet observable change.
 */
public interface Observateur {
    /**
     * Méthode appelée pour actualiser l'état de l'observateur en réponse à un changement dans l'objet observable.
     * @param observable L'objet observable qui a changé.
     */
    public void actualise(Observable observable);
}
