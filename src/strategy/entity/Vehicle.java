package strategy.entity;

import strategy.interfaces.DrivingStartegy;

public class Vehicle {
    DrivingStartegy drivingStartegy;
    public Vehicle(DrivingStartegy drivingStartegy) {
        this.drivingStartegy = drivingStartegy;
    }
    public void drive() {
        drivingStartegy.drive();
    }
}
