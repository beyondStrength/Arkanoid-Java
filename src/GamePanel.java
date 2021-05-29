import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class GamePanel extends JPanel{

    Paddle paddle;
    Ball ball;
    Block[][] blocks = new Block[3][16];

    GamePanel(){
        this.setFocusable(true);
        this.addKeyListener(new kBInput());
        this.setPreferredSize(new Dimension(800,600));
        this.setBackground(Color.BLACK);

        paddle = new Paddle();
        ball = new Ball();

        int x = 5;
        int y = 30;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 16; j++) {
                blocks[i][j] = new Block(x,y);
                x+=50;
            }
            x = 5;
            y+=30;
        }
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        paddle.Draw(g);
        ball.Draw(g);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 16; j++) {
                if (blocks[i][j].alive)
                    blocks[i][j].Draw(g);
            }
        }
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