import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;


public class Ball{

    int x,y,d;
    int speedX, speedY;

    Ball()  {
        this.x = 385;
        this.y = 405;
        this.d = 30;
        this.speedX=0;
        this.speedY=0;
    }


    int getLeft() {
        return this.x;
    }
    int getMiddleX() {
        return this.x + (this.d/2);
    }
    int getRight() {
        return this.x + this.d;
    }
    int getDown() {
        return this.y + this.d;
    }
    int getMiddleY() {
        return this.y + (this.d/2);
    }
    int getUp() {
        return this.y;
    }

    void Draw(Graphics g){
        g.setColor(Color.WHITE);
        g.drawOval(x, y, d, d);

    }

    void CollisionHandler() {
        int right = x+d-1;
        int left = x;
        int up = y;
        int down = y+d-1;

        if (right > 800){
            speedX *= -1;
            x = 799-d;
        }
        if (left < 0){
            speedX *= -1;
            x = 1;
        }
        if (up < 0 || down > 600)
            speedY*= -1;
            
    }

    public void keyPressed(KeyEvent e){
        if (speedX == 0 && speedY == 0){
            switch(e.getKeyCode()){
                case 65,37: //LEFT
                speedX = -10;
                speedY = -10;
                break;
    
                case 93,39: //RIGHT
                speedX = 10;
                speedY = -10;
                break;
            }
        }
    }
    public void keyReleased(KeyEvent e){

    }

    void Update()   {
        this.x += this.speedX;
        this.y += this.speedY;
        CollisionHandler();
    }
}
