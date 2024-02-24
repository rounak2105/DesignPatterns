package strategy.entity;

import strategy.interfaces.DrivingStartegy;

public class Car extends Vehicle{
    public Car() {
        super(new FourWheelerDS());
    }
}
