package Object;

import java.awt.Graphics;
import java.awt.Rectangle;


public abstract class GameObject {
    
    protected double x, y;
//    public Game game;
    
    public GameObject(double x, double y){
        this.x = x;
        this.y = y;
//        this.game = game;
    }
    
    public void render(Graphics g){
        g.fillRect((int) getX(), (int) getY(), 100, 100);
    }

    public Rectangle getBounds(int width, int height){
        return new Rectangle((int) x, (int) y, width, height);
    }
    
    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
