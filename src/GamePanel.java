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
            ball.speedY = -10;
            if (ball.getMiddleX() > paddle.getMiddleX())    {
                ball.speedX = ((ball.getMiddleX() - paddle.getMiddleX())/10)+6;
            }else   {
                ball.speedX = -(((paddle.getMiddleX() - ball.getMiddleX()) /10)+6);
            }
        }

        if (ball.getUp() > paddle.getDown())
            ball = new Ball();
        
    }

    public class kBInput extends KeyAdapter{
        public void keyPressed(KeyEvent e){
            paddle.keyPressed(e);
        }

        public void keyReleased(KeyEvent e){
            paddle.keyReleased(e);
        }
    }
}