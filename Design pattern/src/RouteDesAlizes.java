/**
 * La classe RouteDesAlizes implémente l'interface SuivreRoute.
 * Elle représente une stratégie spécifique de suivi de route appelée "Route des Alizés".
 */
public class RouteDesAlizes implements SuivreRoute{
    /**
     * Méthode pour suivre la route selon la stratégie "Route des Alizés".
     * Affiche "Route des Alizés" à la console.
     */
    @Override
    public void suivreRoute() {
        System.out.println("Route des Alizés");
    }
}
