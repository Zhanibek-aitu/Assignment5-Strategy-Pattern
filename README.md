# Assignment 5: Strategy Pattern - Navigation App

## Problem Overview
Building a navigation application with hard-coded routing algorithms (e.g., inside massive `if-else` or `switch` blocks) violates the Open/Closed Principle. It leads to code bloat and makes the application brittle and hard to maintain as new transportation methods are added.

## Strategy Pattern Solution
This project implements the **Strategy Behavioral Design Pattern**.
It extracts the routing algorithms into separate classes (`CarStrategy`, `WalkStrategy`, `PublicTransportStrategy`), all implementing a common interface (`RouteStrategy`). 
The context class (`Navigator`) delegates the routing calculation to the strategy object, allowing the algorithm to vary independently from the clients that use it.

## Key Benefits
* **Runtime Algorithm Switching:** Strategies can be swapped on the fly based on user preference or environmental factors (e.g., traffic jams).
* **Elimination of Conditionals:** The `Navigator` context contains zero `if-else` logic regarding algorithm selection; it relies purely on polymorphism.
* **Clean Code (Chapter 10):** High cohesion, single responsibility, and isolation from volatility.
