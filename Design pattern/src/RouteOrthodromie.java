/**
 * La classe RouteOrthodromie implémente l'interface SuivreRoute.
 * Elle représente une stratégie spécifique de suivi de route appelée "Route Orthodromie".
 */
public class RouteOrthodromie implements SuivreRoute{
    /**
     * Méthode pour suivre la route selon la stratégie "Route Orthodromie".
     * Affiche "Route Orthodromie" à la console.
     */
    @Override
    public void suivreRoute() {
        System.out.println("Route Orthodromie");
    }
}
