import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;

public class Block {
    int x,y,w,h;
    boolean alive;

    Block(int x, int y)    {
        this.x = x;
        this.y = y;
        this.w = 40;
        this.h = 20;

        alive = true;
    }

    int getRand(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    void Draw(Graphics g) {
        g.setColor(new Color((int)(Math.random() * 0x1000000)));
        g.drawRect(x, y, w, h);
    }
}
