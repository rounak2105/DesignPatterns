package flyweight.factory;

import flyweight.entity.Ball;

import java.util.HashMap;
import java.util.Map;

public class BallFactory {
    private static final String UNDERSCORE = "_";
    private static Map<String, Ball> ballMap = new HashMap<>();
    public static Ball getSimpleBall(String color, String img) {
        String key = color + UNDERSCORE + img;
        if(ballMap.containsKey(key)) {
            System.out.println("memory saved!");
            return ballMap.get(key);
        }
        System.out.println("taking extra memory!");
        Ball ball = new Ball(color, img);
        ballMap.put(key, ball);
        return ball;
    }
}
