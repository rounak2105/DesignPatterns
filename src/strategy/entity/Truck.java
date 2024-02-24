package strategy.entity;

import strategy.interfaces.DrivingStartegy;

public class Truck extends Vehicle{
    public Truck() {
        super(new FourWheelerDS());
    }
}
