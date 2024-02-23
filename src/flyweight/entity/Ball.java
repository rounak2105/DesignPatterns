package flyweight.entity;

public class Ball {
    private String color;
    private String url;
    private int xPos;
    private int yPos;

    public Ball(String color, String url) {
        this.color = color;
        this.url = url;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }
}
