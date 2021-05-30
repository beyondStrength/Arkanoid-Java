import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;

public class Block {
    Ball ball;
    int x,y,w,h;
    boolean alive;

    Block(int x, int y)    {
        this.x = x;
        this.y = y;
        this.w = 40;
        this.h = 20;

        alive = true;
    }


    int getLeft() {
        return this.x;
    }
    int getMiddleX() {
        return this.x + (this.w/2);
    }
    int getRight() {
        return this.x + this.w;
    }
    int getDown() {
        return this.y + this.h;
    }
    int getMiddleY() {
        return this.y + (this.h/2);
    }
    int getUp() {
        return this.y;
    }


    int getRand(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    void Draw(Graphics g) {
        g.setColor(new Color((int)(Math.random() * 0x1000000)));
        g.drawRect(x, y, w, h);
    }
    void Update(){
        CollisionHandler();
    }
    void CollisionHandler() {
        if (ball.getLeft() < this.getRight() &ball.getLeft() < this.getLeft()){

        }

    }
}
