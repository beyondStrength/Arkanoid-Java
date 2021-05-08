import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class GamePanel extends JPanel{

    Paddle paddle;
    Ball ball;

    GamePanel(){
        this.setFocusable(true);
        this.addKeyListener(new kBInput());
        this.setPreferredSize(new Dimension(800,600));
        this.setBackground(Color.BLACK);

        paddle = new Paddle();
        ball = new Ball();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        paddle.Draw(g);
        ball.Draw(g);
    }

    public void Update(){
        ball.Update();
        paddle.Update();
        this.repaint();
    }

    public class kBInput extends KeyAdapter{
        public void keyPressed(KeyEvent e){
            paddle.keyPressed(e);
            System.out.println(e.getKeyCode());
        }

        public void keyReleased(KeyEvent e){
            paddle.keyReleased(e);
            System.out.println(e.getKeyCode());
        }
    }
}