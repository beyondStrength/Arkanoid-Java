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

        GlobalCollisionHandler();
        ball.Update();
        paddle.Update();
         
        this.repaint();
    }

    public void GlobalCollisionHandler()  {
        if (ball.getLeft() < paddle.getRight() &&
        ball.getDown() > paddle.getUp() &&
        ball.getRight() > paddle.getLeft())    {
            ball.y = paddle.getUp() - ball.d;
            ball.speedY*=-1;
        }

        if (ball.getUp() > paddle.getDown())
            ball = new Ball();

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