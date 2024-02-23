package flyweight.service;

import flyweight.entity.Ball;
import flyweight.factory.BallFactory;

public class BallService {
    public void createNBall(int n) {
        Ball ball = BallFactory.getSimpleBall("RED", "url1");
        ball = BallFactory.getSimpleBall("RED", "url1");
        ball = BallFactory.getSimpleBall("RED", "url1");
        ball = BallFactory.getSimpleBall("RED", "url1");
        ball = BallFactory.getSimpleBall("RED", "url1");
        ball = BallFactory.getSimpleBall("GREEN", "url1");
        ball = BallFactory.getSimpleBall("RED", "url1");
        ball = BallFactory.getSimpleBall("RED", "url2");
        ball = BallFactory.getSimpleBall("GREEN", "url1");
    }
}
