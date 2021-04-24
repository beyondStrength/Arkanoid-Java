import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class GamePanel extends JPanel implements Runnable{

    GamePanel(){
        this.setFocusable(true);
        this.addKeyListener(new kBInput());
        this.setPreferredSize(new Dimension(800,600));
        this.setBackground(Color.BLACK);
        System.out.println("Game Panel criado");
    }

    public void run(){
        
    }

    public class kBInput extends KeyAdapter{
        public void keyPressed(KeyEvent e){
            System.out.println(e.getKeyCode());
        }

    }
}