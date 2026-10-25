/**
 * Context Class (Strategy Pattern).
 * Maintains a reference to a Strategy object and delegates the algorithm execution to it.
 * Clean Code Ch. 10: Dependency Management - depends on abstraction (RouteStrategy), not concretions.
 */
public class Navigator {
    private RouteStrategy routeStrategy;

    // Optional: Set a default strategy via constructor
    public Navigator(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    // Allows dynamic algorithm switching at runtime
    public void setRouteStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    // Delegates the work to the strategy object (No if/else logic here!)
    public void calculateRoute(String start, String end) {
        if (routeStrategy == null) {
            System.out.println("⚠️ Strategy is not set. Cannot build route.");
            return;
        }
        routeStrategy.buildRoute(start, end);
    }
}