/**
 * Concrete Strategy for public transit navigation.
 */
public class PublicTransportStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String startPoint, String endPoint) {
        System.out.println("🚌 Planning PUBLIC TRANSPORT route from [" + startPoint + "] to [" + endPoint + "].");
        System.out.println("   -> Checking bus schedules and subway transfers.");
    }
}