import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class ScoreBoard {
    public int v;
    ScoreBoard()   {
        this.v = GameFrame.points;
    }

    void Update()   {
        this.v = GameFrame.points;
    }

    void Draw(Graphics g) {
        g.setColor(Color.GREEN);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 20));
        g.drawString(String.valueOf(v), 750, 550);
    }
}
