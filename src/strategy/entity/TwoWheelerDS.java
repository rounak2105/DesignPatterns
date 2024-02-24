package strategy.entity;

import strategy.interfaces.DrivingStartegy;

public class TwoWheelerDS implements DrivingStartegy {
    @Override
    public void drive() {
        System.out.println("driving with 2 wheels");
    }
}
