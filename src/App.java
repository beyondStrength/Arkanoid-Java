
public class App {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("sun.java2d.opengl", "true");
        GameFrame frame = new GameFrame();
        while(true) {
            if (GameFrame.lives < 1){
                frame.revalidate();
                //frame = new GameFrame();
                GameFrame.lives = 3;
            }
            frame.panel.Update();
            Thread.sleep(1000/60);
        }
    }
}
