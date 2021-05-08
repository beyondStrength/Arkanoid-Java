import java.awt.Color;
import java.awt.Graphics;

public class Ball{

    int x,y,d;
    int speedX, speedY;

    Ball()  {
        this.x = 385;
        this.y = 285;
        this.d = 30;
        this.speedX=10;
        this.speedY=10;
    }


    void Draw(Graphics g){
        g.setColor(Color.WHITE);
        g.drawOval(x, y, d, d);

    }
    
    void CollisionHandler() {
        if (x+d > 800){
            x = 800 - d;
            speedX*= -1;
        }
        if (x < 0)  {
            x = 0;
            speedX*= -1;
        }
        if (y < 0)  {
            y = 0;
            speedY*= -1;
        }
        if (y+d > 600)  {
            y = 600 - d;
            speedY*= -1;
        }
            
    }


    void Update()   {
        this.x += this.speedX;
        this.y -= this.speedY;
        CollisionHandler();
    }
}
