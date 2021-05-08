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
        this.setBackground(Color.WHITE);
        System.out.println("Game Panel criado");

        paddle =  new Paddle(50,50,50,50);
        ball = new Ball(50,50,50);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        paddle.Draw(g);
        ball.Draw(g);
    }

    public void Update(){
        ball.x++;
        this.repaint();
    }

    public class kBInput extends KeyAdapter{
        public void keyPressed(KeyEvent e){
            //System.out.println(e.getKeyCode());
        }

    }
}