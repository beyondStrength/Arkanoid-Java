import javax.swing.*;


public class GameFrame extends JFrame{
    GamePanel panel;
    public static int lives = 3;

    GameFrame(){
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("Arkanoid");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.pack();        
    }


}