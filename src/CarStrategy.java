/**
 * Concrete Strategy for car navigation.
 * Clean Code: Single Responsibility - this class only handles car routing logic.
 */
public class CarStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String startPoint, String endPoint) {
        System.out.println("🚗 Planning CAR route from [" + startPoint + "] to [" + endPoint + "].");
        System.out.println("   -> Calculating traffic jams. Optimizing for highways.");
    }
}