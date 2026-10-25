/**
 * Concrete Strategy for pedestrian navigation.
 */
public class WalkStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String startPoint, String endPoint) {
        System.out.println("🚶 Planning WALKING route from [" + startPoint + "] to [" + endPoint + "].");
        System.out.println("   -> Optimizing for pedestrian paths and parks. Avoiding highways.");
    }
}