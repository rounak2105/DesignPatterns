package flyweight;

import flyweight.service.BallService;

public class FlyWeightMain {
    public static void main(String[] args) {
        BallService ballService = new BallService();
        ballService.createNBall(100);
    }
}
