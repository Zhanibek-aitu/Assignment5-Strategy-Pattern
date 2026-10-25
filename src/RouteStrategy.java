/**
 * Strategy Interface (Clean Code Ch. 10: Isolating Volatility).
 * Declares the execution method common to all route planning algorithms.
 */
public interface RouteStrategy {
    void buildRoute(String startPoint, String endPoint);
}