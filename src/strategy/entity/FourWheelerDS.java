package strategy.entity;

import strategy.interfaces.DrivingStartegy;

public class FourWheelerDS implements DrivingStartegy {
    @Override
    public void drive() {
        System.out.println("driving with 4 wheels");
    }
}
