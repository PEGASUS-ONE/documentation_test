/**
 * L'interface Observable représente un objet qui peut être observé par des observateurs.
 * Elle permet d'ajouter, de retirer et de notifier des observateurs.
 */
public interface Observable {
    /**
     * Ajoute un observateur à la liste des observateurs.
     * @param observer L'observateur à ajouter.
     */
    public void ajouterObservateur(Observateur observer);

    /**
     * Retire un observateur de la liste des observateurs.
     * @param observer L'observateur à retirer.
     */
    public void retirerObservateur(Observateur observer);

    /**
     * Notifie tous les observateurs des changements.
     */
    public void notifierObservateur();
}
