import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;

public class Paddle {
    int x,y,w,h;
    float speed;

    Paddle()    {
        this.x = 350;
        this.y = 500;
        this.w = 100;
        this.h = 30;

        this.speed = 0f;
    }
    
    void Draw(Graphics g) {
        g.setColor(Color.WHITE);
        g.drawRect(x, y, w, h);
    }

    void Update()   {
        this.x += this.speed;
        CollisionHandler();
    }

    void CollisionHandler() {
        if (this.x > 699)
            this.x = 699;
        if (this.x < 0)
            this.x = 0;
    }

    public void keyPressed(KeyEvent e)  {
        switch(e.getKeyCode()){
            case 65,37: //LEFT
            this.speed = -15.0f;
            break;

            case 93,39: //RIGHT
            this.speed = 15.0f;
            break;
        }
    }
    public void keyReleased(KeyEvent e) {
        switch(e.getKeyCode()){
            case 65,37: //LEFT
            if(this.speed < 0)
                this.speed = 0f;
            break;

            case 93,39: //RIGHT
            if(this.speed > 0)
                this.speed = 0f;
            break;
        }
    }
}
