import java.awt.Color;
import java.awt.Graphics;

public class LifeBar {
    int x,y,w,h;
    LifeBar()   {
        this.x = 10;
        this.y = 570;
        this.w = 33 * GameFrame.lives;
        this.h = 20;
    }

    void Update()   {
        this.w = 33 * GameFrame.lives;
    }

    void Draw(Graphics g) {
        g.setColor(Color.GREEN);
        g.drawRect(x, y, w, h);
    }
}
