import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Game extends JPanel{
    JFrame frame = new JFrame();
    Dimension size;
    public static double dW, dH;
    Paddle p = new Paddle();
    Ball b = new Ball();

    void Start()    {
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setTitle("Arkanoid");
        this.frame.setSize(1280,720);
        this.frame.setVisible(true);
        this.frame.setResizable(false);
        this.frame.add(b);
        this.frame.add(p);
        this.frame.addKeyListener(new InputHandler());
        size = frame.getBounds().getSize();
        dH = size.getHeight();
        dW = size.getWidth();

        p.Start();
        b.Start();

    }

    void Update()   {
        size = frame.getBounds().getSize();
        dH = size.getHeight();
        dW = size.getWidth();
        p.Update();
        b.Update();
        p.repaint();
    }

    public class InputHandler extends KeyAdapter{
        public void keyPressed(KeyEvent e)  {
            p.keyPressed(e);

        }
        public void keyReleased(KeyEvent e) {
            p.keyReleased(e);
        }
        
    }

    public static void main(String[] args) throws Exception {
        Game game = new Game();
        game.Start();

        long timer = (1000/60);
        while(true) {

            game.Update();
            Thread.sleep(timer);
        }
    }
}
