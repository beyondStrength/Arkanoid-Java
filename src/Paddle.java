import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Paddle extends JPanel {

    int x,y,w,h;


    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawRect(x, y, w, h);

    }

    void Start()    {
        w = (int)Game.dW/8;
        h = (int)Game.dH/16;
        x = ((int)Game.dW/2)-(w/2);
        y = ((int)Game.dH)-(h*4);
    }

    void Update()   {
        x++;
        this.repaint();
    }
}
