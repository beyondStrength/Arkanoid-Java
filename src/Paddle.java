import java.awt.Graphics;

public class Paddle {
    int x,y,w,h;

    Paddle(int x,int  y, int w, int h){
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
    
    void Draw(Graphics g) {
        g.drawRect(x, y, w, h);
    }
}
