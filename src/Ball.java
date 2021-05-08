import java.awt.Graphics;

public class Ball{

    int x,y,d;
    int speedX, speedY;

    Ball(int x, int y, int d)  {
        this.x = x;
        this.y = y;
        this.d = d;
    }


    void Draw(Graphics g){
        g.drawOval(x, y, d, d);

    }
    
    void Start()    {
        speedX=10;
        speedY=10;
    }

    /*void CollisionHandler() {
        if (x+d > (int)Game.dW){
            x = (int)Game.dW - d;
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
        if (y+d > (int)Game.dH)  {
            y = (int)Game.dH - d;
            speedY*= -1;
        }
            
    }*/


    void Update()   {
        x+=speedX;
        y-=speedY;
        //CollisionHandler();
    }
}
