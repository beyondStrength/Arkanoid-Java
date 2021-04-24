import java.awt.*;
import java.awt.event.*;

import javax.swing.JPanel;

public class Paddle extends JPanel {

    int x,y,w,h;
    int speed;


    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawRect(x, y, w, h);

    }

    public void keyPressed(KeyEvent e){
        if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            speed=10;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT){
            speed=-10;    
        }
    }

    public void keyReleased(KeyEvent e){
        if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            if (speed>0)
                speed = 0;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT){
            if (speed<0)
                speed = 0;    
        }
    }
    
    void Start()    {
        w = (int)Game.dW/8;
        h = (int)Game.dH/16;
        x = ((int)Game.dW/2)-(w/2);
        y = ((int)Game.dH)-(h*4);
    }

    void CollisionHandler() {
        if (x+w > Game.dW)
            x = (int)Game.dW - w;
        if (x < 0)
            x = 0;
    }


    void Update()   {
        x+=speed;
        CollisionHandler();
        //this.repaint();
    }
}
