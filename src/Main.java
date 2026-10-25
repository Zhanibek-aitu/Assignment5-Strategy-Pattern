/**
 * Course: Software Design Patterns
 * Assignment 5: Strategy Pattern Implementation
 * Author: Zhanibek Abilkhan
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Navigation App Started ===\n");

        String origin = "Astana IT University";
        String destination = "Baiterek Monument";

        // 1. Client selects initial strategy (Car)
        Navigator navigator = new Navigator(new CarStrategy());
        navigator.calculateRoute(origin, destination);

        System.out.println("\n--- Traffic jam detected! Switching to Public Transport ---");
        // 2. Dynamic runtime switching
        navigator.setRouteStrategy(new PublicTransportStrategy());
        navigator.calculateRoute(origin, destination);

        System.out.println("\n--- Weather is nice! Switching to Walking mode ---");
        // 3. Dynamic runtime switching again
        navigator.setRouteStrategy(new WalkStrategy());
        navigator.calculateRoute(origin, destination);
    }
}