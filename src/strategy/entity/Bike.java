package strategy.entity;

import strategy.interfaces.DrivingStartegy;

public class Bike extends Vehicle{
    public Bike() {
        super(new TwoWheelerDS());
    }
}
