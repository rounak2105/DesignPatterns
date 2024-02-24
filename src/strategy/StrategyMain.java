package strategy;

import strategy.entity.Bike;
import strategy.entity.Car;
import strategy.entity.Vehicle;

public class StrategyMain {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.drive();
        vehicle = new Bike();
        vehicle.drive();
    }
}
