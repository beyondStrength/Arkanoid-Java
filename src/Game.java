import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Game extends JPanel  {
    JFrame frame = new JFrame();
    Dimension size;
    public static double dW, dH;
    Paddle p = new Paddle();

    void Start()    {
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setTitle("Arkanoid");
        this.frame.setSize(1280,720);
        this.frame.setVisible(true);
        this.frame.setResizable(true);
        this.frame.add(p);
        size = frame.getBounds().getSize();
        dH = size.getHeight();
        dW = size.getWidth();

        p.Start();

    }

    void Update()   {
        size = frame.getBounds().getSize();
        dH = size.getHeight();
        dW = size.getWidth();
        p.Update();
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
